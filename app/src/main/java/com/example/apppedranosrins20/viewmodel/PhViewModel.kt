package com.example.apppedranosrins20.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.apppedranosrins20.model.phdaurina.PhDaUrina
import com.example.apppedranosrins20.repository.PhRepository
import kotlinx.coroutines.*

class PhViewModel (private val phrepository: PhRepository): ViewModel() {

    val phLiveData = MutableLiveData<PhDaUrina>()

    fun getMedPh() {
        CoroutineScope(Dispatchers.Main).launch{
            val phDaUrina = withContext(Dispatchers.Default){
                phrepository.getMedPh()
            }

            phLiveData.value = phDaUrina
        }
    }

    class PhViewModelFactory(private val phrepository: PhRepository): ViewModelProvider.Factory{
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return PhViewModel(phrepository) as T
        }
    }
}