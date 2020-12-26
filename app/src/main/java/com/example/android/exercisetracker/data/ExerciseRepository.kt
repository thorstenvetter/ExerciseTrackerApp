package com.example.android.exercisetracker.data

import androidx.lifecycle.LiveData

class ExerciseRepository(private val exerciseDao: ExerciseDao) {

    val readAllData: LiveData<List<Exercise>> = exerciseDao.readAllData()
//    val readTimedData: LiveData<List<Exercise>> = exerciseDao.readTimedData()
//    val readMultiballData: LiveData<List<Exercise>> = exerciseDao.readMultiballData()

    suspend fun addExercise(exercise: Exercise) {
        exerciseDao.addExercise(exercise)
    }

    suspend fun clearAll() {
        exerciseDao.clear()
    }
}