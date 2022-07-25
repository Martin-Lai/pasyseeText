package com.example.playseetest

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

interface ApiService {

    companion object {
        private val retrofit = Retrofit.Builder().baseUrl("https://srv0api-dev-v2-dot-framy-stage.uc.r.appspot.com")
            .addConverterFactory(GsonConverterFactory.create()).build()
        val apiService = retrofit.create(ApiService::class.java)
    }

    @Headers("authorization: 0123456789#0#examId")
    @GET("/test1.0/backstage/exm1")
    fun getData(): Call<AllData>
}