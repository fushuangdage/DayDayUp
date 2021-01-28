package com.example.daydayup.activity

import android.graphics.Rect
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.TouchDelegate
import androidx.appcompat.app.AppCompatActivity
import com.example.daydayup.R
import kotlinx.android.synthetic.main.activity_scroll_view.*
import java.util.concurrent.ArrayBlockingQueue
import java.util.concurrent.ThreadPoolExecutor
import java.util.concurrent.TimeUnit
import java.util.concurrent.locks.ReentrantLock

class ScrollViewActivity : AppCompatActivity {
    constructor() : super() {
        Log.d("fs66666", ": ")
        Handler().sendEmptyMessage(1)
    }


    var lock = ReentrantLock()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scroll_view)
        button1.touchDelegate = TouchDelegate(Rect(0, 0, 300, 300), button2)
//        button1.dis
        var threadPoolExecutor = ThreadPoolExecutor(
            4, 8, 60, TimeUnit.SECONDS,
            ArrayBlockingQueue(10)
        )


        for (j in 1..14) {
            threadPoolExecutor.execute {
                lock.lock()
                Log.d("fs668866", "onCreate:  : $j")
                Thread.sleep(2500000)
                lock.unlock()
            }
//            Thread.sleep(1000)
        }

    }

    override fun onDestroy() {
        button2.text = "11"
        super.onDestroy()
    }
}