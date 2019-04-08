package com.sandu.kotlinporject.`class`

/**
 * KotlinPorject
 * @author lizewu
 * @date 2019/4/8
 */
class ClassC : ClassA(), ClassB {

    override fun f() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        super<ClassA>.f()
        super<ClassB>.f()

    }

    override fun b() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }



}