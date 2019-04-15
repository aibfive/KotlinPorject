package com.sandu.kotlinporject

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_hello_kotlin.*
import com.sandu.kotlinporject.kextend.*;
/**
 * HelloKotlin
 * @author lizewu
 * @date 2019/3/22
 */
class HelloKotlinActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello_kotlin)
        setOnClickListener()
    }

    /**
     * 设置点击监听器
     */
    fun setOnClickListener(){
        backIv.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            backIv.id -> finish()  //关闭页面
        }
    }
}