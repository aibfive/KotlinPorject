package com.sandu.kotlinporject.kentrust

import android.util.Log

/**
 * KotlinPorject
 * @author lizewu
 * @date 2019/4/23
 */
class BaseImple(val x : Int) : Base {

    override val base: Int = x

    override fun print() {
        Log.i("GG", "BaseImple-->print$base")
    }
}