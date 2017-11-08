package com.quixom.apps.weatherstream.weatherview.confetti

/**
 * Created by akif on 11/2/17.
 */

/**
 * The source from which confetti will appear. This can be either a line or a point.
 *
 *
 * Please note that the specified source represents the top left corner of the drawn
 * confetti. If you want the confetti to appear from off-screen, you'll have to offset it
 * with the confetti's size.
 */
open class ConfettiSource
/**
 * Specifies a line source from which all confetti will emit from.
 *
 * @param x0 x-coordinate of the first point relative to the [ConfettiView]'s parent.
 * @param y0 y-coordinate of the first point relative to the [ConfettiView]'s parent.
 * @param x1 x-coordinate of the second point relative to the [ConfettiView]'s parent.
 * @param y1 y-coordinate of the second point relative to the [ConfettiView]'s parent.
 */
(val x0: Int, val y0: Int, val x1: Int, val y1: Int) {

    /**
     * Specifies a point source from which all confetti will emit from.
     *
     * @param x x-coordinate of the point relative to the [ConfettiView]'s parent.
     * @param y y-coordinate of the point relative to the [ConfettiView]'s parent.
     */
    constructor(x: Int, y: Int) : this(x, y, x, y) {}

    protected open fun getInitialX(random: Float): Float {
        return x0 + (x1 - x0) * random
    }

    protected open fun getInitialY(random: Float): Float {
        return y0 + (y1 - y0) * random
    }
}
