package com.example.viewbindingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.viewbindingexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        changeTheDefaultWelcomeMessage()
    }

    private fun changeTheDefaultWelcomeMessage() {
        Handler().postDelayed({
            binding.welcomeMessage.text = getString(R.string.activity_binding_message)
        }, 2500)
    }
}