package com.example.retrofitapp

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("v2/top-headlines?country=id&apiKey=6e58adcb9c034a9a85d6df7902b1f1d3")
    fun getData(): Call<MyData>
}