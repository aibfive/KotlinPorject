package com.sandu.kotlinporject.kobject

import android.util.Log

/**
 * KotlinPorject
 * @author lizewu
 * @date 2019/4/19
 */
class CompanionNameClass {

    companion object CompanionName{
        fun companionNameFun(){
            Log.i("GG", "伴生对象名")
        }
    }

}