package com.example.myapplication1

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main3.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun ponedilok(view: View) {
        val editText = findViewById<EditText>(R.id.editText)
        val intent = Intent(this, Main3Activity::class.java).apply {
        }
        startActivity(intent)
    }

    fun vivtorok(view: View) {
        val editText = findViewById<EditText>(R.id.editText)
        val intent = Intent(this, MainActivity2::class.java).apply {
        }
        startActivity(intent)
    }

    fun sereda(view: View) {
        val editText = findViewById<EditText>(R.id.editText)
        val intent = Intent(this, MainActivity3::class.java).apply {
        }
        startActivity(intent)
    }

    fun chetver(view: View) {
        val editText = findViewById<EditText>(R.id.editText)
        val intent = Intent(this, MainActivity4::class.java).apply {
        }
        startActivity(intent)
    }

    fun last(view: View) {
        val editText = findViewById<EditText>(R.id.editText)
        val intent = Intent(this, MainActivity5::class.java).apply {
        }
        startActivity(intent)
    }


    companion object {
        const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"
    }
}











