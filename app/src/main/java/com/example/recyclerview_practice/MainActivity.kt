package com.example.recyclerview_practice

import android.app.PendingIntent.getActivity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var nameList = arrayListOf<Name>(
        Name("이승욱",""),
        Name("이승욱",""),
        Name("이승욱",""),
        Name("이승욱",""),
        Name("이승욱",""),
        Name("이승욱","")
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val mAdaper = MainAdapter(this, nameList)
        recycerview.adapter = mAdaper


        val lm = LinearLayoutManager(this)
        recycerview.layoutManager = lm
        recycerview.setHasFixedSize(true)
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recycerview.setLayoutManager(layoutManager)
    }
}
