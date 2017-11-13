package com.quixom.apps.weatherstream.webservice

import android.accounts.NetworkErrorException
import android.app.Activity
import com.quixom.apps.weatherstream.R
import okhttp3.ResponseBody
import retrofit2.Converter
import retrofit2.Response
import java.io.IOException
import java.net.UnknownHostException
import java.util.concurrent.TimeoutException

/**
* Created by akif on 11/10/17.
*/
class ErrorHandler(var mActivity: Activity) {

    fun parseError(response: Response<*>): APIError {

        val converter: Converter<ResponseBody, APIError> = NetworkConfig.getRetrofit().responseBodyConverter(APIError::class.java, arrayOfNulls<Annotation>(0))

        var apiError: APIError
        try {
            apiError = converter.convert(response.errorBody()!!)
        } catch (e: IOException) {
            apiError = APIError()
            apiError.setMessage(mActivity.resources.getString(R.string.something_went_wrong))
            return apiError
        }

        return apiError
    }

    fun setExceptionMessage(t: Throwable?) {
        if (t != null) {
            if (t is IndexOutOfBoundsException) {
//                sActivity.croutonUtil.showCrouton(sActivity.resources.getString(R.string.something_went_wrong))
            } else if (t is TimeoutException) {
            } else if (t is UnknownHostException) {
            } else if (t is NetworkErrorException) {
            } else if (t is IOException) {
            } else {
            }
        } else {
//            sActivity.croutonUtil.showCrouton(sActivity.resources.getString(R.string.something_went_wrong))
        }
    }
}