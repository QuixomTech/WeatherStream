package com.quixom.apps.weatherstream.webservice

import com.quixom.apps.weatherstream.model.WeatherData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.QueryMap

/**
* Created by akif on 11/10/17.
*/
interface WebApis {
    @GET("weather")
    fun getWeatherDetail(@Header(APIParameters.KEY_AUTH) key: String, @QueryMap params: java.util.HashMap<String, String>): Call<WeatherData>
}