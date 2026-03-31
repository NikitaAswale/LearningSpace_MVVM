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
}