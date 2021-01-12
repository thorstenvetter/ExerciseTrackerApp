package com.example.android.exercisetracker.screens.sessionAdd

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.android.exercisetracker.R
import kotlin.Int
import kotlin.String

public class SessionAddFragmentDirections private constructor() {
  private data class ActionSessionAddFragmentToSessionListFragment(
    public val exerciseName: String
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_sessionAddFragment_to_sessionListFragment

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("exerciseName", this.exerciseName)
      return result
    }
  }

  public companion object {
    public fun actionSessionAddFragmentToSessionListFragment(exerciseName: String): NavDirections =
        ActionSessionAddFragmentToSessionListFragment(exerciseName)
  }
}
