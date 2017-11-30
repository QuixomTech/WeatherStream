package com.quixom.apps.weatherstream.utilities

import android.app.Dialog
import android.content.Context
import android.content.DialogInterface
import android.view.Gravity
import com.quixom.apps.weatherstream.R

import com.victor.loading.rotate.RotateLoading


class WSProgressDialog(context: Context, theme: Int) : Dialog(context, theme) {

    companion object {

        private var dialog: WSProgressDialog? = null

        fun show(context: Context, cancelable: Boolean, cancelListener: DialogInterface.OnCancelListener?): WSProgressDialog {
            dialog = WSProgressDialog(context, R.style.ProgressUtil)
            dialog!!.setTitle("")
            dialog!!.setContentView(R.layout.progress_util)
            val rotateLoading: RotateLoading = dialog!!.findViewById(R.id.rotateLoading)
            dialog!!.setCancelable(cancelable)
            dialog!!.setOnCancelListener(cancelListener)
            dialog!!.window!!.attributes.gravity = Gravity.CENTER
            val lp = dialog!!.window!!.attributes
            lp.dimAmount = 0.2f
            dialog!!.window!!.attributes = lp
            rotateLoading.start()

            dialog!!.show()
            return dialog as WSProgressDialog
        }
    }
}
