package com.example.android.exercisetracker.screens.sessionList

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.android.exercisetracker.data.trainingsessions.TrainingSession
import com.example.android.exercisetracker.data.trainingsessions.TrainingSessionDatabase
import com.example.android.exercisetracker.data.Repository
import com.example.android.exercisetracker.data.exercises.Exercise
import com.example.android.exercisetracker.data.exercises.ExerciseDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class SessionListViewModel(exercise: Exercise, application: Application) : AndroidViewModel(application) {

    private val _navigateToAdd = MutableLiveData<Boolean>()
    val navigateToAdd: LiveData<Boolean>
        get() = _navigateToAdd

    private val _selectedExercise = MutableLiveData<Exercise>()
    val selectedExercise: LiveData<Exercise>
        get() = _selectedExercise

    val readAllData: LiveData<List<TrainingSession>>

    private val repository: Repository

    init {
        val exerciseDao = ExerciseDatabase.getDatabase(application).exerciseDao()
        val trainingSessionDao = TrainingSessionDatabase.getDatabase(application).trainingSessionDao()
        repository = Repository(exerciseDao, trainingSessionDao)
        readAllData = repository.readAllData
        _navigateToAdd.value = false
        _selectedExercise.value = exercise
    }

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
