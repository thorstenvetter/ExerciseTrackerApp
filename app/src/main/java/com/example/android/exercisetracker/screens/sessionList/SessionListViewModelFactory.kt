package com.example.android.exercisetracker.screens.sessionList

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.android.exercisetracker.data.exercises.Exercise

class SessionListViewModelFactory(
    private val exercise: Exercise,
    private val application: Application) : ViewModelProvider.Factory {
        @Suppress("unchecked_cast")
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(SessionListViewModel::class.java)) {
                return SessionListViewModel(exercise, application) as T
            }
            throw IllegalArgumentException("Unknown ViewModel class")
        }
}

