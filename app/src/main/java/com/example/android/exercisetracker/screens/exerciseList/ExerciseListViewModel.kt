package com.example.android.exercisetracker.screens.exerciseList

import android.app.Application
import androidx.lifecycle.*
import com.example.android.exercisetracker.data.Repository
import com.example.android.exercisetracker.data.exercises.Exercise
import com.example.android.exercisetracker.data.exercises.ExerciseDatabase
import com.example.android.exercisetracker.data.trainingsessions.TrainingSessionDatabase

class ExerciseListViewModel(application: Application) : AndroidViewModel(application) {

    private var _navigateToExerciseAdd = MutableLiveData<Boolean>()
    val navigateToExerciseAdd: LiveData<Boolean>
        get() = _navigateToExerciseAdd

    val readAllExercises: LiveData<List<Exercise>>

    private val repository: Repository

    init {
        val exerciseDao = ExerciseDatabase.getDatabase(application).exerciseDao()
        val trainingSessionDao = TrainingSessionDatabase.getDatabase(application).trainingSessionDao()
        repository = Repository(exerciseDao, trainingSessionDao)
        readAllExercises = repository.readAllExercises
        _navigateToExerciseAdd.value = false
    }

    fun navigateToAddExercise(){
        _navigateToExerciseAdd.value = true
    }

    fun doneNavigating(){
        _navigateToExerciseAdd.value = false
    }
}