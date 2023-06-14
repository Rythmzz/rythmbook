package com.tm.rythmbook.project.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.tm.rythmbook.databinding.ActivityMainPageBinding
import com.tm.rythmbook.project.view.about.AboutPageActivity
import com.tm.rythmbook.project.view.about.fragment.AboutPageRoleFragment
import com.tm.rythmbook.project.view.about.fragment.AboutPageTitleFragment
import com.tm.rythmbook.project.viewmodel.MyViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainPageActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainPageBinding;
    private lateinit var fragments:ArrayList<Fragment>

    private val viewModel: MyViewModel by viewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setFragment()
        setAdapter()
    }

    private fun setAdapter() {
       val adapterViewPage = object :FragmentStateAdapter(this){
           override fun getItemCount(): Int = fragments.size
           override fun createFragment(position: Int): Fragment = fragments[position]
       }

    }

    private fun setFragment() {
        fragments = arrayListOf(
            AboutPageTitleFragment(),AboutPageRoleFragment()
        )

    }
}