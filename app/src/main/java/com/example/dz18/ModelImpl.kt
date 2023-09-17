package com.example.dz18

object ModelImpl : Model {
    private var count: String = ""
    override fun getCount(): String {
        return count
    }

    override fun setCount() {
        count = randomNumber().toString()
    }
    private fun randomNumber() = (10..99).random()
}