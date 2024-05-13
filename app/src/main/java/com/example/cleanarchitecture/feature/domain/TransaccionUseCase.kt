package com.example.cleanarchitecture.feature.domain

import com.example.cleanarchitecture.feature.data.local.TransaccionDataSet
import com.example.cleanarchitecture.feature.data.model.Transaccion

class TransaccionUseCase {

    val transactionDataSet = TransaccionDataSet()
     fun getAllTransacctionsUser(userId: String): List<Transaccion>{
       return transactionDataSet.createTransacctionsForUser()
    }
}