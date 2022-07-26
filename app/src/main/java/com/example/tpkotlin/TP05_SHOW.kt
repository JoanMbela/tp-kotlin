package com.example.tpkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class TP05_SHOW : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tp05_show)

        // Recuperer les donnees envoyees
        val leName : String? = getIntent().getStringExtra("Nom")
        val leFirstName : String? = getIntent().getStringExtra("Prenom")
        val laBirthdate : String? = getIntent().getStringExtra("DateNaissance")
        val lAddress : String? = getIntent().getStringExtra("Adresse")
        val laPOBox : String? = getIntent().getStringExtra("BP")

        // Recuperer les composants graphiques pour afficher les donnees
//        val textNom : TextView = findViewById(R.id.tvNom)
//        val textPrenom : TextView = findViewById(R.id.txtPrenom)
//        val textDateNaissance : TextView = findViewById(R.id.txtDateNaissance)
//        val textAdresse : TextView = findViewById(R.id.txtAdresse)
//        val textBP : TextView = findViewById(R.id.txtBoitePostaleVille)

        val textNom : TextView = findViewById(R.id.textView3)
        val textPrenom : TextView = findViewById(R.id.txtPreno)
        val textDateNaissance : TextView = findViewById(R.id.dateNaissance)
        val textAdresse : TextView = findViewById(R.id.adresse)
        val textBP : TextView = findViewById(R.id.boitePostal)

        // Affichage des donnees recuperees
        textNom.setText(leName.toString())
        textPrenom.setText(leFirstName.toString())
        textDateNaissance.setText(laBirthdate)
        textAdresse.setText(lAddress)
        textBP.setText(laPOBox)

    }
}