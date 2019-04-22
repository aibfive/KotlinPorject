package com.sandu.kotlinporject

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * KotlinPorject
 * @author lizewu
 * @date 2019/4/22
 */
abstract class BaseFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view = inflater.inflate(layoutId(), container, false)
        return view
    }

    abstract fun layoutId() : Int

    open fun initData(){

    }

    open fun initComponent(){

    }



}
