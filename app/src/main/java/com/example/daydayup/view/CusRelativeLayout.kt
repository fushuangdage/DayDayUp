package com.example.daydayup.view

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.widget.RelativeLayout

/**
 * Author: fushuang
 * Date: 2020/11/7 5:23 PM
 * Description:
 * Wiki:
 * History:
 * <author> <time> <version> <desc>
 */

class CusRelativeLayout : RelativeLayout {


    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {

        var hMode = heightMeasureSpec.getMeasureMode()
        var wMode = widthMeasureSpec.getMeasureMode()

        var hSize = heightMeasureSpec.getMeasureSize()
        var wSize = widthMeasureSpec.getMeasureSize()

        log("fs6666","width mode : $wMode, width $wSize -------  height mode : $hMode, height : $hSize")

        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

        var min = hSize.coerceAtMost(measuredHeight)

        log("fs8888","measureWidth : $measuredWidth ,  measuredHeight : $measuredHeight")


    }

    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {
        super.onLayout(changed, l, t, r, b)

    }

}