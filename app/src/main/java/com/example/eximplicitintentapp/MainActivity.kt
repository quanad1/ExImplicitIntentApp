package com.example.eximplicitintentapp

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    val id:Int = 69
    val language:String = "Kotlin najlepszy jezyk"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val exButton: Button = findViewById(R.id.exButton) as Button
        exButton.setOnClickListener() {
            intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("id_value", id)
            intent.putExtra("language_value", language)
            startActivity(intent)
        }

        val webButton: Button = findViewById(R.id.webButton) as Button
        webButton.setOnClickListener() {

            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.devillecloud.com/"))
            startActivity(intent)

        }
    }
}