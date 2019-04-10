package com.sandu.kotlinporject

import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.*;
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View

/**
 * KotlinPorject
 * @author lizewu
 * @date 2019/3/22
 */
class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        setOnClickListener()

    }

    /**
     * 设置监听事件
     */
    fun setOnClickListener(){
        helloKotlinTv.setOnClickListener(this)
        variableTv.setOnClickListener(this)
        classTv.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            helloKotlinTv.id -> openHelloKotlinActivity()
            variableTv.id -> openVariableActivity()
            classTv.id -> openClassActivity()
            else -> Log.i("GG", "else");
        }
    }

    /**
     * 打开HelloKolin页面
     */
    fun openHelloKotlinActivity(){
        var intent = Intent()
        intent.setClass(this, HelloKotlinActivity::class.java)
        startActivity(intent)
    }

    /**
     * 打开Variable页面
     */
    fun openVariableActivity(){
        var intent = Intent()
        intent.setClass(this, VariableActivity::class.java)
        startActivity(intent)
    }

    fun openClassActivity(){
        var intent = Intent()
        intent.setClass(this, ClassActivity::class.java)
        startActivity(intent)

    }

}