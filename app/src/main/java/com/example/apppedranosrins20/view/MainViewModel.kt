package com.example.apppedranosrins20.view

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.apppedranosrins20.model.User
import com.example.apppedranosrins20.repository.MainRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainViewModel(private val mainRepository: MainRepository): ViewModel(){

    val profileLiveData = MutableLiveData<User>()

    fun getData() {
        CoroutineScope(Dispatchers.Main).launch {
            val perfil = withContext(Dispatchers.Default){
                mainRepository.getData()
            }

            profileLiveData.value = perfil
        }
    }

    class MainViewModelFactory(private val mainRepository: MainRepository): ViewModelProvider.Factory{
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return MainViewModel(mainRepository) as T
        }
    }
}