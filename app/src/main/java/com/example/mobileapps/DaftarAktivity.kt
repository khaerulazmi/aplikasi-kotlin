package com.example.mobileapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_daftar_aktivity.btn_masuk

class DaftarAktivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar_aktivity)
        supportActionBar?.hide()

        intentButtonMasuk()
    }
    private fun intentButtonMasuk(){
        btn_masuk.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}