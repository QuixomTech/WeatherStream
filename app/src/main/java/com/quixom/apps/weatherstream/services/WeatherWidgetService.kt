package com.quixom.apps.weatherstream.services

import android.app.Service
import android.appwidget.AppWidgetManager
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.os.Build
import android.os.IBinder
import android.support.annotation.RequiresApi
import android.widget.RemoteViews
import com.quixom.apps.weatherstream.BuildConfig
import com.quixom.apps.weatherstream.Methods
import com.quixom.apps.weatherstream.R
import com.quixom.apps.weatherstream.dbconfig.UpgradeData
import com.quixom.apps.weatherstream.model.WeatherData
import com.quixom.apps.weatherstream.model.WeatherForecastData
import com.quixom.apps.weatherstream.utilities.KeyUtil
import com.quixom.apps.weatherstream.utilities.WeatherToImage
import com.quixom.apps.weatherstream.webservice.APIParameters
import com.quixom.apps.weatherstream.webservice.NetworkConfig
import com.raizlabs.android.dbflow.sql.language.Delete
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*


/**
 * Created by akif on 12/5/17.
 */
class WeatherWidgetService : Service() {

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        val appWidgetManager: AppWidgetManager = AppWidgetManager.getInstance(this@WeatherWidgetService)
        val allWidgetIds = intent?.getIntArrayExtra(AppWidgetManager.
                EXTRA_APPWIDGET_IDS)

        val timer = Timer()
        val hourlyTask = object : TimerTask() {
            override fun run() {
                val cm: ConnectivityManager = this@WeatherWidgetService.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

                val weatherDataCoord: WeatherData.Coord? = WeatherData.Coord.getCoordinateDetails()
                if (weatherDataCoord != null) {
                    if (cm.activeNetworkInfo != null) {
                        callSearchLocationServiceApi(weatherDataCoord.lat!!, weatherDataCoord.lon!!, allWidgetIds, appWidgetManager)
                    }

                    val weatherData = WeatherData.getLocationBasedWeatherDetails()
                    val mainWeatherData: WeatherData.Main? = WeatherData.Main.getMainWeatherDetails()
                    val inWeatherData: WeatherData.Weather? = WeatherData.Weather.getInnerWeatherDetails()

                    val remoteViews = RemoteViews(this@WeatherWidgetService.packageName, R.layout.weather_forecasting_app_widget)

                    if (weatherData != null && mainWeatherData != null && inWeatherData != null) {

                        remoteViews.setTextViewText(R.id.tvWeatherLocationNameWidget, "" + weatherData.name)
                        remoteViews.setTextViewText(R.id.tvAvgTemperatureWidget, Math.round(mainWeatherData.temp?.toDouble()!!).toString().plus("°"))
                        remoteViews.setTextViewText(R.id.tvMaxTemperatureWidget, Math.round(mainWeatherData.temp_max?.toDouble()!!).toString().plus("°"))
                        remoteViews.setTextViewText(R.id.tvMinTemperatureWidget, Math.round(mainWeatherData.temp_min?.toDouble()!!).toString().plus("°"))
                        remoteViews.setTextViewText(R.id.tvWeatherMessageWidget, inWeatherData.description)
                        remoteViews.setImageViewResource(R.id.ivWeatherTypeIconWidget, WeatherToImage.getWeatherTypeConditionCode(null, inWeatherData.id?.toString()!!))
                    }

                    if (allWidgetIds != null) {
                        for (widgetId in allWidgetIds) {
                            appWidgetManager.updateAppWidget(widgetId, remoteViews)
                        }
                    }

                } else {
                    stopSelf()
                }
            }
        }
        // schedule the task to run starting now and then every half-an-hour...
        timer.schedule(hourlyTask, 0L, 5400000)

