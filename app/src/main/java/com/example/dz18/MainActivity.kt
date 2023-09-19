package com.example.dz18

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private lateinit var button: CardView
    private lateinit var tvCount: TextView
    private lateinit var viewModel: CountViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button)
        tvCount = findViewById(R.id.tv_count)

        viewModel = ViewModelProvider(this).get(CountViewModel::class.java)
        viewModel.countLiveData.observe(this) {
            tvCount.text = it
        }

        button.setOnClickListener { viewModel.addCount() }
    }

    override fun onPause() {
        super.onPause()
        App.getApp().saveDateInPref(viewModel.countLiveData.value.toString())
    }
}