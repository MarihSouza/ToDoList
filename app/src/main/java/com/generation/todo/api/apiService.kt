package com.generation.todo.api

import com.generation.todo.model.Categoria
import retrofit2.Response

import retrofit2.http.GET

interface apiService {

    @GET("categoria")
    suspend fun listCategoria(): Response<List<Categoria>>
}