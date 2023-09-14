package com.example.mobileapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.mobileapps.databinding.ActivityMainBinding

//import kotlinx.android.synthetic.main.activity_main.btn_daftar



class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Thread.sleep(3000)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonMasuk.setOnClickListener{
            startActivity(Intent(this, HomeActivity::class.java))
        }
        binding.btnDaftar.setOnClickListener{
            startActivity(Intent(this,DaftarAktivity::class.java))
        }
    }

//    private fun intentButtonDaftar(){
//        btn_daftar.setOnClickListener{
//            startActivity(Intent(this, DaftarAktivity::class.java))
//        }
//    }
}