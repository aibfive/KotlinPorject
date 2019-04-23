package com.sandu.kotlinporject.kentrust

import android.util.Log

/**
 * KotlinPorject
 * @author lizewu
 * @date 2019/4/23
 */
class EntrustClass {

    fun perform(){
        var baseImple = BaseImple(10)
        baseImple.print()
        Derived(baseImple).print()
        Log.i("GG", "base-->"+Derived(baseImple).base)
    }

}