package com.sandu.kotlinporject.kdata

import android.util.Log

/**
 * KotlinPorject
 * @author lizewu
 * @date 2019/4/16
 */
open class SuperDataClass()  {

    open fun superDataFun(){
        Log.i("GG", "SuperDataClass-->superDataFun")
    }

    final override fun hashCode(): Int {
        return 123456
    }

    final override fun toString(): String {
        return "toString"
    }

    open fun component1() : String{
        return "w"
    }

    open fun component2() : Int{
        return 123
    }

}