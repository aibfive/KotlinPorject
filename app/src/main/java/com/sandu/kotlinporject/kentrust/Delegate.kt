package com.sandu.kotlinporject.kentrust

import android.util.Log
import kotlin.reflect.KProperty

/**
 * KotlinPorject
 * @author lizewu
 * @date 2019/4/24
 */
class Delegate {

    operator fun getValue(age : Any, name: KProperty<*>) : String{
        Log.i("GG", "getValue")
        return "!"
    }

    operator fun setValue(age : Any, name : KProperty<*>, value : String){
        Log.i("GG", "setValue")
    }

}