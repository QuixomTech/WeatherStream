package com.quixom.apps.weatherstream.webservice

import com.quixom.apps.weatherstream.BuildConfig
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by akif on 11/10/17.
 */
open class NetworkConfig {
    companion object {
        private  var retrofitInstance: Retrofit? = null
        private var webApi: WebApis? = null

        fun getRetrofit(): Retrofit {
            if (retrofitInstance == null) {

                retrofitInstance = Retrofit.Builder()
                        .baseUrl(BuildConfig.BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()
            }
            return retrofitInstance!!
        }

        fun getWebApis(): WebApis {
            if (webApi == null) {
                webApi = NetworkConfig.getRetrofit().create(WebApis::class.java)
            }
            return webApi!!
        }
    }
}