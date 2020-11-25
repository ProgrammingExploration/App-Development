package com.panda.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
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

    fun remove(view: View) {
        var inputField = findViewById<EditText>(R.id.remove);
        var text = inputField.text.toString();
        if(list.contains(text)) {
            list.remove(text);
            Toast.makeText(this@MainActivity, "Deleted Successfully", Toast.LENGTH_SHORT).show();
       } else {
            Toast.makeText(this@MainActivity, "Restaraunt not in List", Toast.LENGTH_LONG).show();
        }
        inputField.text.clear();
    }

    fun generate(view: View) {
        var r: Int = nextInt(0, list.size);
        var text = findViewById<TextView>(R.id.restaraunt);
        text.text = list[r];
    }
}