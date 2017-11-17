package com.quixom.apps.weatherstream.widgets

import android.annotation.TargetApi
import android.content.Context
import android.graphics.*
import android.os.Build
import android.support.v4.view.ViewCompat
import android.util.AttributeSet
import android.util.Log
import android.util.TypedValue
import android.view.View
import android.view.ViewOutlineProvider
import android.widget.RelativeLayout
import com.quixom.apps.weatherstream.R

class CrescentoContainer : RelativeLayout {

    var mContext: Context? = null
    var mClipPath: Path? = null
    var mOutlinePath: Path? = null

    internal var width = 0
    internal var height = 0

    /**
     * @param curvatureHeight changes the amount of curve. Default is 50.
     */
    internal var curvatureHeight = 50

    internal lateinit var mPaint: Paint
    private var porterDuffXfermode: PorterDuffXfermode? = null
    private val TAG = "CRESCENTO_CONTAINER"

    constructor(context: Context) : super(context) {
        init(context, null)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init(context, attrs)
    }

    private fun init(context: Context, attrs: AttributeSet?) {
        mContext = context

        porterDuffXfermode = PorterDuffXfermode(PorterDuff.Mode.CLEAR)

        mPaint = Paint(Paint.ANTI_ALIAS_FLAG)
        mPaint.color = Color.WHITE

        mClipPath = Path()
        mOutlinePath = Path()

        val styledAttributes = mContext!!.obtainStyledAttributes(attrs, R.styleable.CrescentoImageView, 0, 0)
        if (styledAttributes.hasValue(R.styleable.CrescentoImageView_curvature)) {
            curvatureHeight = styledAttributes.getDimension(R.styleable.CrescentoImageView_curvature, getDpForPixel(curvatureHeight).toFloat()).toInt()
        }

        styledAttributes.recycle()
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

        width = measuredWidth
        height = measuredHeight

        mClipPath = PathProvider.getClipPath(width, height, curvatureHeight, 0, 0)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            ViewCompat.setElevation(this, ViewCompat.getElevation(this))
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            try {
                setOutlineProvider(outlineProvider)
            } catch (e: Exception) {
                Log.d(TAG, e.message)
            }

        }
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    override fun getOutlineProvider(): ViewOutlineProvider {
        return object : ViewOutlineProvider() {
            override fun getOutline(view: View, outline: Outline) {
                try {
                    outline.setConvexPath(PathProvider.getOutlinePath(width, height, curvatureHeight, 0, 0))
                } catch (e: Exception) {
                    Log.d("Outline Path", e.message)
                }

            }
        }
    }

    override fun dispatchDraw(canvas: Canvas) {
        val saveCount = canvas.saveLayer(0f, 0f, getWidth().toFloat(), getHeight().toFloat(), null, Canvas.ALL_SAVE_FLAG)
        super.dispatchDraw(canvas)
        mPaint.xfermode = porterDuffXfermode
        canvas.drawPath(mClipPath, mPaint)
        canvas.restoreToCount(saveCount)
        mPaint.xfermode = null
    }

    private fun getDpForPixel(pixel: Int): Int {
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, pixel.toFloat(), mContext?.resources?.displayMetrics).toInt()
    }
}
