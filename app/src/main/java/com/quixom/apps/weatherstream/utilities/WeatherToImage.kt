package com.quixom.apps.weatherstream.utilities

import com.quixom.apps.weatherstream.R

/**
* Created by akif on 14/11/17.
*/
object WeatherToImage {

    fun getImageForCode(code: String): Int = when (code) {

    /*** Thunderstorm **/
        "200" -> {
            // thunderstorm with light rain
            R.drawable.snow
        }
        "201" -> {
            // thunderstorm with light rain
            R.drawable.snow
        }
        "202" -> {
            // thunderstorm with heavy rain
            R.drawable.snow
        }
        "210" -> {
            // light thunderstorm
            R.drawable.snow
        }
        "211" -> {
            // thunderstorm
            R.drawable.snow
        }
        "212" -> {
            // heavy thunderstorm
            R.drawable.snow
        }
        "221" -> {
            // ragged thunderstorm
            R.drawable.snow
        }
        "230" -> {
            // thunderstorm with light drizzle
            R.drawable.snow
        }
        "231" -> {
            // thunderstorm with drizzle
            R.drawable.snow
        }
        "232" -> {
            // thunderstorm with heavy drizzle
            R.drawable.snow
        }

    /*** Drizzle  **/
        "300" -> {
            // light intensity drizzle
            R.drawable.snow
        }
        "301" -> {
            // drizzle
            R.drawable.snow
        }
        "302" -> {
            // heavy intensity drizzle
            R.drawable.snow
        }
        "310" -> {
            // light intensity drizzle rain
            R.drawable.snow
        }
        "311" -> {
            // drizzle rain
            R.drawable.snow
        }
        "312" -> {
            // heavy intensity drizzle rain
            R.drawable.snow
        }
        "313" -> {
            // shower rain and drizzle
            R.drawable.snow
        }
        "314" -> {
            // heavy shower rain and drizzle
            R.drawable.snow
        }
        "321" -> {
            // shower drizzle
            R.drawable.snow
        }

    /*** Rain **/
        "500" -> {
            // light rain
            R.drawable.snow
        }
        "501" -> {
            // moderate rain
            R.drawable.snow
        }
        "502" -> {
            // heavy intensity rain
            R.drawable.snow
        }
        "503" -> {
            // very heavy rain
            R.drawable.snow
        }
        "504" -> {
            // extreme rain
            R.drawable.snow
        }
        "511" -> {
            // freezing rain
            R.drawable.snow
        }
        "520" -> {
            // light intensity shower rain
            R.drawable.snow
        }
        "521" -> {
            // shower rain
            R.drawable.snow
        }
        "522" -> {
            // heavy intensity shower rain
            R.drawable.snow
        }
        "531" -> {
            // ragged shower rain
            R.drawable.snow
        }

    /*** Snow **/
        "600" -> {
            // light snow
            R.drawable.snow
        }
        "601" -> {
            // snow
            R.drawable.snow
        }
        "602" -> {
            // heavy snow
            R.drawable.snow
        }
        "611" -> {
            // sleet
            R.drawable.snow
        }
        "612" -> {
            // shower sleet
            R.drawable.snow
        }
        "615" -> {
            // light rain and snow
            R.drawable.snow
        }
        "616" -> {
            // rain and snow
            R.drawable.snow
        }
        "620" -> {
            // light shower snow
            R.drawable.snow
        }
        "621" -> {
            // shower snow
            R.drawable.snow
        }
        "622" -> {
            // heavy shower snow
            R.drawable.snow
        }

    /*** Atmosphere **/
        "701" -> {
            // mist
            R.drawable.snow
        }
        "711" -> {
            // smoke
            R.drawable.snow
        }
        "721" -> {
            // haze
            R.drawable.snow
        }
        "731" -> {
            // sand, dust whirls
            R.drawable.snow
        }
        "741" -> {
            // fog
            R.drawable.snow
        }
        "751" -> {
            // sand
            R.drawable.snow
        }
        "761" -> {
            // dust
            R.drawable.snow
        }
        "762" -> {
            // volcanic ash
            R.drawable.snow
        }
        "771" -> {
            // squalls
            R.drawable.snow
        }
        "781" -> {
            // tornado
            R.drawable.snow
        }

    /*** Clear **/
        "800" -> {
            // clear sky
            R.drawable.snow
        }

    /*** Clouds **/

        "801" -> {
            // few clouds
            R.drawable.snow
        }
        "802" -> {
            // scattered clouds
            R.drawable.snow
        }
        "803" -> {
            // broken clouds
            R.drawable.snow
        }
        "804" -> {
            // overcast clouds
            R.drawable.snow
        }

    /*** Extreme **/
        "900" -> {
            // tornado
            R.drawable.snow
        }
        "901" -> {
            // tropical storm
            R.drawable.snow
        }
        "902" -> {
            // hurricane
            R.drawable.snow
        }
        "903" -> {
            // cold
            R.drawable.snow
        }
        "904" -> {
            // hot
            R.drawable.snow
        }
        "905" -> {
            // windy
            R.drawable.snow
        }
        "906" -> {
            // hail
            R.drawable.snow
        }

    /*** Additional **/
        "951" -> {
            // calm
            R.drawable.snow
        }
        "952" -> {
            // light breeze
            R.drawable.snow
        }
        "953" -> {
            // gentle breeze
            R.drawable.snow
        }
        "954" -> {
            // moderate breeze
            R.drawable.snow
        }
        "955" -> {
            // fresh breeze
            R.drawable.snow
        }
        "956" -> {
            // strong breeze
            R.drawable.snow
        }
        "957" -> {
            // high wind, near gale
            R.drawable.snow
        }
        "958" -> {
            // gale
            R.drawable.snow
        }
        "959" -> {
            // severe gale
            R.drawable.snow
        }
        "960" -> {
            // storm
            R.drawable.snow
        }
        "961" -> {
            // violent storm
            R.drawable.snow
        }
        "962" -> {
            // hurricane
            R.drawable.snow
        }

        else -> {
            R.drawable.snow
        }
    }
}