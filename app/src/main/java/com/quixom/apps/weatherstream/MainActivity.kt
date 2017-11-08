package com.quixom.apps.weatherstream

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.WindowManager
import android.widget.FrameLayout
import com.quixom.apps.weatherstream.Methods.Companion.promptSpeechInput
import com.quixom.apps.weatherstream.activity.SearchActivity
import com.quixom.apps.weatherstream.fragments.MainFragment
import com.quixom.apps.weatherstream.slidingmenu.SlidingMenu
import com.quixom.apps.weatherstream.utilities.FragmentUtil
import kotlinx.android.synthetic.main.leftmenu.*


class MainActivity : AppCompatActivity(), View.OnLongClickListener, View.OnClickListener {

    private var slidingMenuLeft: SlidingMenu? = null
    private var slidingMenuRight: SlidingMenu? = null
    private var fragmentContainer: FrameLayout? = null
    private var fragmentUtil: FragmentUtil? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val w = window
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)

        fragmentUtil = FragmentUtil(this@MainActivity)
        fragmentContainer = findViewById(R.id.fl_fragment_container)

        initSlideMenuLeft()
        initSlideMenuRight()

        ivSpeechToSearch.setOnClickListener(this)
        ivSearchLocationIC.setOnClickListener(this)
        tvLocationSearchText.setOnClickListener(this)

        /** Launch Main Fragment */
        fragmentUtil!!.clearBackStackFragmets()
        fragmentUtil!!.replaceFragment(MainFragment(), false, false)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        if (supportFragmentManager.backStackEntryCount == 0) {
            finish()
        }

        if (slidingMenuLeft?.isMenuShowing!!) {
            slidingMenuLeft?.toggle()
        }

        if (slidingMenuRight?.isMenuShowing!!) {
            slidingMenuRight?.toggle()
        }
    }

    /***
     * Method for initialise slide menu drawer (Setting)
     * */
    fun initSlideMenuLeft() {

        slidingMenuLeft = SlidingMenu(this)
        slidingMenuLeft?.mode = SlidingMenu.LEFT
        slidingMenuLeft?.touchModeAbove = SlidingMenu.TOUCHMODE_NONE
        slidingMenuLeft?.setShadowWidthRes(R.dimen.shadow_width)
        slidingMenuLeft?.setShadowDrawable(R.drawable.shadow)
        slidingMenuLeft?.setBehindOffsetRes(R.dimen.slidingmenu_offset)
        slidingMenuLeft?.setFadeDegree(0.8f)
        slidingMenuLeft?.attachToActivity(this, SlidingMenu.SLIDING_CONTENT)
        slidingMenuLeft?.setBehindWidth(850)
        slidingMenuLeft?.setMenu(R.layout.leftmenu)
        slidingMenuLeft?.isSlidingEnabled

        val leftView = slidingMenuLeft?.menu
    }

    /***
     * Method for Open/Close slide menu drawer */
    fun toggleSlideMenuLeft() {
        if (slidingMenuRight?.isMenuShowing!!) {
            slidingMenuRight?.toggle()
        }
        slidingMenuLeft?.toggle()
    }

    /***
     * Method for initialise slide menu drawer
     * */
    fun initSlideMenuRight() {

        slidingMenuRight = SlidingMenu(this)
        slidingMenuRight?.mode = SlidingMenu.RIGHT
        slidingMenuRight?.touchModeAbove = SlidingMenu.TOUCHMODE_NONE
        slidingMenuRight?.setShadowWidthRes(R.dimen.shadow_width)
        slidingMenuRight?.setShadowDrawable(R.drawable.shadow_right)
        slidingMenuRight?.setBehindOffsetRes(R.dimen.slidingmenu_offset)
        slidingMenuRight?.setFadeDegree(0.8f)
        slidingMenuRight?.attachToActivity(this, SlidingMenu.SLIDING_CONTENT)
        slidingMenuRight?.setBehindWidth(650)
        slidingMenuRight?.setMenu(R.layout.settingmenu)
        slidingMenuRight?.isSlidingEnabled

        val leftView = slidingMenuRight?.menu
    }

    /***
     * Method for Open/Close slide setting drawer */
    fun toggleSlideMenuRight() {
        if (slidingMenuLeft?.isMenuShowing!!) {
            slidingMenuLeft?.toggle()
        }
        slidingMenuRight?.toggle()
    }

    override fun onClick(view: View?) {
        when (view) {
            ivSpeechToSearch -> {
                promptSpeechInput(this@MainActivity)
            }
            tvLocationSearchText, ivSearchLocationIC -> {
                val myIntent = Intent(this@MainActivity, SearchActivity::class.java)
                this@MainActivity.startActivity(myIntent)
            }
        }
    }

    override fun onLongClick(p0: View?): Boolean {
        return false
    }
}
