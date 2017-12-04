package com.quixom.apps.weatherstream.fragments


import android.Manifest
import android.annotation.TargetApi
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.support.v4.app.ActivityCompat
import android.support.v4.app.Fragment
import android.support.v4.content.ContextCompat
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.quixom.apps.weatherstream.BuildConfig
import com.quixom.apps.weatherstream.R
import com.quixom.apps.weatherstream.utilities.KeyUtil
import kotlinx.android.synthetic.main.fragment_about_app.*
import kotlinx.android.synthetic.main.toolbar.*
import kotlinx.android.synthetic.main.toolbar_ui.*
import java.util.*

/**
 * A simple [Fragment] subclass.
 */
class AboutAppFragment : BaseFragment(), View.OnClickListener {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_about_app, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initToolbar()
        tvVersion?.text = mResources.getString(R.string.version).plus(": " + BuildConfig.VERSION_NAME)

    }

    private fun initToolbar() {
        if (!preferenceUtil.getBooleanPref(preferenceUtil.IS_APP_THEME_DAY)) {
            toolbar?.setBackgroundColor(ContextCompat.getColor(mActivity, R.color.gulf_blue_dark))
            llParentAboutApp?.setBackgroundColor(ContextCompat.getColor(mActivity, R.color.gulf_blue_dark))
            svDeveloperInformation?.setBackgroundColor(ContextCompat.getColor(mActivity, R.color.gulf_blue))
            tvAppNameAbout?.setTextColor(ContextCompat.getColor(mActivity, R.color.font_white_trans))
            tvDeveloperInfoTitle?.setTextColor(ContextCompat.getColor(mActivity, R.color.font_white_trans))
            tvCall?.setTextColor(ContextCompat.getColor(mActivity, R.color.font_white_trans))
            tvAddress?.setTextColor(ContextCompat.getColor(mActivity, R.color.font_white_trans))
            tvWebsite?.setTextColor(ContextCompat.getColor(mActivity, R.color.font_white_trans))
        }

        toggleMenu?.visibility = View.GONE
        ivSetting?.visibility = View.GONE
        backNavigation?.visibility = View.VISIBLE
        tvToolbarTitle?.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18F)
        tvToolbarTitle?.text = mResources.getString(R.string.about)

        backNavigation?.setOnClickListener(this)
        tvCall?.setOnClickListener(this)
        tvAddress?.setOnClickListener(this)
        tvWebsite?.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view) {
            backNavigation -> {
                mActivity.onBackPressed()
            }
            tvCall -> {
                checkCallPermission()
            }
            tvAddress -> {
                mapIntent()
            }
            tvWebsite -> {
                webIntent()
            }
        }
    }

    /**
     * this method will show permission pop up messages to user.
     */
    @TargetApi(Build.VERSION_CODES.M)
    private fun checkCallPermission() {
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            val hasWriteCameraPermission = mActivity.checkSelfPermission(Manifest.permission.CAMERA)
            if (hasWriteCameraPermission != PackageManager.PERMISSION_GRANTED) {
                requestPermissions(arrayOf(Manifest.permission.CALL_PHONE), KeyUtil.KEY_CALL_PERMISSION)
            } else {
                callIntent()
            }
        } else {
            callIntent()
        }
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when (requestCode) {
            KeyUtil.KEY_CALL_PERMISSION -> if (permissions.isNotEmpty()) {
                if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    // Permission Granted
                    tvCall?.isClickable = true
                    callIntent()
                } else if (grantResults[0] == PackageManager.PERMISSION_DENIED) {
                    // Should we show an explanation?
                    tvCall?.isClickable = false
                    if (ActivityCompat.shouldShowRequestPermissionRationale(mActivity, Manifest.permission.GET_ACCOUNTS)) {
                        //Show permission explanation dialog...
                        tvCall?.isClickable = false
                    }
                }
            }
            else -> super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        }
    }

    /****
     *  Method for do call, while user tapping on mobile number
     */
    private fun callIntent() {
        val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + mResources.getString(R.string.company_phone)))
        startActivity(intent)
    }

    /***
     * Method for open Map intent with predefined location
     * */
    private fun mapIntent() {
        val uri = String.format(Locale.ENGLISH, "geo:%f,%f", 23.077309, 72.507228)
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(uri))
        context.startActivity(intent)
    }

    /***
     * Method for open Browser with load predefined website address
     * */
    private fun webIntent() {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.quixom.com"))
        startActivity(browserIntent)
    }
}
