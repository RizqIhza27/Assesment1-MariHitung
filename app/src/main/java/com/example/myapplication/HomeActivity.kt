package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

      val segitiga = findViewById<Button>(R.id.segitiga)
        segitiga.setOnClickListener{
            val goSegitiga = Intent(this, SegitigaActivity::class.java)
            startActivity(goSegitiga)
        }

        val persegipjg = findViewById<Button>(R.id.persegipjg)
        persegipjg.setOnClickListener{
            val gopersegipjg = Intent(this, PersegiPanjangActivity::class.java)
            startActivity(gopersegipjg)
        }
    }
}