package com.example.daydayup.test

/**
 * Author: fushuang
 * Date: 2020/11/25 3:32 PM
 * Description:
 * Wiki:
 * History:
 * <author> <time> <version> <desc>
 */
 class Feed(){
    var name: String="2"
    var age:Int=1
}

class User(val map: HashMap<String,Any>) {

    val name: String by map

    val age: Int by map

}