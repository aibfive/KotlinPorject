package com.sandu.kotlinporject.kmvp

import com.sandu.kotlinporject.BaseFragment
import java.util.ArrayList

/**
 * KotlinPorject
 * @author lizewu
 * @date 2019/4/22
 */
abstract class MvpFragment : BaseFragment() {

    var presenters : ArrayList<FramePresenter<Any>>

    init {
        presenters = ArrayList()
    }



    fun addPresenter(presenter : FramePresenter<Any>){
        presenter.attachView(this)
        presenters.add(presenter)
    }

    override fun onDestroyView() {
        val iterator : Iterator<FramePresenter<Any>> = presenters.iterator()
        while (iterator.hasNext()){
            val presenter : FramePresenter<Any> = iterator.next()
            presenter.detachView()
        }
        super.onDestroyView()
    }

}
