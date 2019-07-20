package com.fhd.firozhasan.lifecycle_awarecomponents
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.util.Log
import kotlin.random.Random


class MainActivityViewModel : ViewModel() {
/* UNDERSTANDING VIEWMODEL & LIVEDATA
* VIEWMODEL :
* wht it does is :  * it provides the data to UI. * load the data fm network or db
* SO viewmodel act as communication layer between Network/DB and UI
* data is preserved on confg changes why? activity / frag fetching data fm viewmodel so if activity
* is recreated it taking/ fetching data from same viewmodel.
*
* LIVEDATA :
* We used to update THI UI through interface
* reduce boiler plate code
*
* SO why use livedata with viewmodel?
* Viewmodel survives during configuration changes &
* livedata helps to update UI(without interface) as it can be observed
*
* */
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