package com.example.android.exercisetracker.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "exercise_table")
data class Exercise(
        @PrimaryKey(autoGenerate = true)
        val id: Int,
        val dateString: String,
        val successScore: String,
        val failScore: String,
        val totalScore: String,
        val resultScore: String,
        val exerciseTime: String
)
