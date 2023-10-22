package com.example.myapplication.view.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.data.model.Habit
import com.example.myapplication.databinding.AdapterHomeHabitBinding

class HabitAdapter() : RecyclerView.Adapter<HabitAdapter.ViewHolder>() {
    private val list  = mutableListOf<Habit>()
    init {
        defaultItem()
    }
    private fun defaultItem()
    {
        list.add(Habit(1,"Yoga","hrs",5,R.drawable.demo_listen))
        list.add(Habit(2,"Listening","hrs",5,R.drawable.demo_listen))
        list.add(Habit(1,"Washing","hrs",5,R.drawable.demo_listen))
        list.add(Habit(1,"Reading","hrs",5,R.drawable.demo_listen))
        list.add(Habit(1,"Sleeping","hrs",5,R.drawable.demo_listen))
    }

    class ViewHolder(val binding : AdapterHomeHabitBinding):RecyclerView.ViewHolder(binding.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = AdapterHomeHabitBinding.inflate(LayoutInflater.from(parent.context));
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if(list[position]==null) return ;
        var model = list[position]
        holder.binding.habit=model
    }

    override fun getItemCount(): Int {
        return list.size
    }

}