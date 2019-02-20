package com.gelostech.tubonge.utils

import android.view.View

// Function to show hidden view
fun View.show() {
    if (!this.isShown)
        this.visibility = View.VISIBLE
}

// Function to hide shown view
fun View.hide() {
    if (this.isShown)
        this.visibility = View.GONE
}