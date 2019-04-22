package com.fhd.firozhasan.lifecycle_awarecomponents

import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.OnLifecycleEvent
import android.util.Log


class MainActivityObserver : LifecycleObserver {
    private val TAG = this.javaClass.simpleName

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreateEvent() {
        Log.d(TAG, "Observer ON_CREATE")
    }
}