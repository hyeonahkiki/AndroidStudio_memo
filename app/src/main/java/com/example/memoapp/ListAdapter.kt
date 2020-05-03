package com.example.memoapp

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ListAdapter(val context:Context, val memoList:ArrayList<Memo>):BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = LayoutInflater.from(context).inflate(R.layout.item, null)
        val memoTitle = view.findViewById<TextView>(R.id.memo_title)

        val memo = memoList[position]
        memoTitle.text = memo.title
        // 내용확인할때
        Log.e("adapter", memo.title + ", " + memo.content + ", " + memo.date)

        return view
    }

    override fun getItem(position: Int): Any {
        return memoList[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return memoList.size
    }
}