package com.example.tpkotlin

import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.*

class TP03 : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tp03)

        val laDate = findViewById<EditText>(R.id.etDate)
        val leHeure = findViewById<EditText>(R.id.etHeure)
        val laDateHeure = findViewById<EditText>(R.id.etDH)
        val afficher = findViewById<Button>(R.id.btnAfficher)
        val effacer = findViewById<Button>(R.id.btnEffacer)
        val quitter = findViewById<Button>(R.id.btnQuitter)

        afficher.setOnClickListener{
            val simpleDateFormat = SimpleDateFormat("d MMMM yyyy", Locale.FRENCH)
            val dateStr: String = simpleDateFormat.format(Date())
            laDate.hint = dateStr

            val simpleHeureFormat = SimpleDateFormat("HH:mm:ss", Locale.FRENCH)
            val heureStr: String = simpleHeureFormat.format(Date())
            leHeure.hint = heureStr

            val simpleDateHeureFormat = SimpleDateFormat("d MMMM yyyy - HH:mm:ss", Locale.FRENCH)
            val dateheureStr: String = simpleDateHeureFormat.format(Date())
            laDateHeure.hint = dateheureStr


        }

        quitter.setOnClickListener {
            onBackPressed()
        }
    }
}