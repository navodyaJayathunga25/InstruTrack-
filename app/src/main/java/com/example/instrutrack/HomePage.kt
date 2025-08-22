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

        val instrument = findViewById<android.widget.TextView>(R.id.instru)
        instrument.setOnClickListener{
            val intent = Intent(this, InstrumentsPage::class.java)
            startActivity(intent)
            finish()
        }

        val instrumentImg = findViewById<android.widget.ImageView>(R.id.instruImage)
        instrumentImg.setOnClickListener {
            val intent = Intent(this, InstrumentsPage::class.java)
            startActivity(intent)
            finish()
        }

        //Search Page

        val searchText = findViewById<android.widget.TextView>(R.id.search)
        searchText.setOnClickListener{
            val intent = Intent(this, SearchPage::class.java)
            startActivity(intent)
            finish()
        }

        val searchImage = findViewById<android.widget.ImageView>(R.id.searchImage)
        searchImage.setOnClickListener {
            val intent = Intent(this, SearchPage::class.java)
            startActivity(intent)
            finish()
        }

        //Song Play Page

        val playSongText = findViewById<android.widget.TextView>(R.id.songName1)
        playSongText.setOnClickListener{
            val intent = Intent(this, SongPlayPage::class.java)
            startActivity(intent)
            finish()
        }

        val playSongText2 = findViewById<android.widget.TextView>(R.id.songArtist1)
        playSongText2.setOnClickListener {
            val intent = Intent(this, SongPlayPage::class.java)
            startActivity(intent)
            finish()
        }

        //Home Page

        val homeText = findViewById<android.widget.TextView>(R.id.homei)
        homeText.setOnClickListener{
            val intent = Intent(this, HomePage::class.java)
            startActivity(intent)
            finish()
        }

        val homeImage = findViewById<android.widget.ImageView>(R.id.homeImage)
        homeImage.setOnClickListener {
            val intent = Intent(this, HomePage::class.java)
            startActivity(intent)
            finish()
        }


    }
}