package com.example.daydayup.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import com.example.daydayup.R
import kotlinx.android.synthetic.main.activity_layout_test.*
import kotlin.reflect.KProperty

class LayoutTestActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout_test)
        tv1.setOnClickListener {
            it.visibility = View.GONE
        }

        tv2.addOnLayoutChangeListener { v, left, top, right, bottom, oldLeft, oldTop, oldRight, oldBottom ->

            Log.d("fs666", "onCreate: ")

        }

        tv2.viewTreeObserver.addOnGlobalLayoutListener {

            Log.d("fs666", "onCreate: ")

        }

        Looper.myQueue().addIdleHandler {
            println("asdf")
            return@addIdleHandler false
        }

    }
}

interface Base {
    fun print()
}

// 实现此接口的被委托的类
class BaseImpl(val x: Int) : Base {
    override fun print() { print(x) }
}

// 通过关键字 by 建立委托类
class Derived(b: Base) : Base by BaseImpl(1)

//fun main(args: Array<String>) {
//    val b = BaseImpl(10)
//    Derived(b).print() // 输出 10
//}

class Example {
    var p: String by Delegate()
}

// 委托的类
class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, 这里委托了 ${property.name} 属性"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$thisRef 的 ${property.name} 属性赋值为 $value")
    }
}
fun main(args: Array<String>) {
    val e = Example()
    println(e.p)     // 访问该属性，调用 getValue() 函数

    e.p = "Runoob"   // 调用 setValue() 函数
    println(e.p)
}