package com.example.cardview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(var context: Context) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_recyclerview,parent,false))
    }

    override fun getItemCount(): Int {
       return 9
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }
}