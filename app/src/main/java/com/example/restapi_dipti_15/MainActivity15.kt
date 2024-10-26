package com.example.restapi_dipti_15



import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity15 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main15)

        Handler(Looper.getMainLooper()).postDelayed({

            startActivity(Intent(this@MainActivity15,ProductActivity15::class.java))
            finish()

        },3000)



    }
}