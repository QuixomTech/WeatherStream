package com.quixom.apps.weatherstream.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.support.design.widget.BottomSheetDialog
import android.support.v4.content.ContextCompat
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.quixom.apps.weatherstream.MainActivity
import com.quixom.apps.weatherstream.Methods
import com.quixom.apps.weatherstream.R
import com.quixom.apps.weatherstream.model.WeatherData
import com.quixom.apps.weatherstream.model.WeatherForecastData
import com.quixom.apps.weatherstream.utilities.DateUtil
import com.quixom.apps.weatherstream.utilities.PreferenceUtil
import com.quixom.apps.weatherstream.utilities.WeatherToImage
import java.text.DecimalFormat
import java.text.NumberFormat
import java.util.*


/**
 * Created by akif on 11/3/17.
 */
class ForecastItemAdapter(private var preferenceUtil: PreferenceUtil, private var cityName: String, private var daysForecastList: List<WeatherForecastData.ForecastList>, mainActivity: MainActivity) : RecyclerView.Adapter<ForecastItemAdapter.ViewHolder>() {

    private var context: Context? = null
    private var mActivity: MainActivity? = mainActivity

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ForecastItemAdapter.ViewHolder {
        context = parent.context
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.row_forecast_item_view, parent, false))
    }

    @SuppressLint("InflateParams")
    override fun onBindViewHolder(holder: ForecastItemAdapter.ViewHolder, position: Int) {
        val dateTime = daysForecastList[position].dt_txt
        val dateValue = daysForecastList[position].dt

        holder.tvDayTime.text = DateUtil.getDateFromMillis(dateValue, DateUtil.dateDisplayFormat3, true).plus(" ").plus(DateUtil.convertTime(dateTime!!))

        if (DateUtil.getCurrentDateTime(dateTime)) holder.tvDayTime.background = ContextCompat.getDrawable(mActivity, R.drawable.day_status_active)
        else holder.tvDayTime.background = ContextCompat.getDrawable(mActivity, R.drawable.day_status_pendding)

        val innerWeatherList: List<WeatherData.Weather>? = WeatherData.Weather.getInnerWeatherList()
        if (innerWeatherList != null && innerWeatherList.isNotEmpty()) {
            holder.ivWeatherTypeForecast.setImageResource(WeatherToImage.getWeatherTypeConditionCode(null, innerWeatherList[position].id.toString()))
        }
        val mainWeatherData: List<WeatherData.Main>? = WeatherData.Main.getMainWeatherList()
        if (mainWeatherData != null) {
            val avgTemp = mainWeatherData[position + 1].temp
            val minTemp = mainWeatherData[position + 1].temp_min
            val maxTemp = mainWeatherData[position + 1].temp_max

            if (avgTemp != null && minTemp != null && maxTemp != null) {

                if (preferenceUtil.getBooleanPref(preferenceUtil.IS_TEMPERATURE_UNIT_CELCIUS)) {
                    holder.tvAvgTemperature.text = Math.round(avgTemp.toDouble()).toString().plus(mActivity?.resources?.getString(R.string.temp_degree_sign))
                    holder.tvMinMaxTempExpand.text = Math.round(minTemp.toDouble()).toString().plus(mActivity?.resources?.getString(R.string.temp_degree_sign)).plus("/").plus(Math.round(maxTemp.toDouble()).toString()).plus(mActivity?.resources?.getString(R.string.temp_degree_sign))
                } else {
                    holder.tvAvgTemperature.text = Math.round(Methods.convertCelsiusToFahrenheit(avgTemp.toFloat())).toString().plus(mActivity?.resources?.getString(R.string.temp_degree_sign))
                    holder.tvMinMaxTempExpand.text = Math.round(Methods.convertCelsiusToFahrenheit(minTemp.toFloat())).toString().plus(mActivity?.resources?.getString(R.string.temp_degree_sign)).plus("/").plus(Math.round(Methods.convertCelsiusToFahrenheit(maxTemp.toFloat())).toString()).plus(mActivity?.resources?.getString(R.string.temp_degree_sign))
                }
            }
        }

        if (!preferenceUtil.getBooleanPref(preferenceUtil.IS_APP_THEME_DAY)) {
            holder.tvAvgTemperature.setTextColor(ContextCompat.getColor(mActivity, R.color.azure_white))
        }

        holder.itemView.setOnClickListener {
            Methods.avoidDoubleClicks(holder.itemView)

            val mBottomSheetDialog = BottomSheetDialog(context!!)
            val sheetView = mActivity?.layoutInflater?.inflate(R.layout.bottomsheet_weather_details, null) as View

            val tvHumidityBL = sheetView.findViewById<TextView>(R.id.tvHumidityBL)
            val tvPressureBL = sheetView.findViewById<TextView>(R.id.tvPressureBL)
            val tvSeaLevelBL = sheetView.findViewById<TextView>(R.id.tvSeaLevelBL)
            val tvGroundLevelBL = sheetView.findViewById<TextView>(R.id.tvGroundLevelBL)
            val tvSystemPodBL = sheetView.findViewById<TextView>(R.id.tvSystemPodBL)
            val tvRainVolumeBL = sheetView.findViewById<TextView>(R.id.tvRainVolumeBL)
            val tvRainPrecipitationBL = sheetView.findViewById<TextView>(R.id.tvRainPrecipitationBL)
            val tvWindViewBL = sheetView.findViewById<TextView>(R.id.tvWindViewBL)
            val tvCityBL = sheetView.findViewById<TextView>(R.id.tvCityBL)
            val tvCountryBL = sheetView.findViewById<TextView>(R.id.tvCountryBL)
            val tvDateTimeBL = sheetView.findViewById<TextView>(R.id.tvDateTimeBL)
            val tvHumidityBLabel = sheetView.findViewById<TextView>(R.id.tvHumidityBLabel)
            val tvPressureBLabel = sheetView.findViewById<TextView>(R.id.tvPressureBLabel)
            val tvSystemPodBLabel = sheetView.findViewById<TextView>(R.id.tvSystemPodBLabel)
            val tvRainVolumeBLabel = sheetView.findViewById<TextView>(R.id.tvRainVolumeBLabel)
            val tvRainPrecipitationBLabel = sheetView.findViewById<TextView>(R.id.tvRainPrecipitationBLabel)
            val tvWindViewBLabel = sheetView.findViewById<TextView>(R.id.tvWindViewBLabel)
            val tvGroundLevelBLabel = sheetView.findViewById<TextView>(R.id.tvGroundLevelBLabel)
            val tvSeaLevelBLabel = sheetView.findViewById<TextView>(R.id.tvSeaLevelBLabel)

            val llParentTopView: LinearLayout = sheetView.findViewById(R.id.parentTopView)

            if (mainWeatherData != null && mainWeatherData.isNotEmpty()) {
                val humidity = mainWeatherData[position + 1].humidity
                val pressure = mainWeatherData[position + 1].pressure
                val seaLevel = mainWeatherData[position + 1].sea_level
                val groundLevel = mainWeatherData[position + 1].grnd_level

                val sysWeatherData: WeatherData.Sys? = WeatherData.Sys.getSysWeatherDetails()
                val sysWeatherList: List<WeatherData.Sys>? = WeatherData.Sys.getSysListDetails()
                val rainData: WeatherForecastData.Rain? = WeatherForecastData.Rain.getRainData(dateValue)
                val cloudsData: WeatherData.Clouds? = WeatherData.Clouds.getCloudWeatherDetails()
                val windData: WeatherData.Wind? = WeatherData.Wind.getWindWeatherDetails()

                if (sysWeatherList != null && sysWeatherList.isNotEmpty() && sysWeatherList[position + 1].pod != null) tvSystemPodBL.text = sysWeatherList[position + 1].pod
                if (sysWeatherData?.country != null) {
                    val loc = Locale("", sysWeatherData.country)
                    tvCountryBL.text = loc.displayCountry
                }

                if (rainData?.rainCount != null) {
                    val numberFormat: NumberFormat = DecimalFormat("#.00")
                    tvRainVolumeBL.text = numberFormat.format(rainData.rainCount!!).toString().plus(" mm")
                } else tvRainVolumeBL.text = ("0").plus(" mm")

                if (cloudsData != null) tvRainPrecipitationBL.text = cloudsData.all.toString().plus("%")
                val numberFormat: NumberFormat = DecimalFormat("#.0000")

                if (windData != null) {
                    if (preferenceUtil.getBooleanPref(preferenceUtil.IS_SPEED_UNIT_METERS)) tvWindViewBL.text = windData.speed.toString().plus(mActivity?.resources?.getString(R.string.ms_speed))
                    else tvWindViewBL.text = numberFormat.format(Methods.getMiles(windData.speed?.toFloat()!!)).toString().plus(mActivity!!.resources.getString(R.string.mph_speed))
                }

                tvDateTimeBL.text = DateUtil.getDateFromMillis(dateValue, DateUtil.dateDisplayFormat3, true).plus(" ").plus(DateUtil.convertTime(dateTime))

                tvCityBL.text = cityName
                tvHumidityBL.text = humidity.plus("%")

                val numberFormatHpa: NumberFormat = DecimalFormat("#.00")
                if (preferenceUtil.getBooleanPref(preferenceUtil.IS_AIR_PRESSURE_HPA)) {
                    tvPressureBL.text = numberFormatHpa.format(Methods.gethPa(pressure?.toFloat()!!)).toString().plus(mActivity?.resources?.getString(R.string.hpa_air_pressure))
                    tvSeaLevelBL.text = numberFormatHpa.format(Methods.gethPa(seaLevel?.toFloat()!!)).toString().plus(mActivity?.resources?.getString(R.string.hpa_air_pressure))
                    tvGroundLevelBL.text = numberFormatHpa.format(Methods.gethPa(groundLevel?.toFloat()!!)).toString().plus(mActivity?.resources?.getString(R.string.hpa_air_pressure))
                } else {
                    tvPressureBL.text = numberFormatHpa.format(Methods.getInHG(pressure?.toFloat()!!)).plus(mActivity?.resources?.getString(R.string.inhg_air_pressure))
                    tvSeaLevelBL.text = numberFormatHpa.format(Methods.getInHG(seaLevel?.toFloat()!!)).plus(mActivity?.resources?.getString(R.string.inhg_air_pressure))
                    tvGroundLevelBL.text = numberFormatHpa.format(groundLevel?.toFloat()!!).plus(mActivity?.resources?.getString(R.string.inhg_air_pressure))
                }
            }
            mBottomSheetDialog.setContentView(sheetView)
            mBottomSheetDialog.show()
        }
    }

    override fun getItemCount(): Int = daysForecastList.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val tvDayTime: TextView = itemView.findViewById(R.id.tvDayTime)
        val tvMinMaxTempExpand: TextView = itemView.findViewById(R.id.tvMinMaxTempExpand)
        val tvAvgTemperature: TextView = itemView.findViewById(R.id.tvAvgTemperature)
        val ivWeatherTypeForecast: ImageView = itemView.findViewById(R.id.ivWeatherTypeForecast)
    }
}