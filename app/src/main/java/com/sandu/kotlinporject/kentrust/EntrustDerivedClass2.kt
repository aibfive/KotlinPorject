package com.sandu.kotlinporject.kentrust

import android.util.Log

/**
 * KotlinPorject
 * @author lizewu
 * @date 2019/4/24
 */
class EntrustDerivedClass2(entrustInterface: EntrustInterface) : EntrustInterface by entrustInterface {

    override var age: Int = 100
        get() = field
        set(value) {
            field = value
        }

    /*override fun printFun() {
        Log.i("GG", "age-->$age")
    }*/

    /*fun entrustDerivedClass2Fun(){
        Log.i("GG", "EntrustDerivedClass2")
    }*/

}