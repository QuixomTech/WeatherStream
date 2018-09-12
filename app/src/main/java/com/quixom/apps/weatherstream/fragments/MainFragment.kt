package com.quixom.apps.weatherstream.fragments

import android.annotation.SuppressLint
import android.graphics.drawable.AnimatedVectorDrawable
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AlertDialog
import android.support.v7.widget.LinearLayoutManager
import android.text.TextUtils.TruncateAt
import android.util.TypedValue
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
import com.quixom.apps.weatherstream.slidingmenu.SlidingMenu
import com.quixom.apps.weatherstream.utilities.*
import com.quixom.apps.weatherstream.widgets.StickySwitch
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.android.synthetic.main.leftmenu.*
import kotlinx.android.synthetic.main.settingmenu.*
import kotlinx.android.synthetic.main.toolbar_ui.*
import java.text.DecimalFormat
import java.text.NumberFormat
import java.util.*
import android.view.animation.Animation
import android.view.animation.RotateAnimation



/**
 * A simple [MainFragment] subclass.
 */
class MainFragment : BaseFragment(), View.OnClickListener, StickySwitch.OnSelectedChangeListener {
    private lateinit var weatherSensor: WeatherViewSensorEventListener
    var drawable: AnimatedVectorDrawable?=null
    var drawableBack: AnimatedVectorDrawable?=null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? = inflater!!.inflate(R.layout.fragment_main, container, false)

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
            drawable = ContextCompat.getDrawable(context, R.drawable.ic_menu_animatable) as AnimatedVectorDrawable
            drawableBack = ContextCompat.getDrawable(context, R.drawable.ic_menu_animatable_back) as AnimatedVectorDrawable
            toggleMenu.setImageDrawable(drawable)
        llNoLocationFound.visibility = View.GONE
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        WeatherStreamCallbackManager.addWishCallBack(addWeatherStreamCallBack)
        recyclerViewDaysWeather.setHasFixedSize(true)
        val layoutManager = LinearLayoutManager(mActivity, LinearLayoutManager.HORIZONTAL, false)
        recyclerViewDaysWeather.layoutManager = layoutManager
        val lists: List<WeatherForecastData.ForecastList>? = WeatherForecastData.ForecastList.getForecastList()
        val weatherData: WeatherData? = WeatherData.getLocationBasedWeatherDetails()
        if (weatherData != null) recyclerViewDaysWeather.adapter = ForecastItemAdapter(preferenceUtil, weatherData.name!!, lists!!, mActivity)

        btnSearchLocation.setOnClickListener(this)
        tvDirectionView.setOnClickListener(this)
        tvDirectionLabel.setOnClickListener(this)

        setWeatherDetails()
        mActivity.slidingMenuLeft!!.setOnClosedListener{
                toggleMenu.setImageDrawable(drawableBack)
                drawableBack!!.start()
        }
        mActivity.slidingMenuLeft!!.setOnOpenedListener{
            toggleMenu.setImageDrawable(drawable)
            drawable!!.start()
        }
        mActivity.slidingMenuRight!!.setOnOpenedListener {
            ivSetting.clearAnimation()
        }
        mActivity.slidingMenuRight!!.setOnClosedListener {
            ivSetting.clearAnimation()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        WeatherStreamCallbackManager.removeWishCallBack(addWeatherStreamCallBack)
    }

    override fun onSelectedChange(direction: StickySwitch.Direction, text: String) {
        if (direction == StickySwitch.Direction.LEFT) {
            preferenceUtil.setBooleanPref(preferenceUtil.IS_TEMPERATURE_UNIT_CELCIUS, true)
            mActivity.rbCelsius.isChecked = true
            if (mActivity.rvMenuLocationList.adapter != null) {
                mActivity.rvMenuLocationList.adapter.notifyDataSetChanged()
            }

            setWeatherDetails()

            val weatherData: WeatherData? = WeatherData.getLocationBasedWeatherDetails()
            if (weatherData != null) {
                WeatherForecastData.ForecastList.getForecastList()
                recyclerViewDaysWeather?.adapter?.notifyDataSetChanged()
            }
        } else {
            preferenceUtil.setBooleanPref(preferenceUtil.IS_TEMPERATURE_UNIT_CELCIUS, false)
            mActivity.rbFahrenheit.isChecked = true
            if (mActivity.rvMenuLocationList.adapter != null) mActivity.rvMenuLocationList.adapter.notifyDataSetChanged()
            setWeatherDetails()

            val weatherData: WeatherData? = WeatherData.getLocationBasedWeatherDetails()
            if (weatherData != null) {
                val lists: List<WeatherForecastData.ForecastList>? = WeatherForecastData.ForecastList.getForecastList()
                recyclerViewDaysWeather.adapter = ForecastItemAdapter(preferenceUtil, weatherData.name!!, lists!!, mActivity)
                recyclerViewDaysWeather?.adapter?.notifyDataSetChanged()
            }
        }
    }

