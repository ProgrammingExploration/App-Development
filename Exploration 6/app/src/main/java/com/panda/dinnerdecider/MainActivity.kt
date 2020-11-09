package com.panda.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random.Default.nextInt

class MainActivity : AppCompatActivity() {
    var list: MutableList<String> = mutableListOf<String>("Taco Bell", "McDonalds", "P.F. Changs");

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun add(view: View) {
        var inputField = findViewById<EditText>(R.id.input);
        list.plusAssign(mutableListOf<String>(inputField.text.toString()));
        inputField.text.clear();
    }

    fun generate(view: View) {
        var r: Int = nextInt(0, list.size);
        var text = findViewById<TextView>(R.id.restaraunt);
        text.text = list[r];
    }
}