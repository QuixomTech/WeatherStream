package com.quixom.apps.weatherstream.utilities

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import com.quixom.apps.weatherstream.Methods
import com.quixom.apps.weatherstream.R

/**
 * Created by akif on 11/2/17.
 */

class FragmentUtil(private var mActivity: AppCompatActivity) {

    val currentFragment: Fragment get() {
            val fragmentManager = mActivity.supportFragmentManager
            return fragmentManager.findFragmentById(R.id.fl_fragment_container)
        }

    fun addFragment(fragment: Fragment, isAddToBackStack: Boolean, shouldAnimate: Boolean) {
        pushFragment(fragment, null, R.id.fl_fragment_container, isAddToBackStack, true, shouldAnimate, false)
    }

    fun replaceFragment(fragment: Fragment, isAddToBackStack: Boolean, shouldAnimate: Boolean) {
        pushFragment(fragment, null, R.id.fl_fragment_container, isAddToBackStack, false, shouldAnimate, false)
    }

    fun addFragmentIgnorIfCurrent(fragment: Fragment, isAddToBackStack: Boolean, shouldAnimate: Boolean) {
        pushFragment(fragment, null, R.id.fl_fragment_container, isAddToBackStack, true, shouldAnimate, true)
    }

    fun replaceFragmentIgnorIfCurrent(fragment: Fragment, isAddToBackStack: Boolean, shouldAnimate: Boolean) {
        pushFragment(fragment, null, R.id.fl_fragment_container, isAddToBackStack, false, shouldAnimate, true)
    }

    fun addChildFragment(fragment: Fragment, parentFragment: Fragment, containerId: Int, isAddToBackStack: Boolean, shouldAnimate: Boolean) {
        pushFragment(fragment, parentFragment, containerId, isAddToBackStack, true, shouldAnimate, false)
    }

    fun replaceChildFragment(fragment: Fragment, parentFragment: Fragment, containerId: Int, isAddToBackStack: Boolean, shouldAnimate: Boolean) {
        pushFragment(fragment, parentFragment, containerId, isAddToBackStack, false, shouldAnimate, false)
    }

    fun addChildFragmentIgnorIfCurrent(fragment: Fragment, parentFragment: Fragment, containerId: Int, isAddToBackStack: Boolean, shouldAnimate: Boolean) {
        pushFragment(fragment, parentFragment, containerId, isAddToBackStack, true, shouldAnimate, true)
    }

    fun replaceChildFragmentIgnorIfCurrent(fragment: Fragment, parentFragment: Fragment, containerId: Int, isAddToBackStack: Boolean, shouldAnimate: Boolean) {
        pushFragment(fragment, parentFragment, containerId, isAddToBackStack, false, shouldAnimate, true)
    }


    private fun pushFragment(fragment: Fragment?, parentFragment: Fragment?, containerId: Int, isAddToBackStack: Boolean, isJustAdd: Boolean, shouldAnimate: Boolean, ignoreIfCurrent: Boolean) {
        if (fragment == null)
            return
        // Add the fragment to the 'fragment_container' FrameLayout
        val fragmentManager: FragmentManager// = getSupportFragmentManager();

        if (parentFragment != null) {
            fragmentManager = parentFragment.childFragmentManager
        } else {
            fragmentManager = mActivity.supportFragmentManager
        }


        // Find current visible fragment
        val fragmentCurrent = fragmentManager.findFragmentById(R.id.fl_fragment_container)

        if (ignoreIfCurrent && fragmentCurrent != null) {
            if (fragment.javaClass.canonicalName.equals(fragmentCurrent.tag, ignoreCase = true)) {
                return
            }
        }


        val fragmentTransaction = fragmentManager.beginTransaction()

        if (shouldAnimate) {
            //            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out, android.R.anim.fade_in, android.R.anim.fade_out)
        } else {
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
        }

        if (fragmentCurrent != null) {
            fragmentTransaction.hide(fragmentCurrent)
        }

        if (isAddToBackStack) {
            fragmentTransaction.addToBackStack(fragment.javaClass.canonicalName)
        }

        if (isJustAdd) {
            fragmentTransaction.add(containerId, fragment, fragment.javaClass.canonicalName)
        } else {
            fragmentTransaction.replace(containerId, fragment, fragment.javaClass.canonicalName)
        }

        try {
            fragmentTransaction.commitAllowingStateLoss()
            if (!isAddToBackStack) {
                //                fragmentManager.popBackStackImmediate(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
            }
            Methods.hideKeyboard(mActivity)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun clearBackStackFragmets() {
        try {
            // in my case I get the support fragment manager, it should work with the native one too
            val fragmentManager = mActivity.supportFragmentManager
            // this will clear the back stack and displays no animation on the screen
            fragmentManager.popBackStackImmediate(null, FragmentManager.POP_BACK_STACK_INCLUSIVE)
            val fragmentList = fragmentManager.fragments
            if (fragmentList != null && !fragmentList.isEmpty()) {
                val fragmentTransaction = fragmentManager.beginTransaction()
                fragmentList
                        .filterNotNull()
                        .forEach { fragmentTransaction.remove(it) }

                fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                fragmentTransaction.commit()
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    fun clearBackStackFragments(fragmentManager: FragmentManager) {
        // in my case I get the support fragment manager, it should work with the native one too

        // this will clear the back stack and displays no animation on the screen
        fragmentManager.popBackStackImmediate(null, FragmentManager.POP_BACK_STACK_INCLUSIVE)
        // fragmentManager.popBackStackImmediate(SplashFragment.class.getCanonicalName(),FragmentManager.POP_BACK_STACK_INCLUSIVE);

        val fragmentList = fragmentManager.fragments
        if (fragmentList != null && !fragmentList.isEmpty()) {
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentList
                    .filterNotNull()
                    .forEach { fragmentTransaction.remove(it) }
            fragmentTransaction.commit()
        }
    }

    fun addTabClildFragment(fragmentParent: Fragment?, fragmentChild: Fragment?) {
        if (fragmentParent != null && fragmentChild != null) {
            val fragmentManager = fragmentParent.childFragmentManager
            clearBackStackFragments(fragmentManager)
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.add(R.id.fl_fragment_container, fragmentChild, fragmentChild.javaClass.canonicalName)
            fragmentTransaction.commit()
        }
    }

    fun clearBackStackFragmets(tag: String) {
        // in my case I get the support fragment manager, it should work with the native one too
        val fragmentManager = mActivity.supportFragmentManager
        // this will clear the back stack and displays no animation on the screen
        fragmentManager.popBackStackImmediate(tag, FragmentManager.POP_BACK_STACK_INCLUSIVE)
        //        Methods.hideKeyboard();
    }
}
