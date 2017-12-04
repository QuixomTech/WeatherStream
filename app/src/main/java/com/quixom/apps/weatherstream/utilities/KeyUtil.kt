package com.quixom.apps.weatherstream.utilities


/**
* Created by akif on 14/11/17.
*/

object KeyUtil {
    val datePattern = "dd MMM yyyy HH:mm:ss z"
    val KEY_MODE = "key_mode"
    var KEY_LOCATION = "key_location"

    val REQ_CODE_SPEECH_INPUT = 101
    val PLACE_AUTOCOMPLETE_REQUEST_CODE: Int = 102
    val RC_ENABLE_LOCATION = 103
    val RC_LOCATION_PERMISSION = 104
    val KEY_CALL_PERMISSION = 105

    /*** Application theme */
    val THEME_DEFAULT = 0
    val THEME_NIGHT = 1

    /*** Weather Map api Units */
    val UNITS_STANDARD = "Standard"
    val UNITS_METRIC = "metric"
    val UNITS_IMPERIAL = "imperial"

    /*** Weather Map api accuracy types */
    val TYPES_ACCURATE = "accurate"
    val TYPES_LIKE = "like"

    val LATITUDE_VALUE = "LATITUDE"
    val LONGITUDE_VALUE = "LONGITUDE"
}
