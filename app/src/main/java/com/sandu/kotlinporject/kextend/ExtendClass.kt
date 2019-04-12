package com.sandu.kotlinporject.kextend


fun String?.extendFun() : String?{
    if(this == null){
        return this
    }else{
        return "extend_null"
    }
}

/**
 * 扩展类
 * @author lizewu
 * @date 2019/4/11
 */
class ExtendClass {

    fun performFun(){
        "name".extendFun()

        var nullStr : String? = null

        nullStr.extendFun()

    }

    fun String.subIndexOf(index : Int) : String{
        toUpperCase()
        if(this == null){
            return this
        }else{
            return this.subIndexOf(index)
        }
    }


}
