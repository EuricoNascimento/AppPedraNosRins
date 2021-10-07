package com.example.apppedranosrins20.view

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.apppedranosrins20.model.User
import com.example.apppedranosrins20.repository.Repository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainViewModel(private val repository: Repository): ViewModel(){

    val profileLiveData = MutableLiveData<User>()

    fun getData() {
        CoroutineScope(Dispatchers.Main).launch {
            val perfil = withContext(Dispatchers.Default){
                repository.getData()
            }

            profileLiveData.value = perfil
        }
    }

    class MainViewModelFactory(private val repository: Repository): ViewModelProvider.Factory{
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return MainViewModel(repository) as T
        }
    }
}