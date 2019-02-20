package com.gelostech.tubonge.utils

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.request.RequestOptions
import com.gelostech.tubonge.R
import de.hdodenhof.circleimageview.CircleImageView

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

// Function to load user avatar
fun CircleImageView.loadAvatar(url: Int) {
    val options = RequestOptions().placeholder(R.drawable.user_avatar).centerCrop()

    Glide.with(this.context)
        .load(url)
        .transition(DrawableTransitionOptions.withCrossFade())
        .thumbnail(0.05f)
        .apply(options)
        .into(this)
}

// Extension to bind layout to recyclerview adapter
inline fun <reified T : ViewDataBinding> ViewGroup.inflate(@LayoutRes layoutRes: Int): T {
    return DataBindingUtil.inflate(LayoutInflater.from(context), layoutRes, this, false)
}

inline fun FragmentManager.inTransaction(func: FragmentTransaction.() -> FragmentTransaction) {
    beginTransaction().func().commit()
}

fun AppCompatActivity.addFragment(fragment: Fragment, frameId: Int){
    supportFragmentManager.inTransaction { add(frameId, fragment) }
}

fun AppCompatActivity.replaceFragment(fragment: Fragment, frameId: Int) {
    supportFragmentManager.inTransaction{ replace(frameId, fragment) }
}
