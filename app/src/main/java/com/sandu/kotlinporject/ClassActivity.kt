package com.sandu.kotlinporject

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.sandu.kotlinporject.kextend.ClassA
import com.sandu.kotlinporject.kextend.ClassB
import com.sandu.kotlinporject.kextend.funExtend
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

        performFun(ClassA())
        performFun(ClassB())

        performExtendFun(ClassA())
        performExtendFun(ClassB())
    }

    fun performExtendFun(cls : ClassA){
        cls.funExtend()
    }

    fun performFun(cls : ClassA){
        cls.funA()
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
