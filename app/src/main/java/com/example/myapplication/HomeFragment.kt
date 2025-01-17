package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment

class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ):View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home,container, false)

        view.findViewById<Button>(R.id.segitiga).setOnClickListener{
            NavHostFragment.findNavController(this@HomeFragment)
                    .navigate(R.id.action_HomeFragment_to_SegitigaFragment)

        }
        view.findViewById<Button>(R.id.persegipjg).setOnClickListener{
            NavHostFragment.findNavController(this@HomeFragment)
                    .navigate(R.id.action_HomeFragment_to_PersegiPanjangFragment)

        }
        return view
    }

}