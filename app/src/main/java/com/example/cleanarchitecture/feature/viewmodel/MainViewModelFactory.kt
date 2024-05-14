package com.example.cleanarchitecture.feature.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.cleanarchitecture.feature.domain.TransaccionUseCase

class MainViewModelFactory(val transaccionUseCase: TransaccionUseCase): ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(transaccionUseCase) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}