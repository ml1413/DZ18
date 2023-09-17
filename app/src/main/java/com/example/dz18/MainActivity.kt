package com.example.dz18

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    private lateinit var button: CardView
    private lateinit var tvCount: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button)
        tvCount = findViewById(R.id.tv_count)

        button.setOnClickListener { tvCount.text = randomNumber().toString() }
    }

    private fun randomNumber() = (10..99).random()
}