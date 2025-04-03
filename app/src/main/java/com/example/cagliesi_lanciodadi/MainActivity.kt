package com.example.cagliesi_lanciodadi

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    private val TAG = "MainActivity"
    private lateinit var btnRoll
    private lateinit var txtTitle
    private lateinit var txtNumber
    private lateinit var imgDice

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        Log.d(TAG,"Inflate fatto")
        btnRoll = findViewById<Button>(R.id.buttonLancia)
        txtTitle = findViewById<TextView>(R.id.TextViewTitle)
        txtNumber = findViewById<TextView>(R.id.TextViewNumber)
        imgDice = findViewById<ImageView>(R.id.imageViewDice)

        btnRoll.setOnClickListener(View.OnClickListener {
            val toast = Toast.makeText(this, "LANCIO IN CORSO", Toast.LENGTH_SHORT)
            toast.show()
        })

    }

    public function rollDice(){
        Log.d(TAG,"Lancio del dado")
        val numeroRandom = Random().nextInt(6)+1
        Log.d(TAG,"Lancio del dado: " + numeroRandom.toString())
        txtNumber.text = numeroRandom.toString()
        val imgDiceResources  = when(numeroRandom){
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            else 6 -> R.drawable.dice6
        }
        imgDice.setImageResource(imgDiceResources)
    }
}