package com.sandu.kotlinporject

import android.util.Log

/**
 * KotlinPorject
 * @author lizewu
 * @date 2019/4/9
 */
class DerivedClass : SuperClass {

    constructor(name : String){
        Log.i("GG", "DerivedClass-->constructor(name : String)");
    }

    override fun superA(){
        super.superA()

        Log.i("GG", "superA-->")
    }

}