package com.example.myapplication.samokatus

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.designhomework.R
import com.example.myapplication.MainActivity
import kotlinx.android.synthetic.main.fragment_samokat.*
import kotlinx.android.synthetic.main.toolbar_samocat.*

class ThirdFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_samokat, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as MainActivity).setSupportActionBar(tool_bar)
        rv_story_list.adapter = HorizontalRecuclerAdapter()
        rv_trip_list.adapter = TourAdapter()
    }
}