package com.denebchorny.android.diceroller

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView

class MainActivity : AppCompatActivity() {

    private lateinit var tvResult: AppCompatTextView
    private lateinit var btnRoll: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvResult = findViewById(R.id.tvResult)
        btnRoll = findViewById(R.id.btnRoll)

        btnRoll.setOnClickListener { onRollDice() }
    }

    private fun onRollDice() = Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
}