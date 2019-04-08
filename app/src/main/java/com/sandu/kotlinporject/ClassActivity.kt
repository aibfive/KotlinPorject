package com.sandu.kotlinporject

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.view.inputmethod.InputMethodManager
import com.sandu.kotlinporject.`class`.ConstructorClass
import com.sandu.kotlinporject.`class`.NullBodyClass
import kotlinx.android.synthetic.main.activity_class.*

/**
 * KotlinPorject
 * @author lizewu
 * @date 2019/4/8
 */
class ClassActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class)
        setOnClickListener()
        executeNullBodyClass()
        executeConstructorClass()

        var inputService: InputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager


        var f : Float = 1.0f

        var i : Int = f as Int
    }

    fun setOnClickListener(){
        backIv.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            backIv.id -> finish()
        }
    }

    fun executeNullBodyClass(){
        var nullBodyClass = NullBodyClass()
    }

    fun executeConstructorClass(){
        var constructorClass = ConstructorClass()
    }
}