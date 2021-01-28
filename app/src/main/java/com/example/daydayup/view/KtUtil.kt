package com.example.daydayup.view

import android.util.Log
import android.view.View

/**
 * Author: fushuang
 * Date: 2020/11/7 5:25 PM
 * Description:
 * Wiki:
 * History:
 * <author> <time> <version> <desc>
 */

fun Int.getMeasureMode(): String {
    var mode = View.MeasureSpec.getMode(this)

    return when (mode) {
        View.MeasureSpec.AT_MOST -> "AT_MOST"
        View.MeasureSpec.UNSPECIFIED -> "UNSPECIFIED"
        View.MeasureSpec.EXACTLY -> "EXACTLY"
        else -> "UNKNOW"
    }
}

fun Int.getMeasureSize(): Int {
    return View.MeasureSpec.getSize(this)
}

fun log(tag:String,msg:String){
    Log.d(tag, msg)
}