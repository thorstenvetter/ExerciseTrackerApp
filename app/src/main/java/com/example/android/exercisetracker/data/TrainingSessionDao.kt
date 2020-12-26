package com.example.android.exercisetracker.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface TrainingSessionDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addSession(trainingSession: TrainingSession)

    @Query("SELECT * FROM trainingSession_table ORDER BY id DESC")
    fun readAllData(): LiveData<List<TrainingSession>>

    @Query("DELETE FROM trainingSession_table")
    suspend fun clear()
}