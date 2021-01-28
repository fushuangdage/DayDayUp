package com.example.daydayup.view

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import androidx.recyclerview.widget.RecyclerView

/**
 * Author: fushuang
 * Date: 2020/11/10 1:57 PM
 * Description:
 * Wiki:
 * History:
 * <author> <time> <version> <desc>
</desc></version></time></author> */
class CusRecyclerView : RecyclerView {
    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet?, defStyle: Int) : super(
        context,
        attrs,
        defStyle
    )

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        log("CusRecyclerView ---- ","$measuredHeight")
        var hMode = heightMeasureSpec.getMeasureMode()
        var wMode = widthMeasureSpec.getMeasureMode()

        var hSize = heightMeasureSpec.getMeasureSize()
        var wSize = widthMeasureSpec.getMeasureSize()


        setMeasuredDimension(wSize,Math.min(1000,measuredHeight))
        log("CusRecyclerView ---- ","$measuredHeight")


        log("CusRecyclerView-fs6666","width mode : $wMode, width $wSize -------  height mode : $hMode, height : $hSize")


    }

    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {
        super.onLayout(changed, l, t, r, b)
        Log.d("CusRecyclerView -----", "onLayout() called with: changed = $changed, l = $l, t = $t, r = $r, b = $b")

    }
}