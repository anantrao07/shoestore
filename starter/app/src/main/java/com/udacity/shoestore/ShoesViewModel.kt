package com.udacity.shoestore

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe
import java.util.*

class ShoesViewModel: ViewModel() {

    private val _shoesListLiveData: MutableLiveData<List<Shoe>> = MutableLiveData()
    val shoeListLiveData: LiveData<List<Shoe>> = _shoesListLiveData

    fun populateShoeList() {
        _shoesListLiveData.postValue(listOf(Shoe("Jordan",
                10.0,
                "Jordan",
                "smaller sizes",
                ArrayList<String>()
        )))
    }
}