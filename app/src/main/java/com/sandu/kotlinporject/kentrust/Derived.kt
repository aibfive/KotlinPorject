package com.sandu.kotlinporject.kentrust

import android.util.Log

/**
 * KotlinPorject
 * @author lizewu
 * @date 2019/4/23
 */
class Derived(b : Base) : Base by b{

    override val base: Int
        get() = 100


}