package com.sandu.kotlinporject.kextend

import android.util.Log

fun ClassA.funExtend(){
    Log.i("GG", "funExtend-->ClassA")
}


/**
 * KotlinPorject
 * @author lizewu
 * @date 2019/4/12
 */
open class ClassA {

    open fun funA(){
        Log.i("GG", "classA")
    }

}