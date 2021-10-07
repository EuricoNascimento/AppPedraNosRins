package com.example.apppedranosrins20.repository

import com.example.apppedranosrins20.model.phdaurina.PhDaUrina
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext
import kotlin.random.Random

class PhRepository {
    suspend fun getMedPh(): PhDaUrina {
        return withContext(Dispatchers.Default) {
            delay(3000)
            PhDaUrina (
                Random.nextDouble(4.5, 8.5)
            )
        }
    }

}