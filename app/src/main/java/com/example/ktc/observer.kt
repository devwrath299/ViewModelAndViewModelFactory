package com.example.ktc

import androidx.lifecycle.ViewModel

class observer(var cnt:Int) : ViewModel(){

    fun fn()
    {
        cnt++
    }

}