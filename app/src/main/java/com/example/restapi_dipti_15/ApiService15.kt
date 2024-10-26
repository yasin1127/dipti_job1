package com.example.restapi_dipti_15

import com.example.job01.Product

import retrofit2.http.GET

interface ApiService15 {

    @GET("products")
    suspend fun getProducts():List<Product>

}