package com.leral3.widgetsradio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.leral3.widgetsradio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.radioGroup.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.radioApple -> binding.tvFruit.text = "사과"

                R.id.radioBanana -> binding.tvFruit.text = "바나나"

                R.id.radioOrange -> binding.tvFruit.text = "오렌지"
           }
        }
    }
}