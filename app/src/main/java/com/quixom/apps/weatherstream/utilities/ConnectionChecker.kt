package com.quixom.apps.weatherstream.utilities

import android.annotation.SuppressLint
import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo

/**
* Created by akif on 11/10/17.
*/
class ConnectionChecker(val mContext: Context) {

    @SuppressLint("MissingPermission")
    fun isConnectionAvailable(): Boolean {
        val connectivityManager: ConnectivityManager = mContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo: NetworkInfo = connectivityManager.activeNetworkInfo
        return networkInfo.isConnected
    }
}