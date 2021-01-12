package com.example.android.exercisetracker.screens.exerciseAdd

import android.app.Application
import androidx.lifecycle.*
import com.example.android.exercisetracker.data.Repository
import com.example.android.exercisetracker.data.exercises.Exercise
import com.example.android.exercisetracker.data.AppDatabase
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
        val exerciseDao = AppDatabase.getDatabase(application).exerciseDao()
        val trainingSessionDao = AppDatabase.getDatabase(application).trainingSessionDao()
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