package com.example.android.exercisetracker.data.exercises

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.android.exercisetracker.data.trainingsessions.TrainingSession

@Dao
interface ExerciseDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addExercise(exercise: Exercise)

    @Query("SELECT * FROM exercises_table ORDER BY id DESC")
    fun readAllExercises(): LiveData<List<Exercise>>

    @Query("DELETE FROM exercises_table")
    suspend fun clear()
}