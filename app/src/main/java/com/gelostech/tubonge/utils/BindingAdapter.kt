package com.gelostech.tubonge.utils

import androidx.databinding.BindingAdapter
import de.hdodenhof.circleimageview.CircleImageView

object BindingAdapter {

    @JvmStatic
    @BindingAdapter("app:image")
    fun loadImage(view: CircleImageView, image: Int) {
        view.loadAvatar(image)
    }
}