package com.georgcantor.scanner.util

import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

fun View.setVisibility(visible: Boolean) {
    visibility = if (visible) VISIBLE else GONE
}

fun View.visible() { visibility = VISIBLE }

fun View.gone() { visibility = GONE }

inline fun <T : ViewBinding> AppCompatActivity.viewBinding(
    crossinline bindingInflater: (LayoutInflater) -> T
) = lazy(LazyThreadSafetyMode.NONE) { bindingInflater.invoke(layoutInflater) }