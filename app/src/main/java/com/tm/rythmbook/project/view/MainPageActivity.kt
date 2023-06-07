package com.tm.rythmbook.project.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.tm.rythmbook.R
import com.tm.rythmbook.databinding.ActivityMainPageBinding
import com.tm.rythmbook.project.viewmodel.MyViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainPageActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainPageBinding;

    private val viewModel: MyViewModel by viewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnAdd.setOnClickListener {
            viewModel.fetchName("Hai Tac")
            val intent:Intent = Intent(this, AboutPageActivity::class.java)
            startActivity(intent)
        }
        viewModel.myName.observe(this, Observer { newValue -> binding.tvHello.setText(newValue.toString()) })
    }
}