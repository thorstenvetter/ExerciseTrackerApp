package com.example.android.exercisetracker.screens.exerciseList

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.DiffUtil
import com.example.android.exercisetracker.data.exercises.Exercise
import com.example.android.exercisetracker.databinding.ExerciseListItemBinding
import kotlinx.android.synthetic.main.exercise_list_item.view.*

class ExerciseListAdapter: ListAdapter<Exercise, RecyclerView.ViewHolder>(DiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            ExerciseListItemBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false)
        )
    }

        override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val exercise = getItem(position)
        holder.itemView.nameTextView.text = exercise.name
        (holder as MyViewHolder).bind(exercise)
    }

    class MyViewHolder(private var binding: ExerciseListItemBinding
          ) : RecyclerView.ViewHolder(binding.root) {
        init {
            binding.setClickListener{
                binding.exercise?.let { exercise ->
                    navigateToExerciseSessions(exercise, it)
                }
            }
        }

        fun navigateToExerciseSessions(exercise: Exercise, view: View){
            val direction = ExerciseListFragmentDirections
                    .actionExerciseListFragmentToSessionListFragment()
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

private class DiffCallback : DiffUtil.ItemCallback<Exercise>() {

    override fun areItemsTheSame(oldItem: Exercise, newItem: Exercise): Boolean {
        return oldItem.name == newItem.name
    }

    override fun areContentsTheSame(oldItem: Exercise, newItem: Exercise): Boolean {
        return oldItem == newItem
    }
}



//
//class ExerciseListAdapter(private val onClickListener: OnClickListener): ListAdapter<Exercise, ExerciseListAdapter.MyViewHolder>(DiffCallback) {
//
//    class MyViewHolder(private var binding: ExerciseListItemBinding): RecyclerView.ViewHolder(binding.root){
//        fun bind(exercise: Exercise){
//            binding.exercise = exercise
////            binding.executePendingBindings()
//        }
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
//        return MyViewHolder(ExerciseListItemBinding.inflate(LayoutInflater.from(parent.context)))
//    }
//
//    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
//        val exercise = getItem(position)
//        holder.bind(exercise)
//        holder.itemView.nameTextView.text = "test"
////                exercise.name
//        holder.itemView.setOnClickListener{
//            onClickListener.onClick(exercise)
//        }
//    }
//
//    companion object DiffCallback: DiffUtil.ItemCallback<Exercise>(){
//        override fun areItemsTheSame(oldItem: Exercise, newItem: Exercise): Boolean {
//            return oldItem === newItem
//        }
//
//        override fun areContentsTheSame(oldItem: Exercise, newItem: Exercise): Boolean {
//            return oldItem.id == newItem.id
//        }
//    }
//
//
////    override fun getItemCount(): Int {
////        return exerciseList.size
////    }
////
////    fun setData(exercises: List<Exercise>){
////        this.exerciseList = exercises
////        notifyDataSetChanged()
////    }
//
//    class OnClickListener(val clickListener: (exercise: Exercise) -> Unit){
//        fun onClick(exercise: Exercise) = clickListener(exercise)
//    }
//}
