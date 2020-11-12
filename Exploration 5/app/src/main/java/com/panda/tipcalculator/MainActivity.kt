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
        var price = findViewById<EditText>(R.id.price).text.toString().toInt();
        var tip = findViewById<EditText>(R.id.tip).text.toString().toInt();
        var percent = tip * 0.01;
        var final = price + (price * percent);
        var finalText = findViewById<TextView>(R.id.result);
        finalText.text = final.toString();
    }
}