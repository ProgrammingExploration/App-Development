package com.panda.signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class UserPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_page)
        var name = this.intent.getStringExtra("fname");
        var email = this.intent.getStringExtra("email");
        var pass = this.intent.getStringExtra("pass");
        var r = this.intent.getStringExtra("r");
        var final = "Name: $name\n Email: $email\n Password: $pass";
        findViewById<TextView>(R.id.data).text = final;
        var drawable = this.intent.getIntExtra("drawable", 0);
        findViewById<ImageView>(R.id.user_img).setImageResource(drawable);
    }

    fun editBio(view: View) {
        var name = this.intent.getStringExtra("fname");
        var email = this.intent.getStringExtra("email");
        var pass = this.intent.getStringExtra("pass");
        var drawable = this.intent.getIntExtra("drawable", 0);
        var intent = Intent(this, MainActivity::class.java).apply {
            putExtra("email", email);
            putExtra("pass", pass);
            putExtra("fname", name);
            putExtra("drawable", drawable);
        };
        startActivity(intent);
    }
};