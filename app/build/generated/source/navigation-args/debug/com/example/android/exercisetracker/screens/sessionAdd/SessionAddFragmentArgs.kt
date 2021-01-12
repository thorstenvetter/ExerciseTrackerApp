package com.example.android.exercisetracker.screens.sessionAdd

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class SessionAddFragmentArgs(
  public val exerciseName: String
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("exerciseName", this.exerciseName)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): SessionAddFragmentArgs {
      bundle.setClassLoader(SessionAddFragmentArgs::class.java.classLoader)
      val __exerciseName : String?
      if (bundle.containsKey("exerciseName")) {
        __exerciseName = bundle.getString("exerciseName")
        if (__exerciseName == null) {
          throw IllegalArgumentException("Argument \"exerciseName\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"exerciseName\" is missing and does not have an android:defaultValue")
      }
      return SessionAddFragmentArgs(__exerciseName)
    }
  }
}
