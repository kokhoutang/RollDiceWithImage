package com.example.rolldicewithimage

import androidx.appcompat.app.AppCompatActivity
import android.widget.*;
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRoll :Button = findViewById<Button>(R.id.btnRollDice)
        btnRoll.setOnClickListener() {

            val randomInt = (1..6).random()

            val diceImage : ImageView = findViewById<ImageView>(R.id.dice_image)

          //  rollDice()
            val drawableResource = when (randomInt) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            diceImage.setImageResource(drawableResource)
        }
    }
}

 /*   private fun rollDice() {
        val randomInt = (1..6).random()

        val diceImage: ImageView = findViewById(R.id.dice_image)
    }

*/