package com.example.learningspace_mvvm

import retrofit2.http.GET

interface APIService {

    @GET("users")
    suspend fun getUsers(): List<Users>

    @GET("users/1")
    suspend fun getUsers1(): Users1
}