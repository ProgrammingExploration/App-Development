package com.panda.listapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ExampleAdapter(private val exampleList: List<ExampleItem>) : RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder>() {
    class ExampleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.img);
        val textView: TextView = itemView.findViewById(R.id.text_view);
    };

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.example_item,
        parent, false);
        return ExampleViewHolder(itemView);
    }

    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {
        val current = exampleList[position];

        holder.imageView.setImageResource(current.image);
        holder.textView.text = current.text;
    }

    override fun getItemCount(): Int {
        return exampleList.size;
    }
}