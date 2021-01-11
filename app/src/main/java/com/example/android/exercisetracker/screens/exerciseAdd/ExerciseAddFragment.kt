package com.example.android.exercisetracker.screens.exerciseAdd

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.example.android.exercisetracker.R
import com.example.android.exercisetracker.databinding.ExerciseAddFragmentBinding

class ExerciseAddFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {

        val binding: ExerciseAddFragmentBinding =
                DataBindingUtil.inflate(layoutInflater, R.layout.exercise_add_fragment, container, false)

        val exerciseAddViewModel = ViewModelProvider(this).get(ExerciseAddViewModel::class.java)
        binding.exerciseAddViewModel = exerciseAddViewModel
        binding.lifecycleOwner = this

        binding.addButton.setOnClickListener {
            if (binding.exerciseNameEditText.text.toString() != "") {
                val exerciseName = binding.exerciseNameEditText.text
                exerciseAddViewModel.insertDataToDatabase(exerciseName.toString())
            }
            else{
                Toast.makeText(context, "Please select a name for your exercise", Toast.LENGTH_SHORT).show()
            }
        }

        exerciseAddViewModel.navigateToExerciseList.observe(viewLifecycleOwner, Observer {
            if (it == true) {
                this.findNavController().navigateUp()
                exerciseAddViewModel.doneNavigating()
            }
        })

        return binding.root
    }
}