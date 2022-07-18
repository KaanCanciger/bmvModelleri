package com.kaancanciger.bmvmodelleri

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tanitim.*

class TanitimActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tanitim)

        val intent = intent
        val secilenBmvIsmi = intent.getStringExtra("bmvModeliIsmi")
        textView.text = secilenBmvIsmi

        val secilenBmvGorseli = intent.getIntExtra("bmvModeliGorseli",0)
        val bitmap = BitmapFactory.decodeResource(applicationContext.resources,secilenBmvGorseli)
        imageView.setImageBitmap(bitmap)


    }
}