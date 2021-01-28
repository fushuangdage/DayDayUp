package com.example.daydayup.util

import android.app.Activity
import android.content.Context
import android.os.Build
import android.os.Debug
import android.os.Environment
import android.util.Log
import androidx.annotation.RequiresApi
import java.io.File
import java.io.FileInputStream
import java.io.FileReader
import java.security.Permission
import java.util.jar.Manifest

/**
 * Author: fushuang
 * Date: 2020/12/8 8:14 PM
 * Description:
 * Wiki:
 * History:
 * <author> <time> <version> <desc>
 */


fun Any.simpleLogMethod(string: String): Unit {
    var stackTrace = Thread.currentThread().stackTrace
    var targetIndex=0
    for ((i,stackTraceElement)in stackTrace.withIndex()) {
        if (stackTraceElement.methodName == "simpleLogMethod") {
            targetIndex=i+1
        }
    }
    var stackTraceElement = stackTrace[targetIndex]
    println("fs666888 ${this.javaClass.simpleName} # ${stackTraceElement.methodName} ")
}

@RequiresApi(Build.VERSION_CODES.M)
fun Activity.requestPer() {
    this.requestPermissions(
        arrayOf(
            android.Manifest.permission.WRITE_EXTERNAL_STORAGE,
            android.Manifest.permission.READ_EXTERNAL_STORAGE
        ), 100
    )
}

@RequiresApi(Build.VERSION_CODES.KITKAT)
fun Context.dumpHprof() {

    var cacheDir = this.externalCacheDir
    var cacheDir1 = Environment.getExternalStorageDirectory()

    var file = File(cacheDir1!!.absolutePath, "daydayup_${System.currentTimeMillis()}.hprof")
    Debug.dumpHprofData(file.absolutePath)

//    var fileInputStream = FileReader(file)

//    var byteArray = ByteArray(1024)
//    while (fileInputStream.read(byteArray)!=-1){
//        String()
//    }
}