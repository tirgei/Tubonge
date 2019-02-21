package com.gelostech.tubonge.utils

import android.content.Context
import android.graphics.drawable.Drawable
import android.os.Build
import androidx.core.content.ContextCompat
import com.mikepenz.iconics.IconicsDrawable
import com.mikepenz.iconics.typeface.IIcon

object AppUtils {

    // Check if Build version is >= Marshmallow
    fun buildMarshMellow(): Boolean {
        return Build.VERSION.SDK_INT > Build.VERSION_CODES.M
    }

    // Return iconics drawable
    fun drawable(context: Context, icon: IIcon, color: Int, size: Int): Drawable {
        return IconicsDrawable(context).icon(icon).color(ContextCompat.getColor(context, color)).sizeDp(size)
    }
}