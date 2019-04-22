package com.sandu.kotlinporject.kmvp

/**
 * KotlinPorject
 * @author lizewu
 * @date 2019/4/22
 */
open class FramePresenter<V : Any> {

    protected var v : V? = null

    fun attachView(view : V){
        this.v = view
    }

    fun detachView(){
        this.v = null
    }

}
