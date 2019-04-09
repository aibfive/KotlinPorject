package com.sandu.kotlinporject

import android.content.Context
import android.support.annotation.RequiresApi
import android.util.AttributeSet
import android.widget.FrameLayout

/**
 * KotlinPorject
 * @author lizewu
 * @date 2019/4/9
 */
class ViewClass : FrameLayout {

    constructor(context: Context) : super(context, null)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    @RequiresApi(21)
    public constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) : super(context, attrs, defStyleAttr, defStyleRes)
}