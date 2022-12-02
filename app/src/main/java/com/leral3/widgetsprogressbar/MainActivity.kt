package com.leral3.widgetsprogressbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.leral3.widgetsprogressbar.databinding.ActivityMainBinding
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {

    val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        thread(start = true) {
            Thread.sleep(3000)
            runOnUiThread {
                showProgress(false)
            }
        }

    }

    // 클래스 안에 showProgress 메서드를 만들고 리니어 레이아웃을 숨겼다 보였다 할 수 있는 코드 추가

    fun showProgress (show:Boolean) {
        /* if (show) {
            binding.progressLayout.visibility = View.VISIBLE
        } else {
            binding.progressLayout.visibility = View.GONE
        } */

        binding.progressLayout.visibility = if (show) View.VISIBLE else View.GONE
    }
}