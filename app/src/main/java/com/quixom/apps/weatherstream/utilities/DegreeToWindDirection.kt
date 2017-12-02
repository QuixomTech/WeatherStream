package com.quixom.apps.weatherstream.utilities

import com.quixom.apps.weatherstream.MainActivity
import com.quixom.apps.weatherstream.R

/**
* Created by akif on 11/14/17.
*/
object DegreeToWindDirection {

    fun getWindDirection(mainActivity: MainActivity, degree: Double): String {
        if (degree > 11.25 && degree < 33.75) {
            return mainActivity.resources.getString(R.string.nne)
        }
        if (degree > 33.75 && degree < 56.25) {
            return mainActivity.resources.getString(R.string.ne)
        }
        if (degree > 56.25 && degree < 78.75) {
            return mainActivity.resources.getString(R.string.ene)
        }
        if (degree > 78.75 && degree < 101.25) {
            return mainActivity.resources.getString(R.string.e)
        }
        if (degree > 101.25 && degree < 123.75) {
            return mainActivity.resources.getString(R.string.ese)
        }
        if (degree > 123.75 && degree < 146.25) {
            return mainActivity.resources.getString(R.string.se)
        }
        if (degree > 146.25 && degree < 168.75) {
            return mainActivity.resources.getString(R.string.sse)
        }
        if (degree > 168.75 && degree < 191.25) {
            return mainActivity.resources.getString(R.string.s)
        }
        if (degree > 191.25 && degree < 213.75) {
            return mainActivity.resources.getString(R.string.ssw)
        }
        if (degree > 213.75 && degree < 236.25) {
            return mainActivity.resources.getString(R.string.sw)
        }
        if (degree > 236.25 && degree < 258.75) {
            return mainActivity.resources.getString(R.string.wsw)
        }
        if (degree > 258.75 && degree < 281.25) {
            return mainActivity.resources.getString(R.string.w)
        }
        if (degree > 281.25 && degree < 303.75) {
            return mainActivity.resources.getString(R.string.wnw)
        }
        if (degree > 303.75 && degree < 326.25) {
            return mainActivity.resources.getString(R.string.nw)
        }
        if (degree > 326.25 && degree < 348.75) {
            return mainActivity.resources.getString(R.string.nnw)
        } else {
            return mainActivity.resources.getString(R.string.n)
        }
    }
}