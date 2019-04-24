package com.sandu.kotlinporject.kentrust

import android.util.Log

/**
 * KotlinPorject
 * @author lizewu
 * @date 2019/4/24
 */
class EntrustDerivedClass1 : EntrustInterface {

    override var age: Int = 1
        get() = field
    set(value) {
        field = value
    }

    override fun printFun() {
        Log.i("GG", "age-->$age")
    }

    fun entrustDerivedClass1Fun(){
        Log.i("GG", "EntrustDerivedClass1")
    }

}