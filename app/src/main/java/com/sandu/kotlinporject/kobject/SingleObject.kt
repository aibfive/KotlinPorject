package com.sandu.kotlinporject.kobject

import android.util.Log
import android.view.View

/**
 * KotlinPorject
 * @author lizewu
 * @date 2019/4/23
 */
object SingleObject : SuperClass(){

    val name = ""

    fun singleFun(){
        Log.i("GG", "singleFun")
    }

    override fun superClassFun() {
        super.superClassFun()
    }
}