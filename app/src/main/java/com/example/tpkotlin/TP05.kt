package com.example.tpkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class TP05 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tp05)

        // Recuperation des composants graphiques
        val etNom = findViewById<EditText>(R.id.edtNom)
        val etPrenom = findViewById<EditText>(R.id.edtPrenom)
        val etDateNaissance = findViewById<EditText>(R.id.edtDateNaissance)
        val etAdresse = findViewById<EditText>(R.id.edtAdresse)
        val etBP = findViewById<EditText>(R.id.edtBoitepostale)

        val bouttonEnvoyer = findViewById<Button>(R.id.btnEnvoyer)
        val bouttonEffacer = findViewById<Button>(R.id.btnEffacer)
        val bouttonQuitter = findViewById<Button>(R.id.btnQuitter)

        bouttonEnvoyer.setOnClickListener() {

            // Creation d'une intention pour l'envoi des donnees
            val monIntention = Intent(this@TP05, TP05_SHOW::class.java)

            // Recuperation des donnees a envoyer
            val leNom = etNom.text
            val lePrenom = etPrenom.text
            val laDateNaissance = etDateNaissance.text
            val lAdresse = etAdresse.text
            val laBP = etBP.text

            // Attachement des donnees a l'intention
            monIntention.putExtra("Nom", leNom)
            monIntention.putExtra("Prenom", lePrenom)
            monIntention.putExtra("Adresse", lAdresse)
            monIntention.putExtra("DateNaissance", laDateNaissance)
            monIntention.putExtra("BP", laBP)

            startActivity(monIntention)

        }

    }
}