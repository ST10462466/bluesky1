package com.example.myweatherapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.activity.enableEdgeToEdge

class MainScreen : AppCompatActivity() {
    private lateinit var dayEditText: EditText
    private lateinit var morningtEditText: EditText
    private lateinit var afternoontEditText: EditText
    private lateinit var eveningtEditText: EditText
    private lateinit var averageEditText: EditText
    private val day = ArrayList<String>()
    private val morningt = ArrayList<Int>()
    private val afternoont = ArrayList<Int>()
    private val eveningt = ArrayList<Int>()
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_screen)

        dayEditText = findViewById(R.id.day)
        morningtEditText = findViewById(R.id.morningt)
        afternoontEditText = findViewById(R.id.afternoont)
        eveningtEditText = findViewById(R.id.eveningt)
        averageEditText = findViewById(R.id.average)

    }
}