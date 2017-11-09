package com.quixom.apps.weatherstream.webservice

import android.content.Context
import com.quixom.apps.weatherstream.model.WeatherData

/**
 * Created by akif on 11/9/17.
 */
interface WeatherDataUpdator {
    interface View {
        fun onDataFetched(weatherData: WeatherData?)

        fun onStoredDataFetched(weatherData: WeatherData?)

        fun onError()

        fun getContextInstance(): Context
    }

    interface Presenter {
        fun subscribe(view: WeatherDataUpdator.View)

        fun unSubscribe()

        fun refresh(locationName: String)
    }
}