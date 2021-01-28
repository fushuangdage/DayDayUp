package com.example.daydayup.test

import com.example.daydayup.view.log

/**
 * Author: fushuang
 * Date: 2020/11/11 12:09 PM
 * Description:
 * Wiki:
 * History:
 * <author> <time> <version> <desc>
</desc></version></time></author> */
class Test1:Test(){
    fun test(a:Int): Unit {
        if (a in 3 until  5){
            log("","a")
        }
    }
}