package com.example.ktc

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class observerfactory (var cnt:Int):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
    return observer(cnt) as T
    }
}