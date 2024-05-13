package com.example.cleanarchitecture.feature.data.local

import com.example.cleanarchitecture.feature.data.model.Transaccion

class TransaccionDataSet {

    fun createTransacctionsForUser(): List<Transaccion>{
        return listOf(
            Transaccion("id1",2000.0,"id1","id2"),
            Transaccion("id2",3000.0,"id1","id3"),
            Transaccion("id3",4000.0,"id1","id4"),
            Transaccion("id4",5000.0,"id2","id1"),
            Transaccion("id5",6000.0,"id3","id1"),
            Transaccion("id6",7000.0,"id4","id1"),
        )
    }
}