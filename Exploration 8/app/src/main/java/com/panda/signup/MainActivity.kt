package com.panda.signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import kotlin.random.Random.Default.nextInt

class MainActivity : AppCompatActivity() {
    var list = listOf(R.drawable.one, R.drawable.two, R.drawable.three, R.drawable.four, R.drawable.five);
    var r = nextInt(0, list.size);

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var name = this.intent.getStringExtra("fname");
        var email = this.intent.getStringExtra("email");
        var pass = this.intent.getStringExtra("pass");
        findViewById<EditText>(R.id.name).setText(name);
        findViewById<EditText>(R.id.email).setText(email);
        findViewById<EditText>(R.id.pass).setText(pass);
        var drawable = this.intent.getIntExtra("drawable", R.drawable.one)
        findViewById<ImageView>(R.id.img).setImageResource(drawable);
    }

    fun register(view: View) {
        var name = findViewById<EditText>(R.id.name).text.toString();
        var email = findViewById<EditText>(R.id.email).text.toString();
        var pass = findViewById<EditText>(R.id.pass).text.toString();
        var intent = Intent(this, UserPage::class.java).apply {
            putExtra("fname", name);
            putExtra("email", email);
            putExtra("pass", pass);
            putExtra("drawable", list[r]);
        };
        startActivity(intent);
    }

    fun generate(view: View) {
        r = nextInt(0, list.size);
        findViewById<ImageView>(R.id.img).setImageResource(list[r]);
    }
}