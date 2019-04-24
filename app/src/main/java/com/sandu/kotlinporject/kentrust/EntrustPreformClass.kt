package com.sandu.kotlinporject.kentrust

import android.util.Log

/**
 * KotlinPorject
 * @author lizewu
 * @date 2019/4/23
 */
class EntrustPreformClass {

    fun perform(){
        var entrustDerivedClass1 = EntrustDerivedClass1()
        var entrustDerivedClass2 = EntrustDerivedClass2(entrustDerivedClass1)

        entrustDerivedClass1.printFun()
        entrustDerivedClass1.entrustDerivedClass1Fun()

        Log.i("GG", "age-->${entrustDerivedClass2.age}")
        entrustDerivedClass2.printFun()
        entrustDerivedClass2.age = 200
        entrustDerivedClass2.printFun()
    }



}