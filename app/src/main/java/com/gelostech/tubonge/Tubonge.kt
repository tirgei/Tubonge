package com.gelostech.tubonge

import androidx.multidex.MultiDexApplication
import timber.log.Timber

class Tubonge : MultiDexApplication() {

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}