    fun setWeatherData(weatherDataAnim: WeatherDataAnim) {
//        weatherView.setWeatherData(weatherDataAnim)
    }

    override fun onClick(v: View?) {
        when (v) {
            toggleMenu -> {
                Methods.avoidDoubleClicks(toggleMenu)
                mActivity.slidingMenuLeft?.clearIgnoredViews()
                if (mActivity.slidingMenuRight?.isMenuShowing!!) {
                    mActivity.slidingMenuRight!!.toggle()
                }
                mActivity.slidingMenuLeft?.showMenu(true)

            }
            ivSetting -> {
                Methods.avoidDoubleClicks(ivSetting)
                mActivity.toggleSlideMenuRight()
                val rotate = RotateAnimation(
                        0f, 360f,
                        Animation.RELATIVE_TO_SELF, 0.5f,
                        Animation.RELATIVE_TO_SELF, 0.5f)
                rotate.duration = 500
                rotate.repeatCount=Animation.INFINITE
                ivSetting.startAnimation(rotate)
            }
            btnSearchLocation -> {
                Methods.avoidDoubleClicks(btnSearchLocation)
                mActivity.showGoogleAutoLocationSearch("")
            }
            tvDirectionView, tvDirectionLabel -> {
                Methods.avoidDoubleClicks(tvDirectionView)
                showInfoDialog()
            }
        }
    }

    override fun onHiddenChanged(hidden: Boolean) {
        super.onHiddenChanged(hidden)
        if (!hidden && isAdded) {
            val weatherData: WeatherData? = WeatherData.getLocationBasedWeatherDetails()
            if (weatherData != null) initToolbar(weatherData.name!!)
        }
    }

    /***
     * Method for initialise Toolbar
     * */
    @SuppressLint("SetTextI18n")
    private fun initToolbar(header: String) {
        tvToolbarTitle.text = header
        toggleMenu?.visibility = View.VISIBLE
        ivSetting?.visibility = View.VISIBLE
        backNavigation?.visibility = View.GONE
        tvToolbarTitle?.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24F)
        toggleMenu.setOnClickListener(this)
        ivSetting.setOnClickListener(this)
        ivSetting.setOnClickListener(this)

        toggleMenu.tag = 0
        stickySwitch.onSelectedChangeListener = this

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
        llNoLocationFound.visibility = View.GONE
        val weatherData: WeatherData? = WeatherData.getLocationBasedWeatherDetails()
        val sysWeatherData: WeatherData.Sys? = WeatherData.Sys.getSysWeatherDetails()

        val mainWeatherData: WeatherData.Main? = WeatherData.Main.getMainWeatherDetails()
        val cloudWeatherData: WeatherData.Clouds? = WeatherData.Clouds.getCloudWeatherDetails()
        val inWeatherData: WeatherData.Weather? = WeatherData.Weather.getInnerWeatherDetails()
        val windWeatherData: WeatherData.Wind? = WeatherData.Wind.getWindWeatherDetails()

