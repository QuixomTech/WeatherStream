package com.quixom.apps.weatherstream.utilities


/**
 * Created by mind on 30/03/17.
 */

object KeyUtil {
    val datePattern = "dd MMM yyyy HH:mm:ss z"
    val KEY_MODE = "key_mode"

    /*** Sensor  */
    val KEY_SENSOR_NAME = "key_sensor_name"
    val KEY_SENSOR_TYPE = "key_sensor_type"
    val KEY_SENSOR_ICON = "key_sensor_icon"

    var KEY_LAST_KNOWN_HUMIDITY = 0f

    val KEY_CAMERA_CODE = 101
    val KEY_CALL_PERMISSION = 102
    val IS_USER_COME_FROM_SYSTEM_APPS = 1
    val IS_USER_COME_FROM_USER_APPS = 2

    val REQ_CODE_SPEECH_INPUT = 103
}
