package com.tm.rythmbook.project.view.about.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.tm.rythmbook.databinding.FragmentAboutTitlePageBinding

class AboutPageTitleFragment : Fragment() {
    private lateinit var binding: FragmentAboutTitlePageBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAboutTitlePageBinding.inflate(layoutInflater,container,false)
        return binding.root
    }
}