        if (weatherData != null && sysWeatherData != null && inWeatherData != null) {
            initToolbar(weatherData.name!!)

            if (sysWeatherData.country != null) {
                val loc = Locale("", sysWeatherData.country)
                tvCountryAdd?.text = loc.displayCountry
            }

            if (preferenceUtil.getBooleanPref(preferenceUtil.IS_TEMPERATURE_UNIT_CELCIUS)) {
                stickySwitch.setDirection(StickySwitch.Direction.LEFT, true)
                tvAverageTemperatureView?.text = Math.round(mainWeatherData?.temp?.toDouble()!!).toString().plus(mResources.getString(R.string.temp_degree_sign))
                tvTemperatureMinV?.text = Math.round(mainWeatherData.temp_min?.toDouble()!!).toString().plus(mResources.getString(R.string.temperature_low))
                tvTemperatureMaxV?.text = Math.round(mainWeatherData.temp_max?.toDouble()!!).toString().plus(mResources.getString(R.string.temperature_high))
            } else {
                stickySwitch.setDirection(StickySwitch.Direction.RIGHT, true)
                tvAverageTemperatureView?.text = Math.round(Methods.convertCelsiusToFahrenheit(mainWeatherData?.temp?.toFloat()!!)).toString().plus(mResources.getString(R.string.temp_degree_sign))
                tvTemperatureMinV?.text = Math.round(Methods.convertCelsiusToFahrenheit(mainWeatherData.temp_min?.toFloat()!!)).toString().plus(mResources.getString(R.string.temperature_low))
                tvTemperatureMaxV?.text = Math.round(Methods.convertCelsiusToFahrenheit(mainWeatherData.temp_max?.toFloat()!!)).toString().plus(mResources.getString(R.string.temperature_high))
            }

            tvWeatherTypeView?.text = inWeatherData.description
            tvDateTime?.text = DateUtil.getDateFromMillis(weatherData.dt, DateUtil.dateDisplayFormat1, true)
            tvHumidityView?.text = mainWeatherData.humidity?.plus("%")
            if (cloudWeatherData?.all != null) tvRainPrecipitationView?.text = cloudWeatherData.all.toString().plus("%")
            if (windWeatherData?.speed != null) {
                val numberFormat: NumberFormat = DecimalFormat("#.0000")
                if (preferenceUtil.getBooleanPref(preferenceUtil.IS_SPEED_UNIT_METERS)) tvWindView?.text = windWeatherData.speed?.plus(mResources.getString(R.string.ms_speed))
                else tvWindView?.text = numberFormat.format(Methods.getMiles(windWeatherData.speed?.toFloat()!!)).toString().plus(mResources.getString(R.string.mph_speed))
            }

            iv_weather_type.setImageResource(WeatherToImage.getWeatherTypeConditionCode(this@MainFragment, inWeatherData.id?.toString()!!))
            if (windWeatherData?.deg != null) tvDirectionView?.text = DegreeToWindDirection.getWindDirection(mActivity, windWeatherData.deg?.toDouble()!!)
        } else llNoLocationFound.visibility = View.VISIBLE
    }

    private var addWeatherStreamCallBack: WeatherStreamCallback = object : WeatherStreamCallback {
        override fun onSearchLocationAction(type: Int) {
            when (type) {
                1 -> setWeatherDetails()
                2 -> {
                    val weatherData: WeatherData? = WeatherData.getLocationBasedWeatherDetails()
                    if (weatherData != null) {
                        val lists: List<WeatherForecastData.ForecastList>? = WeatherForecastData.ForecastList.getForecastList()
                        recyclerViewDaysWeather.adapter = ForecastItemAdapter(preferenceUtil, weatherData.name!!, lists!!, mActivity)
                        recyclerViewDaysWeather.adapter?.notifyDataSetChanged()
                    }
                }
                3 -> {
                    setWeatherDetails()
                    val weatherData: WeatherData? = WeatherData.getLocationBasedWeatherDetails()
                    if (weatherData != null) {
                        val lists: List<WeatherForecastData.ForecastList>? = WeatherForecastData.ForecastList.getForecastList()
                        recyclerViewDaysWeather.adapter = ForecastItemAdapter(preferenceUtil, weatherData.name!!, lists!!, mActivity)
                        recyclerViewDaysWeather?.adapter?.notifyDataSetChanged()
                    }
                }
                4 -> {
                    setWeatherDetails()

                    val weatherData: WeatherData? = WeatherData.getLocationBasedWeatherDetails()
                    if (weatherData != null) {
                        WeatherForecastData.ForecastList.getForecastList()
                        try {
//                        recyclerViewDaysWeather.adapter = ForecastItemAdapter(preferenceUtil, weatherData.name!!, lists!!, mActivity)
                            recyclerViewDaysWeather?.adapter?.notifyDataSetChanged()
                        } catch (e: Exception) {
                            e.printStackTrace()
                        }
                    }
                }
            }
        }
    }

    @SuppressLint("InflateParams")
    private fun showInfoDialog() {
        val dialogBuilder = AlertDialog.Builder(mActivity)
        val inflater = this.layoutInflater
        val dialogView = inflater.inflate(R.layout.alert_dialog_layout, null)
        dialogBuilder.setView(dialogView)

        dialogBuilder.setNegativeButton(mActivity.resources.getString(R.string.close)) { dialog, _ ->
            dialog.dismiss()
        }
        val b = dialogBuilder.create()
        b.show()
        b.window.setBackgroundDrawableResource(R.color.app_background)
        b.getButton(AlertDialog.BUTTON_NEGATIVE).setTextColor(ContextCompat.getColor(mActivity, R.color.font_primary))
        b.getButton(AlertDialog.BUTTON_POSITIVE).setTextColor(ContextCompat.getColor(mActivity, R.color.font_primary))
    }
}

