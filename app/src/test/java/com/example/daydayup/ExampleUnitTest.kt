package com.example.daydayup

import android.util.Log
import android.view.View
import com.example.daydayup.javatest.bean.Animal
import com.example.daydayup.javatest.bean.Cat
import com.example.daydayup.javatest.bean.Dog
import org.junit.Test

import org.junit.Assert.*
import java.lang.Exception
import kotlin.concurrent.thread

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun invokeTest(): Unit {
        var obj: Animal = Cat()
        test(obj)

        try {
            thread {
                Thread.sleep(10000)
                var a = 1 / 0
            }.start()
        } catch (e: Exception) {
            Log.d("fs666", "invokeTest: ")
            e.printStackTrace()
        }

    }

    fun test(obj: Animal): Unit {
        print("test: ")
    }

    fun test(obj: Cat): Unit {
        print("test:Cat ")
    }

    fun test(obj: Dog): Unit {
        print("test: Dog")
    }

}