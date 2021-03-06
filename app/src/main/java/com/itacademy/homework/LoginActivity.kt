package com.itacademy.homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.itacademy.homework.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Summit.setOnClickListener {

            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}