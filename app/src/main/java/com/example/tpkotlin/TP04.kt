package com.example.tpkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class TP04 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tp04)

        val zoneAffiche = findViewById<TextInputLayout>(R.id.txtArea)
        val zoneSaisie = findViewById<TextInputEditText>(R.id.txtEdit)
        val btnHide = findViewById<Button>(R.id.btnMasquer)
        val btnShow = findViewById<Button>(R.id.btnAffiche)
        val btnEnable = findViewById<Button>(R.id.btnAutoriser)
        val btnDisable = findViewById<Button>(R.id.btnInterdire)
        val btnQuit = findViewById<Button>(R.id.btnQuit)

        btnHide.setOnClickListener {
            zoneAffiche.visibility = View.INVISIBLE
        }

        btnShow.setOnClickListener {
            zoneAffiche.visibility = View.VISIBLE
        }

        btnEnable.setOnClickListener {
            zoneSaisie.isEnabled = true
        }

        btnDisable.setOnClickListener {
            zoneSaisie.isEnabled = false
        }

        btnQuit.setOnClickListener {
            onBackPressed()
        }
    }
}