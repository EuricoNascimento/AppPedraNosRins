package com.example.apppedranosrins20.repository

import com.example.apppedranosrins20.model.EnumGenero
import com.example.apppedranosrins20.model.User
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext

class MainRepository {

    suspend fun getData(): User {
        return withContext(Dispatchers.Default){
            delay(3000)
            User(
                "Eurico Neto",
                EnumGenero.OUTROS.descricao,
                135,
                193,
                2000
            )
        }
    }

}