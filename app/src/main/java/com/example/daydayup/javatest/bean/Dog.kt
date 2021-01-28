package com.example.daydayup.javatest.bean

import android.util.Log

/**
 * Author: fushuang
 * Date: 2020/11/25 5:27 PM
 * Description:
 * Wiki:
 * History:
 * <author> <time> <version> <desc>
 */
class Dog : Animal() {
    override fun say() {
        super.say()
        Log.d("fs666", "say: Dog")
    }
}