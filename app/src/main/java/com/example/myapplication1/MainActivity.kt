package com.example.myapplication1

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.content.ContextCompat.startActivity


class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var button : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        button = findViewById(R.id.tv1)
//        button.setOnClickListener(this)
    }

    fun ponedilok(view: View) {
        val intent = Intent(this, Main3Activity::class.java).apply {
        }
        startActivity(intent)
    }

    fun vivtorok(view: View) {  
        val intent = Intent(this, MainActivity2::class.java).apply {
        }
        startActivity(intent)
    }

    fun sereda(view: View) {
        val intent = Intent(this, MainActivity3::class.java).apply {
        }
        startActivity(intent)
    }

    fun chetver(view: View) {
        val intent = Intent(this, MainActivity4::class.java).apply {
        }
        startActivity(intent)
    }

    fun last(view: View) {
        val intent = Intent(this, MainActivity5::class.java).apply {
        }
        startActivity(intent)
    }

    fun time123(view: View) {
        val intent = Intent(this, MainActivity6::class.java).apply {
        }
        startActivity(intent)
    }

    fun notes(view: View) {
        val intent = Intent(this, MainActivity8::class.java).apply {
        }
        startActivity(intent)
    }


    companion object {
        const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }


}












