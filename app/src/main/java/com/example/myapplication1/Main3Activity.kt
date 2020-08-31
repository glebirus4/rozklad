package com.example.myapplication1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.myapplication1.MainActivity.Companion.EXTRA_MESSAGE

class Main3Activity : AppCompatActivity() {
//ponedilok
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main3)

    // Get the Intent that started this activity and extract the string
 //   val message = intent.getStringExtra(EXTRA_MESSAGE)

    // Capture the layout's TextView and set the string as its text
   // val textView = findViewById<TextView>(R.id.textView).apply {
      //  text = message
    }
}
//}
