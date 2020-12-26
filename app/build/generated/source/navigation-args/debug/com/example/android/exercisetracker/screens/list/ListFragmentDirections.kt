package com.example.android.exercisetracker.screens.list

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.android.exercisetracker.R

class ListFragmentDirections private constructor() {
  companion object {
    fun actionListFragmentToAddFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_listFragment_to_addFragment)
  }
}
