package com.sandu.kotlinporject.kextend

import android.util.Log

fun String.extendFun(){

}

val String.extendVar
    get() = "extendVar"


class ExtendClass() {

    fun extendFun(){

        Log.i("GG", "extendVar-->"+"".extendVar)

    }

}
