package com.example.rnum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView



class GameActivity : AppCompatActivity() {

    var min:Int = 0
    var max:Int = 0
    var number:Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        min = intent.getIntExtra("min", 0)
        max = intent.getIntExtra("max", 200)

        Log.d("mytag", "min $min")
        Log.d("mytag", "max $max")

        number = (min + max) / 2

        findViewById<TextView>(R.id.question).text = "Ваше число $number?"

    }

    fun onYesNoClick(view: android.view.View) {

        when (view.id) {

            R.id.yes -> {
                max = number
                number = (max + min) / 2
                findViewById<TextView>(R.id.question).text = "Ваше число $number?"

                Log.d("mytag", "max $max")
            }

            R.id.no -> {
                min = number
                number = (max + number) / 2
                findViewById<TextView>(R.id.question).text = "Ваше число $number?"

                Log.d("mytag", "min $min")

            }

        }

        if (max - 1 == min) {
            findViewById<TextView>(R.id.question).text = "Ваше число $min"
        }

    }

}