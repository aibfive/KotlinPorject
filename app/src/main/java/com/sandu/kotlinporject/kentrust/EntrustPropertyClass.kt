package com.sandu.kotlinporject.kentrust

import android.util.Log
import kotlin.properties.Delegates

/**
 * KotlinPorject
 * @author lizewu
 * @date 2019/4/25
 */
class EntrustPropertyClass(var map : Map<String, Int>) {

    val valEntrust : String by ValDelegateClass()

    var varEntrust : String by VarDelegateClass()

    val valLazy : Long by lazy(LazyThreadSafetyMode.PUBLICATION) {
        Log.i("GG", "akdkaslgh")
        122L
    }

    var name: String by Delegates.observable("demo",{
        kProperty , oldName , newName->
        if(name.equals(oldName)){
            Log.i("GG", "想通了")
        }else {
            Log.i("GG", "kProperty：${kProperty.name}| oldName:$oldName| newName:$newName")
        }
    })

    var name1 : String by Delegates.vetoable("demo", {
        kProperty, oldName, newName ->
        if(oldName.equals(newName)){
            //Log.i("GG", "相同了")
            true
        }else{
            //Log.i("GG", "kProperty：${kProperty.name}| oldName:$oldName| newName:$newName")
            false
        }
    })

     var name2 : String by Delegates.notNull<String>()

    val map1 : Int by map
    val map2 : Int by map

}
