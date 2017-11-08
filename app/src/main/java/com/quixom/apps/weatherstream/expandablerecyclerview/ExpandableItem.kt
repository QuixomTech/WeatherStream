/***********************************************************************************
 * The MIT License (MIT)
 * Copyright (c) 2014 Robin Chutaux
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.quixom.apps.weatherstream.expandablerecyclerview

import android.content.Context
import android.os.Handler
import android.support.annotation.UiThread
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.Transformation
import android.widget.RelativeLayout
import com.quixom.apps.weatherstream.R


/**
 * @author Robin Chutaux
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
class ExpandableItem @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = R.attr.expandableItemStyle) : RelativeLayout(context, attrs, defStyleAttr) {

    val contentLayout: ViewGroup
    val headerLayout: ViewGroup
    var duration: Int = 0
    var isClosedByUser = true
        private set
    private var isAnimationRunning = false
    var isOpened = false
        private set

    init {
        val inflater = LayoutInflater.from(context)
        inflater.inflate(R.layout.widget_expandableitem, this, true)
        headerLayout = findViewById(R.id.widget_expandableitem_headerlayout)
        contentLayout = findViewById(R.id.widget_expandableitem_contentlayout)

        val a = context.obtainStyledAttributes(attrs, R.styleable.ExpandableItem, defStyleAttr, 0)
        val headerId = a.getResourceId(R.styleable.ExpandableItem_layoutHeader, -1)
        val contentId = a.getResourceId(R.styleable.ExpandableItem_layoutContent, -1)
        duration = a.getInt(R.styleable.ExpandableItem_duration, context.resources.getInteger(android.R.integer.config_shortAnimTime))
        a.recycle()

        if (headerId == -1 || contentId == -1) {
            throw IllegalArgumentException("HeaderLayout and ContentLayout cannot be null!")
        }
        if (isInEditMode) kotlin.run {
            return@run
        }

        val headerView = inflater.inflate(headerId, headerLayout, false)
        headerView.layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        headerLayout.addView(headerView)
        headerLayout.setOnTouchListener { v, event ->
            if (isOpened && event.action == MotionEvent.ACTION_UP) {
                hide()
                isClosedByUser = true
            }
            isOpened && event.action == MotionEvent.ACTION_DOWN
        }
        val contentView = inflater.inflate(contentId, contentLayout, false)
        contentView.layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        contentLayout.addView(contentView)
        contentLayout.visibility = View.GONE

        tag = TAG
    }

    @UiThread
    private fun expand(view: View) {
        isOpened = true
        view.measure(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT)
        val targetHeight = view.measuredHeight
        view.layoutParams.height = 0
        view.visibility = View.VISIBLE

        val animation = object : Animation() {
            override fun applyTransformation(interpolatedTime: Float, t: Transformation) {
                view.layoutParams.height = if (interpolatedTime == 1f) RelativeLayout.LayoutParams.WRAP_CONTENT else (targetHeight * interpolatedTime).toInt()
                view.requestLayout()
            }
        }
        animation.duration = duration.toLong()
        view.startAnimation(animation)
    }

    @UiThread
    private fun collapse(view: View) {
        isOpened = false
        val initialHeight = view.measuredHeight

        val animation = object : Animation() {
            override fun applyTransformation(interpolatedTime: Float, t: Transformation) {
                if (interpolatedTime == 1f) {
                    view.visibility = View.GONE
                    isOpened = false
                } else {
                    view.layoutParams.height = initialHeight - (initialHeight * interpolatedTime).toInt()
                    view.requestLayout()
                }
            }
        }
        animation.duration = duration.toLong()
        view.startAnimation(animation)
    }

    @UiThread
    fun hideNow() {
        contentLayout.layoutParams.height = 0
        contentLayout.invalidate()
        contentLayout.visibility = View.GONE
        isOpened = false
    }

    @UiThread
    fun showNow() {
        if (!isOpened) {
            contentLayout.visibility = View.VISIBLE
            isOpened = true
            contentLayout.layoutParams.height = RelativeLayout.LayoutParams.WRAP_CONTENT
            contentLayout.invalidate()
        }
    }

    @UiThread
    fun show() {
        if (!isAnimationRunning) {
            expand(contentLayout)
            isAnimationRunning = true
            Handler().postDelayed({ isAnimationRunning = false }, duration.toLong())
        }
    }

    @UiThread
    fun hide() {
        if (!isAnimationRunning) {
            collapse(contentLayout)
            isAnimationRunning = true
            Handler().postDelayed({ isAnimationRunning = false }, duration.toLong())
        }
        isClosedByUser = false
    }

    companion object {
        internal val TAG = ExpandableItem::class.java.canonicalName
    }
}