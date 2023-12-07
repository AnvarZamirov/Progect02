package com.example.myapplicatio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.myapplicatio.home.SecondActivity

class MainActivity :  AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun onClickGoMian(view : View) {
        val intent = Intent(this,SecondActivity::class.java)
        startActivity(intent)
    }

    }

