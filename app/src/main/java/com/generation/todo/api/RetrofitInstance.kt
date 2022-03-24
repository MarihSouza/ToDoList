package com.generation.todo.api

import android.provider.SyncStateContract
import com.generation.todo.util.Cosntants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitInstance {
    private val retrofit by lazy{
       Retrofit.Builder()
           .baseUrl(Cosntants.BASE_URL)
           .addConverterFactory(GsonConverterFactory.create())
           .build()

    }

        val api: apiService by lazy{
            retrofit.create(apiService::class.java)
        }
}