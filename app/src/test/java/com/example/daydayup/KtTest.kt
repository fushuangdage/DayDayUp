package com.example.daydayup

import org.junit.Test
import java.util.*

/**
 * Author: fushuang
 * Date: 2021/1/21 3:07 PM
 * Description:
 * Wiki:
 * History:
 * <author> <time> <version> <desc>
 */

class KtTest {
    @Test
    fun test1(): Unit {
        val interceptor = LinkedList<(Int) -> Int>()

        interceptor.add { a -> 1 }
        interceptor.add { a -> 2 }
        interceptor.add { a -> 3 }


        var iterator = interceptor.iterator()
        while (iterator.hasNext()){
            var next = iterator.next()
            var invoke = next.invoke(1)
            println(invoke)

        }
    }
}