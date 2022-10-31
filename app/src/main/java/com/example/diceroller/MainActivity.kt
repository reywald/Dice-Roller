package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val dice1 = Dice(6)
        val dice2 = Dice(6)
        val diceRoll1 = dice1.roll()
        val diceRoll2 = dice2.roll()
        val resultTextView1: TextView = findViewById(R.id.textView)
        resultTextView1.text = diceRoll1.toString()
        val resultTextView2: TextView = findViewById(R.id.textView2)
        resultTextView2.text = diceRoll2.toString()
    }
}

/**
 * Roll the dice and update the screen with the result.
 */
class Dice(private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}