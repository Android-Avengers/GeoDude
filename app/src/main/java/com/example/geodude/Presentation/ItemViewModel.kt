package com.example.geodude.Presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.geodude.Domain.ItemInteractor
import com.example.geodude.Domain.ItemInteractorImpl
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers

class ItemViewModel : ViewModel() {

    val interactor: ItemInteractor by lazy { ItemInteractorImpl() }
    val items = MutableLiveData<String>()

    fun loadItems() {
        interactor.getData()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                items.value = it.toString()
            }, {
                print(it.message)
            })


    }
}