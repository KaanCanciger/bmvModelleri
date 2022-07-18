package com.kaancanciger.bmvmodelleri

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var bmvModelleri = ArrayList<String>()
        bmvModelleri.add("e28")
        bmvModelleri.add("e34")
        bmvModelleri.add("e39")
        bmvModelleri.add("e60")
        bmvModelleri.add("f10")



        val e28DrawableId = R.drawable.e28
        val e34DrawableId = R.drawable.e34
        val e39DrawableId = R.drawable.e39
        val e60DrawableId = R.drawable.e60
        val f10DrawableId = R.drawable.f10

        var bmvModelleriDrawableListesi = ArrayList<Int>()
        bmvModelleriDrawableListesi.add(e28DrawableId)
        bmvModelleriDrawableListesi.add(e34DrawableId)
        bmvModelleriDrawableListesi.add(e39DrawableId)
        bmvModelleriDrawableListesi.add(e60DrawableId)
        bmvModelleriDrawableListesi.add(f10DrawableId)


        //Adapter

        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        val adapter = RecyclerAdapter(bmvModelleri,bmvModelleriDrawableListesi)
        recyclerView.adapter = adapter


    }
}