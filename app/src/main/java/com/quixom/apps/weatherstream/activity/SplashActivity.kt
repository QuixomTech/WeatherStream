package com.quixom.apps.weatherstream.activity

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.location.Location
import android.location.LocationListener
import android.location.LocationManager
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.provider.Settings
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.google.android.gms.location.places.ui.PlaceAutocomplete
import com.quixom.apps.weatherstream.MainActivity
import com.quixom.apps.weatherstream.Methods
import com.quixom.apps.weatherstream.R
import com.quixom.apps.weatherstream.utilities.KeyUtil
import com.quixom.apps.weatherstream.utilities.KeyUtil.RC_ENABLE_LOCATION
import com.quixom.apps.weatherstream.utilities.KeyUtil.RC_LOCATION_PERMISSION

class SplashActivity : AppCompatActivity() {
    var mLocationManager: LocationManager? = null
    var mLocation: Location? = null
    val SPLASH_TIME_OUT = 1000

    /***
     * Refresh the weather location on location changed
     * */
    var mLocationListener: LocationListener = object : LocationListener {
        override fun onLocationChanged(location: Location?) {

            //Check if the location is not null
            //Remove the location listener as we don't need to fetch the weather again and again
            if (location?.latitude != null && location.latitude != 0.0 && location.longitude != 0.0) {
                mLocation = location
                mLocationManager?.removeUpdates(this)

                Handler().postDelayed({
                    val intent = Intent(this@SplashActivity, MainActivity::class.java)
                    intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                    intent.putExtra(KeyUtil.LATITUDE_VALUE, location.latitude)
                    intent.putExtra(KeyUtil.LONGITUDE_VALUE, location.longitude)
                    startActivity(intent)
                    finish()
                }, SPLASH_TIME_OUT.toLong())
            }
        }

        override fun onStatusChanged(provider: String?, status: Int, extras: Bundle?) {
            Toast.makeText(this@SplashActivity, "Status", Toast.LENGTH_SHORT).show()
        }

        override fun onProviderEnabled(provider: String?) {
            Toast.makeText(this@SplashActivity, "Provider", Toast.LENGTH_SHORT).show()
        }

        override fun onProviderDisabled(provider: String?) {
            Handler().postDelayed({
                val intent = Intent(this@SplashActivity, MainActivity::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                intent.putExtra(KeyUtil.LATITUDE_VALUE, 0.0)
                intent.putExtra(KeyUtil.LONGITUDE_VALUE, 0.0)
                startActivity(intent)
                finish()
            }, SPLASH_TIME_OUT.toLong())
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        mLocationManager = getSystemService(Context.LOCATION_SERVICE) as LocationManager

        if (checkAndAskForLocationPermissions()) {
            if (Methods.checkHistory()) {
                checkGpsEnabledAndPrompt()
            } else {
                Handler().postDelayed({
                    val intent = Intent(this@SplashActivity, MainActivity::class.java)
                    intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                    intent.putExtra(KeyUtil.LATITUDE_VALUE, 0.0)
                    intent.putExtra(KeyUtil.LONGITUDE_VALUE, 0.0)
                    startActivity(intent)
                    finish()
                }, SPLASH_TIME_OUT.toLong())
            }
        }
    }

    /***
     * Check if the gps is enabled by the user
     * if not then prompt to enable gps
     * else start fetching the location
     * */
    private fun checkGpsEnabledAndPrompt() {
        //Check if the gps is enabled
        val isLocationEnabled = mLocationManager!!.isProviderEnabled(LocationManager.NETWORK_PROVIDER)

        if (!isLocationEnabled) {
            //Show alert dialog to enable gps
            val dialogBuilder = AlertDialog.Builder(this@SplashActivity)
                    .setCancelable(false)
            val inflater = this.layoutInflater
            val dialogView = inflater.inflate(R.layout.alert_dialog_location, null)
            dialogBuilder.setView(dialogView)
            dialogBuilder.setPositiveButton(android.R.string.ok, { dialog, which ->
                //Start settings to enable location
                val intent = Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS)
                startActivityForResult(intent, KeyUtil.RC_ENABLE_LOCATION)
                dialog.dismiss()
            })
            dialogBuilder.setNegativeButton(android.R.string.cancel, { dialog, which ->
                mLocationListener.onProviderDisabled("")
                dialog.dismiss()
            })
            val b = dialogBuilder.create()
            b.show()
        } else {
            requestLocationUpdates()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        when (requestCode) {
            RC_ENABLE_LOCATION -> {
                checkGpsEnabledAndPrompt()
            }

            KeyUtil.PLACE_AUTOCOMPLETE_REQUEST_CODE -> {
                if (resultCode == Activity.RESULT_OK) {
                    val place = PlaceAutocomplete.getPlace(this, data)
                } else if (resultCode == PlaceAutocomplete.RESULT_ERROR) {
                    Methods.hideKeyboard(this@SplashActivity)
                    val status = PlaceAutocomplete.getStatus(this, data)
                } else if (resultCode == Activity.RESULT_CANCELED) {
                    Methods.hideKeyboard(this@SplashActivity)
                }
            }
        }
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        when (requestCode) {
            RC_LOCATION_PERMISSION -> {
                if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    checkGpsEnabledAndPrompt()
                } else {
                    checkAndAskForLocationPermissions()
                }
            }
        }
    }

    /***
     * Start receiving the location updates
     * */
    @SuppressLint("MissingPermission")
    private fun requestLocationUpdates() {
        val provider = LocationManager.NETWORK_PROVIDER

        //Add the location listener and request updated
        mLocationManager?.requestLocationUpdates(provider, 0, 0.0f, mLocationListener)

        val location = mLocationManager?.getLastKnownLocation(provider)
        mLocationListener.onLocationChanged(location)
    }

    /***
     * Check if location permission have been granted by the user
     * */
    private fun checkAndAskForLocationPermissions(): Boolean {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (checkSelfPermission(android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                requestPermissions(arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION), KeyUtil.RC_LOCATION_PERMISSION)
                return false
            }
        }
        return true
    }
}
