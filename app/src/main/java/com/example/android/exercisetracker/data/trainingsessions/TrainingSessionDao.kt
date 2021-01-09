package com.example.android.exercisetracker.data.trainingsessions

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.android.exercisetracker.data.exercises.Exercise

@Dao
interface TrainingSessionDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addSession(trainingSession: TrainingSession)

    @Query("SELECT * FROM trainingSession_table ORDER BY id DESC")
    fun readAllData(): LiveData<List<TrainingSession>>

//    @Query("Select * FROM trainingSession_table WHERE exerciseName = :exerciseName")
//    fun readExerciseSessions(exerciseName: String)

    @Query("DELETE FROM trainingSession_table")
    suspend fun clear()
}