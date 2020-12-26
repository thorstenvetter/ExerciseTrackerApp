package com.example.android.exercisetracker.screens.list

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.android.exercisetracker.data.Exercise
import com.example.android.exercisetracker.data.ExerciseDatabase
import com.example.android.exercisetracker.data.ExerciseRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ListViewModel(application: Application) : AndroidViewModel(application) {

    private val _navigateToAdd = MutableLiveData<Boolean>()
    val navigateToAdd: LiveData<Boolean>
        get() = _navigateToAdd

    val readAllData: LiveData<List<Exercise>>
//    val readTimedData: LiveData<List<Exercise>>
//    val readMultiballData: LiveData<List<Exercise>>

    private val repository: ExerciseRepository

    init {
        val exerciseDao = ExerciseDatabase.getDatabase(application).exerciseDao()
        repository = ExerciseRepository(exerciseDao)
        readAllData = repository.readAllData
//        readTimedData = repository.readTimedData
//        readMultiballData = repository.readMultiballData
        _navigateToAdd.value = false
    }

//    fun showTimedData(){
//        readAllData = repository.readTimedData
//    }

//    fun showAllData(){
//        readAllData = repository.readAllData
//    }

//    fun showMultiballData(){
//        readAllData = repository.readMultiballData
//    }

    fun navigateToAdd() {
        _navigateToAdd.value = true
    }

    fun doneNavigating() {
        _navigateToAdd.value = false
    }

    fun clearAllExercises() {
        viewModelScope.launch(Dispatchers.IO) {
            repository.clearAll()
        }
    }
}
