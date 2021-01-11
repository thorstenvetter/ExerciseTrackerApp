package com.example.android.exercisetracker.data.trainingsessions

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.android.exercisetracker.data.exercises.Exercise

@Entity(tableName = "trainingSession_table")
data class TrainingSession(
        @PrimaryKey(autoGenerate = true)
        val id: Int,
        val dateString: String,
        val successScore: String,
        val failScore: String,
        val totalScore: String,
        val resultScore: String,
        val sessionTime: String
)
