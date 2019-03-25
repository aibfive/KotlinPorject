package com.sandu.kotlinporject

import android.os.Bundle
import android.support.annotation.IntegerRes
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_variable.*

/**
 * 变量Activity
 * @author lizewu
 * @date 2019/3/25
 */
class VariableActivity : AppCompatActivity(), View.OnClickListener{

   val valValue : String = "valValue"
        /*get() {
            return field
        }*/
        get() = field.toUpperCase()

    var varValue : String = "varValue"
        get() {
            Log.i("GG", "Get")
            return field
        }
        set(value) = if(varValue.equals(varValue)){
            Log.i("GG", "Set")
            field = "hhhhh"
        }else{
            Log.i("GG", "Set")
            field = "hhhhh"

        }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_variable)
        backIv.setOnClickListener(this)

        contentTv.text = getContent()
    }

    fun getContent() : String{
        var stringBuffer = StringBuffer()
        stringBuffer.appendln("valValue-->"+valValue)
        stringBuffer.appendln("varValue-->"+varValue)
        return stringBuffer.toString()
    }

    override fun onClick(v: View) {
        when(v.id){
            backIv.id -> finish()
        }
    }
}