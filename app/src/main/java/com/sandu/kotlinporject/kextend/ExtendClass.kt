package com.sandu.kotlinporject.kextend

import android.util.Log
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView


fun String?.extendFun() : String?{
    if(this == null){
        return this
    }else{
        return "extend_null"
    }
}

fun View?.setWidthAndHeight(width : Int, height : Int){
    if(this == null){
        return
    }
    var params = this.layoutParams
    params.width = width
    params.height = height
    this.layoutParams = params
}


var View.leftMargin : Int
    get() {
        var params = this.layoutParams as LinearLayout.LayoutParams
        return params.leftMargin
    }
    set(value) {
        var params = this.layoutParams as LinearLayout.LayoutParams
        params.leftMargin = value
        this.layoutParams = params
    }

/**
 * 扩展类
 * @author lizewu
 * @date 2019/4/11
 */
class ExtendClass {

    fun String.funA(){
    }

    fun funExtend() : String{
        "".funA()
        return "originalFun"
    }

}
