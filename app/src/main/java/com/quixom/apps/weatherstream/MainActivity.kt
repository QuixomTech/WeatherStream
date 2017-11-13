package com.quixom.apps.weatherstream

import android.annotation.TargetApi
import android.app.Activity
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.speech.RecognizerIntent
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.FrameLayout
import android.widget.Toast
import com.google.android.gms.common.GooglePlayServicesNotAvailableException
import com.google.android.gms.common.GooglePlayServicesRepairableException
import com.google.android.gms.location.places.ui.PlaceAutocomplete
import com.quixom.apps.weatherstream.Methods.Companion.isNetworkConnected
import com.quixom.apps.weatherstream.Methods.Companion.promptSpeechInput
import com.quixom.apps.weatherstream.adapters.LocationHistoryAdapter
import com.quixom.apps.weatherstream.dbconfig.UpgradeData
import com.quixom.apps.weatherstream.fragments.MainFragment
import com.quixom.apps.weatherstream.model.LocationSearchHistory
import com.quixom.apps.weatherstream.model.WeatherData
import com.quixom.apps.weatherstream.slidingmenu.SlidingMenu
import com.quixom.apps.weatherstream.utilities.FragmentUtil
import com.quixom.apps.weatherstream.utilities.KeyUtil
import com.quixom.apps.weatherstream.webservice.APIParameters
import com.quixom.apps.weatherstream.webservice.NetworkConfig
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.android.synthetic.main.leftmenu.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity(), View.OnLongClickListener, View.OnClickListener {

    private var slidingMenuLeft: SlidingMenu? = null
    private var slidingMenuRight: SlidingMenu? = null
    private var fragmentContainer: FrameLayout? = null
    private var fragmentUtil: FragmentUtil? = null
    lateinit var errorHandler: com.quixom.apps.weatherstream.webservice.ErrorHandler
    var lists = ArrayList<LocationSearchHistory>()

    @TargetApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        errorHandler = com.quixom.apps.weatherstream.webservice.ErrorHandler(this@MainActivity)

        this.window.navigationBarColor = ContextCompat.getColor(this, R.color.colorPrimaryDark)

        fragmentUtil = FragmentUtil(this@MainActivity)
        fragmentContainer = findViewById(R.id.fl_fragment_container)

        initSlideMenuLeft()
        initSlideMenuRight()

        ivSpeechToSearchMenu.setOnClickListener(this)
        ivSearchLocationIC.setOnClickListener(this)
        tvLocationSearchText.setOnClickListener(this)

        /** Launch Main Fragment */
        fragmentUtil!!.clearBackStackFragmets()
        fragmentUtil!!.replaceFragment(MainFragment(), false, false)


        /*** Init Recylerview here */
        val layoutManager = LinearLayoutManager(this@MainActivity)
        rvMenuLocationList.layoutManager = layoutManager

        // Fetch searched location list from database.
        val searchedLocation: List<LocationSearchHistory> = LocationSearchHistory.getSearchedLocationList()
        if (searchedLocation.isNotEmpty()) {
            for(searchedLC in searchedLocation) {
                lists.add(LocationSearchHistory(0,searchedLC.cityName, searchedLC.countyName, searchedLC.weatherType, searchedLC.temperature))
            }
            rvMenuLocationList.adapter = LocationHistoryAdapter(lists, this@MainActivity)
        }

        /*** Weather notification */
        /*val localNotification = LocalNotification(this@MainActivity)
        localNotification.showCustomLayoutHeadsUpNotification(this@MainActivity)*/
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
        slidingMenuLeft?.touchModeAbove = SlidingMenu.RIGHT
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

        val LeftMenu = slidingMenuRight?.menu
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
            ivSpeechToSearchMenu -> {
                Methods.avoidDoubleClicks(ivSpeechToSearchMenu)
                promptSpeechInput(this@MainActivity)
            }
            tvLocationSearchText -> {
                Methods.avoidDoubleClicks(tvLocationSearchText)
                openGoogleAutoLocationSearch("")
            }
        }
    }

    override fun onLongClick(p0: View?): Boolean {
        return false
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {

            KeyUtil.REQ_CODE_SPEECH_INPUT -> {
                if (resultCode == Activity.RESULT_OK && data != null) {
                    val result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS)
                    openGoogleAutoLocationSearch(result[0])
                }
            }

            KeyUtil.PLACE_AUTOCOMPLETE_REQUEST_CODE -> {
                if (resultCode === Activity.RESULT_OK) {
                    val place = PlaceAutocomplete.getPlace(this, data)
                    callSearchLocationApi(place.name.toString())
                    Toast.makeText(this@MainActivity, place.name, Toast.LENGTH_SHORT).show()
                } else if (resultCode === PlaceAutocomplete.RESULT_ERROR) {
                    val status = PlaceAutocomplete.getStatus(this, data)

                } else if (resultCode === Activity.RESULT_CANCELED) {
                    // The user canceled the operation.
                }
            }
        }
    }

    fun openGoogleAutoLocationSearch(locationName: String) {
        try {
            val intent = PlaceAutocomplete.IntentBuilder(PlaceAutocomplete.MODE_OVERLAY).build(this)
            intent.putExtra(KeyUtil.KEY_LOCATION, locationName)
            startActivityForResult(intent, KeyUtil.PLACE_AUTOCOMPLETE_REQUEST_CODE)
        } catch (e: GooglePlayServicesRepairableException) {
            e.printStackTrace()
        } catch (e: GooglePlayServicesNotAvailableException) {
            e.printStackTrace()
        }
    }


    var locationSearchCall: Call<WeatherData>? = null

    fun callSearchLocationApi(locationName: String) {

        if (isNetworkConnected(this@MainActivity)) {

            val hashMap = APIParameters.getParam()
            hashMap.put(APIParameters.LocationSearch.queryParam, "" + locationName)

            locationSearchCall = NetworkConfig.getWebApis().getWeatherDetail(APIParameters.KEY_OPEN_WEATHER_MAP_KEY, hashMap)
            locationSearchCall!!.enqueue(object : Callback<WeatherData> {

                override fun onResponse(call: Call<WeatherData>, response: Response<WeatherData>) {
                    if (call.isCanceled)
                        return

                    if (response != null) {
                        if (response.isSuccessful) {
                            if (response.body() != null) {
                                if (response.body()?.cod == 200) {
                                    Methods.hideKeyboard(this@MainActivity)
                                    Toast.makeText(this@MainActivity, response.body()?.name, Toast.LENGTH_SHORT).show()
                                    Methods.showSnackBar(coordinatorLayoutMain, response.code().toString(), ContextCompat.getColor(this@MainActivity, R.color.brink_pink), this@MainActivity)

                                    UpgradeData.clearApplicationData()
                                    var weatherDetail: WeatherData = response.body()!!
                                    val locationSearch =  LocationSearchHistory()

                                    if (weatherDetail != null) {
                                        println("dtaa = =" + weatherDetail.name)
                                        locationSearch.cityName = weatherDetail.name
                                        locationSearch.countyName = weatherDetail.sys?.country
                                        locationSearch.temperature = weatherDetail.main?.temp?.toDouble()
                                        locationSearch.weatherType = weatherDetail?.weather?.get(0)?.main
                                        locationSearch.save()

                                        lists.add(LocationSearchHistory(0, locationSearch.cityName, locationSearch.countyName, locationSearch.weatherType, locationSearch.temperature))
                                        rvMenuLocationList.adapter = LocationHistoryAdapter(lists , this@MainActivity)
                                    }
                                }

                            } else {
                                Methods.showSnackBar(coordinatorLayoutMain, response.message(), ContextCompat.getColor(this@MainActivity, R.color.brink_pink), this@MainActivity)
                            }
                        } else {
                            Methods.showSnackBar(coordinatorLayoutMain, response.message(), ContextCompat.getColor(this@MainActivity, R.color.brink_pink), this@MainActivity)
                        }
                    } else {
                        Methods.showSnackBar(coordinatorLayoutMain, errorHandler.parseError(response).message(), ContextCompat.getColor(this@MainActivity, R.color.brink_pink), this@MainActivity)
                    }
                }

                override fun onFailure(call: Call<WeatherData>?, t: Throwable?) {
                    if (call!!.isCanceled)
                        return
                    errorHandler.setExceptionMessage(t)
                }
            })
        } else {
            Methods.showSnackBar(coordinatorLayoutMain, resources.getString(R.string.no_internet_connection), ContextCompat.getColor(this@MainActivity, R.color.brink_pink), this@MainActivity)
        }
    }
}
