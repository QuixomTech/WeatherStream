package com.quixom.apps.weatherstream.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.text.TextUtils.TruncateAt
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.matteobattilana.weather.WeatherDataAnim
import com.github.matteobattilana.weather.WeatherViewSensorEventListener
import com.quixom.apps.weatherstream.Methods
import com.quixom.apps.weatherstream.R
import com.quixom.apps.weatherstream.adapters.ForecastItemAdapter
import com.quixom.apps.weatherstream.model.WeatherData
import com.quixom.apps.weatherstream.model.WeatherForecastData
import com.quixom.apps.weatherstream.utilities.*
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.android.synthetic.main.fragment_weather_location_view.*
import kotlinx.android.synthetic.main.toolbar_ui.*
import java.util.*

/**
 * A simple [BaseFragment] subclass.
 */
class MainFragment : BaseFragment(), View.OnClickListener {

    lateinit var weatherSensor: WeatherViewSensorEventListener

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? = inflater!!.inflate(R.layout.fragment_main, container, false)

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        weatherSensor = WeatherViewSensorEventListener(mActivity, weatherView)

        WeatherStreamCallbackManager.addWishCallBack(addWeatherStreamCallBack)
        recyclerViewDaysWeather.setHasFixedSize(true)
        val layoutManager = LinearLayoutManager(mActivity, LinearLayoutManager.HORIZONTAL, false)
        recyclerViewDaysWeather.layoutManager = layoutManager
        val lists: List<WeatherForecastData.ForecastList>? = WeatherForecastData.ForecastList.getForecastList()
        recyclerViewDaysWeather.adapter = ForecastItemAdapter(lists!!, mActivity)

        setWeatherDetails()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        WeatherStreamCallbackManager.removeWishCallBack(addWeatherStreamCallBack)
    }

    fun setWeatherData(weatherDataAnim: WeatherDataAnim) {
        weatherView.setWeatherData(weatherDataAnim)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            toggleMenu.id -> {
                Methods.avoidDoubleClicks(toggleMenu)
                mActivity.toggleSlideMenuLeft()
            }
            ivSetting.id -> {
                Methods.avoidDoubleClicks(ivSetting)
                mActivity.toggleSlideMenuRight()
            }
            else -> {
            }
        }
    }

    override fun onResume() {
        super.onResume()
        weatherSensor.onResume()
    }

    override fun onPause() {
        super.onPause()
        weatherSensor.onPause()
    }

    /***
     * Method for initialise Toolbar
     * */
    @SuppressLint("SetTextI18n")
    private fun initToolbar(header: String) {
        tvToolbarTitle.text = header
        toggleMenu.setOnClickListener(this)
        ivSetting.setOnClickListener(this)
        toggleMenu.tag = 0

        try {
            tvToolbarTitle.ellipsize = TruncateAt.MARQUEE
            tvToolbarTitle.isFocusable = true
            tvToolbarTitle.isFocusableInTouchMode = true
            tvToolbarTitle.requestFocus()
            tvToolbarTitle.setSingleLine(true)
            tvToolbarTitle.isSelected = true
            tvToolbarTitle.marqueeRepeatLimit = -1

        } catch (e: NoSuchFieldException) {
        } catch (e: IllegalAccessException) {
        }
    }

    fun setWeatherDetails() {
        val weatherData: WeatherData? = WeatherData.getLocationBasedWeatherDetails()
        val sysWeatherData: WeatherData.Sys? = WeatherData.Sys.getSysWeatherDetails()

        val mainWeatherData: WeatherData.Main? = WeatherData.Main.getMainWeatherDetails()
        val cloudWeatherData: WeatherData.Clouds? = WeatherData.Clouds.getCloudWeatherDetails()
        val inWeatherData: WeatherData.Weather? = WeatherData.Weather.getInnerWeatherDetails()
        val windWeatherData: WeatherData.Wind? = WeatherData.Wind.getWindWeatherDetails()

        if (weatherData != null && sysWeatherData != null && inWeatherData != null) {
            initToolbar(weatherData.name!!)

            val loc = Locale("", sysWeatherData.country)
            tvCountryAdd?.text = loc.displayCountry
            tvAverageTemperatureView?.text = Math.round(mainWeatherData?.temp?.toDouble()!!).toString().plus(mResources.getString(R.string.temp_degree_sign))
            tvWeatherTypeView?.text = inWeatherData.description
            tvTemperatureMinV?.text = Math.round(mainWeatherData.temp_min?.toDouble()!!).toString().plus(mResources.getString(R.string.temperature_low))
            tvTemperatureMaxV?.text = Math.round(mainWeatherData.temp_max?.toDouble()!!).toString().plus(mResources.getString(R.string.temperature_high))
            tvDateTime?.text = DateUtil.getDateFromMillis(weatherData.dt, DateUtil.dateDisplayFormat1)

            tvHumidityView?.text = mainWeatherData.humidity?.plus("%")
            if (cloudWeatherData?.all != null) {
                tvRainPrecipitationView?.text = cloudWeatherData.all.toString().plus("%")
            }
            if (windWeatherData?.speed != null) {
                tvWindView?.text = windWeatherData.speed?.plus(" m/s")
            }
            if (windWeatherData?.deg != null) {
                tvDirectionView?.text = DegreeToWindDirection.getWindDirection(mActivity, windWeatherData.deg?.toDouble()!!)
            }

            WeatherToImage.getWeatherTypeConditionCode(this@MainFragment, weatherView, inWeatherData.id?.toString()!!)
        }
    }

    private var addWeatherStreamCallBack: WeatherStreamCallback = object : WeatherStreamCallback {
        override fun onSearchLocationAction(type: Int) {
            if (type == 1) {
                setWeatherDetails()
            }

            if (type == 2){
                recyclerViewDaysWeather?.adapter?.notifyDataSetChanged()
            }
        }
    }
}

