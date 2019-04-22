package com.sandu.kotlinporject.kmvp

/**
 * KotlinPorject
 * @author lizewu
 * @date 2019/4/22
 */
interface FrameV2P {

    interface View{
        fun frameSuccess()
        fun frameFailed();
    }

    abstract class Presenter : FramePresenter<View>(){
        abstract fun frame()
    }

}