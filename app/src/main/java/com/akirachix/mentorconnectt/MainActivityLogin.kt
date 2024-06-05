package com.akirachix.mentorconnectt

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.akirachix.mentorconnectt.databinding.ActivityMainLoginBinding

class MainActivityLogin : AppCompatActivity() {

    lateinit var binding: ActivityMainLoginBinding

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_main_login)
//        val connect = findViewById<TextView>(R.id.tvSignup)
//        connect.setOnClickListener{
//            val intent = Intent(this,MainActivity::class.java)
//            startActivity(intent)
//        }
        binding = ActivityMainLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvSignup.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        binding.btnLogin.setOnClickListener {
            validateLogin()
        }


    }

    private fun validateLogin() {
        clearErrors()
        var formError = false

        val username = binding.etUsername.text.toString()
        if (username.isBlank()) {
            formError = true
            binding.tilUsername.error = getString(R.string.username_is_required)
        }
        val password = binding.etPassword.text.toString()
        if (password.isEmpty()) {
            formError = true
            binding.tilPassword.error = getString(R.string.password_is_required)
        }
        if(!formError){
            //proceed to registration
        }
    }
    private fun clearErrors() {
        binding.tilUsername.error = null
        binding.tilPassword.error = null
    }
}