package com.example.android.exercisetracker.data;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.example.android.exercisetracker.data.exercises.ExerciseDao;
import com.example.android.exercisetracker.data.exercises.ExerciseDao_Impl;
import com.example.android.exercisetracker.data.trainingsessions.TrainingSessionDao;
import com.example.android.exercisetracker.data.trainingsessions.TrainingSessionDao_Impl;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile ExerciseDao _exerciseDao;

  private volatile TrainingSessionDao _trainingSessionDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `exercises_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `trainingSession_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `exerciseName` TEXT NOT NULL, `dateString` TEXT NOT NULL, `successScore` TEXT NOT NULL, `failScore` TEXT NOT NULL, `totalScore` TEXT NOT NULL, `resultScore` TEXT NOT NULL, `sessionTime` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '62b68b98031def4a609a088631b8c512')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `exercises_table`");
        _db.execSQL("DROP TABLE IF EXISTS `trainingSession_table`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsExercisesTable = new HashMap<String, TableInfo.Column>(2);
        _columnsExercisesTable.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExercisesTable.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysExercisesTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesExercisesTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoExercisesTable = new TableInfo("exercises_table", _columnsExercisesTable, _foreignKeysExercisesTable, _indicesExercisesTable);
        final TableInfo _existingExercisesTable = TableInfo.read(_db, "exercises_table");
        if (! _infoExercisesTable.equals(_existingExercisesTable)) {
          return new RoomOpenHelper.ValidationResult(false, "exercises_table(com.example.android.exercisetracker.data.exercises.Exercise).\n"
                  + " Expected:\n" + _infoExercisesTable + "\n"
                  + " Found:\n" + _existingExercisesTable);
        }
        final HashMap<String, TableInfo.Column> _columnsTrainingSessionTable = new HashMap<String, TableInfo.Column>(8);
        _columnsTrainingSessionTable.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTrainingSessionTable.put("exerciseName", new TableInfo.Column("exerciseName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTrainingSessionTable.put("dateString", new TableInfo.Column("dateString", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTrainingSessionTable.put("successScore", new TableInfo.Column("successScore", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTrainingSessionTable.put("failScore", new TableInfo.Column("failScore", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTrainingSessionTable.put("totalScore", new TableInfo.Column("totalScore", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTrainingSessionTable.put("resultScore", new TableInfo.Column("resultScore", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTrainingSessionTable.put("sessionTime", new TableInfo.Column("sessionTime", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTrainingSessionTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTrainingSessionTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTrainingSessionTable = new TableInfo("trainingSession_table", _columnsTrainingSessionTable, _foreignKeysTrainingSessionTable, _indicesTrainingSessionTable);
        final TableInfo _existingTrainingSessionTable = TableInfo.read(_db, "trainingSession_table");
        if (! _infoTrainingSessionTable.equals(_existingTrainingSessionTable)) {
          return new RoomOpenHelper.ValidationResult(false, "trainingSession_table(com.example.android.exercisetracker.data.trainingsessions.TrainingSession).\n"
                  + " Expected:\n" + _infoTrainingSessionTable + "\n"
                  + " Found:\n" + _existingTrainingSessionTable);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "62b68b98031def4a609a088631b8c512", "c95ccf7128e1aa2fbdd79105b35802ea");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "exercises_table","trainingSession_table");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `exercises_table`");
      _db.execSQL("DELETE FROM `trainingSession_table`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public ExerciseDao exerciseDao() {
    if (_exerciseDao != null) {
      return _exerciseDao;
    } else {
      synchronized(this) {
        if(_exerciseDao == null) {
          _exerciseDao = new ExerciseDao_Impl(this);
        }
        return _exerciseDao;
      }
    }
  }

  @Override
  public TrainingSessionDao trainingSessionDao() {
    if (_trainingSessionDao != null) {
      return _trainingSessionDao;
    } else {
      synchronized(this) {
        if(_trainingSessionDao == null) {
          _trainingSessionDao = new TrainingSessionDao_Impl(this);
        }
        return _trainingSessionDao;
      }
    }
  }
}
