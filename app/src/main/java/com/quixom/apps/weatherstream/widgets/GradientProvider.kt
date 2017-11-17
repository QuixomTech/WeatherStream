package com.quixom.apps.weatherstream.widgets

import android.graphics.LinearGradient
import android.graphics.Shader

internal object GradientProvider {

    fun getShader(gradientStartColor: Int, gradientEndColor: Int, gradientDirection: Int, width: Int, height: Int): Shader {
        when (gradientDirection) {
            CrescentoImageView.Gradient.TOP_TO_BOTTOM -> return LinearGradient(0f, 0f, 0f, height.toFloat(), gradientStartColor, gradientEndColor, Shader.TileMode.CLAMP)
            CrescentoImageView.Gradient.BOTTOM_TO_TOP -> return LinearGradient(0f, height.toFloat(), 0f, 0f, gradientStartColor, gradientEndColor, Shader.TileMode.CLAMP)
            CrescentoImageView.Gradient.LEFT_TO_RIGHT -> return LinearGradient(0f, 0f, width.toFloat(), 0f, gradientStartColor, gradientEndColor, Shader.TileMode.CLAMP)
            CrescentoImageView.Gradient.RIGHT_TO_LEFT -> return LinearGradient(width.toFloat(), 0f, 0f, 0f, gradientStartColor, gradientEndColor, Shader.TileMode.CLAMP)
            else -> return LinearGradient(0f, 0f, height.toFloat(), 0f, gradientStartColor, gradientEndColor, Shader.TileMode.CLAMP)
        }
    }
}
