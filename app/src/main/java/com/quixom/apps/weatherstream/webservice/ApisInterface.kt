package com.quixom.apps.weatherstream.webservice

import com.quixom.apps.weatherstream.model.WeatherData
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

/**
* Created by akif on 11/9/17.
*/
interface ApisInterface {

    /**
     * API method: Get current location weather forecasting by Name
     * */
    @GET("weather")
    fun getCurrentLocationWeatherByName(@Header("x-api-key") key: String, @Query("q") q: String): Observable<WeatherData>

    /**
     * API method: Get current location weather forecasting by Geographic Coordinates.
     * */
    @GET("weather")
    fun getCurrentLocationWeatherByGeographicCoordinates(@Header("x-api-key") key: String, @Query("lat") lat: Double, @Query("lng") lng: Double): Observable<WeatherData>
}