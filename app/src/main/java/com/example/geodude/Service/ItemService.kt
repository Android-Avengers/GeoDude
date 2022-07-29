package com.example.geodude.Service

import com.example.geodude.Model.Item
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET

interface ItemService {

    @GET("items/request")
    fun getItems(): Observable<Item>

}