package com.example.memoapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {
    val MAIN_TAG = "MainActivity Log Tag"
    // 데이터 클래스 적용하고 사용하기
//    val memoList = arrayListOf<Memo>(
////
//    )

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
//        val title = ArrayList<String>()


        if (intent.hasExtra("title") && intent.hasExtra("content") && intent.hasExtra("date")){
            memoList.add(Memo(intent.getStringExtra("title"), intent.getStringExtra("content"), intent.getStringExtra("date")))
        }


        val memoadapter = ListAdapter(this,memoList)
        listView.adapter = memoadapter


//        Log.e(MAIN_TAG, intent.extras.toString())
//        if (intent.hasExtra("title")){
//            title.add(intent.getStringExtra("title")) }
//        //어댑터 설정
//        listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, title)


        // 아이템에 이벤트 만들기
//        listView.setOnItemClickListener { parent, view, position, id ->
//            val element = listView.adapter.getItem(position) // The item that was clicked
//            Log.e("view", element.toString())
//            val intent = Intent(this, CreateActivity::class.java)
//            startActivity(intent)
//        }


    }




}
