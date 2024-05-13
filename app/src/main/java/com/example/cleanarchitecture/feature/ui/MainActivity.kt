package com.example.cleanarchitecture.feature.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.cleanarchitecture.databinding.ActivityMainBinding
import com.example.cleanarchitecture.feature.data.model.Transaccion
import com.example.cleanarchitecture.feature.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val button = binding.button
        setupViewModel()
        button.setOnClickListener {
             viewModel.getListTransactions("id1")
        }

    }

    private fun setupViewModel(){

        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        val transactionsObserver = Observer<List<Transaccion>> {
            Log.e("Transacciones",it.toString())
        }

        viewModel.getLiveDataObserver().observe(this,transactionsObserver)
    }
}