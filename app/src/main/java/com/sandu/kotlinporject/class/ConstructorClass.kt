package com.sandu.kotlinporject.`class`

import android.util.Log

/**
 * KotlinPorject
 * @author lizewu
 * @date 2019/4/8
 */
class ConstructorClass constructor(){

    init {
        Log.i("GG", "init")
    }

    constructor(name: String) : this(){
        Log.i("GG", "constructor(name: String)")
    }

    constructor(name: String, age: Int) : this(name){
        Log.i("GG", "constructor(name: String, age: Int)")
    }

}
