package com.example.memoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_create.*
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class CreateActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create)
        Log.e("activity", "on createactivity create")

        // 다시쓰기 버튼
        reset_btn.setOnClickListener {

            var toast = Toast.makeText(this, "모든내용이 다 지워집니다.", Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.CENTER_VERTICAL,0,0)
            toast.show()
            content_input.setText("")
            title_input.setText("")
            date_input.setText("")
        }

        // 저장하기 버튼
        save_btn.setOnClickListener {
            Toast.makeText(this, "입력내용이 저장됩니다.", Toast.LENGTH_SHORT).show()
            val msgIntent = Intent(this, MainActivity::class.java)
            // text안써주면 객체 이름이 찍힌다.
            msgIntent.putExtra("title", title_input.text.toString())
            msgIntent.putExtra("content", content_input.text.toString())
            msgIntent.putExtra("date", date_input.text.toString())
            startActivity(msgIntent)
            finish()
        }
    }


}
