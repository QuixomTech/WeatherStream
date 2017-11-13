package com.quixom.apps.weatherstream.webservice

import retrofit2.Call

/**
* Created by akif on 11/10/17.
*/
class APIUtil {
    fun cancelCall(call: Call<*>?) {

        if (call != null && !call.isCanceled) {
            call.cancel()
        }
    }
}