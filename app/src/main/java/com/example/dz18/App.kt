package com.example.dz18

import android.app.Application
import android.content.Context
import android.content.SharedPreferences

class App : Application() {
    private lateinit var sharedPreferences: SharedPreferences
    override fun onCreate() {
        super.onCreate()
        instance = this
        sharedPreferences = getSharedPreferences("MyShared", Context.MODE_PRIVATE)

    }

    fun saveDateInPref(count: String) {
        sharedPreferences.edit()
            .putString(SP_KEY, count)
            .apply()
    }

    fun getDataFromPref(): String {
        return sharedPreferences.getString(SP_KEY, "") ?: ""
    }


    companion object {
        private lateinit var instance: App
        fun getApp() = instance
        const val SP_KEY = "SharedPreference"
    }
}