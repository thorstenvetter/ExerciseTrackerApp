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
import com.example.android.exercisetracker.screens.sessionList.SessionListAdapter
import kotlinx.android.synthetic.main.exercise_list_item.view.*
import kotlinx.android.synthetic.main.list_item.view.*

class ExerciseListAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var exerciseList = emptyList<Exercise>()

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.exercise_list_item, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return exerciseList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val currentItem = exerciseList[position]

        holder.itemView.nameTextView.text = currentItem.name
    }

    fun setData(exercises: List<Exercise>){
        this.exerciseList = exercises
        notifyDataSetChanged()
    }
}