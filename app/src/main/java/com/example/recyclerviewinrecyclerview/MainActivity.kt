package com.example.recyclerviewinrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val clickListener =
        object : VerticalAdapter.ItemClickListener {
            override fun onClick(position: Int) {
                Log.d("hoge", position.toString())
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.adapter = VerticalAdapter().also {
            it.clickListener = clickListener
        }
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}
