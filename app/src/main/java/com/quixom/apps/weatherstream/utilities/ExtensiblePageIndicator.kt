package com.quixom.apps.weatherstream.utilities

import android.annotation.TargetApi
import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.RectF
import android.os.Build
import android.support.v4.content.ContextCompat
import android.support.v4.view.GravityCompat
import android.support.v4.view.ViewPager
import android.util.AttributeSet
import android.view.Gravity
import android.view.View
import com.quixom.apps.weatherstream.R

class ExtensiblePageIndicator : View, ViewPager.OnPageChangeListener {

    private var mViewPager: ViewPager? = null
    private var activePaint: Paint? = null
    private var inactivePaint: Paint? = null

    private var circlePadding: Int = 0
    private var circleRadius: Int = 0
    private var circleCount: Int = 0

    private var mGravity: Int = 0
    private var mState: Int = 0
    private var mPageOffset: Float = 0.toFloat()
    private var mCurrentDragPage: Int = 0
    private var mSelectedPage: Int = 0
    private var currentNormalOffset: Float = 0.toFloat()
    private var currentRelativePageOffset: Float = 0.toFloat()
    private var startedSettleNormalOffset: Float = 0.toFloat()
    private var startedSettlePageOffset: Float = 0.toFloat()

    private val desiredHeight: Int
        get() = paddingTop + paddingBottom + circleRadius * 2

    private val desiredWidth: Int
        get() = paddingLeft + paddingRight + circleRadius * 2 * circleCount + (circleCount - 1) * circlePadding

    private val startedX: Float
        get() {
            when (mGravity) {
                Gravity.LEFT, GravityCompat.START -> return paddingLeft.toFloat()
                Gravity.RIGHT, GravityCompat.END -> return measuredWidth.toFloat() - paddingRight.toFloat() - allCirclesWidth
                Gravity.CENTER -> return measuredWidth / 2 - allCirclesWidth / 2
                else -> return measuredWidth / 2 - allCirclesWidth / 2
            }
        }

    private val allCirclesWidth: Float
        get() = (circleRadius * 2 * circleCount + (circleCount - 1) * circlePadding).toFloat()

    constructor(context: Context) : super(context) {
        init(null)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init(attrs)
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init(attrs)
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int, defStyleRes: Int) : super(context, attrs, defStyleAttr, defStyleRes) {
        init(attrs)
    }

    private fun init(attrs: AttributeSet?) {

        if (isInEditMode) {
            circleCount = 3
        }

        circleRadius = resources.getDimension(R.dimen.fvp_default_circle_radius).toInt()
        circlePadding = resources.getDimension(R.dimen.fvp_default_circle_padding).toInt()

        var inactiveColor = ContextCompat.getColor(context, R.color.fpi_default_indicator_inactive_color)
        var activeColor = ContextCompat.getColor(context, R.color.fpi_default_indicator_active_color)
        val gravity = Gravity.CENTER

        if (attrs != null) {
            val a = context.theme.obtainStyledAttributes(attrs, R.styleable.ExtensiblePageIndicator, 0, 0)
            circleRadius = a.getDimension(R.styleable.ExtensiblePageIndicator_indicatorRadius, circleRadius.toFloat()).toInt()
            circlePadding = a.getDimension(R.styleable.ExtensiblePageIndicator_indicatorPadding, circlePadding.toFloat()).toInt()
            inactiveColor = a.getColor(R.styleable.ExtensiblePageIndicator_indicatorInactiveColor, inactiveColor)
            activeColor = a.getColor(R.styleable.ExtensiblePageIndicator_indicatorActiveColor, activeColor)
            mGravity = a.getInt(R.styleable.ExtensiblePageIndicator_android_gravity, gravity)
        }

        activePaint = Paint(Paint.ANTI_ALIAS_FLAG)
        activePaint!!.color = activeColor

        inactivePaint = Paint(Paint.ANTI_ALIAS_FLAG)
        inactivePaint!!.color = inactiveColor
    }

