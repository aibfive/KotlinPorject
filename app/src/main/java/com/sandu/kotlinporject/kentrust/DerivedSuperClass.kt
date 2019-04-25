package com.sandu.kotlinporject.kentrust

import android.util.Log

/**
 * KotlinPorject
 * @author lizewu
 * @date 2019/4/25
 */
class DerivedSuperClass : SuperInterface {

    override var superVar: String = "super_var"
        get() = field
        set(value) {
            field = value
        }

    override fun superFun() {
        Log.i("GG", "Super_Fun-->$superVar")
    }

}
