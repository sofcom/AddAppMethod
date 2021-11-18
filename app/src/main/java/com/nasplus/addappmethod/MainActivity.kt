package com.nasplus.addappmethod

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCopyContent.setOnClickListener {
            // editContent에 입력한 데이터를 txtInput에 저장함
            val txtInput = edtContent.text.toString()

            // 이 내용을 viewContent.text에 저장함
            viewContent.text = txtInput
        }
    }
}