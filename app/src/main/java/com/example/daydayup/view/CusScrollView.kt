package com.example.daydayup.view

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import androidx.core.widget.NestedScrollView
import com.example.daydayup.util.simpleLogMethod

/**
 * Author: fushuang
 * Date: 2020/12/8 6:02 PM
 * Description:
 * Wiki:
 * History:
 * <author> <time> <version> <desc>
 */
class CusScrollView :NestedScrollView{
    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

    override fun onTouchEvent(ev: MotionEvent?): Boolean {
        Log.d("fs666", "onTouchEvent: ")
        return super.onTouchEvent(ev)
    }

    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        Log.d("fs666", "dispatchTouchEvent: ")
        return super.dispatchTouchEvent(ev)
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        simpleLogMethod(
            "onMeasure() called with: widthMeasureSpec = $widthMeasureSpec, heightMeasureSpec = $heightMeasureSpec"
        )
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
    }

}