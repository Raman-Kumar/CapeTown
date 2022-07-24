package com.example.capetown

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class FragmentHolderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_holder)

        setUpFragment()
    }

    fun setUpFragment(){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_container_view, AFragment.newInstance("empty", "empty"))
            commit()
        }
    }
}