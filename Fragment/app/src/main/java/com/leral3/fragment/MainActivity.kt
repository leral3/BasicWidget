package com.leral3.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.leral3.ListFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setFragment()
    }

    fun setFragment() {
        /*val listFragment: ListFragment = ListFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.frameLayout, listFragment)
        transaction.commit()*/
    }
}