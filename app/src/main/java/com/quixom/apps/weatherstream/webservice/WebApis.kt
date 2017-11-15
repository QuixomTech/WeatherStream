package com.quixom.apps.weatherstream.webservice

import com.quixom.apps.weatherstream.model.WeatherData
import com.quixom.apps.weatherstream.model.WeatherForecastData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.QueryMap
import java.util.*

/**
* Created by akif on 11/10/17.
*/
interface WebApis {

    @GET("weather")
    fun getWeatherDetail(@Header(APIParameters.KEY_AUTH) key: String, @QueryMap params: java.util.HashMap<String, String>): Call<WeatherData>

    @GET("forecast")
    fun getWeatherForecasting(@Header(APIParameters.KEY_AUTH) key: String, @QueryMap params: HashMap<String, String>): Call<WeatherForecastData>
}