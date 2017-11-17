package com.quixom.apps.weatherstream.utilities

import com.github.matteobattilana.weather.PrecipType
import com.quixom.apps.weatherstream.R
import com.quixom.apps.weatherstream.fragments.MainFragment
import com.quixom.apps.weatherstream.weatherview.WeatherView

/**
 * Created by akif on 14/11/17.
 */
object WeatherToImage {

    fun getWeatherTypeConditionCode(mainFragment: MainFragment, weatherView: WeatherView, code: String): Int =

            when (code) {

    /*** Thunderstorm **/
        "200" -> {
            // thunderstorm with light rain
            mainFragment.setWeatherData(PrecipType.RAIN)
            weatherView.emissionRate = 25f
            weatherView.fadeOutPercent = 1f
            weatherView.angle = 10
            R.drawable.snow
        }
        "201" -> {
            // thunderstorm with light rain
            mainFragment.setWeatherData(PrecipType.RAIN)
            weatherView.emissionRate = 25f
            weatherView.fadeOutPercent = 1f
            weatherView.angle = 20
            R.drawable.snow
        }
        "202" -> {
            // thunderstorm with heavy rain
            mainFragment.setWeatherData(PrecipType.RAIN)
            weatherView.emissionRate = 75f
            weatherView.fadeOutPercent = 1.2f
            weatherView.angle = 30
            R.drawable.snow
        }
        "210" -> {
            // light thunderstorm
            mainFragment.setWeatherData(PrecipType.CLEAR)
            R.drawable.snow
        }
        "211" -> {
            // thunderstorm
            mainFragment.setWeatherData(PrecipType.CLEAR)
            R.drawable.snow
        }
        "212" -> {
            // heavy thunderstorm
            mainFragment.setWeatherData(PrecipType.CLEAR)
            R.drawable.snow
        }
        "221" -> {
            // ragged thunderstorm
            mainFragment.setWeatherData(PrecipType.CLEAR)
            R.drawable.snow
        }
        "230" -> {
            // thunderstorm with light drizzle
            mainFragment.setWeatherData(PrecipType.CLEAR)
            R.drawable.snow
        }
        "231" -> {
            // thunderstorm with drizzle
            mainFragment.setWeatherData(PrecipType.CLEAR)
            R.drawable.snow
        }
        "232" -> {
            // thunderstorm with heavy drizzle
            mainFragment.setWeatherData(PrecipType.CLEAR)
            R.drawable.snow
        }

    /*** Drizzle  **/
        "300" -> {
            // light intensity drizzle
            mainFragment.setWeatherData(PrecipType.CLEAR)
            R.drawable.snow
        }
        "301" -> {
            // drizzle
            mainFragment.setWeatherData(PrecipType.CLEAR)
            R.drawable.snow
        }
        "302" -> {
            // heavy intensity drizzle
            mainFragment.setWeatherData(PrecipType.CLEAR)
            R.drawable.snow
        }
        "310" -> {
            // light intensity drizzle rain
            mainFragment.setWeatherData(PrecipType.RAIN)
            weatherView.emissionRate = 15f
            weatherView.fadeOutPercent = 1.5f
            weatherView.angle = 10
            R.drawable.snow
        }
        "311" -> {
            // drizzle rain
            mainFragment.setWeatherData(PrecipType.RAIN)
            weatherView.emissionRate = 20f
            weatherView.fadeOutPercent = 1.3f
            weatherView.angle = 20
            R.drawable.snow
        }
        "312" -> {
            // heavy intensity drizzle rain
            mainFragment.setWeatherData(PrecipType.RAIN)
            weatherView.emissionRate = 50f
            weatherView.fadeOutPercent = 1.3f
            weatherView.angle = 10
            R.drawable.snow
        }
        "313" -> {
            // shower rain and drizzle
            mainFragment.setWeatherData(PrecipType.RAIN)
            weatherView.emissionRate = 55f
            weatherView.fadeOutPercent = 1.1f
            weatherView.angle = 30
            R.drawable.snow
        }
        "314" -> {
            // heavy shower rain and drizzle
            mainFragment.setWeatherData(PrecipType.RAIN)
            weatherView.emissionRate = 60f
            weatherView.fadeOutPercent = 1.1f
            weatherView.angle = 30
            R.drawable.snow
        }
        "321" -> {
            // shower drizzle
            R.drawable.snow
        }

    /*** Rain **/
        "500" -> {
            // light rain
            mainFragment.setWeatherData(PrecipType.RAIN)
            weatherView.emissionRate = 25f
            weatherView.fadeOutPercent = 1.2f
            weatherView.angle = 20
            R.drawable.snow
        }
        "501" -> {
            // moderate rain
            mainFragment.setWeatherData(PrecipType.RAIN)
            weatherView.emissionRate = 50f
            weatherView.fadeOutPercent = 1.2f
            weatherView.angle = 10
            R.drawable.snow
        }
        "502" -> {
            // heavy intensity rain
            mainFragment.setWeatherData(PrecipType.RAIN)
            weatherView.emissionRate = 80f
            weatherView.fadeOutPercent = 1.1f
            weatherView.angle = 20
            R.drawable.snow
        }
        "503" -> {
            // very heavy rain
            mainFragment.setWeatherData(PrecipType.RAIN)
            weatherView.emissionRate = 90f
            weatherView.fadeOutPercent = 1.3f
            weatherView.angle = 20
            R.drawable.snow
        }
        "504" -> {
            // extreme rain
            mainFragment.setWeatherData(PrecipType.RAIN)
            weatherView.emissionRate = 110f
            weatherView.fadeOutPercent = 1.5f
            weatherView.angle = 10
            R.drawable.snow
        }
        "511" -> {
            // freezing rain
            mainFragment.setWeatherData(PrecipType.SNOW)
            weatherView.emissionRate = 50f
            weatherView.fadeOutPercent = 0.7f
            weatherView.angle = 10
            R.drawable.snow
        }
        "520" -> {
            // light intensity shower rain
            mainFragment.setWeatherData(PrecipType.RAIN)
            weatherView.emissionRate = 40f
            weatherView.fadeOutPercent = 0.7f
            weatherView.angle = 30
            R.drawable.snow
        }
        "521" -> {
            // shower rain
            mainFragment.setWeatherData(PrecipType.RAIN)
            weatherView.emissionRate = 55f
            weatherView.fadeOutPercent = 1f
            weatherView.angle = 10
            R.drawable.snow
        }
        "522" -> {
            // heavy intensity shower rain
            mainFragment.setWeatherData(PrecipType.RAIN)
            weatherView.emissionRate = 70f
            weatherView.fadeOutPercent = 1.2f
            weatherView.angle = 10
            R.drawable.snow
        }
        "531" -> {
            // ragged shower rain
            mainFragment.setWeatherData(PrecipType.RAIN)
            weatherView.emissionRate = 60f
            weatherView.fadeOutPercent = 1f
            weatherView.angle = 10
            R.drawable.snow
        }

    /*** Snow **/
        "600" -> {
            // light snow
            mainFragment.setWeatherData(PrecipType.SNOW)
            weatherView.emissionRate = 5f
            weatherView.fadeOutPercent = .8f
            weatherView.angle = 20
            R.drawable.snow
        }
        "601" -> {
            // snow
            mainFragment.setWeatherData(PrecipType.SNOW)
            weatherView.emissionRate = 8f
            weatherView.fadeOutPercent = 1f
            weatherView.angle = 10
            R.drawable.snow
        }
        "602" -> {
            // heavy snow
            mainFragment.setWeatherData(PrecipType.SNOW)
            weatherView.emissionRate = 20f
            weatherView.fadeOutPercent = 1.1f
            weatherView.angle = 10
            R.drawable.snow
        }
        "611" -> {
            // sleet
            mainFragment.setWeatherData(PrecipType.SNOW)
            weatherView.emissionRate = 5f
            weatherView.fadeOutPercent = 1.1f
            weatherView.angle = 10
            R.drawable.snow
        }
        "612" -> {
            // shower sleet
            mainFragment.setWeatherData(PrecipType.SNOW)
            weatherView.emissionRate = 6f
            weatherView.fadeOutPercent = 1f
            weatherView.angle = 10
            R.drawable.snow
        }
        "615" -> {
            // light rain and snow
            mainFragment.setWeatherData(PrecipType.SNOW)
            weatherView.emissionRate = 6f
            weatherView.fadeOutPercent = .9f
            weatherView.angle = 20
            R.drawable.snow
        }
        "616" -> {
            // rain and snow
            mainFragment.setWeatherData(PrecipType.SNOW)
            weatherView.emissionRate = 8f
            weatherView.fadeOutPercent = 1.1f
            weatherView.angle = 20
            R.drawable.snow
        }
        "620" -> {
            // light shower snow
            mainFragment.setWeatherData(PrecipType.SNOW)
            weatherView.emissionRate = 5f
            weatherView.fadeOutPercent = .8f
            weatherView.angle = 10
            R.drawable.snow
        }
        "621" -> {
            // shower snow
            mainFragment.setWeatherData(PrecipType.SNOW)
            weatherView.emissionRate = 7f
            weatherView.fadeOutPercent = .8f
            weatherView.angle = 10
            R.drawable.snow
        }
        "622" -> {
            // heavy shower snow
            mainFragment.setWeatherData(PrecipType.SNOW)
            weatherView.emissionRate = 20f
            weatherView.fadeOutPercent = 1.1f
            weatherView.angle = 10
            R.drawable.snow
        }

    /*** Atmosphere **/
        "701" -> {
            // mist
            mainFragment.setWeatherData(PrecipType.CLEAR)
            R.drawable.snow
        }
        "711" -> {
            // smoke
            mainFragment.setWeatherData(PrecipType.CLEAR)
            R.drawable.snow
        }
        "721" -> {
            // haze
            mainFragment.setWeatherData(PrecipType.CLEAR)
            R.drawable.snow
        }
        "731" -> {
            // sand, dust whirls
            mainFragment.setWeatherData(PrecipType.CLEAR)
            R.drawable.snow
        }
        "741" -> {
            // fog
            mainFragment.setWeatherData(PrecipType.CLEAR)
            R.drawable.snow
        }
        "751" -> {
            // sand
            mainFragment.setWeatherData(PrecipType.CLEAR)
            R.drawable.snow
        }
        "761" -> {
            // dust
            mainFragment.setWeatherData(PrecipType.CLEAR)
            R.drawable.snow
        }
        "762" -> {
            // volcanic ash
            mainFragment.setWeatherData(PrecipType.CLEAR)
            R.drawable.snow
        }
        "771" -> {
            // squalls
            mainFragment.setWeatherData(PrecipType.CLEAR)
            R.drawable.snow
        }
        "781" -> {
            // tornado
            mainFragment.setWeatherData(PrecipType.CLEAR)
            R.drawable.snow
        }

    /*** Clear **/
        "800" -> {
            // clear sky
            mainFragment.setWeatherData(PrecipType.CLEAR)
            R.drawable.snow
        }

    /*** Clouds **/

        "801" -> {
            // few clouds
            mainFragment.setWeatherData(PrecipType.CLEAR)
            R.drawable.snow
        }
        "802" -> {
            // scattered clouds
            mainFragment.setWeatherData(PrecipType.CLEAR)
            R.drawable.snow
        }
        "803" -> {
            // broken clouds
            mainFragment.setWeatherData(PrecipType.CLEAR)
            R.drawable.snow
        }
        "804" -> {
            // overcast clouds
            mainFragment.setWeatherData(PrecipType.CLEAR)
            R.drawable.snow
        }

    /*** Extreme **/
        "900" -> {
            // tornado
            mainFragment.setWeatherData(PrecipType.CLEAR)
            R.drawable.snow
        }
        "901" -> {
            // tropical storm
            mainFragment.setWeatherData(PrecipType.CLEAR)
            R.drawable.snow
        }
        "902" -> {
            // hurricane
            mainFragment.setWeatherData(PrecipType.CLEAR)
            R.drawable.snow
        }
        "903" -> {
            // cold
            mainFragment.setWeatherData(PrecipType.CLEAR)
            R.drawable.snow
        }
        "904" -> {
            // hot
            mainFragment.setWeatherData(PrecipType.CLEAR)
            R.drawable.snow
        }
        "905" -> {
            // windy
            mainFragment.setWeatherData(PrecipType.CLEAR)
            R.drawable.snow
        }
        "906" -> {
            // hail
            mainFragment.setWeatherData(PrecipType.CLEAR)
            R.drawable.snow
        }

    /*** Additional **/
        "951" -> {
            // calm
            mainFragment.setWeatherData(PrecipType.CLEAR)
            R.drawable.snow
        }
        "952" -> {
            // light breeze
            mainFragment.setWeatherData(PrecipType.CLEAR)
            R.drawable.snow
        }
        "953" -> {
            // gentle breeze
            mainFragment.setWeatherData(PrecipType.CLEAR)
            R.drawable.snow
        }
        "954" -> {
            // moderate breeze
            mainFragment.setWeatherData(PrecipType.CLEAR)
            R.drawable.snow
        }
        "955" -> {
            // fresh breeze
            mainFragment.setWeatherData(PrecipType.CLEAR)
            R.drawable.snow
        }
        "956" -> {
            // strong breeze
            mainFragment.setWeatherData(PrecipType.CLEAR)
            R.drawable.snow
        }
        "957" -> {
            // high wind, near gale
            mainFragment.setWeatherData(PrecipType.CLEAR)
            R.drawable.snow
        }
        "958" -> {
            // gale
            mainFragment.setWeatherData(PrecipType.CLEAR)
            R.drawable.snow
        }
        "959" -> {
            // severe gale
            mainFragment.setWeatherData(PrecipType.CLEAR)
            R.drawable.snow
        }
        "960" -> {
            // storm
            mainFragment.setWeatherData(PrecipType.CLEAR)
            R.drawable.snow
        }
        "961" -> {
            // violent storm
            mainFragment.setWeatherData(PrecipType.CLEAR)
            R.drawable.snow
        }
        "962" -> {
            // hurricane
            mainFragment.setWeatherData(PrecipType.CLEAR)
            R.drawable.snow
        }

        else -> {
            mainFragment.setWeatherData(PrecipType.CLEAR)
            R.drawable.snow
        }
    }
}