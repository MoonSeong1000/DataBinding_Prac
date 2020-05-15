package com.example.databinding_prac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.databinding_prac.databinding.ActivityMainBinding
import com.example.databinding_prac.factory.MainViewModelFactory
import com.example.databinding_prac.model.User
import com.example.databinding_prac.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding: ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        subscribeUi(binding)
    }

    private fun subscribeUi(binding: ActivityMainBinding) {
        var factory = MainViewModelFactory()
        var viewModel: MainViewModel = ViewModelProvider(this,factory).get(MainViewModel::class.java)
        viewModel.clickConverter.observe(this, Observer {
            Toast.makeText(this, "${binding.user?.name}, ${binding.user?.address}", Toast.LENGTH_SHORT).show()
        })

        binding.user= User("천문성","안산시", R.drawable.ic_launcher_background)
        binding.viewModel = viewModel
        binding.setLifecycleOwner(this)
    }
}
