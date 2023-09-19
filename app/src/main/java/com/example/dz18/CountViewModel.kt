package com.example.dz18

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CountViewModel : ViewModel() {
    private val model: Model = ModelImpl
    val countLiveData = MutableLiveData(model.getCount())

    init {
        countLiveData.value = App.getApp().getDataFromPref()
    }

    fun addCount() {
        model.setCount()
        countLiveData.value = model.getCount()
    }

    override fun onCleared() {
        super.onCleared()
//        App.getApp().saveDateInPref(model.getCount())
    }
}