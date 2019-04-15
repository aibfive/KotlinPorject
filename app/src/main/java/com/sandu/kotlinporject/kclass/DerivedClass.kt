package com.sandu.kotlinporject.kclass

import android.util.Log
import android.widget.TextView

/**
 * KotlinPorject
 * @author lizewu
 * @date 2019/4/9
 */
class DerivedClass() : SuperClass() {

    override fun funSuper() {
        Log.i("GG", "DerivedClass-->funSuper")
    }

    fun TextView.on(){
        this.left

    }}