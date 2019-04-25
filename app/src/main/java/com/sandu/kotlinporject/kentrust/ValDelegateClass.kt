package com.sandu.kotlinporject.kentrust

import kotlin.reflect.KProperty

/**
 * KotlinPorject
 * @author lizewu
 * @date 2019/4/25
 */
class ValDelegateClass {

    operator fun getValue(thisRef : Any?, property : KProperty<*>) : String{
        return "get_value"
    }

}