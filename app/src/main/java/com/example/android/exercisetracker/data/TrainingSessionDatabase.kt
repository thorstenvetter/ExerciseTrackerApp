package com.example.android.exercisetracker.data


import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [TrainingSession::class], version = 1, exportSchema = false)
abstract class TrainingSessionDatabase : RoomDatabase() {

    abstract fun trainingSessionDao(): TrainingSessionDao

    companion object {
        @Volatile
        private var INSTANCE: TrainingSessionDatabase? = null

        fun getDatabase(context: Context): TrainingSessionDatabase {
            val tempInstance =
                    INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                        context.applicationContext,
                        TrainingSessionDatabase::class.java,
                        "trainingSession_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}