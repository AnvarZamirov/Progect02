package com.example.myapplicatio.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myapplicatio.MainActivity
import com.example.myapplicatio.R
import kotlinx.coroutines.MainScope

class FifthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth)
    }
    fun onClickGoMian(view : View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

}