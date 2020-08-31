package com.example.myapplication1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.myapplication1.MainActivity.Companion.EXTRA_MESSAGE

class Main3Activity : AppCompatActivity() {
//ponedilok
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main3)
    }

    fun time123(view: View) {
        val intent = Intent(this, MainActivity6::class.java).apply {
        }
        startActivity(intent)
    }
}
//}
