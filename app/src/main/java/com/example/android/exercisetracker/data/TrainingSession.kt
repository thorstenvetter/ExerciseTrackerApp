package com.example.android.exercisetracker.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "trainingSession_table")
data class TrainingSession(
        @PrimaryKey(autoGenerate = true)
        val id: Int,
//        val exercise: Exercise,
        val dateString: String,
        val successScore: String,
        val failScore: String,
        val totalScore: String,
        val resultScore: String,
        val sessionTime: String
)
