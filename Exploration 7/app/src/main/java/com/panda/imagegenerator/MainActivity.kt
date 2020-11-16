package com.panda.imagegenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlin.random.Random.Default.nextInt

class MainActivity : AppCompatActivity() {
    val list = listOf(R.drawable.one, R.drawable.two, R.drawable.three, R.drawable.four, R.drawable.five);

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun generate(view: View) {
        var r = nextInt(0, list.size);
        println(r);
        var img = findViewById<ImageView>(R.id.img);
        img.setImageResource(list[r]);
    }
}