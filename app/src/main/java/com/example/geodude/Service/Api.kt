package com.example.geodude.Service

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Api {

    private var mItemService : ItemService = TODO();

    @Synchronized
    fun initialize() {

        val gson : Gson = GsonBuilder().create()
        val httpClient = OkHttpClient.Builder()
        val logging = HttpLoggingInterceptor()
        httpClient.interceptors().add(logging)
        val geodudeAdapterBuilder = Retrofit.Builder()
            .client(httpClient.build())
            .addConverterFactory(GsonConverterFactory.create(gson))
//            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .baseUrl("https://www.google.com")
        val adapter = geodudeAdapterBuilder.build()

        mItemService = adapter.create(ItemService::class.java)
    }

    fun getItemService() : ItemService { return mItemService;}

}