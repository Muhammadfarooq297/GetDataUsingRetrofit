package com.example.getdatausingretrofit

import retrofit2.http.GET

interface myInterface {

    @GET("/quotes")
    suspend fun getQuotes():retrofit2.Response<QuoteList>

}