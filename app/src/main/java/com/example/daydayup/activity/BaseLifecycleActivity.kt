package com.example.daydayup.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.daydayup.util.simpleLogMethod

/**
 * Author: fushuang
 * Date: 2021/1/21 11:27 AM
 * Description:
 * Wiki:
 * History:
 * <author> <time> <version> <desc>
 */

open class BaseLifecycleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        simpleLogMethod("")
    }

    override fun onStart() {
        super.onStart()
        simpleLogMethod("")

    }

    override fun onResume() {
        super.onResume()
        simpleLogMethod("")

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        simpleLogMethod("")

    }

    override fun onPause() {
        super.onPause()
        simpleLogMethod("")

    }

    override fun onStop() {
        super.onStop()
        simpleLogMethod("")

    }

    override fun onDestroy() {
        super.onDestroy()
        simpleLogMethod("")

    }

}