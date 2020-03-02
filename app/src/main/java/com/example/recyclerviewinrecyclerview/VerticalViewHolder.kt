package com.example.recyclerviewinrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item_vertical_view.view.*

class VerticalViewHolder(parent: View) : RecyclerView.ViewHolder(parent) {
    var clickListener: VerticalAdapter.ItemClickListener? = null

    companion object {
        fun newInstance(parent: ViewGroup): VerticalViewHolder {
            val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.list_item_vertical_view, parent, false)
            return VerticalViewHolder(itemView)
        }
    }

    private val adapter = HorizontalAdapter(object : VerticalAdapter.ItemClickListener {
        override fun onClick(position: Int) {
            clickListener?.onClick(position)
        }
    })

    init {
        parent.recyclerView.layoutManager = LinearLayoutManager(parent.context, LinearLayoutManager.HORIZONTAL, false)
        parent.recyclerView.adapter = adapter
    }
}
