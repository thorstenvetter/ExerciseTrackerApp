package com.example.android.exercisetracker.data

import androidx.lifecycle.LiveData
import com.example.android.exercisetracker.data.exercises.Exercise
import com.example.android.exercisetracker.data.exercises.ExerciseDao
import com.example.android.exercisetracker.data.trainingsessions.TrainingSession
import com.example.android.exercisetracker.data.trainingsessions.TrainingSessionDao

class Repository(private val exerciseDao: ExerciseDao,
                 private val trainingSessionDao: TrainingSessionDao) {

    val readAllExercises: LiveData<List<Exercise>> = exerciseDao.readAllExercises()
    val readAllData: LiveData<List<TrainingSession>> = trainingSessionDao.readExerciseSessions()

    suspend fun addExercise(exercise: Exercise){
        exerciseDao.addExercise(exercise)
    }

//    suspend fun readExercise(exerciseName: String){
//        exerciseDao.readExercise(exerciseName)
//    }

    suspend fun clearAllExercises(){
        exerciseDao.clear()
    }

    suspend fun addTrainingSession(trainingSession: TrainingSession) {
        trainingSessionDao.addSession(trainingSession)
    }

    suspend fun clearAllSessions() {
        trainingSessionDao.clear()
    }
}