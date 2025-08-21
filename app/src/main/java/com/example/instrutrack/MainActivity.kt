package com.example.instrutrack

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val next = findViewById<android.widget.TextView>(R.id.Lbl2)
        next.setOnClickListener{
            val intent = Intent(this, RegisterPage::class.java)
            startActivity(intent)
            finish()
        }

        val next1 = findViewById<android.widget.TextView>(R.id.Lbl3)
        next1.setOnClickListener{
            val intent = Intent(this, RegisterPage::class.java)
            startActivity(intent)
            finish()
        }
    }
}