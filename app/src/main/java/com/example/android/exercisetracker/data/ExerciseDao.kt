package com.example.android.exercisetracker.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface ExerciseDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addExercise(exercise: Exercise)

    @Query("SELECT * FROM exercise_table ORDER BY id DESC")
    fun readAllData(): LiveData<List<Exercise>>

    @Query("SELECT * FROM exercise_table WHERE exerciseTime != ' ' ORDER BY id DESC")
    fun readTimedData(): LiveData<List<Exercise>>

    @Query("SELECT * FROM exercise_table WHERE exerciseTime = ' ' ORDER BY id DESC")
    fun readMultiballData(): LiveData<List<Exercise>>

    @Query("DELETE FROM exercise_table")
    suspend fun clear()
}