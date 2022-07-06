package com.example.retrofitapp

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("v2/top-headlines?country=id&apiKey=INSERT_API_KEY_HERE")
    fun getData(): Call<MyData>
}
