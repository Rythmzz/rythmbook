package com.tm.rythmbook.project.view.about.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.tm.rythmbook.databinding.FragmentAboutRolePageBinding

class AboutPageRoleFragment : Fragment() {

    private lateinit var binding: FragmentAboutRolePageBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAboutRolePageBinding.inflate(layoutInflater,container,false);
        return binding.root
    }
}