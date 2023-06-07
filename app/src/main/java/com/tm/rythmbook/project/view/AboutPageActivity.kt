package com.tm.rythmbook.project.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tm.rythmbook.databinding.ActivityAboutPageBinding

class AboutPageActivity :AppCompatActivity() {
    lateinit var binding: ActivityAboutPageBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutPageBinding.inflate(layoutInflater)
        setContentView(binding.root);

    }
}