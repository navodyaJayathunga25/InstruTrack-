package com.example.instrutrack

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class LoginPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login_page)

        val signupRegi = findViewById<android.widget.TextView>(R.id.signUp2)
        signupRegi.setOnClickListener{
            val intent = Intent(this, RegisterPage::class.java)
            startActivity(intent)
            finish()
        }

        val signInMain = findViewById<android.widget.Button>(R.id.btnConfirmPwdMain)
        signInMain.setOnClickListener{
            val intent = Intent(this, HomePage::class.java)
            startActivity(intent)
            finish()
        }

        val pwdChange = findViewById<android.widget.TextView>(R.id.forgotpwd)
        pwdChange.setOnClickListener{
            val intent = Intent(this, NewPassword::class.java)
            startActivity(intent)
            finish()
        }
    }
}