package com.example.android.exercisetracker.data.exercises

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "exercises_table")
data class Exercise(
        @PrimaryKey(autoGenerate = true)
        val id: Int,
        val name: String
)
