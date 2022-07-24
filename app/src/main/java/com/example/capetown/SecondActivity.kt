package com.example.capetown

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Log.d("lifecycle callbacks  ", " B onCreate()")

    }

    public fun showDialog(view : View) {
        val newFragment: StartGameDialogFragment = StartGameDialogFragment()
        newFragment.show(supportFragmentManager, "tag")

//        BottomDialogFragment.newInstance(30).show(supportFragmentManager, "dialog")
    }

    override fun onStart() {
        super.onStart()
        Log.d("lifecycle callbacks", " B onStart()");
    }

    override fun onResume() {
        super.onResume()
        Log.d("lifecycle callbacks ", " B onResume()");
    }

    override fun onPause() {
        super.onPause()
        Log.d("lifecycle callbacks ", " B onPause()");
    }

    override fun onStop() {
        super.onStop()
        Log.d("lifecycle callbacks ", " B onStop()");
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("lifecycle callbacks ", " B onDestroy()");
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("lifecycle callbacks ", " B onRestart()");
    }
}