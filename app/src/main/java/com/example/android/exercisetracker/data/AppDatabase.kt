package com.example.android.exercisetracker.data


import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.android.exercisetracker.data.exercises.Exercise
import com.example.android.exercisetracker.data.exercises.ExerciseDao
import com.example.android.exercisetracker.data.trainingsessions.TrainingSession
import com.example.android.exercisetracker.data.trainingsessions.TrainingSessionDao

@Database(entities = [Exercise::class, TrainingSession::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun exerciseDao(): ExerciseDao
    abstract fun trainingSessionDao(): TrainingSessionDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            val tempInstance =
                    INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                        context.applicationContext,
                        AppDatabase::class.java,
                        "app_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}