    fun initViewPager(viewPager: ViewPager) {
        //modified by maddog05
        if (mViewPager === viewPager)
            return
        if (mViewPager != null)
            viewPager.addOnPageChangeListener(this)
        if (viewPager.adapter == null)
            throw IllegalStateException("ViewPager doesn't have an adapter isntance.")
        mViewPager = viewPager
        mViewPager!!.addOnPageChangeListener(this)
        //finish modified
        circleCount = viewPager.adapter.count
        mCurrentDragPage = viewPager.currentItem
        invalidate()
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {

        val height = View.resolveSize(desiredHeight, heightMeasureSpec)
        val width = View.resolveSize(desiredWidth, widthMeasureSpec)

        setMeasuredDimension(width, height)
    }

    override fun onDraw(canvas: Canvas) {

        // draw behind circles
        for (i in 0 until circleCount) {
            val center = getCircleCenter(i)
            canvas.drawCircle(center, (paddingTop + circleRadius).toFloat(), circleRadius.toFloat(), inactivePaint!!)
        }

        drawRect(canvas)

    }

    private fun drawRect(canvas: Canvas) {

        //modified by maddog05
        if (mViewPager == null)
            return

        if (mViewPager!!.adapter == null)
            return

        if (mViewPager!!.adapter.count == 0)
            return
        //finish modified
        val top = paddingTop.toFloat()
        val bottom = top + circleRadius * 2

        val moveDistance = (circleRadius * 2 + circlePadding).toFloat()
        val isDragForward = mSelectedPage - mCurrentDragPage < 1

        val relativePageOffset = if (isDragForward) mPageOffset else 1.0f - mPageOffset
        currentRelativePageOffset = relativePageOffset

        val shiftedOffset = relativePageOffset * OFFSET_MULTIPLIER_NORMAL

        val settleShiftedOffset = Math.max(0f, mapValue(relativePageOffset, startedSettlePageOffset, 1.0f, startedSettleNormalOffset, 1.0f))

        val normalOffset = if (mState == ViewPager.SCROLL_STATE_SETTLING) settleShiftedOffset else shiftedOffset
        currentNormalOffset = normalOffset

        val largerOffset = Math.min(if (mState == ViewPager.SCROLL_STATE_SETTLING) relativePageOffset * OFFSET_MULTIPLIER_SETTLING else relativePageOffset * OFFSET_MULTIPLIER_DRAG, 1.0f)

        val circleCenter = getCircleCenter(if (isDragForward) mCurrentDragPage else mSelectedPage)

        val normal = moveDistance * normalOffset
        val large = moveDistance * largerOffset

        val left = if (isDragForward) circleCenter - circleRadius + normal else circleCenter - circleRadius.toFloat() - large
        val right = if (isDragForward) circleCenter + circleRadius.toFloat() + large else circleCenter + circleRadius - normal

        val rectF = RectF(left, top, right, bottom)
        canvas.drawRoundRect(rectF, circleRadius.toFloat(), circleRadius.toFloat(), activePaint!!)

    }

    private fun mapValue(value: Float, a1: Float, a2: Float, b1: Float, b2: Float): Float {
        return b1 + (value - a1) * (b2 - b1) / (a2 - a1)
    }

    private fun getCirclePadding(position: Int): Float {
        return (circlePadding * position + circleRadius * 2 * position).toFloat()
    }

    private fun getCircleCenter(position: Int): Float {
        return startedX + circleRadius.toFloat() + getCirclePadding(position)
    }

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
        mCurrentDragPage = position
        mPageOffset = positionOffset
        postInvalidate()
    }

    override fun onPageSelected(position: Int) {}

    override fun onPageScrollStateChanged(state: Int) {
        mState = state
        if (state == ViewPager.SCROLL_STATE_IDLE || state == ViewPager.SCROLL_STATE_DRAGGING) {
            mSelectedPage = mViewPager!!.currentItem
            currentNormalOffset = 0f
            currentRelativePageOffset = 0f
        } else if (state == ViewPager.SCROLL_STATE_SETTLING) {
            startedSettleNormalOffset = currentNormalOffset
            startedSettlePageOffset = currentRelativePageOffset
        }
    }

    override fun onDetachedFromWindow() {
        //modified by maddog05
        if (mViewPager != null)
            mViewPager!!.removeOnPageChangeListener(this)
        //finish modified
        super.onDetachedFromWindow()
    }

    companion object {

        //setted as final by maddog05
        private val OFFSET_MULTIPLIER_DRAG = 1.2f
        private val OFFSET_MULTIPLIER_SETTLING = 1.4f
        private val OFFSET_MULTIPLIER_NORMAL = 0.30f
    }
}
