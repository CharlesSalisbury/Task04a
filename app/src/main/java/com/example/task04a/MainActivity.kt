package com.example.task04a

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Create a new ViewOne object
        val myMainView = ViewOne(this)
// Comment this line out (or better remove it)
// setContentView(R.layout.activity_main)
        setContentView(myMainView)

    }
}
