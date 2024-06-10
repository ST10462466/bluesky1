package com.example.myweatherapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge

class MainScreen : AppCompatActivity() {
    private lateinit var dayEditText: EditText
    private lateinit var morningtEditText: EditText
    private lateinit var afternoontEditText: EditText
    private lateinit var eveningtEditText: EditText
    private lateinit var averageTextView: TextView
    // Declaring arrays
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
         averageTextView= findViewById(R.id.average)

        val clear = findViewById<Button>(R.id.clear)
        val enter = findViewById<Button>(R.id.enter1)
        val exit = findViewById<Button>(R.id.exit2)
        val continue1 = findViewById<Button>(R.id.continue1)

        clear.setOnClickListener {
            cleardata()
        }

        enter.setOnClickListener {
            enterdata()
        }

        continue1.setOnClickListener {
            val intent = Intent (this, DetailedViewScreen::class.java)
            intent.putStringArrayListExtra("day", day)
            intent.putIntegerArrayListExtra("morningt", morningt)
            intent.putIntegerArrayListExtra("afternoont", afternoont)
            intent.putIntegerArrayListExtra("eveningt", eveningt)
            startActivity(intent)
            finish()
        }
    }

    private fun enterdata() {
        val day = dayEditText.text.toString()
        val morningt = morningtEditText.text.toString().toIntOrNull()
        val afternoont =afternoontEditText.text.toString().toIntOrNull()
        val eveningt = eveningtEditText.text.toString().toIntOrNull()

        if (day.isNotEmpty() && morningt != null && afternoont != null){
            day.enter(day)
            morningt.enter(morningt)
            afternoont.enter(afternoont)
            if (eveningt != null) {
                eveningt.enter(eveningt)
            }

            dayEditText.text.clear()
            morningtEditText.text.clear()
            afternoontEditText.text.clear()
            eveningtEditText.text.clear()

            Toast.makeText(this, "Information entered correctly", Toast.LENGTH_SHORT).show()
    }
        else
        {
            Toast.makeText(this,"Please enter correctly the informations required", Toast.LENGTH_SHORT).show()
            finish()
        }
}

    private fun cleardata() {
        day.clear()
        morningt.clear()
        afternoont.clear()
        eveningt.clear()

        dayEditText.text.clear()
        morningtEditText.text.clear()
        afternoontEditText.text.clear()
        eveningtEditText.text.clear()

        Toast.makeText(this, "Information cleared" , Toast.LENGTH_SHORT).show()
        finish()
    }
}

private fun Int.enter(morningt: Int) {
    TODO("Not yet implemented")
}

private fun String.enter(day: String) {
    TODO("Not yet implemented")
}
