package com.example.tpkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.pow
import kotlin.math.sqrt

class TP02 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val resolution = findViewById<Button>(R.id.btnR);
//        val quitter = findViewById<Button>(R.id.btnExit)
//        val resultat = findViewById<TextView>(R.id.vR);
//        resolution.setOnClickListener() {
//            val A = findViewById<EditText>(R.id.vA).text.toString().toDouble();
//            val B = findViewById<EditText>(R.id.vB).text.toString().toDouble();
//            val C = findViewById<EditText>(R.id.vC).text.toString().toDouble();
//
//            if (A == 0.0) {
//                if (B == 0.0) {
//                    if (C == 0.0) {
//                        resultat.text = "L'équation admet une infinité de solutions dans IR.";
//                    }
//                    else{
//                        resultat.text = "L'équation n'admet pas de solution dans IIR.";
//                    }
//                }
//                else{
//                    var X = (-C/B);
//                    resultat.text = "L'équation admet une solution dans IIR qui est : " + X;
//                }
//            }
//            else{
//                var D = (B.pow(2) - 4*A*C);
//                if(D<0.0){
//                    resultat.text = "L'équation n'admet pas de solution dans IIR.";
//                }
//                else if(D == 0.0){
//                    var X0 = (-B/(2*A));
//                    resultat.text = "L'équation admet une solution double dans IIR qui est : " + X0;
//                }
//                else{
//                    var X1 = ((-B- sqrt(D))/(2*A));
//                    var X2 = ((-B+ sqrt(D))/(2*A));
//                    resultat.text = "L'équation admet deux solution distinct dans IIR qui sont : " + X1 + " et " + X2;
//                }
//            }
//        }
//        quitter.setOnClickListener {
//            onBackPressed()
//        }
    }
}