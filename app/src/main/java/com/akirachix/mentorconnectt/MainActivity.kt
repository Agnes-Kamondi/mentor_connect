package com.akirachix.mentorconnectt

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val connect = findViewById<TextView>(R.id.textView3)
        connect.setOnClickListener{
            val intent = Intent(this,log_in::class.java)
            startActivity(intent)
        }
    }
}