package com.sandu.kotlinporject.kentrust

import android.util.Log
import kotlin.reflect.KCallable
import kotlin.reflect.KProperty

/**
 * KotlinPorject
 * @author lizewu
 * @date 2019/4/25
 */
class VarDelegateClass {

    operator fun getValue(classType : Any?, propertyType : KProperty<*>) : String {
        return "classType-->$classType, property-->$propertyType, propertyName-->${propertyType.name}"
    }

    operator fun setValue(classType : Any?, propertyType: kotlin.reflect.KProperty<*>, value : String) {
        Log.i("GG",  "classType-->$classType, property-->$propertyType, propertyName-->${propertyType.name}, value-->$value")
    }

}