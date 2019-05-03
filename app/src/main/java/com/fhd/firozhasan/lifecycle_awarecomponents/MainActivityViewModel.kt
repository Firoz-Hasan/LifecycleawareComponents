package com.fhd.firozhasan.lifecycle_awarecomponents

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import java.util.*

class MainActivityViewModel : ViewModel() {
    private val TAG = this.javaClass.simpleName
    private var myRandomNumber : MutableLiveData<String>? = null


    fun getNumber(): MutableLiveData<String>? {
        debug("+++++++++++++++++++++++++Get Number")
        if (myRandomNumber == null){
            myRandomNumber = MutableLiveData()
            createNumber()
        }
        return myRandomNumber
    }

    public fun createNumber() {
        debug("+++++++++++++++++++++++++Create new number")
        val random = Random()
        myRandomNumber?.value = "Number: " + (random.nextInt(10 - 1) + 1)

    }

    override fun onCleared() {
        super.onCleared()
        debug("+++++++++++++++++++++++++ViewModel Destroyed")
    }
}