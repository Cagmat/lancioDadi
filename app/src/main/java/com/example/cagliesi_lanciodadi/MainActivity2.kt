package com.example.cagliesi_lanciodadi

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.setPadding
import java.util.Random

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        val message = intent.getStringExtra("NUMERO")
        var ImgEstrazione = findViewById<ImageView>(R.id.imageViewEstrazione)
        var TextEstrazione = findViewById<TextView>(R.id.textViewEstrazione)
        val imgDiceResources  = when(message){
            "1" -> R.drawable.dice_face_1
            "2" -> R.drawable.dice_face_2
            "3" -> R.drawable.dice_face_3
            "4" -> R.drawable.dice_face_4
            "5" -> R.drawable.dice_face_5
            else -> R.drawable.dice_face_6
        }
        ImgEstrazione.setImageResource(imgDiceResources)
        TextEstrazione.setText("NUMERO ESTRATTO: " + message)

    }
}