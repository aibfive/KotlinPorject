package com.sandu.kotlinporject

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.sandu.kotlinporject.kentrust.TestEntrustClass
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


    }

    fun setOnClickListener(){
        backIv.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            backIv.id -> {
                finish()
            }
        }
    }

}
