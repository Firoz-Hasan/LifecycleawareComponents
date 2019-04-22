package com.fhd.firozhasan.lifecycle_awarecomponents

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private val TAG = this.javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "Owner ON_CREATE")
        lifecycle.addObserver(MainActivityObserver())
    }
}
