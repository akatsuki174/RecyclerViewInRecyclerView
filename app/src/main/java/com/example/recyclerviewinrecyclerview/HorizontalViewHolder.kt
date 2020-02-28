package com.example.recyclerviewinrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class HorizontalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    companion object {
        fun newInstance(parent: ViewGroup): HorizontalViewHolder {
            val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.list_item_horizontal_view, parent, false)
            return HorizontalViewHolder(itemView)
        }
    }
}
