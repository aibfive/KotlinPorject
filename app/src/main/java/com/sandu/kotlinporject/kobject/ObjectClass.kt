package com.sandu.kotlinporject.kobject

import android.util.Log

/**
 * KotlinPorject
 * @author lizewu
 * @date 2019/4/18
 */
class ObjectClass {

    var outerObj = object {
        fun outerObjectFun(){
            Log.i("GG", "outerObjectFun")
        }
    }

    fun objFun(){

    }
}