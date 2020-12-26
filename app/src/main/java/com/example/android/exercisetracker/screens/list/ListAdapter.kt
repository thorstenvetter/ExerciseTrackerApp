package com.example.android.exercisetracker.screens.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android.exercisetracker.R
import com.example.android.exercisetracker.data.Exercise
import kotlinx.android.synthetic.main.list_item.view.*

class ListAdapter : RecyclerView.Adapter<ListAdapter.MyViewHolder>() {

    private var exerciseList = emptyList<Exercise>()
    private var timedExerciseList = emptyList<Exercise>()
    private var multiballExerciseList = emptyList<Exercise>()

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false))
    }

    override fun getItemCount(): Int {
        return exerciseList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = exerciseList[position]

        holder.itemView.dateTextView.text = currentItem.dateString
        holder.itemView.resultTextView.text = currentItem.resultScore
        holder.itemView.exerciseTimeTextView.text = currentItem.exerciseTime
    }

    fun setData(exercise: List<Exercise>) {
        this.exerciseList = exercise
        notifyDataSetChanged()
    }

}