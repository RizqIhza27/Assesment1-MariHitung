package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SegitigaActivity : AppCompatActivity(), View.OnClickListener {
   private lateinit var et_panjang : EditText

   private lateinit var et_tinggi: EditText
   private lateinit var hasil_luas : TextView

   private lateinit var btn_hitung : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segitiga)


        et_panjang = findViewById(R.id.et_panjang)
        et_tinggi = findViewById(R.id.et_tinggi)
        hasil_luas = findViewById(R.id.hasil_luas)

        btn_hitung = findViewById(R.id.btn_hitung)

        btn_hitung.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        if(v?.id == R.id.btn_hitung){
            val inputLength = et_panjang.text.toString().trim()

            val inputHeight = et_tinggi.text.toString().trim()

            var isEmptyFields = false

            when{
                inputHeight.isEmpty() -> {
                    isEmptyFields = true
                    et_panjang.error = "Fields ini tidak boleh kosong"
                }
                inputLength.isEmpty() -> {
                    isEmptyFields = true
                    et_tinggi.error = "Fields ini tidak boleh kosong"
                }

            }

            if(!isEmptyFields){

                val volume = (inputLength.toDouble() * inputHeight.toDouble())/2
                hasil_luas.text = volume.toString()
            }


        }
    }
}