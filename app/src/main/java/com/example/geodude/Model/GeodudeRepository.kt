package com.example.geodude.Model

import com.example.geodude.Service.Api
import io.reactivex.rxjava3.core.Observable

class GeodudeRepository {

    private val api = Api()

    fun getItems(): Observable<Item> {
        return api.getItemService().getItems()
    }

}