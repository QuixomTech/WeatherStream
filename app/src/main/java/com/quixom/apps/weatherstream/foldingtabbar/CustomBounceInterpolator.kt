package client.yalantis.com.foldingtabbar

import android.view.animation.Interpolator

/**
 * Created by akif on 02/11/17
 */
internal class CustomBounceInterpolator(private val amplitude: Double = 0.1, private val frequency: Double = 0.8) : Interpolator {

    override fun getInterpolation(time: Float): Float {
        return (-1.0 * Math.exp(-time / amplitude) *
                Math.cos(frequency * time) + 1).toFloat()
    }
}