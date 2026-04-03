package com.example.learningspace_mvvm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class UsersViewModel : ViewModel() {

    private val repository = Repository()
    private val repository1 = Repository()

    private val _users = MutableStateFlow<List<Users>>(emptyList())
    private val _users1 = MutableStateFlow<List<Users1>>(emptyList())
    val users: StateFlow<List<Users>> = _users
    val users1: StateFlow<List<Users1>> = _users1

    init {
        fetchUsers()
        fetchUsers1()
    }

    fun fetchUsers() {
        viewModelScope.launch {
            _users.value = repository.getUsers()
        }
    }

    fun fetchUsers1() {
        viewModelScope.launch {
            _users1.value = repository1.getUsers1()
        }
    }

}