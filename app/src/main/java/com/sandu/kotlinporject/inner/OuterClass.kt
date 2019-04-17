package com.sandu.kotlinporject.inner

import android.util.Log
import android.view.View
import com.sandu.kotlinporject.kextend.SuperExtendClass

/**
 * KotlinPorject
 * @author lizewu
 * @date 2019/4/17
 */
open class OuterClass {

    var outer : String = "outer"

    fun setInnerClass(inner : SuperExtendClass){
        InnerClass().innerFun()
        NestedClass().nestedFun()
    }

    open inner class InnerClass{
        open fun innerFun(){
            Log.i("GG", "outer-->$outer")
        }
    }



    class NestedClass{
        fun nestedFun(){

        }
    }

}