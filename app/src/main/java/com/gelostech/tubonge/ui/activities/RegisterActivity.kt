package com.gelostech.tubonge.ui.activities

import android.os.Bundle
import com.gelostech.tubonge.R
import com.gelostech.tubonge.ui.base.BaseActivity
import com.gelostech.tubonge.utils.AppUtils
import com.gelostech.tubonge.utils.setDrawable
import com.mikepenz.ionicons_typeface_library.Ionicons
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        initViews()
    }

    private fun initViews() {
        setSupportActionBar(toolbar)
        supportActionBar?.title = null

        name.setDrawable(AppUtils.drawable(this, Ionicons.Icon.ion_person, R.color.primaryTextLight, 18))
        email.setDrawable(AppUtils.drawable(this, Ionicons.Icon.ion_email, R.color.primaryTextLight, 18))
        phone.setDrawable(AppUtils.drawable(this, Ionicons.Icon.ion_android_call, R.color.primaryTextLight, 18))

        register.setOnClickListener { launchActivity(MainActivity::class.java) }
    }

}
