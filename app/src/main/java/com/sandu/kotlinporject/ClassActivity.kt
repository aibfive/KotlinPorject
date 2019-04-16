package com.sandu.kotlinporject

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import com.sandu.kotlinporject.kdata.DataClass
import com.sandu.kotlinporject.kdata.SuperDataClass
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
        /*var data = DataClass("name", 100)
        //data.superDataFun()
        Log.i("GG", "component1-->"+data.component1())
        Log.i("GG", "component2-->"+data.component2())*/
        var user = UserDto("Hai", 123)
        Log.i("GG", "component1-->"+user.toString())
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
