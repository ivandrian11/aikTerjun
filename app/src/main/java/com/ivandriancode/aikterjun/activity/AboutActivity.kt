package com.ivandriancode.aikterjun.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ivandriancode.aikterjun.R

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        supportActionBar?.title = "About"
    }
}