        return START_STICKY
    }

    override fun onBind(p0: Intent?): IBinder? {
        return null
    }

    /***
     * API Method for get the weather information of specific location
     * */
    var locationSearchCall: Call<WeatherData>? = null

    fun callSearchLocationServiceApi(lat: Double, lon: Double, allWidgetIds: IntArray?, appWidgetManager: AppWidgetManager) {
        val hashMap = APIParameters.getParam()
        hashMap.put(APIParameters.LocationSearch.lat, "" + lat)
        hashMap.put(APIParameters.LocationSearch.lon, "" + lon)
        hashMap.put(APIParameters.LocationSearch.type, KeyUtil.TYPES_ACCURATE)
        hashMap.put(APIParameters.LocationSearch.units, "" + KeyUtil.UNITS_METRIC)

        locationSearchCall = NetworkConfig.getWebApis().getWeatherDetail(BuildConfig.KEY_OPEN_WEATHER_MAP_KEY, hashMap)
        locationSearchCall!!.enqueue(object : Callback<WeatherData> {

            @RequiresApi(Build.VERSION_CODES.N)
            override fun onResponse(call: Call<WeatherData>, response: Response<WeatherData>) {
                if (call.isCanceled)
                    return

                if (response != null) {
                    if (response.isSuccessful) {
                        if (response.body() != null) {
                            if (response.body()?.cod == 200 && response.body()?.name != null && response.body()?.name != "") {

                                UpgradeData.clearApplicationData()

                                val weatherDetail: WeatherData = response.body()!!
                                val innerWeatherDetail: Array<WeatherData.Weather>? = response.body()!!.weather
                                val sysWeatherDetail: WeatherData.Sys = response.body()!!.sys!!
                                val coordDetail: WeatherData.Coord = response.body()!!.coord!!
                                val mainWeatherDetail: WeatherData.Main = response.body()!!.main!!
                                val windWeatherDetail: WeatherData.Wind = response.body()!!.wind!!
                                val cloudsWeatherDetail: WeatherData.Clouds = response.body()!!.clouds!!
                                weatherDetail.save()

                                coordDetail.id = 0
                                coordDetail.save()

                                sysWeatherDetail.sysId = 0
                                sysWeatherDetail.save()

                                mainWeatherDetail.id = 0
                                mainWeatherDetail.save()

                                windWeatherDetail.id = 0
                                windWeatherDetail.save()

                                cloudsWeatherDetail.id = 0
                                cloudsWeatherDetail.save()

                                for (inWeatherDt in innerWeatherDetail!!) {
                                    inWeatherDt.wId = 0
                                    inWeatherDt.save()
                                }

                                callWeatherForecasting(lat, lon)
                            }
                        }
                    }
                }
            }

            override fun onFailure(call: Call<WeatherData>?, t: Throwable?) {}
        })
    }

    /***
     * API Method for get the weather information of specific location
     * */
    var weatherForecastingCall: Call<WeatherForecastData>? = null

    fun callWeatherForecasting(lat: Double, lon: Double) {

        val hashMap = APIParameters.getParam()
        hashMap.put(APIParameters.ForecastingWeather.lat, "" + lat)
        hashMap.put(APIParameters.ForecastingWeather.lon, "" + lon)
        hashMap.put(APIParameters.ForecastingWeather.units, "" + KeyUtil.UNITS_METRIC)
        hashMap.put(APIParameters.ForecastingWeather.type, "" + KeyUtil.TYPES_ACCURATE)

        weatherForecastingCall = NetworkConfig.getWebApis().getWeatherForecasting(BuildConfig.KEY_OPEN_WEATHER_MAP_KEY, hashMap)
        weatherForecastingCall!!.enqueue(object : Callback<WeatherForecastData> {

            override fun onResponse(call: Call<WeatherForecastData>, response: Response<WeatherForecastData>) {
                if (call.isCanceled)
                    return

                if (response != null) {
                    if (response.isSuccessful) {
                        if (response.body() != null) {
                            if (response.body()?.cod == "200") {

                                val weatherForecastData: WeatherForecastData = response.body()!!
                                weatherForecastData.id = 0
                                weatherForecastData.save()

                                val forecastingList: Array<WeatherForecastData.ForecastList> = response.body()?.list!!
                                if (forecastingList != null && forecastingList.isNotEmpty()) {
                                    Methods.isProgressHide()
                                    for (hourlyWeatherData in forecastingList) {
                                        hourlyWeatherData.id = 0
                                        hourlyWeatherData.save()

                                        val sysWeatherDetail: WeatherData.Sys = hourlyWeatherData.sys!!
                                        if (sysWeatherDetail != null) {
                                            sysWeatherDetail.sysId = 0
                                            sysWeatherDetail.save()
                                        }

                                        val mainWeatherDetail: WeatherData.Main = hourlyWeatherData.main!!
                                        mainWeatherDetail.id = 0
                                        mainWeatherDetail.save()

                                        val windWeatherDetail: WeatherData.Wind = hourlyWeatherData.wind!!
                                        windWeatherDetail.id = 0
                                        windWeatherDetail.save()

                                        val cloudsWeatherDetail: WeatherData.Clouds = hourlyWeatherData.clouds!!
                                        cloudsWeatherDetail.id = 0
                                        cloudsWeatherDetail.save()

                                        if (hourlyWeatherData.rain != null) {
                                            val rainData: WeatherForecastData.Rain = hourlyWeatherData.rain!!
                                            rainData.id = 0
                                            rainData.dt = hourlyWeatherData.dt
                                            rainData.save()
                                        } else {
                                            Delete.table(WeatherForecastData.Rain::class.java)
                                        }

                                        val innerWeatherDetail: Array<WeatherData.Weather>? = hourlyWeatherData.weather
                                        if (innerWeatherDetail != null) {
                                            for (innerWDetail in innerWeatherDetail) {
                                                innerWDetail.wId = 0
                                                innerWDetail.save()
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

            override fun onFailure(call: Call<WeatherForecastData>?, t: Throwable?) {}
        })
    }
}