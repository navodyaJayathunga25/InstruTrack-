package com.example.instrutrack

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class NewPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_new_password)

        val back = findViewById<android.widget.Button>(R.id.backbutton1)
        back.setOnClickListener{
            val intent = Intent(this, LoginPage::class.java)
            startActivity(intent)
            finish()
        }

        val confirm = findViewById<android.widget.Button>(R.id.btnConfirmPwdMain)
        confirm.setOnClickListener{
            val intent = Intent(this, LoginPage::class.java)
            startActivity(intent)
            finish()
        }
    }
}