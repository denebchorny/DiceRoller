package com.denebchorny.android.diceroller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var ivDice: AppCompatImageView
    private lateinit var btnRoll: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ivDice = findViewById(R.id.ivDice)
        btnRoll = findViewById(R.id.btnRoll)

        btnRoll.setOnClickListener { onRollDice() }
    }

    private fun onRollDice() {
        val randomNumber = Random.nextInt(6) + 1
        ivDice.setImageLevel(randomNumber)

        // Course version
       /*val drawableResource = when (randomNumber) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        ivDice.setImageResource(drawableResource)*/
    }
}