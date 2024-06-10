package com.example.myweatherapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextClock
import android.widget.TextView
import androidx.activity.enableEdgeToEdge

class DetailedViewScreen : AppCompatActivity() {
    private lateinit var detailsTextView: TextView
    private lateinit var averageTextView: TextView
    private lateinit var minimumtTextView: TextView
    private lateinit var maximumTextView: TextView
    private lateinit var back: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailed_view_screen)

        detailsTextView = findViewById(R.id.details)
        averageTextView = findViewById(R.id.average)
        minimumtTextView = findViewById(R.id.minimumt)
        maximumTextView = findViewById(R.id.maximumt)
        back = findViewById(R.id.back)

        val day = intent.getStringArrayListExtra("day") ?: arrayListOf()
        val morningt =
            intent.getIntegerArrayListExtra("morningt") ?: arrayListOf()
        val afternoont =
            intent.getIntegerArrayListExtra("afternoont") ?: arrayListOf()
        val eveningt =
        intent.getIntegerArrayListExtra("eveningt") ?: arrayListOf()

        val details = StringBuilder()
        var totaltemperature = 0
        for (i in day.indices) {
            details.append("${day[i]}: Morning - ${morningt[i]}\n")
            totaltemperature += morningt[i] + afternoont[i] + eveningt[i]
        }
        val average = if (day.isNotEmpty()) totaltemperature / day.size else 0
        detailsTextView.text = details.toString()
        averageTextView.text = "Average screen time: $average mins"

        back.setOnClickListener {
            finish()
        }
    }

}