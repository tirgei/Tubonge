package com.gelostech.tubonge.ui.activities

import android.os.Bundle
import com.gelostech.tubonge.R
import com.gelostech.tubonge.ui.base.BaseActivity
import com.gelostech.tubonge.utils.loadUrl
import com.gelostech.tubonge.utils.show
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.empty_state.view.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
        showEmptyState()
    }

    private fun initViews() {
        setSupportActionBar(toolbar)
        supportActionBar?.title = null

        emptyState.image.loadUrl(R.drawable.empty_inbox)
        emptyState.text.text = getString(R.string.empty_inbox)
    }

    private fun showEmptyState() {
        emptyState.show()
    }
}
