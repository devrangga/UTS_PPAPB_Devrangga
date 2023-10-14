package com.example.utsppapbdev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.utsppapbdev.databinding.ActivityMainPaymentBinding

class MainActivityPayment : AppCompatActivity() {
    private lateinit var binding : ActivityMainPaymentBinding
    private lateinit var places : Array<String>
    private val type = arrayOf(
        "Royal Diamond",
        "Golden Gem",
        "Silver Bullet"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainPaymentBinding.inflate(layoutInflater)
        setContentView(binding.root)


        with(binding){
            val adapterType = ArrayAdapter(this@MainActivityPayment, com.google.android.material
                .R.layout.support_simple_spinner_dropdown_item,type)
            adapterType.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerType.adapter=adapterType


            places = resources.getStringArray(R.array.places)
            val adapterPlaces = ArrayAdapter(this@MainActivityPayment,com.google.android.material
                .R.layout.support_simple_spinner_dropdown_item,places)
            spinnerPlace.adapter = adapterPlaces

        }
    }
}