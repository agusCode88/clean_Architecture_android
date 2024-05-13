package com.example.cleanarchitecture.feature.ui

import android.os.Bundle
import android.util.Log
import android.view.SurfaceControl
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.cleanarchitecture.R
import com.example.cleanarchitecture.feature.data.model.Transaccion
import com.example.cleanarchitecture.feature.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        val transactionsObserver = Observer<List<Transaccion>> {
             Log.e("Transacciones",it.toString())
        }

        viewModel.getLiveDataObserver().observe(this,transactionsObserver)
    }
}