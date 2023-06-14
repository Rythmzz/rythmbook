package com.tm.rythmbook.project.view.about

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.tm.rythmbook.R
import com.tm.rythmbook.databinding.ActivityAboutPageBinding
import com.tm.rythmbook.project.view.about.fragment.AboutPageRoleFragment
import com.tm.rythmbook.project.view.about.fragment.AboutPageTitleFragment

class AboutPageActivity :AppCompatActivity() {
    lateinit var binding: ActivityAboutPageBinding
    private lateinit var fragments:ArrayList<Fragment>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutPageBinding.inflate(layoutInflater)
        setContentView(binding.root);
        setTitleUI()
        setFragment()
        setAdapter()
    }

    private fun setTitleUI() {
        supportActionBar?.hide()
        window.statusBarColor = ContextCompat.getColor(this, R.color.main_color)
    }

    private fun setAdapter() {
        val adapterViewPage = object : FragmentStateAdapter(this){
            override fun getItemCount(): Int = fragments.size
            override fun createFragment(position: Int): Fragment = fragments[position]
        }
        binding.vpFragment.adapter = adapterViewPage
        binding.dotsIndicator.setViewPager2(binding.vpFragment)
    }

    private fun setFragment() {
        fragments = arrayListOf(
            AboutPageTitleFragment(), AboutPageRoleFragment()
        )

    }
}