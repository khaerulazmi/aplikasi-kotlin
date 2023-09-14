package com.example.mobileapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.mobileapps.databinding.ActivitySplashScreenBinding

@Suppress("DEPRECATION")
class SplashScreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Handler().postDelayed({
            // Setelah 3 detik, buat Intent untuk beralih ke aktivitas berikutnya
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Selesaikan aktivitas splash screen agar tidak dapat kembali
        }, 3000)

    }
}