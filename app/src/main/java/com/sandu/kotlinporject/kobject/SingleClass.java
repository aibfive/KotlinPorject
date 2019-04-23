package com.sandu.kotlinporject.kobject;

import android.util.Log;

/**
 * KotlinPorject
 *
 * @author lizewu
 * @date 2019/4/23
 */
public class SingleClass {

    public static final SingleClass INSTANCE;

    public final void singleFun() {
        Log.i("GG", "singleFun");
    }

    static {
        SingleClass var0 = new SingleClass();
        INSTANCE = var0;
    }

}
