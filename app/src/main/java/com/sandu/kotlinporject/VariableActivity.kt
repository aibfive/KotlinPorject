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
class VariableActivity : AppCompatActivity(), View.OnClickListener {




    var varValue : String? = "var_value"
        get() {
            return field
        }
        set(value) {
            field = value
        }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_variable)
        backIv.setOnClickListener(this)
        contentTv.text = getContent()
        varValue = null
        Log.i("GG", "varValue-->"+varValue)
    }

    fun getContent() : String{
        var stringBuffer = StringBuffer()
        stringBuffer.appendln(varValue)
        return stringBuffer.toString()
    }

    override fun onClick(v: View) {
        when(v.id){
            backIv.id -> finish()
        }
    }
}