package com.example.recyclerviewinrecyclerview

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class VerticalAdapter : RecyclerView.Adapter<VerticalViewHolder>() {
    var clickListener: ItemClickListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VerticalViewHolder {
        return VerticalViewHolder.newInstance(parent).also {
            it.clickListener = clickListener
        }
    }

    override fun getItemCount(): Int {
        return 1
    }

    override fun onBindViewHolder(holder: VerticalViewHolder, position: Int) {

    }

    interface ItemClickListener {
        fun onClick(position: Int)
    }
}
