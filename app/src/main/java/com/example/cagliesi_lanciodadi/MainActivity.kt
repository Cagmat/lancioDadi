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
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var btnRoll = findViewById<Button>(R.id.buttonLancia)
        var txtTitle = findViewById<TextView>(R.id.TextViewTitle)
        var imgDice = findViewById<ImageView>(R.id.imageViewDice)

        btnRoll.setOnClickListener(View.OnClickListener {
            val toast = Toast.makeText(this, "LANCIO IN CORSO", Toast.LENGTH_SHORT)
            toast.show()
        })

    }
}