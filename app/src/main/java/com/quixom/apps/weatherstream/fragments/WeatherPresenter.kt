package com.quixom.apps.weatherstream.fragments

import android.content.Context
import com.google.gson.Gson
import com.quixom.apps.weatherstream.model.WeatherData
import com.quixom.apps.weatherstream.utilities.KeyUtil
import com.quixom.apps.weatherstream.webservice.NetworkServices
import com.quixom.apps.weatherstream.webservice.WeatherDataUpdator
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers


/**
 * Created by akif on 11/9/17.
 */
class WeatherPresenter : WeatherDataUpdator.Presenter {

    var mView: WeatherDataUpdator.View? = null

    override fun subscribe(view: WeatherDataUpdator.View) {
        mView = view
    }

    override fun unSubscribe() {
        mView = null
    }

    override fun refresh(locationName: String) {
        NetworkServices.getOpenWeatherMAPApi()
                .getCurrentLocationWeatherByName(KeyUtil.KEY_OPEN_WEATHER_MAP_KEY, locationName)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe({ weatherData ->
                    mView?.onDataFetched(weatherData)
                    getWeatherResults(mView?.getContextInstance(), weatherData)
                }, { error ->
                    mView?.onError()
                })
    }

    private fun getWeatherResults(context: Context?, weatherData: WeatherData): WeatherData? {
        return try {
            val gson = Gson()
            val weatherJson = gson.toJson(weatherData)
            val weatherResults = gson.fromJson(weatherJson, com.quixom.apps.weatherstream.model.WeatherData::class.java)
            if (weatherResults != null) {
                mView?.onStoredDataFetched(weatherResults)
            }
            weatherResults
        } catch (e: Exception) {
            null
        }
    }
}