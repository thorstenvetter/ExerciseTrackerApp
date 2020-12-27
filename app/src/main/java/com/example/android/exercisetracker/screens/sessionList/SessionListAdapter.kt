package com.example.android.exercisetracker.screens.sessionList

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android.exercisetracker.R
import com.example.android.exercisetracker.data.TrainingSession
import kotlinx.android.synthetic.main.list_item.view.*

class SessionListAdapter : RecyclerView.Adapter<SessionListAdapter.MyViewHolder>() {

    private var sessionList = emptyList<TrainingSession>()

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false))
    }

    override fun getItemCount(): Int {
        return sessionList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = sessionList[position]

        holder.itemView.dateTextView.text = currentItem.dateString
        holder.itemView.resultTextView.text = currentItem.resultScore
        holder.itemView.sessionTimeTextView.text = currentItem.sessionTime
    }

    fun setData(trainingSession: List<TrainingSession>) {
        this.sessionList = trainingSession
        notifyDataSetChanged()
    }

}