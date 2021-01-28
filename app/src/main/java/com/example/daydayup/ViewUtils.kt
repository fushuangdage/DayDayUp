//package com.example.daydayup
//
//import android.util.Log
//import android.view.View
//import com.didichuxing.dfbasesdk.utils.UIHandler
//
///**
// * Author: fushuang
// * Date: 2021/1/12 4:14 PM
// * Description:
// * Wiki:
// * History:
// * <author> <time> <version> <desc>
// */
//
//interface ViewRelayoutListener : View.OnLayoutChangeListener, Runnable {
//
//
//
//    override fun onLayoutChange(
//        v: View?,
//        left: Int,
//        top: Int,
//        right: Int,
//        bottom: Int,
//        oldLeft: Int,
//        oldTop: Int,
//        oldRight: Int,
//        oldBottom: Int
//    ) {
//
//        UIHandler.removeCallbacks(this)
//        UIHandler.postDelayed(100,this)
//    }
//
//    override fun run() {
//        layoutFinalChange()
//    }
//
//    fun layoutFinalChange()
//
//}
//
//fun View.addViewReLayoutListener(listener: ViewRelayoutListener) {
//
//    this.addOnLayoutChangeListener(listener)
//
//
//}
//
//fun View.removeViewReLayoutListener(listener: ViewRelayoutListener) {
//
//    this.removeOnLayoutChangeListener(listener)
//
//
//}