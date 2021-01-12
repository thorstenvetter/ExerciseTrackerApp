package com.example.android.exercisetracker.screens.sessionAdd

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.android.exercisetracker.screens.sessionList.SessionListViewModel

class SessionAddViewModelFactory (
    private val exerciseName: String,
    private val application: Application
) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SessionAddViewModel::class.java)) {
            return SessionAddViewModel(exerciseName, application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}