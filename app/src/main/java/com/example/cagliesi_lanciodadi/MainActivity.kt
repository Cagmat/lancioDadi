package com.example.cagliesi_lanciodadi

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Random


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    private val TAG = "MainActivity"
    private lateinit var btnRoll : Button
    private lateinit var txtTitle  : TextView
    private lateinit var imgDice : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        Log.d(TAG,"Inflate fatto")
        btnRoll = findViewById<Button>(R.id.buttonLancia)
        txtTitle = findViewById<TextView>(R.id.TextViewTitle)
        imgDice = findViewById<ImageView>(R.id.imageViewDice)

        btnRoll.setOnClickListener(View.OnClickListener {
            val toast = Toast.makeText(this, "LANCIO IN CORSO", Toast.LENGTH_SHORT)
            toast.show()
            rollDice()
        })

    }

    public fun rollDice(){
        Log.d(TAG,"Lancio del dado")
        val numeroRandom = Random().nextInt(6)+1
        Log.d(TAG,"Lancio del dado: " + numeroRandom.toString())
        val imgDiceResources  = when(numeroRandom){
            1 -> R.drawable.dice_face_1
            2 -> R.drawable.dice_face_2
            3 -> R.drawable.dice_face_3
            4 -> R.drawable.dice_face_4
            5 -> R.drawable.dice_face_5
            else -> R.drawable.dice_face_6
        }
        imgDice.setImageResource(imgDiceResources)
        val intent = Intent(this, MainActivity2::class.java).apply {putExtra("NUMERO", numeroRandom.toString())}
        startActivity(intent)
    }
}