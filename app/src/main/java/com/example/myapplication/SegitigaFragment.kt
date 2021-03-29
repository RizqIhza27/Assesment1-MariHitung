package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment

class SegitigaFragment : Fragment(), View.OnClickListener {
    private lateinit var et_panjang : EditText

    private lateinit var et_tinggi: EditText
    private lateinit var hasil_luas : TextView

    private lateinit var btn_hitung : Button
    lateinit var navController: NavController
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_segitiga, container, false)

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
       et_panjang= view.findViewById<EditText>(R.id.et_panjang)
       et_tinggi= view.findViewById<EditText>(R.id.et_tinggi)
        hasil_luas = view.findViewById<TextView>(R.id.hasil_luas)

        view.findViewById<Button>(R.id.btn_hitung).setOnClickListener(this)

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