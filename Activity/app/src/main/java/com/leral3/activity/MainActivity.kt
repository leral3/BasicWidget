package com.leral3.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import com.leral3.activity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val activityResult = registerForActivityResult(ActivityResultContracts. StartActivityForResult()) {
            if(it.resultCode == RESULT_OK) {
                val message = it.data?.getStringExtra("returnValue")
                Toast.makeText(this, message, Toast.LENGTH_LONG).show()
            }
        }

        var a = SubActivity::class.java

        binding.btnStart.setOnClickListener {
            val intent = Intent(this, a)
            intent.putExtra("from1", "Hello Bundle")
            intent.putExtra("from2", 2022)
            intent.putExtra("from3", binding.editMessage.text.toString())

            activityResult.launch(intent)
        }


    }
}