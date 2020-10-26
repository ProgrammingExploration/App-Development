package com.panda.tipcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calculate(view: View) {
        var price: Int = findViewById<EditText>(R.id.price).text.toString().toInt();
        var tip: Int = findViewById<EditText>(R.id.tip).text.toString().toInt();
        var totalString: String = (price + (price * tip/100)).toString();
        val textView: TextView = findViewById(R.id.total);
        textView.text = totalString;
    }
}