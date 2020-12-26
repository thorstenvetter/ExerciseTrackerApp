package com.example.android.exercisetracker.screens.add

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.android.exercisetracker.R

class AddFragmentDirections private constructor() {
  companion object {
    fun actionAddFragmentToListFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_addFragment_to_listFragment)
  }
}
