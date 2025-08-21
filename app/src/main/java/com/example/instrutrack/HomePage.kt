package com.example.instrutrack

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_page)

        //Profile Page

        val topProfile = findViewById<android.widget.ImageView>(R.id.profileTop)
        topProfile.setOnClickListener{
            val intent = Intent(this, ProfilePage::class.java)
            startActivity(intent)
            finish()
        }

        val topUserName = findViewById<android.widget.TextView>(R.id.userName)
        topUserName.setOnClickListener{
            val intent = Intent(this, ProfilePage::class.java)
            startActivity(intent)
            finish()
        }

        val downProfile = findViewById<android.widget.ImageView>(R.id.profileImage)
        downProfile.setOnClickListener{
            val intent = Intent(this, ProfilePage::class.java)
            startActivity(intent)
            finish()
        }

        val downProfileName = findViewById<android.widget.TextView>(R.id.profile)
        downProfileName.setOnClickListener{
            val intent = Intent(this, ProfilePage::class.java)
            startActivity(intent)
            finish()
        }

        //Instrument Page
        //Search Page
        //Favorite Page
        //Download Page
    }
}