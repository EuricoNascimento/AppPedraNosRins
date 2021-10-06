package com.example.apppedranosrins20.repository

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext
import kotlin.random.Random

class PhRepository {

    suspend fun getMedPh(): Double{
        return withContext(Dispatchers.Default) {
            delay(3000)
            Random.nextDouble(4.5, 8.5)
        }
    }
}