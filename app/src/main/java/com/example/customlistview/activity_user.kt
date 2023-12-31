package com.example.customlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.customlistview.databinding.ActivityMainBinding
import com.example.customlistview.databinding.ActivityUserBinding

class activity_user : AppCompatActivity() {

    private lateinit var binding : ActivityUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        val phone = intent.getStringExtra("phone")
        val country = intent.getStringExtra("country")
        val imageId = intent.getIntExtra("imageId",R.drawable.download1)

        binding.nameProfile.text = name
        binding.PhoneProfile.text = phone
        binding.CountryProfile.text = country
        binding.profImage.setImageResource(imageId)
    }
}

