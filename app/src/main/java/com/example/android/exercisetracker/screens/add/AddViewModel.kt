package com.example.android.exercisetracker.screens.add

import android.app.Application
import android.os.CountDownTimer
import android.text.Editable
import android.text.TextWatcher
import android.text.format.DateUtils
import androidx.lifecycle.*
import com.example.android.exercisetracker.data.TrainingSession
import com.example.android.exercisetracker.data.TrainingSessionDatabase
import com.example.android.exercisetracker.data.TrainingSessionRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.time.LocalDate

class AddViewModel(application: Application) : AndroidViewModel(application) {

    private val readAllData: LiveData<List<TrainingSession>>
    private val repository: TrainingSessionRepository

    //exercise variables

    private val _successScore = MutableLiveData<Int>()
    val successScore: LiveData<Int>
        get() = _successScore

    private val _failScore = MutableLiveData<Int>()
    val failScore: LiveData<Int>
        get() = _failScore

    private var totalScore = 0
    private var resultScore = 0
    private var result = ""

    private val _date = MutableLiveData<LocalDate>()

    //exercise state variables

    private val _eventSessionStarted = MutableLiveData<Boolean>()
    val eventSessionStarted: LiveData<Boolean>
        get() = _eventSessionStarted

    private val _eventSessionPaused = MutableLiveData<Boolean>()
    val eventSessionPaused: LiveData<Boolean>
        get() = _eventSessionPaused

    private val _eventSessionNoTimerStarted = MutableLiveData<Boolean>()
    val eventSessionNoTimerStarted: LiveData<Boolean>
        get() = _eventSessionNoTimerStarted

    //timer variables
    private lateinit var timer: CountDownTimer

    private val _currentTime = MutableLiveData<Long>()
    private val currentTime: LiveData<Long>
        get() = _currentTime

    var currentTimeString = Transformations.map(currentTime) { time ->
        DateUtils.formatElapsedTime(time)
    }

    private var isStarted = false
    private var isPaused = true
    private var isResumed = false

    companion object {
        private const val ONE_SECOND = 1000L
    }

    private var _timerTime = MutableLiveData<Long>()
    private var timeString = " "

    //navigation variable

    private val _navigateToList = MutableLiveData<Boolean>()
    val navigateToList: LiveData<Boolean>
        get() = _navigateToList

    init {
        val trainingSessionDao = TrainingSessionDatabase.getDatabase(application).trainingSessionDao()
        repository = TrainingSessionRepository(trainingSessionDao)
        readAllData = repository.readAllData
        _navigateToList.value = false
        _successScore.value = 0
        _failScore.value = 0
        _currentTime.value = 0L
        _eventSessionStarted.value = false
        _eventSessionNoTimerStarted.value = false
        _eventSessionPaused.value = false
        _timerTime.value = 0L
    }

    val timerTextWatcher: TextWatcher
        get() = object : TextWatcher {
            override fun afterTextChanged(editedTime: Editable?) {
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (p0.toString() != "") {
                    _currentTime.value = p0.toString().toLong() * 60
                } else {
                    _currentTime.value = 0L
                }
                saveCountDownTime()
            }
        }

    private fun saveCountDownTime() {
        if (_currentTime.value != 0L) {
            _timerTime.value = _currentTime.value.toString().toLong() / 60
            timeString = "${_timerTime.value.toString()} min"
        }
    }

    private fun startTimer(countDownTime: Long) {
        timer = object : CountDownTimer(
                countDownTime,
                ONE_SECOND
        ) {
            override fun onTick(millisUntilFinished: Long) {
                _currentTime.value = millisUntilFinished / ONE_SECOND
            }

            override fun onFinish() {
                insertDataToDatabase()
            }
        }.start()
    }

    fun onStart() {

        when {
            !isStarted -> {
                if (_currentTime.value != 0L) {
                    val countDownTime = _currentTime.value?.times(ONE_SECOND)
                    if (countDownTime != null) {
                        startTimer(countDownTime)
                    }
                } else {
                    _eventSessionNoTimerStarted.value = true
                }
                isStarted = true
                isResumed = true
                isPaused = false
                _eventSessionStarted.value = true
            }
            !isPaused -> {
                timer.cancel()
                isPaused = true
                isResumed = false
                _eventSessionPaused.value = true
                _eventSessionStarted.value = false
            }
            !isResumed -> {
                if (_currentTime.value != 0L) {
                    val countDownTime = _currentTime.value?.times(ONE_SECOND)
                    if (countDownTime != null) {
                        startTimer(countDownTime)
                    }
                }
                isResumed = true
                isPaused = false
                _eventSessionStarted.value = true
                _eventSessionPaused.value = false
            }
        }
    }


    fun doneNavigating() {
        _navigateToList.value = false
    }

    fun addSuccessScore() {
        if (isStarted && isResumed) {
            _successScore.value = _successScore.value?.plus(1)
        }
    }

    fun addFailScore() {
        if (isStarted && isResumed) {
            _failScore.value = _failScore.value?.plus(1)
        }
    }

    fun insertDataToDatabase() {

        if (isStarted) {
            if (_eventSessionNoTimerStarted.value == false) {
                timer.cancel()
            }
            totalScore =
                    _successScore.value.toString().toInt() + _failScore.value.toString().toInt()
            resultScore = if (totalScore != 0) {
                100 * _successScore.value.toString().toInt() / totalScore
            } else {
                0
            }
            _date.value = LocalDate.now()
            result = "$resultScore% (${_successScore.value}/$totalScore)"
            val session = TrainingSession(0, _date.value.toString(), _successScore.value.toString(),
                    _failScore.value.toString(), totalScore.toString(), result, timeString)
            addSession(session)
            _navigateToList.value = true
        }
    }

    private fun addSession(trainingSession: TrainingSession) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.addTrainingSession(trainingSession)
        }
    }
}