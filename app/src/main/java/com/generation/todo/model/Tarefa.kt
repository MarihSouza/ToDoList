package com.generation.todo.model

data class Tarefa (
    val id: Long,
    val nome: String,
    var descricao: String,
    var responsavel: String,
    var data: String,
    var status: Boolean,
    var categoria: Categoria
        ){
}