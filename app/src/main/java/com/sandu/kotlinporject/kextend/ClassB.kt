package com.sandu.kotlinporject.kextend

import android.util.Log

fun ClassB.funExtend(){
    Log.i("GG", "funExtend-->ClassB")
}

/**
 * KotlinPorject
 * @author lizewu
 * @date 2019/4/12
 */
class ClassB() : ClassA() {

    override fun funA() {
        Log.i("GG", "classB")
    }

}