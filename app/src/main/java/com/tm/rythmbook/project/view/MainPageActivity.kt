package com.tm.rythmbook.project.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tm.rythmbook.R
import com.tm.rythmbook.databinding.ActivityMainPageBinding

class MainPageActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainPageBinding;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}