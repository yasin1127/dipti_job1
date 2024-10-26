package com.example.restapi_dipti_15

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiInstance15 {

    val retrofit = Retrofit.Builder()
        .baseUrl("https://api.escuelajs.co/api/v1/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()


    val apiService = retrofit.create(ApiService15::class.java)

}