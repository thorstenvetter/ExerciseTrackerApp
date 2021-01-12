package com.example.android.exercisetracker.screens.sessionList

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.android.exercisetracker.data.trainingsessions.TrainingSession
import com.example.android.exercisetracker.data.AppDatabase
import com.example.android.exercisetracker.data.Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class SessionListViewModel(private var exerciseName: String, application: Application) : AndroidViewModel(application) {

    private val _navigateToAdd = MutableLiveData<Boolean>()
    val navigateToAdd: LiveData<Boolean>
        get() = _navigateToAdd

    private val repository: Repository

    var readAllData: LiveData<List<TrainingSession>>

    init {
        val exerciseDao = AppDatabase.getDatabase(application).exerciseDao()
        val trainingSessionDao = AppDatabase.getDatabase(application).trainingSessionDao()
        repository = Repository(exerciseDao, trainingSessionDao)
//        readAllData = repository.readAllData
        readAllData = repository.getSessionsForExercise(exerciseName)
        _navigateToAdd.value = false
    }

//    var readSessions = repository.getSessionsForExercise(exerciseName)

    fun navigateToAdd() {
        _navigateToAdd.value = true
    }

    fun doneNavigating() {
        _navigateToAdd.value = false
    }

    fun clearAllSessions() {
        viewModelScope.launch(Dispatchers.IO) {
            repository.clearAllSessions()
        }
    }
}
