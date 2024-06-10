package com.example.myweatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val next = findViewById<Button>(R.id.next1) // button which allows the user to move to the Main Screen of the app
        val exit = findViewById<Button>(R.id.exit1) // button which allows the user to exit the app

        next.setOnClickListener {
            val intent = Intent (this, MainScreen::class.java)
            startActivity(intent)
            finish()
        }
        exit.setOnClickListener {
            finish()
        }
    }
}