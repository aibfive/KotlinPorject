package com.sandu.kotlinporject.kabstract

import com.sandu.kotlinporject.kinterface.SuperInterface

/**
 * KotlinPorject
 * @author lizewu
 * @date 2019/4/10
 */
class DerivedAbstractClass()  {

    /*interface SuperInterface1{
        fun superInterface1()
    }

    var doubleObjA : SuperAbstractClass = object : SuperAbstractClass() , SuperInterface, SuperInterface1{
        override fun superAbstractFun() {

        }

        override fun superInterfaceFun() {

        }

        override fun superInterface1() {

        }
    }

    object doubleObjB : SuperAbstractClass() , SuperInterface{
        override fun superAbstractFun() {

        }

        override fun superInterfaceFun() {

        }
    }

    var obj = object : View.OnClickListener{
        override fun onClick(p0: View?) {

        }
    }

    object ObjA{
        fun objAFun(){
        }
    }*/

    object doubleObjB : SuperAbstractClass() , SuperInterface {
        override fun superAbstractFun() {

        }

        override fun superInterfaceFun() {

        }
    }

    companion object {
        fun companionObjectFun(){

        }
    }

    /*companion object{
        fun companionObjectFun(){

        }
    }*/

    /*public var ObjA = object{
        fun aaaaaaa(){

        }
    }

    private var ObjB : Any = object{
        fun bbbbbb(){

        }
    }*/

    /*fun derivedAbstractFun(){
        ObjB.bbbbbb()
    }*/

}
