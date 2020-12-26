package com.example.android.exercisetracker.screens.add;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 J2\u00020\u0001:\u0001JB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020/H\u0002J\u0006\u0010B\u001a\u00020@J\u0006\u0010C\u001a\u00020@J\u0006\u0010D\u001a\u00020@J\u0006\u0010E\u001a\u00020@J\u0006\u0010F\u001a\u00020@J\b\u0010G\u001a\u00020@H\u0002J\u0010\u0010H\u001a\u00020@2\u0006\u0010I\u001a\u00020\u0007H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00158BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R(\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00190\u00190\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00158F\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010\u0017R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\u00158F\u00a2\u0006\u0006\u001a\u0004\b!\u0010\u0017R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00158F\u00a2\u0006\u0006\u001a\u0004\b#\u0010\u0017R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00158F\u00a2\u0006\u0006\u001a\u0004\b%\u0010\u0017R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00100\u00158F\u00a2\u0006\u0006\u001a\u0004\b\'\u0010\u0017R\u000e\u0010(\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00158F\u00a2\u0006\u0006\u001a\u0004\b,\u0010\u0017R\u001d\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0.0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0017R\u000e\u00101\u001a\u000202X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u00105\u001a\b\u0012\u0004\u0012\u00020\u00100\u00158F\u00a2\u0006\u0006\u001a\u0004\b6\u0010\u0017R\u000e\u00107\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000209X\u0082.\u00a2\u0006\u0002\n\u0000R\u0011\u0010:\u001a\u00020;8F\u00a2\u0006\u0006\u001a\u0004\b<\u0010=R\u000e\u0010>\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006K"}, d2 = {"Lcom/example/android/exercisetracker/screens/add/AddViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_currentTime", "Landroidx/lifecycle/MutableLiveData;", "", "_date", "Ljava/time/LocalDate;", "_eventExerciseFinished", "", "_eventExerciseNoTimerStarted", "_eventExercisePaused", "_eventExerciseStarted", "_failScore", "", "_navigateToList", "_successScore", "_timerTime", "currentTime", "Landroidx/lifecycle/LiveData;", "getCurrentTime", "()Landroidx/lifecycle/LiveData;", "currentTimeString", "", "kotlin.jvm.PlatformType", "getCurrentTimeString", "setCurrentTimeString", "(Landroidx/lifecycle/LiveData;)V", "eventExerciseFinished", "getEventExerciseFinished", "eventExerciseNoTimerStarted", "getEventExerciseNoTimerStarted", "eventExercisePaused", "getEventExercisePaused", "eventExerciseStarted", "getEventExerciseStarted", "failScore", "getFailScore", "isPaused", "isResumed", "isStarted", "navigateToList", "getNavigateToList", "readAllData", "", "Lcom/example/android/exercisetracker/data/Exercise;", "getReadAllData", "repository", "Lcom/example/android/exercisetracker/data/ExerciseRepository;", "result", "resultScore", "successScore", "getSuccessScore", "timeString", "timer", "Landroid/os/CountDownTimer;", "timerTextWatcher", "Landroid/text/TextWatcher;", "getTimerTextWatcher", "()Landroid/text/TextWatcher;", "totalScore", "addExercise", "", "exercise", "addFailScore", "addSuccessScore", "doneNavigating", "insertDataToDatabase", "onStart", "saveCountDownTime", "startTimer", "countDownTime", "Companion", "app_debug"})
public final class AddViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.android.exercisetracker.data.Exercise>> readAllData = null;
    private final com.example.android.exercisetracker.data.ExerciseRepository repository = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _successScore = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _failScore = null;
    private int totalScore = 0;
    private int resultScore = 0;
    private java.lang.String result = "";
    private final androidx.lifecycle.MutableLiveData<java.time.LocalDate> _date = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _eventExerciseStarted = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _eventExercisePaused = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _eventExerciseNoTimerStarted = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _eventExerciseFinished = null;
    private android.os.CountDownTimer timer;
    private final androidx.lifecycle.MutableLiveData<java.lang.Long> _currentTime = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.lang.String> currentTimeString;
    private boolean isStarted = false;
    private boolean isPaused = true;
    private boolean isResumed = false;
    private androidx.lifecycle.MutableLiveData<java.lang.Long> _timerTime;
    private java.lang.String timeString = " ";
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _navigateToList = null;
    private static final long ONE_SECOND = 1000L;
    public static final com.example.android.exercisetracker.screens.add.AddViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.android.exercisetracker.data.Exercise>> getReadAllData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getSuccessScore() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getFailScore() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getEventExerciseStarted() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getEventExercisePaused() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getEventExerciseNoTimerStarted() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getEventExerciseFinished() {
        return null;
    }
    
    private final androidx.lifecycle.LiveData<java.lang.Long> getCurrentTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getCurrentTimeString() {
        return null;
    }
    
    public final void setCurrentTimeString(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getNavigateToList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.text.TextWatcher getTimerTextWatcher() {
        return null;
    }
    
    private final void saveCountDownTime() {
    }
    
    private final void startTimer(long countDownTime) {
    }
    
    public final void onStart() {
    }
    
    public final void doneNavigating() {
    }
    
    public final void addSuccessScore() {
    }
    
    public final void addFailScore() {
    }
    
    public final void insertDataToDatabase() {
    }
    
    private final void addExercise(com.example.android.exercisetracker.data.Exercise exercise) {
    }
    
    public AddViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/android/exercisetracker/screens/add/AddViewModel$Companion;", "", "()V", "ONE_SECOND", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}