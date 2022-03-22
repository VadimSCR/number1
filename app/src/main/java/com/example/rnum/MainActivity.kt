package com.example.rnum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


    fun NextActivity(view: View) {

        val intent = Intent(this, GameActivity::class.java);

        val min = findViewById<EditText>(R.id.min).getText().toString().toInt()
        val max = findViewById<EditText>(R.id.max).getText().toString().toInt()

        intent.putExtra("min", min)
        intent.putExtra("max", max)

        startActivity(intent)

    }

}