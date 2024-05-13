package com.example.cleanarchitecture.feature.data.model

data class Transaccion(
    val id: String = "",
    val monto: Double = 0.0,
    val idSender: String = "",
    val idReceiver: String = "",
)