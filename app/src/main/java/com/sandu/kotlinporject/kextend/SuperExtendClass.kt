package com.sandu.kotlinporject.kextend

import android.util.Log


/**
 * KotlinPorject
 * @author lizewu
 * @date 2019/4/12
 */
abstract class SuperExtendClass {

    open fun String.extendFun(){
        Log.i("GG", "SuperExtendClass-->extendFun")
    }

    open fun call(){
        "".extendFun()
    }

}