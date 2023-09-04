package com.example.mobileapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.btn_daftar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        intentButtonDaftar()

    }

    private fun intentButtonDaftar(){
        btn_daftar.setOnClickListener{
            startActivity(Intent(this, DaftarAktivity::class.java))
        }
    }
}