package com.example.android.exercisetracker.data.trainingsessions;

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
public final class TrainingSessionDao_Impl implements TrainingSessionDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<TrainingSession> __insertionAdapterOfTrainingSession;

  private final SharedSQLiteStatement __preparedStmtOfClear;

  public TrainingSessionDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTrainingSession = new EntityInsertionAdapter<TrainingSession>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `trainingSession_table` (`id`,`exerciseName`,`dateString`,`successScore`,`failScore`,`totalScore`,`resultScore`,`sessionTime`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TrainingSession value) {
        stmt.bindLong(1, value.getId());
        if (value.getExerciseName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getExerciseName());
        }
        if (value.getDateString() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDateString());
        }
        if (value.getSuccessScore() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getSuccessScore());
        }
        if (value.getFailScore() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getFailScore());
        }
        if (value.getTotalScore() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getTotalScore());
        }
        if (value.getResultScore() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getResultScore());
        }
        if (value.getSessionTime() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getSessionTime());
        }
      }
    };
    this.__preparedStmtOfClear = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM trainingSession_table";
        return _query;
      }
    };
  }

  @Override
  public Object addSession(final TrainingSession trainingSession,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfTrainingSession.insert(trainingSession);
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
  public LiveData<List<TrainingSession>> readAllData() {
    final String _sql = "SELECT * FROM trainingSession_table ORDER BY id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"trainingSession_table"}, false, new Callable<List<TrainingSession>>() {
      @Override
      public List<TrainingSession> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfExerciseName = CursorUtil.getColumnIndexOrThrow(_cursor, "exerciseName");
          final int _cursorIndexOfDateString = CursorUtil.getColumnIndexOrThrow(_cursor, "dateString");
          final int _cursorIndexOfSuccessScore = CursorUtil.getColumnIndexOrThrow(_cursor, "successScore");
          final int _cursorIndexOfFailScore = CursorUtil.getColumnIndexOrThrow(_cursor, "failScore");
          final int _cursorIndexOfTotalScore = CursorUtil.getColumnIndexOrThrow(_cursor, "totalScore");
          final int _cursorIndexOfResultScore = CursorUtil.getColumnIndexOrThrow(_cursor, "resultScore");
          final int _cursorIndexOfSessionTime = CursorUtil.getColumnIndexOrThrow(_cursor, "sessionTime");
          final List<TrainingSession> _result = new ArrayList<TrainingSession>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TrainingSession _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpExerciseName;
            _tmpExerciseName = _cursor.getString(_cursorIndexOfExerciseName);
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
            final String _tmpSessionTime;
            _tmpSessionTime = _cursor.getString(_cursorIndexOfSessionTime);
            _item = new TrainingSession(_tmpId,_tmpExerciseName,_tmpDateString,_tmpSuccessScore,_tmpFailScore,_tmpTotalScore,_tmpResultScore,_tmpSessionTime);
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
  public LiveData<List<TrainingSession>> readSessionsForExercise(final String exerciseName) {
    final String _sql = "SELECT * FROM trainingSession_table WHERE exerciseName = ? ORDER BY id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (exerciseName == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, exerciseName);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"trainingSession_table"}, false, new Callable<List<TrainingSession>>() {
      @Override
      public List<TrainingSession> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfExerciseName = CursorUtil.getColumnIndexOrThrow(_cursor, "exerciseName");
          final int _cursorIndexOfDateString = CursorUtil.getColumnIndexOrThrow(_cursor, "dateString");
          final int _cursorIndexOfSuccessScore = CursorUtil.getColumnIndexOrThrow(_cursor, "successScore");
          final int _cursorIndexOfFailScore = CursorUtil.getColumnIndexOrThrow(_cursor, "failScore");
          final int _cursorIndexOfTotalScore = CursorUtil.getColumnIndexOrThrow(_cursor, "totalScore");
          final int _cursorIndexOfResultScore = CursorUtil.getColumnIndexOrThrow(_cursor, "resultScore");
          final int _cursorIndexOfSessionTime = CursorUtil.getColumnIndexOrThrow(_cursor, "sessionTime");
          final List<TrainingSession> _result = new ArrayList<TrainingSession>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TrainingSession _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpExerciseName;
            _tmpExerciseName = _cursor.getString(_cursorIndexOfExerciseName);
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
            final String _tmpSessionTime;
            _tmpSessionTime = _cursor.getString(_cursorIndexOfSessionTime);
            _item = new TrainingSession(_tmpId,_tmpExerciseName,_tmpDateString,_tmpSuccessScore,_tmpFailScore,_tmpTotalScore,_tmpResultScore,_tmpSessionTime);
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
