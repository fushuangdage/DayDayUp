package com.example.daydayup.view

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.view.animation.Interpolator
import android.widget.OverScroller
import android.widget.TextView
import com.example.daydayup.util.simpleLogMethod
import java.util.logging.Handler

/**
 * Author: fushuang
 * Date: 2020/11/29 8:52 PM
 * Description:
 * Wiki:
 * History:
 * <author> <time> <version> <desc>
 */

class CusTextview : androidx.appcompat.widget.AppCompatTextView {


    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        simpleLogMethod(" onTouchEvent ")
        return true
    }

    override fun dispatchTouchEvent(event: MotionEvent?): Boolean {
        simpleLogMethod("dispatchTouchEvent")
        return super.dispatchTouchEvent(event)
    }


    override fun draw(canvas: Canvas?) {
        super.draw(canvas)
        Log.d("fs66666", "draw: ")
    }

}