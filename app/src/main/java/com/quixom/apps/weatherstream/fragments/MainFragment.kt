package com.quixom.apps.weatherstream.fragments

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.text.TextUtils.TruncateAt
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.github.matteobattilana.weather.PrecipType
import com.github.matteobattilana.weather.WeatherDataAnim
import com.github.matteobattilana.weather.WeatherViewSensorEventListener
import com.quixom.apps.weatherstream.Methods
import com.quixom.apps.weatherstream.R
import com.quixom.apps.weatherstream.adapters.ItemAdapter
import com.quixom.apps.weatherstream.adapters.WeatherTVFragmentAdapter
import com.quixom.apps.weatherstream.model.WeatherData
import com.quixom.apps.weatherstream.webservice.WeatherDataUpdator
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.android.synthetic.main.toolbar_ui.*

/**
 * A simple [BaseFragment] subclass.
 */
class MainFragment : BaseFragment(), WeatherDataUpdator.View, View.OnClickListener {

    var weatherTVFragmentAdapter: WeatherTVFragmentAdapter? = null
    lateinit var weatherSensor: WeatherViewSensorEventListener

    var mPresenter: WeatherDataUpdator.Presenter? = null


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_main, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initToolbar()

        mPresenter = WeatherPresenter()
        mPresenter?.subscribe(this)

        initViews()

        weatherSensor = WeatherViewSensorEventListener(mActivity, weatherView)
        weatherTVFragmentAdapter = WeatherTVFragmentAdapter(mActivity.supportFragmentManager)

        weatherTVFragmentAdapter!!.addFragment(WeatherTVFragment.newInstance(R.color.frag1))
        weatherTVFragmentAdapter!!.addFragment(WeatherTVFragment.newInstance(R.color.frag2))
        weatherTVFragmentAdapter!!.addFragment(WeatherTVFragment.newInstance(R.color.frag3))

        vpWeatherView.adapter = weatherTVFragmentAdapter
        flexibleIndicator.initViewPager(vpWeatherView)

        setWeatherData(PrecipType.SNOW)
        weatherView.emissionRate = 30f
        weatherView.fadeOutPercent = 1f
        weatherView.angle = 20

        val layoutManager = LinearLayoutManager(mActivity)
        recyclerViewDaysWeather.layoutManager = layoutManager
        recyclerViewDaysWeather.adapter = ItemAdapter(layoutManager, recyclerViewDaysWeather, mActivity)
    }

    private fun setWeatherData(weatherData: WeatherDataAnim) {
        weatherView.setWeatherData(weatherData)
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

    override fun onDestroy() {
        super.onDestroy()
        mPresenter?.unSubscribe()
    }

    /***
     * Method for initialise Toolbar
     * */
    private fun initToolbar() {
        tvToolbarTitle.text = "California"
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

    private fun initViews() {
        mPresenter?.refresh("London")
    }

    override fun getContextInstance() = mActivity

    override fun onError() {
        Toast.makeText(mActivity,"OnError", Toast.LENGTH_LONG).show()
    }

    override fun onStoredDataFetched(weatherData: WeatherData?) {
        println("weather data = " + weatherData?.getName() +",->" + weatherData?.getClouds()?.getAll()+",->"+weatherData?.getWeather()?.get(0)?.getDescription())
    }
    override fun onDataFetched(weatherData: com.quixom.apps.weatherstream.model.WeatherData?) {
    }

}

