package com.example.recyclerviewinrecyclerview

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class VerticalAdapter() : RecyclerView.Adapter<VerticalViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VerticalViewHolder {
        return VerticalViewHolder.newInstance(parent)
    }

    override fun getItemCount(): Int {
        return 1
    }

    override fun onBindViewHolder(holder: VerticalViewHolder, position: Int) {

    }
}
