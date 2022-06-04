package com.example.pr_11_gladunov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
    fun onClick(view: View){
        val intent = Intent(this, MainActivity3::class.java)
        startActivity(intent)
    }
    fun ONCLICK(view: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }


}