package com.leral3.WidgetsProgressBar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.leral3.WidgetsProgressBar.databinding.ActivityMainBinding
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {

    val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //앱이 실행되고 5초 후에 showProgress(false)를 호출하는 코드를 작성
        //아래와 같이 작성하면 메인 스레드에서 동작을 멈추는 Thread.sleep() 메서드를 호출했기때문에 애뮬레이터에
        //아무것도 보이지 않습니다.

        /* Thread.sleep(5000)
        showProgress(false) */

        thread (start = true){
            Thread.sleep(5000)
            runOnUiThread {
                showProgress(false)
            }
        }

    }

    //클래스 안에 showProgress 메서드를 만들고 리니어 레이아웃을 숨겼다 보였다하는 코드 추가
    fun showProgress(show : Boolean) {
        /* if (show) {
            binding.progressLayout.visibility = View.VISIBLE
        } else {
            binding.progressLayout.visibility = View.GONE
        } */

        //위에 코드를 아래와 같이 줄여서 작성할 수 있습니다.

        binding.progressLayout.visibility = if(show) View.VISIBLE else View.GONE

    }
}