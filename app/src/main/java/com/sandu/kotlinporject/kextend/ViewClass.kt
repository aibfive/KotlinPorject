package com.sandu.kotlinporject.kextend

import android.util.Log
import android.view.View
import android.widget.TextView

fun View.extendFun(){
    Log.i("GG", "View-->extendFun")
}

fun TextView.extendFun(){
    Log.i("GG", "TextView-->extendFun")
}
