package com.example.myapplication1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

lateinit var button : Button
class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main8)
    }
    fun onClick(view: View?) {
        when(view?.id){
            R.id.tv1->{
                val webpage: Uri = Uri.parse("https://pidruchnyk.com.ua/432-storya-ukrayini-pometun-gupan-10-klas.html")
                val intent = Intent(Intent.ACTION_VIEW, webpage)
                if (intent.resolveActivity(packageManager) != null) {
                    startActivity(intent)
                }}
        } }

    fun onClick1(view: View?) {
        when(view?.id){
            R.id.tv2->{
                val webpage: Uri = Uri.parse("https://pidruchnyk.com.ua/447-ekonomka-radonova-11-klas.html")
                val intent = Intent(Intent.ACTION_VIEW, webpage)
                if (intent.resolveActivity(packageManager) != null) {
                    startActivity(intent)
                }}
        }}
}