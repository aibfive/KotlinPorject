package com.sandu.kotlinporject.kdata

import android.util.Log

/**
 * KotlinPorject
 * @author lizewu
 * @date 2019/4/16
 */
data class DataClass(var name : String,  var score : Int) : SuperDataClass(), SuperDataInterface {

    var age : Int = 1

    override fun superDataFun() {
        super.superDataFun()
        Log.i("GG", "DataClass-->superDataFun")
    }

    override fun superDataInterfaceFun() {

    }



}
