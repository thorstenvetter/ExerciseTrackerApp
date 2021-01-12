package com.example.android.exercisetracker.screens.sessionList

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.android.exercisetracker.R
import kotlin.Int
import kotlin.String

public class SessionListFragmentDirections private constructor() {
  private data class ActionSessionListFragmentToSessionAddFragment(
    public val exerciseName: String
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_sessionListFragment_to_sessionAddFragment

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("exerciseName", this.exerciseName)
      return result
    }
  }

  public companion object {
    public fun actionSessionListFragmentToSessionAddFragment(exerciseName: String): NavDirections =
        ActionSessionListFragmentToSessionAddFragment(exerciseName)
  }
}
