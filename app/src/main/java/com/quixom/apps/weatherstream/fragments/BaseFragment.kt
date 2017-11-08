package com.quixom.apps.weatherstream.fragments

import android.content.Context
import android.content.res.Resources
import android.os.Bundle
import android.support.v4.app.Fragment
import com.quixom.apps.weatherstream.MainActivity
import com.quixom.apps.weatherstream.Methods
import com.quixom.apps.weatherstream.utilities.FragmentUtil

/**
* Created by akif on 11/2/17.
*/

open class BaseFragment : Fragment() {

    lateinit var mActivity: MainActivity
    lateinit var fragmentUtil: FragmentUtil
    lateinit var mResources: Resources

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mActivity = activity as MainActivity
        fragmentUtil = FragmentUtil(mActivity)
        mResources = mActivity.resources

        Methods(mActivity)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        view!!.setOnClickListener { }
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        mActivity = activity as MainActivity
    }
}