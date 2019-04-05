package dev.android_blog.lovecall

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text1.setOnClickListener {
            text1.isClickable = false
            callToNumber(this, "01012345678")
        }

        text2.setOnClickListener {
            text2.isClickable = false
            callToNumber(this, "01012345678")
        }

        text3.setOnClickListener {
            text3.isClickable = false
            callToNumber(this, "01012345678")
        }

        text4.setOnClickListener {
            text4.isClickable = false
            callToNumber(this, "01012345678")
        }

    }

    override fun onResume() {
        super.onResume()
        text1.isClickable = true
        text2.isClickable = true
        text3.isClickable = true
        text4.isClickable = true
    }
}
