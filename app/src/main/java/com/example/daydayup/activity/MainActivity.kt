package com.example.daydayup.activity

import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.animation.Interpolator
import android.widget.OverScroller
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.daydayup.R
import com.example.daydayup.util.dumpHprof
import com.example.daydayup.view.RvAdapter

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var recyclerView: RecyclerView
    private lateinit var scroller: OverScroller

    val sQuinticInterpolator =
        Interpolator { t ->
            var t = t
            t -= 1.0f
            t * t * t * t * t + 1.0f
        }


    override fun onResume() {
        super.onResume()
        val s =
            "https://api.udache.com/gulfstream/pre-sale/v1/other/pGetSceneList?access_key_id=2&userlng=116.1111&access_key_id=2"

        var replace = s.replace(Regex("&userlng=([^&]+)&"), "&").replace(Regex("access_key_id=([^&]+)&"), "")

        Log.d("fs66666", "onResume: $replace")

    }

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val scroller = OverScroller(this, sQuinticInterpolator)
        window.decorView
        recyclerView = findViewById(R.id.recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = RvAdapter()
        recyclerView.setOnScrollChangeListener({ v, scrollX, scrollY, oldScrollX, _ ->

        })

        recyclerView.addOnScrollListener(object : RecyclerView.OnScrollListener() {

            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                super.onScrollStateChanged(recyclerView, newState)
                Log.d("fs6668888", "onScrollStateChanged: $newState")
            }
        })


        recyclerView.setOnClickListener(this)
        findViewById<View>(R.id.tv).setOnClickListener(this)


        //


    }


    var lastScrollY = 0

    override fun onClick(v: View?) {

        dumpHprof()
//        scroller = OverScroller(this, sQuinticInterpolator)
//
//        recyclerView.run {
////            scroller.startScroll(0, this.computeVerticalScrollOffset(), 0, -this.computeVerticalScrollOffset()-500,2000)
//            this.smoothScrollBy(0, -1000)
////            scroller.startScroll(
////                0,
////                this.computeVerticalScrollOffset(),
////                0,
////                -this.computeVerticalScrollOffset()-measuredHeight,
////                1000
////            )
////            lastScrollY = scroller.currY
////
////            while (scroller.computeScrollOffset()) {
////
////                Log.d("fs888", "onClick: ${scroller.currY}")
////                var dY = lastScrollY - scroller.currY
////                lastScrollY = dY
////                Log.d(
////                    "fs666",
////                    "computeScroll: $dY   :   scroller.currY ${scroller.currY} "
////                )
////                var consumed = intArrayOf(0, 0)
////                var offsetInWindow = intArrayOf(0, 0)
////                recyclerView?.dispatchNestedPreScroll(
////                    0, dY,
////                    consumed, offsetInWindow, ViewCompat.TYPE_TOUCH
////                )
////            }
//        }
//
//
//        while (!scroller.isFinished) {
//            scroller.computeScrollOffset()
//            Log.d("TAG", "fs6666 :  " + scroller.currY)
//        }


//        Log.d("fs68888888", "onClick: ")

    }
}