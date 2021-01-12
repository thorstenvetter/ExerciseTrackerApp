package com.example.android.exercisetracker.screens.exerciseAdd

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.android.exercisetracker.R

public class ExerciseAddFragmentDirections private constructor() {
  public companion object {
    public fun actionExerciseAddFragmentToExerciseListFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_exerciseAddFragment_to_exerciseListFragment)
  }
}
