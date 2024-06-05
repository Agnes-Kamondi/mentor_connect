package com.akirachix.mentorconnectt

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.akirachix.mentorconnectt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvLogin.setOnClickListener {
            val intent = Intent(this, MainActivityLogin::class.java)
            startActivity(intent)
//            finish()

//        val connect = findViewById<TextView>(R.id.tvLogin)
//        connect.setOnClickListener{
//            val intent = Intent(this,MainActivityLogin::class.java)
//            startActivity(intent)
//        }
        }
        binding.btnRegister.setOnClickListener {
            validateRegistration()
        }
    }

    private fun validateRegistration() {
        clearErrors()
        var formError = false

        val firstName = binding.etFirsttName.text.toString()
        if (firstName.isBlank()) {
            formError = true
            binding.tilFirstName.error = getString(R.string.first_name_is_required)
        }
        val lastName = binding.etLastName.text.toString()
        if (lastName.isEmpty()) {
            formError = true
            binding.tilLastName.error = getString(R.string.last_name_is_required)
        }
        val email = binding.etEmail.text.toString()
        if (email.isEmpty()) {
            formError = true
            binding.tilEmail.error = getString(R.string.email_is_required)
        }
        val codeHive = binding.etCodehiveID.text.toString()
        if (codeHive.isEmpty()) {
            formError = true
            binding.tilCodehiveID.error = getString(R.string.codehive_id_is_required)
        }
        val username = binding.etUserName.text.toString()
        if (username.isEmpty()) {
            formError = true
            binding.tilUserName.error = getString(R.string.username_is_required)
        }
        val password = binding.etPassword.text.toString()
        if (password.isEmpty()) {
            formError = true
            binding.tilPassword.error = getString(R.string.password_is_required)
        }
        val passwordConf = binding.etConfirmPassword.text.toString()
        if (passwordConf.isEmpty()) {
            formError = true
            binding.tilConfirmPassword.error = getString(R.string.confirmpassword_is_required)
        }
        if (password != passwordConf) {
            formError = true
            binding.tilConfirmPassword.error =
                getString(R.string.password_and_confirmation_do_not_match)
        }
        if(!formError){
            //proceed to registration
        }

    }
    private fun clearErrors(){
        binding.tilFirstName.error = null
        binding.tilLastName.error = null
        binding.tilEmail.error = null
        binding.tilCodehiveID.error = null
        binding.tilUserName.error = null
        binding.tilPassword.error = null
        binding.tilConfirmPassword.error = null
    }
}