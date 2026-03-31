package com.example.learningspace_mvvm

import retrofit2.http.GET

interface APIService {

    @GET("users")
    suspend fun getUsers(): List<Users>
}