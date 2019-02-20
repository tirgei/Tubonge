package com.gelostech.tubonge.utils

import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions

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

// Function to load image from Int resource
fun ImageView.loadUrl(url: Int) {
    Glide.with(this.context)
        .load(url)
        .transition(DrawableTransitionOptions.withCrossFade())
        .thumbnail(0.05f)
        .into(this)
}