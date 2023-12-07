package com.example.myapplicatio.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myapplicatio.MainActivity
import com.example.myapplicatio.R

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
    }
    fun onClickGoMian(view : View) {
        val intent = Intent(this, fourthActivity::class.java)
        startActivity(intent)
    }
}