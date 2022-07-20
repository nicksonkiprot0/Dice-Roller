package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var dice_image: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val roll_button: Button = findViewById(R.id.roll_button)
        dice_image= findViewById(R.id.dice_image)
        roll_button.setOnClickListener { rollDice() }


    }

    private fun rollDice() {
        val randomInt: Int = Random.nextInt(6)+ 1
        val drawableResource = when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5

            else -> {R.drawable.dice_6}
        }

        dice_image.setImageResource(drawableResource)
    }
}