package com.example.geodude.Domain

import com.example.geodude.Model.GeodudeRepository
import com.example.geodude.Model.Item
import io.reactivex.rxjava3.core.Observable

interface ItemInteractor {

    fun getData(): Observable<Item>

}

class ItemInteractorImpl() : ItemInteractor {

    private val geodudeRepository: GeodudeRepository by lazy { GeodudeRepository() }

    override fun getData(): Observable<Item> {
        return geodudeRepository.getItems()

    }

}