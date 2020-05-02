package com.example.memoapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {
    val MAIN_TAG = "MainActivity Log Tag"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("activity", "oncreate")


        memo_btn.setOnClickListener {
            val nextIntent = Intent(this, CreateActivity::class.java)
            startActivity(nextIntent)
        }


    }

    override fun onResume() {
        super.onResume()
        Log.e(MAIN_TAG, "onResume start")
        val listView = findViewById<ListView>(R.id.memolist)
        val test = ArrayList<String>()
        Log.e(MAIN_TAG, intent.extras.toString())
        if (intent.hasExtra("title")){
            if (test.size == 0){
                test.add(intent.getStringExtra("title"))
            } else {
                test.add(intent.getStringExtra("title"))
            }
        }
        //어댑터 설정
        memolist.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, test)

    }




}
