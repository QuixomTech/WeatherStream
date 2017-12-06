package com.quixom.apps.weatherstream.services

import android.app.ActivityManager
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
import com.quixom.apps.weatherstream.R
import com.quixom.apps.weatherstream.dbconfig.UpgradeData
import com.quixom.apps.weatherstream.model.WeatherData
import com.quixom.apps.weatherstream.utilities.KeyUtil
import com.quixom.apps.weatherstream.utilities.WeatherToImage
import com.quixom.apps.weatherstream.webservice.APIParameters
import com.quixom.apps.weatherstream.webservice.NetworkConfig
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
        val allWidgetIds = intent?.getIntArrayExtra(AppWidgetManager.EXTRA_APPWIDGET_IDS)

        println("service started successfully!!!")

        val timer = Timer()
        val hourlyTask = object : TimerTask() {
            override fun run() {
                val cm: ConnectivityManager = this@WeatherWidgetService.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

                val weatherDataCoord: WeatherData.Coord? = WeatherData.Coord.getCoordinateDetails()
                if (weatherDataCoord != null) {
                    println("weatherDataCoord == " + weatherDataCoord.lat)

                    if (cm.activeNetworkInfo != null && cm.isActiveNetworkMetered) {
                        callSearchLocationServiceApi(weatherDataCoord.lat!!, weatherDataCoord.lon!!)
                    }
                    val weatherData = WeatherData.getLocationBasedWeatherDetails()
                    val mainWeatherData: WeatherData.Main? = WeatherData.Main.getMainWeatherDetails()
                    val inWeatherData: WeatherData.Weather? = WeatherData.Weather.getInnerWeatherDetails()


                    for (widgetId in allWidgetIds!!) {

                        val remoteViews = RemoteViews(this@WeatherWidgetService.packageName, R.layout.weather_forecasting_app_widget)

                        if (weatherData != null && mainWeatherData != null && inWeatherData != null) {
                            remoteViews.setTextViewText(R.id.tvWeatherLocationNameWidget, "" + weatherData.name)
                            remoteViews.setTextViewText(R.id.tvAvgTemperatureWidget, Math.round(mainWeatherData.temp?.toDouble()!!).toString().plus("°"))
                            remoteViews.setTextViewText(R.id.tvMaxTemperatureWidget, Math.round(mainWeatherData.temp_max?.toDouble()!!).toString().plus("°"))
                            remoteViews.setTextViewText(R.id.tvMinTemperatureWidget, Math.round(mainWeatherData.temp_min?.toDouble()!!).toString().plus("°"))
                            remoteViews.setTextViewText(R.id.tvWeatherMessageWidget, inWeatherData.description)
                            remoteViews.setImageViewResource(R.id.ivWeatherTypeIconWidget, WeatherToImage.getWeatherTypeConditionCode(null, null, inWeatherData.id?.toString()!!))
                        }

                        appWidgetManager.updateAppWidget(widgetId, remoteViews)
                    }
                }
            }
        }
        // schedule the task to run starting now and then every hour...
        timer.schedule(hourlyTask, 0L, 5000)

        stopSelf()
        return START_STICKY
    }

    override fun onBind(p0: Intent?): IBinder? {
        return null
    }

    /***
     * API Method for get the weather information of specific location
     * */
    var locationSearchCall: Call<WeatherData>? = null

    fun callSearchLocationServiceApi(lat: Double, lon: Double) {
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
                            }
                        }
                    }
                }
            }

            override fun onFailure(call: Call<WeatherData>?, t: Throwable?) {}
        })
    }

    private fun isAppIsInBackground(context: Context): Boolean {
        var isInBackground = true
        val am = context.getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
        val runningProcesses = am.runningAppProcesses
        for (processInfo in runningProcesses) {
            if (processInfo.importance == ActivityManager.RunningAppProcessInfo.IMPORTANCE_FOREGROUND) {
                for (activeProcess in processInfo.pkgList) {
                    if (activeProcess == context.packageName) {
                        isInBackground = false
                    }
                }
            }
        }
        return isInBackground
    }
}