package com.quixom.apps.weatherstream.widgets

import android.graphics.Path

internal object PathProvider {

    fun getOutlinePath(width: Int, height: Int, curvatureHeight: Int, direction: Int, gravity: Int): Path {

        val mPath = Path()

        if (direction == CrescentoImageView.CurvatureDirection.OUTWARD) {
            if (gravity == CrescentoImageView.Gravity.TOP) {
                mPath.moveTo(0f, 0f)
                mPath.lineTo(0f, (height - curvatureHeight).toFloat())
                mPath.quadTo((width / 2).toFloat(), (height + curvatureHeight).toFloat(),
                        width.toFloat(), (height - curvatureHeight).toFloat())
                mPath.lineTo(width.toFloat(), 0f)
                mPath.lineTo(0f, 0f)
                mPath.close()
            } else {
                mPath.moveTo(0f, height.toFloat())
                mPath.lineTo(0f, curvatureHeight.toFloat())
                mPath.quadTo((width / 2).toFloat(), (-curvatureHeight).toFloat(),
                        width.toFloat(), curvatureHeight.toFloat())
                mPath.lineTo(width.toFloat(), height.toFloat())
                mPath.close()
            }
        } else {
            if (gravity == CrescentoImageView.Gravity.TOP) {
                mPath.moveTo(0f, 0f)
                mPath.lineTo(0f, height.toFloat())
                mPath.quadTo((width / 2).toFloat(), (height - curvatureHeight).toFloat(),
                        width.toFloat(), height.toFloat())
                mPath.lineTo(width.toFloat(), 0f)
                mPath.lineTo(0f, 0f)
                mPath.close()
            } else {
                mPath.moveTo(0f, height.toFloat())
                mPath.lineTo(0f, 0f)
                mPath.cubicTo(0f, 0f,
                        (width / 2).toFloat(), curvatureHeight.toFloat(),
                        width.toFloat(), curvatureHeight.toFloat())
                mPath.lineTo(width.toFloat(), height.toFloat())
                mPath.lineTo(0f, height.toFloat())
                mPath.close()
            }
        }
        return mPath
    }

    fun getClipPath(width: Int, height: Int, curvatureHeight: Int, direction: Int, gravity: Int): Path {

        val mPath = Path()

        if (direction == CrescentoImageView.CurvatureDirection.OUTWARD) {
            if (gravity == CrescentoImageView.Gravity.TOP) {

                mPath.moveTo(0f, (height - curvatureHeight).toFloat())
                mPath.quadTo((width / 2).toFloat(), (height + curvatureHeight).toFloat(),
                        width.toFloat(), (height - curvatureHeight).toFloat())
                mPath.lineTo(width.toFloat(), 0f)
                mPath.lineTo(width.toFloat(), height.toFloat())
                mPath.lineTo(0f, height.toFloat())
                mPath.close()
            } else {
                mPath.moveTo(0f, 0f)
                mPath.lineTo(width.toFloat(), 0f)
                mPath.lineTo(width.toFloat(), curvatureHeight.toFloat())
                mPath.quadTo((width / 2).toFloat(), (-curvatureHeight).toFloat(),
                        0f, curvatureHeight.toFloat())
                mPath.lineTo(0f, 0f)
                mPath.close()
            }
        } else {
            if (gravity == CrescentoImageView.Gravity.TOP) {
                mPath.moveTo(0f, height.toFloat())
                mPath.quadTo((width / 2).toFloat(), (height - 2 * curvatureHeight).toFloat(),
                        width.toFloat(), height.toFloat())
                mPath.lineTo(width.toFloat(), height.toFloat())
                mPath.close()
            } else {
                mPath.moveTo(0f, 0f)
                mPath.lineTo(width.toFloat(), 0f)
                mPath.quadTo((width / 2).toFloat(), (2 * curvatureHeight).toFloat(),
                        0f, 0f)
                mPath.lineTo(0f, 0f)
                mPath.close()
            }
        }
        return mPath
    }
}
