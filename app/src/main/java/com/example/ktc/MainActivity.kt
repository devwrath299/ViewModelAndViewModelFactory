package com.example.ktc

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    lateinit var texts:TextView
    lateinit var observ: observer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        observ=ViewModelProvider(this,observerfactory(4)).get(observer::class.java)
        texts=findViewById(R.id.tns)
        setText()
    }

    fun fn(v:View)
    {
        observ.fn()
        setText()
    }

    private fun setText() {
       texts.text=observ.cnt.toString()
    }

}