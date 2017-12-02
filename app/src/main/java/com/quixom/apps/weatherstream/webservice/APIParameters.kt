package com.quixom.apps.weatherstream.webservice

import java.util.*

/**
* Created by akif on 11/10/17.
*/

object APIParameters {

    fun getParam(): HashMap<String, String> = HashMap()

    class LocationSearch {
        companion object {
            val apiKey = "apikey"
            val lat = "lat"
            val lon = "lon"
            val type = "type"
            val units = "units"
        }
    }

    class  ForecastingWeather {
        companion object {
            val apiKey = "apikey"
            val lat = "lat"
            val lon = "lon"
            val units = "units"
            val type = "type"
        }
    }
}