package com.example.android.exercisetracker.screens.exerciseList

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.DiffUtil
import com.example.android.exercisetracker.R
import com.example.android.exercisetracker.data.exercises.Exercise
import com.example.android.exercisetracker.databinding.ExerciseListItemBinding
import com.example.android.exercisetracker.generated.callback.OnClickListener
import com.example.android.exercisetracker.screens.sessionList.SessionListAdapter
import kotlinx.android.synthetic.main.exercise_list_item.view.*
import kotlinx.android.synthetic.main.list_item.view.*

class ExerciseListAdapter: ListAdapter<Exercise, RecyclerView.ViewHolder>(ExerciseDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ExerciseViewHolder(
            ExerciseListItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val exercise = getItem(position)
        (holder as ExerciseViewHolder).bind(exercise)
    }

    class ExerciseViewHolder(private val binding: ExerciseListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        init {
            binding.setClickListener {
                binding.exercise?.let { exercise ->
                    navigateToExercise(exercise, it)
                }
            }
        }

        private fun navigateToExercise(exercise: Exercise, view: View) {
            val direction = ExerciseListFragmentDirections
                .actionExerciseListFragmentToSessionListFragment(exercise.name)
            view.findNavController().navigate(direction)
        }

        fun bind(item: Exercise) {
            binding.apply {
                exercise = item
                executePendingBindings()
            }
        }
    }
}

private class ExerciseDiffCallback: DiffUtil.ItemCallback<Exercise>(){
    override fun areItemsTheSame(oldItem: Exercise, newItem: Exercise): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Exercise, newItem: Exercise): Boolean {
        return oldItem == newItem
    }
}

