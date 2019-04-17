package com.sandu.kotlinporject

/**
 * KotlinPorject
 *
 * @author lizewu
 * @date 2019/4/16
 */
class UserDto(var name : String, var age : Int) {

    operator fun component1() : String{
        return name
    }

    operator fun component2() : Int{
        return age
    }

    operator fun component3() : Float{
        return 1.0F
    }

    operator fun component4() : Char{
        return 'c'
    }

}
