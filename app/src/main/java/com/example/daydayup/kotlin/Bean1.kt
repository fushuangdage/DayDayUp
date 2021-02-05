package com.example.daydayup.kotlin

/**
 * Author: fushuang
 * Date: 2021/1/29 9:04 PM
 * Description:
 * Wiki:
 * History:
 * <author> <time> <version> <desc>
 */

class Bean1 {
    var value = 1
    var next: Bean2? = null
}

class Bean2 {
    var value = 2

    var next: Bean3? = null

}

class Bean3 {
    var value = 3

    var next: Bean1? = null

}