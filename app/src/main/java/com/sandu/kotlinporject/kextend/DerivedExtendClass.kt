package com.sandu.kotlinporject.kextend

import android.util.Log

/**
 * KotlinPorject
 * @author lizewu
 * @date 2019/4/12
 */
class DerivedExtendClass() : SuperExtendClass(){

    override fun String.extendFun() {
        Log.i("GG", "DerivedExtendClass-->extendFun")
    }

    fun performExtendFun(){
        "".extendFun()
    }

}