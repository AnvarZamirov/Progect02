package com.example.myapplicatio.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myapplicatio.R

class fourthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)
    }
    fun onClickGoMian(view: View) {
        val intent = Intent(this, FifthActivity::class.java)
        startActivity(intent)
    }
}