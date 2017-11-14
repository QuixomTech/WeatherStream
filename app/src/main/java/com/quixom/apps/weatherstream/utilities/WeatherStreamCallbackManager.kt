package com.quixom.apps.weatherstream.utilities

/**
* Created by akif on 11/14/17.
*/

class WeatherStreamCallbackManager: WeatherStreamCallback {

    companion object {
        var weatherStreamCallbacks: MutableList<WeatherStreamCallback>? = null

        fun addWishCallBack(weatherStreamCallback: WeatherStreamCallback) {
            initList()
            if (!weatherStreamCallbacks!!.contains(weatherStreamCallback)) {
                weatherStreamCallbacks!!.add(weatherStreamCallback)
            }
        }

        fun removeWishCallBack(weatherStreamCallback: WeatherStreamCallback) {
            initList()
            if (weatherStreamCallbacks!!.contains(weatherStreamCallback)) {
                weatherStreamCallbacks!!.remove(weatherStreamCallback)
            }
        }

        fun updateHomeScreenData () {
            if (weatherStreamCallbacks == null || weatherStreamCallbacks!!.isEmpty()) return

            for (i in weatherStreamCallbacks!!) {
                i.onSearchLocationAction()
            }
        }
        private fun initList() {
            if (weatherStreamCallbacks == null) {
                weatherStreamCallbacks = ArrayList()
            }
        }
    }

    override fun onSearchLocationAction() {
    }
}