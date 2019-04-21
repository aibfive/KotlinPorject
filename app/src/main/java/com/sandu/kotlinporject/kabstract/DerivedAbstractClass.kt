package com.sandu.kotlinporject.kabstract

import android.view.View
import com.sandu.kotlinporject.kinterface.SuperInterface

/**
 * KotlinPorject
 * @author lizewu
 * @date 2019/4/10
 */
class DerivedAbstractClass()  {

    var doubleObjA : SuperInterface = object : SuperAbstractClass() , SuperInterface{
        override fun superAbstractFun() {

        }

        override fun superInterfaceFun() {

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
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    }

    object ObjA{
        fun objAFun(){

        }
    }

    var ObjB = object{
        fun objBFun(){

        }
    }


}