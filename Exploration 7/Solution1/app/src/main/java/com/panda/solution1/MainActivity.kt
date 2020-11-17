package com.panda.solution1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.math.abs
import kotlin.random.Random.Default.nextInt

class MainActivity : AppCompatActivity() {
    var r: Int = nextInt(0, 20);

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun guess(view: View) {
        var text = findViewById<EditText>(R.id.guess);
        var guess = findViewById<EditText>(R.id.guess).text.toString().toInt();
        if(guess == r) {
            Toast.makeText(this@MainActivity, "Correct", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this@MainActivity, "You were off by ${abs(guess - r)}", Toast.LENGTH_SHORT).show();
        }
        text.text.clear();
    }

    fun reset(view: View) {
        r = nextInt(0, 20);
        var text = findViewById<EditText>(R.id.guess);
        Toast.makeText(this@MainActivity, "Reset Successfully", Toast.LENGTH_SHORT).show();
        text.text.clear();
    }

    fun giveup(view: View) {
        var text = findViewById<TextView>(R.id.show);
        text.text = r.toString();
    }
}