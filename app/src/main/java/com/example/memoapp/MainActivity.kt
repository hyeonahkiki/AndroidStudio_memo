package com.example.memoapp

import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 다시쓰기 버튼
        reset_btn.setOnClickListener {

            var toast = Toast.makeText(this, "모든내용이 다 지워집니다.", Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.CENTER_VERTICAL,0,0)
            toast.show()
            content_input.setText("")
            title_input.setText("")
            data_input.setText("")
        }

        // 저장하기 버튼
        save_btn.setOnClickListener {
            Toast.makeText(this, "입력내용이 저장됩니다.", Toast.LENGTH_SHORT).show()
        }
    }
}
