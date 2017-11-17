package com.quixom.apps.weatherstream.widgets

import android.annotation.TargetApi
import android.content.Context
import android.graphics.*
import android.graphics.drawable.BitmapDrawable
import android.os.Build
import android.support.v4.view.ViewCompat
import android.support.v7.widget.AppCompatImageView
import android.util.AttributeSet
import android.util.Log
import android.util.TypedValue
import android.view.View
import android.view.ViewOutlineProvider
import com.quixom.apps.weatherstream.R

class CrescentoImageView : AppCompatImageView {

    var mContext: Context? = null
    var mClipPath: Path? = null

    internal var width = 0
    internal var height = 0
    var mBitmap: Bitmap? = null
    var tintPaint: Paint? = null
    var shaderPaint: Paint? = null

    /**
     * @param gravity whether TOP or BOTTOM
     */
    internal var gravity = Gravity.TOP

    /**
     * @param curvatureHeight changes the amount of curve. Default is 50.
     */
    internal var curvatureHeight = 50

    /**
     * @param tintAmount varies from 0-255
     */
    internal var tintAmount = 0

    /**
     * @param tintMode whether manual or automatic. Default is TintMode.AUTOMATIC.
     */
    internal var tintMode = TintMode.AUTOMATIC

    /**
     * @param tintPaint color of tint to be applied
     */
    internal var tintColor = 0

    internal var gradientDirection = 0

    private var gradientStartColor = Color.TRANSPARENT
    private var gradientEndColor = Color.TRANSPARENT

    internal var curvatureDirection = CurvatureDirection.OUTWARD

    var mPaint: Paint?= null
    private var porterDuffXfermode: PorterDuffXfermode? = null
    private val TAG = "CRESCENTO_IMAGE_VIEW"

    object Gravity {
        internal val TOP = 0
        internal val BOTTOM = 1
    }

    object TintMode {
        internal val AUTOMATIC = 0
        internal val MANUAL = 1
    }

    object Gradient {
        internal val TOP_TO_BOTTOM = 0
        internal val BOTTOM_TO_TOP = 1
        internal val LEFT_TO_RIGHT = 2
        internal val RIGHT_TO_LEFT = 3
    }

    object CurvatureDirection {
        internal val OUTWARD = 0
        internal val INWARD = 1
    }

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
        mPaint!!.color = Color.WHITE

        shaderPaint = Paint(Paint.ANTI_ALIAS_FLAG)

        mClipPath = Path()

        val styledAttributes = mContext!!.obtainStyledAttributes(attrs, R.styleable.CrescentoImageView, 0, 0)
        if (styledAttributes.hasValue(R.styleable.CrescentoImageView_curvature)) {
            curvatureHeight = styledAttributes.getDimension(R.styleable.CrescentoImageView_curvature, getDpForPixel(curvatureHeight).toFloat()).toInt()
        }

        if (styledAttributes.hasValue(R.styleable.CrescentoImageView_crescentoTintAlpha)) {
            if (styledAttributes.getInt(R.styleable.CrescentoImageView_crescentoTintAlpha, 0) <= 255 && styledAttributes.getInt(R.styleable.CrescentoImageView_crescentoTintAlpha, 0) >= 0) {
                tintAmount = styledAttributes.getInt(R.styleable.CrescentoImageView_crescentoTintAlpha, 0)
            }
        }

        if (styledAttributes.hasValue(R.styleable.CrescentoImageView_gravity)) {
            if (styledAttributes.getInt(R.styleable.CrescentoImageView_gravity, 0) == Gravity.BOTTOM) {
                gravity = Gravity.BOTTOM
            } else {
                gravity = Gravity.TOP
            }
        }

        if (styledAttributes.hasValue(R.styleable.CrescentoImageView_crescentoTintMode)) {
            if (styledAttributes.getInt(R.styleable.CrescentoImageView_crescentoTintMode, 0) == TintMode.AUTOMATIC) {
                tintMode = TintMode.AUTOMATIC
            } else {
                tintMode = TintMode.MANUAL
            }
        }

        if (styledAttributes.hasValue(R.styleable.CrescentoImageView_gradientDirection)) {
            gradientDirection = styledAttributes.getInt(R.styleable.CrescentoImageView_gradientDirection, 0)
        }

        /* Default start color is transparent*/
        gradientStartColor = styledAttributes.getColor(R.styleable.CrescentoImageView_gradientStartColor, Color.TRANSPARENT)

        /* Default end color is transparent*/
        gradientEndColor = styledAttributes.getColor(R.styleable.CrescentoImageView_gradientEndColor, Color.TRANSPARENT)

        if (styledAttributes.hasValue(R.styleable.CrescentoImageView_crescentoTintColor)) {
            tintColor = styledAttributes.getColor(R.styleable.CrescentoImageView_crescentoTintColor, 0)
        }

        /* Default curvature direction would be outward*/
        curvatureDirection = styledAttributes.getInt(R.styleable.CrescentoImageView_curvatureDirection, 0)

        styledAttributes.recycle()

        if (drawable != null) {
            val mBitmapDrawable = drawable as BitmapDrawable
            mBitmap = mBitmapDrawable.bitmap
//            pickColorFromBitmap(mBitmap!!)
        } else {
            if (background != null) {
                val mBitmapDrawable = background as BitmapDrawable
                mBitmap = mBitmapDrawable.bitmap
//                pickColorFromBitmap(mBitmap!!)
            }
        }
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

        width = measuredWidth
        height = measuredHeight

        mClipPath = PathProvider.getClipPath(width, height, curvatureHeight, curvatureDirection, gravity)

        ViewCompat.setElevation(this, ViewCompat.getElevation(this))

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
                    outline.setConvexPath(PathProvider.getOutlinePath(width, height, curvatureHeight, curvatureDirection, gravity))
                } catch (e: Exception) {
                    Log.d("Outline Path", e.message)
                }

            }
        }
    }

    override fun onDraw(canvas: Canvas) {
        val saveCount = canvas.saveLayer(0f, 0f, getWidth().toFloat(), getHeight().toFloat(), null, Canvas.ALL_SAVE_FLAG)
        super.onDraw(canvas)
        mPaint?.xfermode = porterDuffXfermode
        if (tintPaint != null) {
            canvas.drawColor(tintPaint!!.color)
        }

        val mShader = GradientProvider.getShader(gradientStartColor, gradientEndColor, gradientDirection, canvas.width, canvas.height)
        shaderPaint?.shader = mShader
        canvas.drawPaint(shaderPaint)

        canvas.drawPath(mClipPath, mPaint)
        canvas.restoreToCount(saveCount)
        mPaint?.xfermode = null
    }

    private fun getDpForPixel(pixel: Int): Int {
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, pixel.toFloat(), mContext?.resources?.displayMetrics).toInt()
    }

    fun setCurvature(height: Int) {
        curvatureHeight = getDpForPixel(height)
    }

    fun setTintColor(tintColor: Int) {
        this.tintColor = tintColor
    }

    fun setTintMode(tintMode: Int) {
        this.tintMode = tintMode
    }

    fun setTintAmount(tintAmount: Int) {
        this.tintAmount = tintAmount
    }

    fun setGradientDirection(direction: Int) {
        this.gradientDirection = direction
    }

    fun setGradientStartColor(startColor: Int) {
        this.gradientStartColor = startColor
    }

    fun setGradientEndColor(endColor: Int) {
        this.gradientEndColor = endColor
    }

    fun setCurvatureDirection(direction: Int) {
        this.curvatureDirection = direction
    }
}
