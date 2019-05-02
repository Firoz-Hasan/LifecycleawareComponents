package com.fhd.firozhasan.lifecycle_awarecomponents

import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    /*
    * LIFECYCLEOWNER provides lifecycle status to lifecycle aware components
    * LIFECYCLEOBSERVER responds lifecycle status and perform aciton
    * VIEWMODEL : It provides data to UI / communication layer between UI & data resource
    *
    * */
    private val TAG = this.javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "Owner ON_CREATE")
        lifecycle.addObserver(MainActivityObserver())


//        MainActivityDataGenerator myData = new MainActivityDataGenerator();
        val model = ViewModelProviders.of(this).get(MainActivityViewModel::class.java)
        val myRandomNumber = model.getNumber()
        tvNumber.setText(myRandomNumber)
        debug("+++++++++++++++++++++++++Random Number Set")
    }

    override fun onStart() {
        super.onStart()
        debug("Owner ON_START")

    }

    override fun onResume() {
        super.onResume()
        debug("Owner ON_RESUME")
    }

    override fun onPause() {
        super.onPause()
        debug("Owner ON_PAUSE")
    }

    override fun onStop() {
        super.onStop()
        debug("Owner ON_STOP")
    }

    override fun onDestroy() {
        super.onDestroy()
        debug("Owner ON_DESTROY")
    }
}
