package com.example.databinding_prac.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

//데이터를 처리하고 리스너로 받을 viewModel
class MainViewModel() : ViewModel() {
    var clickConverter = MutableLiveData<Unit>()

    fun onClickHandler() {
        clickConverter.value = Unit
    }
}