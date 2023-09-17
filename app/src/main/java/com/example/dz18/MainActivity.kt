package com.example.dz18

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity(), View {
    private lateinit var button: CardView
    private lateinit var tvCount: TextView
    private val presenter: Presenter = PresenterImpl()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button)
        tvCount = findViewById(R.id.tv_count)

        presenter.setView(this)
        button.setOnClickListener { presenter.generateCountNumber() } }

    override fun updateCount(count: String) {
        tvCount.text = count
    }
}