package com.example.daydayup.view

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.view.TouchDelegate
import android.widget.Button
import com.example.daydayup.util.simpleLogMethod

/**
 * Author: fushuang
 * Date: 2020/12/8 7:57 PM
 * Description:
 * Wiki:
 * History:
 * <author> <time> <version> <desc>
 */
class CusButton :androidx.appcompat.widget.AppCompatButton{

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )


    override fun onTouchEvent(event: MotionEvent?): Boolean {
        simpleLogMethod("onTouchEvent")
        return false
    }

    override fun dispatchTouchEvent(event: MotionEvent?): Boolean {
        simpleLogMethod("dispatchTouchEvent")
        parent.requestDisallowInterceptTouchEvent(true)
        parent.parent.requestDisallowInterceptTouchEvent(true)
        return super.dispatchTouchEvent(event)
    }
}