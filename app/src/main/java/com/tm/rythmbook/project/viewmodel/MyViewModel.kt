package com.tm.rythmbook.project.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tm.rythmbook.project.repo.MyRepository

class MyViewModel(val repository: MyRepository) : ViewModel() {
    var myName:MutableLiveData<String> = MutableLiveData<String>()

    fun fetchName(name:String) : Unit{
        myName.value = name
    }
}