package com.gelostech.tubonge.ui.base

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.gelostech.tubonge.utils.AppUtils
import org.jetbrains.anko.toast

open class BaseActivity : AppCompatActivity() {
    private var doubleBackToExit = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (AppUtils.buildMarshMellow()) {
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
            window.statusBarColor = Color.WHITE
        }
    }

    override fun onBackPressed() {
        if (doubleBackToExit) {
            super.onBackPressed()
        } else {
            toast("Tap back again to exit")
            doubleBackToExit = true
            Handler().postDelayed({ doubleBackToExit = false }, 1500)
        }
    }
}
