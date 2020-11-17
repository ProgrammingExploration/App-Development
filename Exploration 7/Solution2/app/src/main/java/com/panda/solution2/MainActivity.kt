package com.panda.solution2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random.Default.nextInt

class MainActivity : AppCompatActivity() {
    var img_list = listOf(R.drawable.one, R.drawable.two, R.drawable.three, R.drawable.four, R.drawable.five);
    var text_list = listOf<String>("Dog", "Green Boi", "Fish Bowl", "Hacker", "Barney");

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun generate(view: View) {
        val a = nextInt(0, img_list.size);
        val b = nextInt(0, text_list.size);
        var img = findViewById<ImageView>(R.id.img);
        img.setImageResource(img_list[a]);
        var text = findViewById<TextView>(R.id.show_text);
        text.text = text_list[b];
        var final = findViewById<ImageView>(R.id.check)
        if(a == b) {
            final.setImageResource(R.drawable.check);
        } else {
            final.setImageResource(R.drawable.wrong);
        }
    }
}