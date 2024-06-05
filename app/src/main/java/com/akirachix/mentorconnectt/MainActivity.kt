package com.akirachix.mentorconnectt

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val connect = findViewById<TextView>(R.id.tvLogin)
        connect.setOnClickListener{
            val intent = Intent(this,MainActivityLogin::class.java)
            startActivity(intent)
        }
    }
}