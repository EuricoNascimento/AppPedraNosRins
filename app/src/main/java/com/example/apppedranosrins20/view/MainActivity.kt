package com.example.apppedranosrins20.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.apppedranosrins20.R
import com.example.apppedranosrins20.databinding.ActivityMainBinding
import com.example.apppedranosrins20.repository.Repository

class MainActivity : AppCompatActivity(){

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_AppPedraNosRins20)
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(
            this,
            MainViewModel.MainViewModelFactory(Repository())
        ).get(MainViewModel::class.java)

        viewModel.profileLiveData.observe(this, Observer{ profile ->
            binding.tvName.text = profile.name
            binding.tvGenero.text = profile.genero
            binding.tvPeso.text = profile.peso.toString()
            binding.tvAltura.text = profile.altura.toString()
            binding.tvObjetivo.text = profile.objetivoDiario.toString()
        })

        viewModel.getData()
    }
}