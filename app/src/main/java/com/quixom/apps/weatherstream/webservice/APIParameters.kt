package com.quixom.apps.weatherstream.webservice

import java.util.*

/**
* Created by akif on 11/10/17.
*/

object APIParameters {

    var BASE_URL = "https://api.openweathermap.org/data/2.5/"
    val KEY_OPEN_WEATHER_MAP_KEY = "63ce7b4d979b0eee4325513aa8b112e0"
    const val KEY_AUTH = "x-api-key"

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