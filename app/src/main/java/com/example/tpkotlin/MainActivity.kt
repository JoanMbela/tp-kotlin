package com.example.tpkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnTP01 = findViewById<Button>(R.id.btnTP1)
        btnTP01.setOnClickListener {
            startActivity(Intent(this, TP01::class.java))
        }

        val btnTP02 = findViewById<Button>(R.id.btnTP2)
        btnTP02.setOnClickListener {
            startActivity(Intent(this, TP02::class.java))
        }

        val btnTP03 = findViewById<Button>(R.id.btnTP3)
        btnTP03.setOnClickListener {
            startActivity(Intent(this, TP03::class.java))
        }

        val btnTP04 = findViewById<Button>(R.id.btnTP4)
        btnTP04.setOnClickListener {
            startActivity(Intent(this, TP04::class.java))
        }

        val btnTP05 = findViewById<Button>(R.id.btnTP5)
        btnTP05.setOnClickListener {
            startActivity(Intent(this, TP05::class.java))
        }
    }
}