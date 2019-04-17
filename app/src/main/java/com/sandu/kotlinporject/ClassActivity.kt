package com.sandu.kotlinporject

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import android.view.ViewGroup
import com.sandu.kotlinporject.inner.OuterClass
import com.sandu.kotlinporject.kabstract.SuperAbstractClass
import com.sandu.kotlinporject.kdata.DataClass
import com.sandu.kotlinporject.kdata.SuperDataClass
import com.sandu.kotlinporject.kextend.SuperExtendClass
import com.sandu.kotlinporject.kinterface.SuperInterface
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
        /*when(v.id){
            backIv.id -> {
                finish()
            }
        }*/
    }

}
