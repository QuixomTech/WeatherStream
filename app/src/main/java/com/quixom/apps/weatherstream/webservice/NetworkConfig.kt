package com.quixom.apps.weatherstream.webservice

import com.quixom.apps.weatherstream.BuildConfig
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
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
                val logging: HttpLoggingInterceptor = HttpLoggingInterceptor()
                logging.level = HttpLoggingInterceptor.Level.BODY
                val httpClient: OkHttpClient.Builder = OkHttpClient.Builder()
                httpClient.addInterceptor(logging)

                retrofitInstance = Retrofit.Builder()
                        .baseUrl(BuildConfig.BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .client(httpClient.build())
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