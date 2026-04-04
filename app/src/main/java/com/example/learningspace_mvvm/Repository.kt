package com.example.learningspace_mvvm

class Repository() {

    private val apiService = RetrofitInstance.api

    suspend fun getUsers(): List<Users>{
        return try {
            apiService.getUsers()
        } catch (e: Exception) {
            emptyList()
        }
    }

    suspend fun getUsers1(): Users1?{
        return try {
            apiService.getUsers1()
        } catch (e: Exception) {
            null
        }
    }

}
