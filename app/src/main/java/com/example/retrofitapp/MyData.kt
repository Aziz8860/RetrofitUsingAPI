package com.example.retrofitapp

data class MyData(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)