package com.panda.api

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.android.volley.Request
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        load();
    }

    fun load() {
        val queue = Volley.newRequestQueue(this);
        val url = "https://evening-mountain-10604.herokuapp.com/api";

        val jsonObjectRequest = JsonObjectRequest(Request.Method.GET, url, null,
                { response ->
                    var final = "";

                    var email = response.getString("email");

                    var name = response.getJSONObject("name");
                    var first = name.getString("first");
                    var last = name.getString("last");
                    final = "Email: $email \nFirst Name: $first\nLast Name: $last";
                    findViewById<TextView>(R.id.data).text = final;
                },
                { it ->
                    println(it.toString())
                }
        )

        queue.add(jsonObjectRequest);
    }
}