package com.example.mobileapps


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mobileapps.databinding.ActivityMainBinding

//import kotlinx.android.synthetic.main.activity_main.btn_daftar



class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        }
    }
