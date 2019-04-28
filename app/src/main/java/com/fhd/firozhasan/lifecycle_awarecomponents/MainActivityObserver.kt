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
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onSTARTEvent() {
        debug("Observer ON_START")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResumeEvent() {
        debug( "Observer ON_RESUME ")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPauseEvent() {
        debug( "Observer ON_PAUSE ")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStopEvent() {
        debug( "Observer ON_STOP ")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroyEvent() {
        debug( "Observer ON_DESTROY")
    }
}