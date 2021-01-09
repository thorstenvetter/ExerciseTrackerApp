package com.example.android.exercisetracker.screens.exerciseAdd

import android.app.Application
import android.text.Editable
import android.text.TextWatcher
import androidx.lifecycle.*
import com.example.android.exercisetracker.data.Repository
import com.example.android.exercisetracker.data.exercises.Exercise
import com.example.android.exercisetracker.data.exercises.ExerciseDao
import com.example.android.exercisetracker.data.exercises.ExerciseDatabase
import com.example.android.exercisetracker.data.trainingsessions.TrainingSession
import com.example.android.exercisetracker.data.trainingsessions.TrainingSessionDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ExerciseAddViewModel(application: Application) : AndroidViewModel(application) {

    private val readExercise: LiveData<List<Exercise>>
    private val repository: Repository

    private val _exerciseNameString = MutableLiveData<String>()

    private var _navigateToExerciseList = MutableLiveData<Boolean>()
    val navigateToExerciseList: LiveData<Boolean>
        get() = _navigateToExerciseList

    init {
        val exerciseDao = ExerciseDatabase.getDatabase(application).exerciseDao()
        val trainingSessionDao = TrainingSessionDatabase.getDatabase(application).trainingSessionDao()
        repository = Repository(exerciseDao, trainingSessionDao)
        readExercise = repository.readAllExercises
        _navigateToExerciseList.value = false
        _exerciseNameString.value = ""
    }

    fun insertDataToDatabase(exerciseName: String){

        val exercise = Exercise(0, exerciseName)
        addExercise(exercise)
        navigateToExerciseList()
    }

    private fun addExercise(exercise: Exercise) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.addExercise(exercise)
        }
    }

    fun navigateToExerciseList(){
        _navigateToExerciseList.value = true
    }

    fun doneNavigating(){
        _navigateToExerciseList.value = false
    }
}