package com.fhd.firozhasan.lifecycle_awarecomponents
import android.arch.lifecycle.ViewModel
import android.util.Log
import kotlin.random.Random


class MainActivityViewModel : ViewModel() {

    private val TAG = this.javaClass.simpleName
    private var myRandomNumber: String? = null

    val number: String?
        get() {
            Log.d(TAG, "Get number")
            if (myRandomNumber == null) {
                createNumber()
            }
            return myRandomNumber
        }

    private fun createNumber() {
        Log.d(TAG, "Create new number")
        val random = Random
        myRandomNumber = "Number: " + (random.nextInt(10 - 1) + 1)
    }

    override fun onCleared() {
        super.onCleared()
        Log.d(TAG, "ViewModel Destroyed")
    }
}