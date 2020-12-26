package com.example.android.exercisetracker.data;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ExerciseDao_Impl implements ExerciseDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Exercise> __insertionAdapterOfExercise;

  private final SharedSQLiteStatement __preparedStmtOfClear;

  public ExerciseDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfExercise = new EntityInsertionAdapter<Exercise>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `exercise_table` (`id`,`dateString`,`successScore`,`failScore`,`totalScore`,`resultScore`,`exerciseTime`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Exercise value) {
        stmt.bindLong(1, value.getId());
        if (value.getDateString() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getDateString());
        }
        if (value.getSuccessScore() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getSuccessScore());
        }
        if (value.getFailScore() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getFailScore());
        }
        if (value.getTotalScore() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getTotalScore());
        }
        if (value.getResultScore() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getResultScore());
        }
        if (value.getExerciseTime() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getExerciseTime());
        }
      }
    };
    this.__preparedStmtOfClear = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM exercise_table";
        return _query;
      }
    };
  }

  @Override
  public Object addExercise(final Exercise exercise, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfExercise.insert(exercise);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object clear(final Continuation<? super Unit> p0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfClear.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfClear.release(_stmt);
        }
      }
    }, p0);
  }

  @Override
  public LiveData<List<Exercise>> readAllData() {
    final String _sql = "SELECT * FROM exercise_table ORDER BY id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"exercise_table"}, false, new Callable<List<Exercise>>() {
      @Override
      public List<Exercise> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfDateString = CursorUtil.getColumnIndexOrThrow(_cursor, "dateString");
          final int _cursorIndexOfSuccessScore = CursorUtil.getColumnIndexOrThrow(_cursor, "successScore");
          final int _cursorIndexOfFailScore = CursorUtil.getColumnIndexOrThrow(_cursor, "failScore");
          final int _cursorIndexOfTotalScore = CursorUtil.getColumnIndexOrThrow(_cursor, "totalScore");
          final int _cursorIndexOfResultScore = CursorUtil.getColumnIndexOrThrow(_cursor, "resultScore");
          final int _cursorIndexOfExerciseTime = CursorUtil.getColumnIndexOrThrow(_cursor, "exerciseTime");
          final List<Exercise> _result = new ArrayList<Exercise>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Exercise _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpDateString;
            _tmpDateString = _cursor.getString(_cursorIndexOfDateString);
            final String _tmpSuccessScore;
            _tmpSuccessScore = _cursor.getString(_cursorIndexOfSuccessScore);
            final String _tmpFailScore;
            _tmpFailScore = _cursor.getString(_cursorIndexOfFailScore);
            final String _tmpTotalScore;
            _tmpTotalScore = _cursor.getString(_cursorIndexOfTotalScore);
            final String _tmpResultScore;
            _tmpResultScore = _cursor.getString(_cursorIndexOfResultScore);
            final String _tmpExerciseTime;
            _tmpExerciseTime = _cursor.getString(_cursorIndexOfExerciseTime);
            _item = new Exercise(_tmpId,_tmpDateString,_tmpSuccessScore,_tmpFailScore,_tmpTotalScore,_tmpResultScore,_tmpExerciseTime);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<Exercise>> readTimedData() {
    final String _sql = "SELECT * FROM exercise_table WHERE exerciseTime != ' ' ORDER BY id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"exercise_table"}, false, new Callable<List<Exercise>>() {
      @Override
      public List<Exercise> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfDateString = CursorUtil.getColumnIndexOrThrow(_cursor, "dateString");
          final int _cursorIndexOfSuccessScore = CursorUtil.getColumnIndexOrThrow(_cursor, "successScore");
          final int _cursorIndexOfFailScore = CursorUtil.getColumnIndexOrThrow(_cursor, "failScore");
          final int _cursorIndexOfTotalScore = CursorUtil.getColumnIndexOrThrow(_cursor, "totalScore");
          final int _cursorIndexOfResultScore = CursorUtil.getColumnIndexOrThrow(_cursor, "resultScore");
          final int _cursorIndexOfExerciseTime = CursorUtil.getColumnIndexOrThrow(_cursor, "exerciseTime");
          final List<Exercise> _result = new ArrayList<Exercise>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Exercise _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpDateString;
            _tmpDateString = _cursor.getString(_cursorIndexOfDateString);
            final String _tmpSuccessScore;
            _tmpSuccessScore = _cursor.getString(_cursorIndexOfSuccessScore);
            final String _tmpFailScore;
            _tmpFailScore = _cursor.getString(_cursorIndexOfFailScore);
            final String _tmpTotalScore;
            _tmpTotalScore = _cursor.getString(_cursorIndexOfTotalScore);
            final String _tmpResultScore;
            _tmpResultScore = _cursor.getString(_cursorIndexOfResultScore);
            final String _tmpExerciseTime;
            _tmpExerciseTime = _cursor.getString(_cursorIndexOfExerciseTime);
            _item = new Exercise(_tmpId,_tmpDateString,_tmpSuccessScore,_tmpFailScore,_tmpTotalScore,_tmpResultScore,_tmpExerciseTime);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<Exercise>> readMultiballData() {
    final String _sql = "SELECT * FROM exercise_table WHERE exerciseTime = ' ' ORDER BY id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"exercise_table"}, false, new Callable<List<Exercise>>() {
      @Override
      public List<Exercise> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfDateString = CursorUtil.getColumnIndexOrThrow(_cursor, "dateString");
          final int _cursorIndexOfSuccessScore = CursorUtil.getColumnIndexOrThrow(_cursor, "successScore");
          final int _cursorIndexOfFailScore = CursorUtil.getColumnIndexOrThrow(_cursor, "failScore");
          final int _cursorIndexOfTotalScore = CursorUtil.getColumnIndexOrThrow(_cursor, "totalScore");
          final int _cursorIndexOfResultScore = CursorUtil.getColumnIndexOrThrow(_cursor, "resultScore");
          final int _cursorIndexOfExerciseTime = CursorUtil.getColumnIndexOrThrow(_cursor, "exerciseTime");
          final List<Exercise> _result = new ArrayList<Exercise>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Exercise _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpDateString;
            _tmpDateString = _cursor.getString(_cursorIndexOfDateString);
            final String _tmpSuccessScore;
            _tmpSuccessScore = _cursor.getString(_cursorIndexOfSuccessScore);
            final String _tmpFailScore;
            _tmpFailScore = _cursor.getString(_cursorIndexOfFailScore);
            final String _tmpTotalScore;
            _tmpTotalScore = _cursor.getString(_cursorIndexOfTotalScore);
            final String _tmpResultScore;
            _tmpResultScore = _cursor.getString(_cursorIndexOfResultScore);
            final String _tmpExerciseTime;
            _tmpExerciseTime = _cursor.getString(_cursorIndexOfExerciseTime);
            _item = new Exercise(_tmpId,_tmpDateString,_tmpSuccessScore,_tmpFailScore,_tmpTotalScore,_tmpResultScore,_tmpExerciseTime);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
