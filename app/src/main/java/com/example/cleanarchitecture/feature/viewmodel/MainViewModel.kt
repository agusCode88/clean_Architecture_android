package com.example.cleanarchitecture.feature.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.cleanarchitecture.feature.data.model.Transaccion
import com.example.cleanarchitecture.feature.domain.TransaccionUseCase

class MainViewModel: ViewModel() {

     private val listData = MutableLiveData<List<Transaccion>>()
     val transactionsUseCase = TransaccionUseCase()

    init {
        getListTransactions("id1")
    }

    fun setListData(listaTransacciones: List<Transaccion>){
        listData.value = listaTransacciones
    }

    // Podemos usar corrutinas para hacer las peticiones
    fun getListTransactions(idUser: String){
        setListData(transactionsUseCase.getAllTransacctionsUser(idUser))
    }

    fun getLiveDataObserver(): LiveData<List<Transaccion>> {
        return listData
    }

}