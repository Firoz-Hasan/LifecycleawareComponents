package com.fhd.firozhasan.lifecycle_awarecomponents

import android.util.Log

fun Any.debug(message: String) {
    Log.d(this::class.java.simpleName, message)
}