package com.sandu.kotlinporject.kentrust

/**
 * KotlinPorject
 * @author lizewu
 * @date 2019/4/25
 */
class EntrustDerivedSuperClass(superInterface: SuperInterface) : SuperInterface by superInterface {

    override var superVar: String = "derived_var"
        get() = field
        set(value) {
            field = value
        }

   /* override fun superFun() {
        Log.i("GG", "Derived_Fun-->$superVar")
    }*/

}