package com.example.android.exercisetracker.screens.sessionList

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class SessionListViewModelFactory (
    private val exerciseName: String,
    private val application: Application
) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SessionListViewModel::class.java)) {
            return SessionListViewModel(exerciseName, application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
