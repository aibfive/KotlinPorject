package com.sandu.kotlinporject.kentrust

import android.util.Log

/**
 * KotlinPorject
 * @author lizewu
 * @date 2019/4/25
 */
class TestEntrustClass {

    fun testEntrustFun(){
        var derivedSuperClass = DerivedSuperClass()
        var entrustDerivedSuperClass = EntrustDerivedSuperClass(derivedSuperClass)
        Log.i("GG", "DerivedSuperClass-var-->"+derivedSuperClass.superVar)
        Log.i("GG", "EntrustDerivedSuperClass-var-->"+entrustDerivedSuperClass.superVar)
        derivedSuperClass.superFun()
        entrustDerivedSuperClass.superFun()
    }

}