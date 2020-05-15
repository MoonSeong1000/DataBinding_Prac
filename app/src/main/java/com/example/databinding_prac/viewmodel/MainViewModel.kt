package com.example.databinding_prac.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel() : ViewModel() {
    var clickConverter = MutableLiveData<Unit>()

    //클릭 이벤트를 받아온다.
    fun onClickHandler() {
        clickConverter.value = Unit
    }
}