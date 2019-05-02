package com.fhd.firozhasan.lifecycle_awarecomponents

import android.arch.lifecycle.ViewModel
import java.util.*

class MainActivityViewModel : ViewModel() {
    private val TAG = this.javaClass.simpleName
    private var myRandomNumber : String? = null


    fun getNumber(): String? {
        debug("+++++++++++++++++++++++++Get Number")
        if (myRandomNumber == null){
            createNumber()
        }
        return myRandomNumber
    }

    private fun createNumber() {
        debug("+++++++++++++++++++++++++Create new number")
        val random = Random()
        myRandomNumber = "Number: " + (random.nextInt(10 - 1) + 1)

    }

    override fun onCleared() {
        super.onCleared()
        debug("+++++++++++++++++++++++++ViewModel Destroyed")
    }
}