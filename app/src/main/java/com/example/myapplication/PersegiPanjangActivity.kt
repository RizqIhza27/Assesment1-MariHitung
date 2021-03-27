package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class PersegiPanjangActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var et_panjang : EditText

    private lateinit var et_lebar: EditText
    private lateinit var hasil_luas : TextView

    private lateinit var btn_hitung : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_persegi_panjang)
        et_panjang = findViewById(R.id.et_panjang)
        et_lebar = findViewById(R.id.et_lebar)
        hasil_luas = findViewById(R.id.hasil_luas)

        btn_hitung = findViewById(R.id.btn_hitung)

        btn_hitung.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        if(v?.id == R.id.btn_hitung){
            val inputLength = et_panjang.text.toString().trim()

            val inputWidth = et_lebar.text.toString().trim()

            var isEmptyFields = false

            when{
                inputWidth.isEmpty() -> {
                    isEmptyFields = true
                    et_lebar.error = "Fields ini tidak boleh kosong"
                }
                inputLength.isEmpty() -> {
                    isEmptyFields = true
                    et_panjang.error = "Fields ini tidak boleh kosong"
                }

            }

            if(!isEmptyFields){

                val volume = inputLength.toDouble() * inputWidth.toDouble()
                hasil_luas.text = volume.toString()
            }


        }
    }
}