package com.panda.listapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val exampleList = generateList(100);
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view);
        recyclerView.adapter = ExampleAdapter(exampleList);
        recyclerView.layoutManager = LinearLayoutManager(this);
        recyclerView.setHasFixedSize(true);
    }

    fun generateList(size: Int): ArrayList<ExampleItem> {
        val list = ArrayList<ExampleItem>();
        for(i in 0 until size) {
            var drawable: Int = 0;
            var n = i % 3;
            if(n == 0) {
                drawable = R.drawable.ic_sun;
            } else if(n == 1) {
                drawable = R.drawable.ic_main;
            } else if(n == 2) {
                drawable = R.drawable.ic_music;
            }

            val item = ExampleItem(drawable, "Item $i");
            list += item;
        };
        return list;
    }
}