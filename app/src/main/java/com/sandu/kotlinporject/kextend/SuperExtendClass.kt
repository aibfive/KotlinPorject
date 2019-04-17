package com.sandu.kotlinporject.kextend

import android.util.Log


/**
 * KotlinPorject
 * @author lizewu
 * @date 2019/4/12
 */
class SuperExtendClass {

    fun String.extendFun(){
        Log.i("GG", "SuperExtendClass-->extendFun")
    }

    fun call(){
        "".extendFun()
    }

}