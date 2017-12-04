package com.quixom.apps.weatherstream

import android.annotation.SuppressLint
import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.graphics.Typeface
import android.net.ConnectivityManager
import android.speech.RecognizerIntent
import android.support.design.widget.Snackbar
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat
import android.text.SpannableString
import android.text.SpannableStringBuilder
import android.text.style.ForegroundColorSpan
import android.util.DisplayMetrics
import android.view.View
import android.view.WindowManager
import android.view.inputmethod.InputMethodManager
import android.widget.TextView
import android.widget.Toast
import com.quixom.apps.weatherstream.model.WeatherData
import com.quixom.apps.weatherstream.utilities.KeyUtil
import com.quixom.apps.weatherstream.utilities.WSProgressDialog
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by akif on 11/2/17.
 */
class Methods(val mActivity: MainActivity) {

    companion object {
        /**
         * Show Keyboard..
         *
         * @param activity: An activity object.
         */
        fun showKeyboard(activity: Activity) {
            val inm = activity.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inm.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0)
        }

        /***
         * Hide keyboard.
         *
         * @param activity: Main activity object.
         */
        fun hideKeyboard(activity: Activity) {
            if (activity != null) {
                activity.window?.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN)
                val view: View = activity.currentFocus
                if (true) run {
                    val imm = activity.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                    imm.hideSoftInputFromWindow(view.windowToken, 0)
                }
            }
        }

        /***
         * To prevent from double clicking on view and it's prevents to overlapping fragment.
         * **/
        fun avoidDoubleClicks(view: View) {
            val delayMillis: Long = 200
            if (!view.isClickable) run {
                return
            }
            view.isClickable = false
            view.postDelayed({ view.isClickable = true }, delayMillis)
        }

        /**
         * @param mainActivity use for get applicationContext
         * @param dp           value to convert into px
         * @return converted px from dp value
         */
        fun dpToPxConvertor(mainActivity: MainActivity, dp: Int): Int {
            val displayMetrics = mainActivity.resources.displayMetrics
            return Math.round(dp * (displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT))
        }

        /**
         * @param mainActivity use for get applicationContext
         * @param px           value to convert into dp
         * @return converted dp from px value
         */
        fun pxToDpConvertor(mainActivity: MainActivity, px: Int): Int {
            val displayMetrics = mainActivity.resources.displayMetrics
            return Math.round(px / (displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT))
        }

        /**
         * Share intent common.
         *
         * @param message: message
         */
        fun shareIntent(activity: Activity, message: String) {
            val sendIntent = Intent(Intent.ACTION_SEND)
            sendIntent.type = "text/plain"
            sendIntent.putExtra(android.content.Intent.EXTRA_TEXT, message)
            activity.startActivity(Intent.createChooser(sendIntent, "Sharing"))
        }

        /**
         * Convert time into millisecond.
         *
         * @param givenDateString: time which need to convert.
         * @return: time in millisecond.
         */
        fun convertTimeToMillisecond(givenDateString: String): Long {
            var timeInMilliseconds: Long = 0
            val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
            try {
                val mDate = sdf.parse(givenDateString)
                timeInMilliseconds = mDate.time
            } catch (e: ParseException) {
                e.printStackTrace()
            }
            return timeInMilliseconds
        }

        /**
         * Change format of date.
         *
         * @param dateTime:   notification date which is converted to local from GMT.
         * @param newFormat: Need to convert format.
         * @return: date with format.
         */
        private fun getDateFormate(dateTime: String, newFormat: String): String {
            val inputFormate = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
            val outputFormate = SimpleDateFormat(newFormat + " 'at' " + "hh:mm aa")
            try {
                val date = inputFormate.parse(dateTime)
                return outputFormate.format(date)
            } catch (e: ParseException) {
                e.printStackTrace()
            }
            return ""
        }

        /**
         * Convert GMT to local.
         *
         * @param mDate: notification created date.
         * @return: date which is converted in local.
         */
        fun getDateFormateGMTToLocal(mDate: String): String {
            val inputFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
            val outputFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
            val date: Date
            val str: String
            try {
                inputFormat.timeZone = TimeZone.getTimeZone("GMT")
                date = inputFormat.parse(mDate)
                outputFormat.timeZone = TimeZone.getDefault()
                str = outputFormat.format(date)
                return str
            } catch (e: Exception) {
                e.printStackTrace()
            }
            return ""
        }

        /***
         * Get date from Timestamp
         *
         * @param: timestamp value
         *
         * @return: date from given Timestamp
         */
        fun getDate(timeStamp: Long): String {
            return try {
                @SuppressLint("SimpleDateFormat") val sdf = SimpleDateFormat(KeyUtil.datePattern)
                val netDate = Date(timeStamp)
                sdf.format(netDate)
            } catch (ex: Exception) {
                ex.printStackTrace().toString()
            }
        }

        /**
         * Set string with spannable.
         *
         * @param first:  string
         * @param second: string
         * @return: string with two different text_selector_color
         */
        fun getSpannableString(context: Context, first: String, second: String): SpannableStringBuilder {

            val font1 = Typeface.createFromAsset(context.assets, "fonts/Roboto-Regular.ttf")
            val font2 = Typeface.createFromAsset(context.assets, "fonts/Roboto-Medium.ttf")
            val builder = SpannableStringBuilder()

            val dkgraySpannable = SpannableString(first + " ")
            dkgraySpannable.setSpan(ForegroundColorSpan(ContextCompat.getColor(context, R.color.font_white)), 0, first.length, 0)
//            dkgraySpannable.setSpan(CustomTypefaceSpan("", font1), 0, second.length, 0)
            builder.append(dkgraySpannable)

            val blackSpannable = SpannableString(second)
            blackSpannable.setSpan(ForegroundColorSpan(ContextCompat.getColor(context, R.color.font_white)), 0, second.length, 0)
//            blackSpannable.setSpan(CustomTypefaceSpan("", font2), 0, second.length, 0)
            builder.append(blackSpannable)
            return builder
        }

        /***
         * Method for check network connection
         *
         * @param: instance of MainActivity
         * */
        @SuppressLint("MissingPermission")
        fun isNetworkConnected(mActivity: MainActivity): Boolean {
            val cm: ConnectivityManager = mActivity.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            return cm.activeNetworkInfo != null
        }

        /**
         * Method for calculate percentage value
         * */
        fun calculatePercentage(value: Double, total: Double): Int {
            val usage = (value * 100.0f / total).toInt().toDouble()
            return usage.toInt()
        }

        /**
         * Showing google speech input dialog
         */
        fun promptSpeechInput(activity: Activity) {
            val intent = Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH)
            intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM)
            intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault())
            intent.putExtra(RecognizerIntent.EXTRA_PROMPT, activity.getString(R.string.speech_prompt))
            try {
                ActivityCompat.startActivityForResult(activity, intent, KeyUtil.REQ_CODE_SPEECH_INPUT, null)
            } catch (a: ActivityNotFoundException) {
                Toast.makeText(activity, activity.getString(R.string.speech_not_supported), Toast.LENGTH_SHORT).show()
            }
        }

        /***
         * Method for show SnackBar layout
         * */
        fun showSnackBar(view: View, message: String, color: Int, mActivity: MainActivity) {
            val snackbar = Snackbar.make(view, message, Snackbar.LENGTH_LONG)

            // Changing action button text text_selector_color
            val sbView = snackbar.view
            sbView.setBackgroundColor(color)
            val textView = sbView.findViewById<View>(android.support.design.R.id.snackbar_text) as TextView
            textView.setTextColor(ContextCompat.getColor(mActivity, R.color.font_white))
            snackbar.show()
        }

        /***
         * Method for check history
         * **/
        fun checkHistory(): Boolean {
            val weatherData: WeatherData? = WeatherData.getLocationBasedWeatherDetails()
            return weatherData == null
        }

        /*** Converts to celsius */
        fun convertFahrenheitToCelsius(fahrenheit: Float): Float = (fahrenheit - 32) * 5 / 9

        /*** Converts to fahrenheit */
        fun convertCelsiusToFahrenheit(celsius: Float): Float = celsius * 9 / 5 + 32

        /*** Convert meters/second to miles/hour */
        fun getMiles(i: Float): Double = i * 0.000621371192

        /*** Convert miles/hour to meter/second */
        fun getMeters(i: Float): Double = i * 1609.344

        /*** Convert hPa to in/Hg */
        fun getInHG(i: Float): Double = i * 0.02952998751

        /*** Convert in/Hg to hpa */
        fun gethPa(i: Float): Double = i * 33.8638816

        var wsProgressDialog: WSProgressDialog? = null

        /**
         * This method shows progressBar.
         *
         * @param mContext: context.
         */
        fun isProgressShowMessage(mContext: Context) {
            try {
                if (wsProgressDialog == null) {
                    wsProgressDialog = WSProgressDialog.show(mContext, false, null)
                } else {
                    if (!wsProgressDialog!!.isShowing) {
                        wsProgressDialog = WSProgressDialog.show(mContext, false, null)
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }

        }

        /**
         * This method is hide a progressBar.
         */
        fun isProgressHide() {
            try {
                wsProgressDialog?.dismiss()
            } catch (e: Exception) {
                e.printStackTrace()
            }

        }
    }
}