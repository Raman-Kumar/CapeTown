package com.example.capetown

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.example.capetown.databinding.ActivityMainBinding
import com.example.capetown.databinding.FragmentBottomDialogListDialogBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // button on click takes to Second Activity
        findViewById<Button>(R.id.button).setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java);
            startActivity(intent);
        }

        // button takes to fragment holder activity
        findViewById<Button>(R.id.button_fragment_holder).setOnClickListener{
            val intent = Intent(this, FragmentHolderActivity::class.java);
            startActivity(intent);
        }

//        val intent = Intent(this, SecondActivity::class.java);
//        startActivity(intent);


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