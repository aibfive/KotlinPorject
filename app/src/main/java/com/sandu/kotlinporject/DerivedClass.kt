package com.sandu.kotlinporject

/**
 * KotlinPorject
 * @author lizewu
 * @date 2019/4/9
 */
class DerivedClass() : SuperClass() {

    override var name: String
        get() = super.name
        set(value) {}

}