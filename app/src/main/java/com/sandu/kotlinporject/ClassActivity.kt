package com.sandu.kotlinporject

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import com.sandu.kotlinporject.kextend.ExtendClass
import kotlinx.android.synthetic.main.activity_class.*

/**
 * KotlinPorject
 * @author lizewu
 * @date 2019/4/8
 */
open class ClassActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class)
        setOnClickListener()

        var extend = ExtendClass()
        //Log.i("GG", "extend-->"+extend.leng)
        extend.test()
    }

    fun setOnClickListener(){
        backIv.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            backIv.id -> finish()
        }
    }

}