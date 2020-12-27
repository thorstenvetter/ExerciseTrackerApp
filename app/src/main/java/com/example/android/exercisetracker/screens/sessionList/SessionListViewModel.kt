package com.example.android.exercisetracker.screens.sessionList

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.android.exercisetracker.data.TrainingSession
import com.example.android.exercisetracker.data.TrainingSessionDatabase
import com.example.android.exercisetracker.data.TrainingSessionRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class SessionListViewModel(application: Application) : AndroidViewModel(application) {

    private val _navigateToAdd = MutableLiveData<Boolean>()
    val navigateToAdd: LiveData<Boolean>
        get() = _navigateToAdd

    val readAllData: LiveData<List<TrainingSession>>

    private val repository: TrainingSessionRepository

    init {
        val trainingSessionDao = TrainingSessionDatabase.getDatabase(application).trainingSessionDao()
        repository = TrainingSessionRepository(trainingSessionDao)
        readAllData = repository.readAllData
        _navigateToAdd.value = false
    }

    fun navigateToAdd() {
        _navigateToAdd.value = true
    }

    fun doneNavigating() {
        _navigateToAdd.value = false
    }

    fun clearAllSessions() {
        viewModelScope.launch(Dispatchers.IO) {
            repository.clearAll()
        }
    }
}
