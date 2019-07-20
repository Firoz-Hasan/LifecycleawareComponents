package com.fhd.firozhasan.lifecycle_awarecomponents
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.util.Log
import kotlin.random.Random


class MainActivityViewModel : ViewModel() {

    private val TAG = this.javaClass.simpleName
    private var myRandomNumber: MutableLiveData<String>? = null

    val number: MutableLiveData<String>?
        get() {
            Log.d(TAG, "Get number")
            if (myRandomNumber == null) {
                myRandomNumber = MutableLiveData()
                createNumber()
            }
            return myRandomNumber
        }

     fun createNumber() {
        Log.d(TAG, "Create new number")
        val random = Random
        myRandomNumber?.value = "Number: " + (random.nextInt(10 - 1) + 1)
    }

    override fun onCleared() {
        super.onCleared()
        Log.d(TAG, "ViewModel Destroyed")
    }
}