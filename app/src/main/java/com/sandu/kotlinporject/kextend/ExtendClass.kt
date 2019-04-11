package com.sandu.kotlinporject.kextend

import android.util.Log

/**
 * 扩展类
 * @author lizewu
 * @date 2019/4/11
 */
class ExtendClass {

    var leng : Int = "name".length()


    var String?.name : String
        get() {
            return this.name
        }
        set(value) {
            this.plus(value)
            Log.i("GG", "name-->$value")
        }


    fun String?.length() : Int{
        if(this == null){
            return 0
        }else {
            return this.length
        }
    }

    fun test(){

        Log.i("GG", "proprietary-->"+null.name)
        Log.i("GG", "proprietary-->"+"name".name)
        null.name = "dss"
    }

}