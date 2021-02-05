package com.example.daydayup.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Looper
import android.util.Log
import com.example.daydayup.R
import com.example.daydayup.util.simpleLogMethod
import io.reactivex.rxjava3.core.Flowable
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.core.Scheduler
import io.reactivex.rxjava3.functions.Consumer
import io.reactivex.rxjava3.schedulers.Schedulers

class CommonTestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_common_test)
        rxJavaTest()
        Looper.myQueue().addIdleHandler {
            simpleLogMethod("IdleHandler666 run")
            return@addIdleHandler true
        }
    }

    private fun rxJavaTest() {
        Flowable.just("Hello world").subscribe(System.out::println)
        Observable.create<Int> {
            it.onNext(66)
        }
            .map {
                simpleLogMethod("map1： ${Thread.currentThread().name}")
                return@map it.toString() + "1"
            }
//            .subscribeOn(Schedulers.io())
            .map {
                simpleLogMethod("map2： ${Thread.currentThread().name}")
                return@map it.toString() + "2"
            }
            .subscribe {
                println("hello world")
            }
    }


}