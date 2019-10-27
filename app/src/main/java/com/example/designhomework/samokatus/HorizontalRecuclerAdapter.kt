package com.example.myapplication.samokatus

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.designhomework.R

class HorizontalRecuclerAdapter : RecyclerView.Adapter<HorizontalRecuclerHolder>() {
    var stories: List<String> = arrayListOf("Подписки", "Авиабилеты", "Туры", "Отели")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HorizontalRecuclerHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.story_list_item, parent, false)
        return HorizontalRecuclerHolder(v)
    }

    override fun getItemCount(): Int = stories.size

    override fun onBindViewHolder(holder: HorizontalRecuclerHolder, position: Int) = holder.bind(stories[position])
}
