package com.sandu.kotlinporject

import android.util.Log

/**
 * KotlinPorject
 * @author lizewu
 * @date 2019/4/9
 */
open class SuperClass{

    constructor(name : String){
        Log.i("GG", "SuperClass-->constructor(name : String)");
    }

    constructor(){
        Log.i("GG", "SuperClass-->constructor()");
    }

    open fun superA(){

    }
}