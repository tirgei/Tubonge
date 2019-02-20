package com.gelostech.tubonge.utils

import android.os.Build

object AppUtils {

    // Check if Build version is >= Marshmallow
    fun buildMarshMellow(): Boolean {
        return Build.VERSION.SDK_INT > Build.VERSION_CODES.M
    }
}