package com.example.android.exercisetracker.screens.exerciseList

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.android.exercisetracker.R
import kotlin.Int
import kotlin.String

public class ExerciseListFragmentDirections private constructor() {
  private data class ActionExerciseListFragmentToSessionListFragment(
    public val exerciseName: String
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_exerciseListFragment_to_sessionListFragment

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("exerciseName", this.exerciseName)
      return result
    }
  }

  public companion object {
    public fun actionExerciseListFragmentToExerciseAddFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_exerciseListFragment_to_exerciseAddFragment)

    public fun actionExerciseListFragmentToSessionListFragment(exerciseName: String): NavDirections
        = ActionExerciseListFragmentToSessionListFragment(exerciseName)
  }
}
