package com.quixom.apps.weatherstream.webservice

import com.quixom.apps.weatherstream.utilities.KeyUtil
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by akif on 11/9/17.
 */
object NetworkServices {
    var retrofit: Retrofit
    lateinit var retrofit2: Retrofit
    var logging: HttpLoggingInterceptor = HttpLoggingInterceptor()
    var httpClient:OkHttpClient.Builder = OkHttpClient.Builder()

    init {
        logging.level = HttpLoggingInterceptor.Level.BODY
        httpClient.addInterceptor(logging)

        retrofit = Retrofit.Builder()
                .baseUrl(KeyUtil.BASE_URL_OPEN_WEATHER_MAP)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient.build())
                .build()

        retrofit2 = Retrofit.Builder()
                .baseUrl(KeyUtil.BASE_URL_ACCUWEATHER)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient.build())
                .build()
    }

    fun getOpenWeatherMAPApi() = retrofit.create(ApisInterface::class.java)
    fun getAccuWeatherApi() = retrofit2.create(ApisInterface::class.java)
}

