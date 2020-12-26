package com.example.android.exercisetracker.data

import androidx.lifecycle.LiveData

class TrainingSessionRepository(private val trainingSessionDao: TrainingSessionDao) {

    val readAllData: LiveData<List<TrainingSession>> = trainingSessionDao.readAllData()

    suspend fun addTrainingSession(trainingSession: TrainingSession) {
        trainingSessionDao.addSession(trainingSession)
    }

    suspend fun clearAll() {
        trainingSessionDao.clear()
    }
}