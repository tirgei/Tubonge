package com.gelostech.tubonge.ui.activities

import android.os.Bundle
import com.gelostech.tubonge.R
import com.gelostech.tubonge.ui.base.BaseActivity
import com.gelostech.tubonge.utils.hide
import com.gelostech.tubonge.utils.show
import kotlinx.android.synthetic.main.activity_auth.*

class AuthActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        initViews()
    }

    private fun initViews() {
        signin.setOnClickListener {
            enterLogin.hide()
            verifyLogin.show()
        }

        verify.setOnClickListener { launchActivity(MainActivity::class.java) }
    }


    override fun onBackPressed() {
        if (verifyLogin.isShown) {
            verifyLogin.hide()
            enterLogin.show()
        } else {
            super.onBackPressed()
        }
    }
}
