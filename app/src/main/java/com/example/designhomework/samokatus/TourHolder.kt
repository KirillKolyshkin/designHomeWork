package com.example.myapplication.samokatus

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.story_trip_item.view.*

class TourHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(trip: Tour) {
        itemView.card_title.text = trip.name
        itemView.card_description.text = trip.desc
    }
}