package com.leral3.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.leral3.activity.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {

    val binding by lazy {ActivitySubBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.to1.text = intent.getStringExtra("from1")
        binding.to2.text = "${ intent.getIntExtra("from2",0) }"
        binding.to3.text = intent.getStringExtra("from3")

        binding.btnClose.setOnClickListener {
            val returnIntent = Intent()
            returnIntent.putExtra("returnValue", binding.editMessageSub.text.toString())
            setResult(RESULT_OK, returnIntent)
            finish()
        }

    }
}