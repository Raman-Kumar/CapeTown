package com.example.capetown

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("lifecycle callbacks ", "onCreate()");
    }

    override fun onStart() {
        super.onStart()
        Log.d("lifecycle callbacks ", "onStart()");
    }

    override fun onResume() {
        super.onResume()
        Log.d("lifecycle callbacks ", "onResume()");
    }

    override fun onPause() {
        super.onPause()
        Log.d("lifecycle callbacks ", "onPause()");
    }

    override fun onStop() {
        super.onStop()
        Log.d("lifecycle callbacks ", "onStop()");
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("lifecycle callbacks ", "onDestroy()");
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("lifecycle callbacks ", "onRestart()");
    }
}