package com.example.myapplication.samokatus

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.designhomework.R

class TourAdapter : RecyclerView.Adapter<TourHolder>() {
    var trips: List<Tour> = arrayListOf(
        Tour("Круиз с Flek$$ Landiey – 259€", "7 дней флекса с копанией Flek$$ Air"),
        Tour("Круиз с Flek$$ Landiey – 259€", "7 дней флекса с копанией Flek$$ Air"),
        Tour("Круиз с Flek$$ Landiey – 259€", "7 дней флекса с копанией Flek$$ Air"),
        Tour("Круиз с Flek$$ Landiey – 259€", "7 дней флекса с копанией Flek$$ Air"),
        Tour("Круиз с Flek$$ Landiey – 259€", "7 дней флекса с копанией Flek$$ Air"),
        Tour("Круиз с Flek$$ Landiey – 259€", "7 дней флекса с копанией Flek$$ Air"),
        Tour("Круиз с Flek$$ Landiey – 259€", "7 дней флекса с копанией Flek$$ Air")
    )


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TourHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.story_trip_item, parent, false)
        return TourHolder(v)
    }

    override fun getItemCount(): Int = trips.size

    override fun onBindViewHolder(holder: TourHolder, position: Int) = holder.bind(trips[position])
}