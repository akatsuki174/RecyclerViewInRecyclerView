package com.example.recyclerviewinrecyclerview

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class HorizontalAdapter(private val clickListener: VerticalAdapter.ItemClickListener?): RecyclerView.Adapter<HorizontalViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HorizontalViewHolder {
        return HorizontalViewHolder.newInstance(parent)
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: HorizontalViewHolder, position: Int) {
        holder.itemView.setOnClickListener {
            clickListener?.onClick(position)
        }
    }
}
