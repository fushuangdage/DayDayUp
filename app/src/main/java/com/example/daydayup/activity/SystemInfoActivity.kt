package com.example.daydayup.activity

import android.app.ActivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Debug
import com.example.daydayup.R

class SystemInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_system_info)
        var activityManager = getSystemService(ACTIVITY_SERVICE) as (ActivityManager)
        var info = ActivityManager.MemoryInfo()
        activityManager.getMemoryInfo(info)

        var debugInfo = Debug.MemoryInfo()
        Debug.getMemoryInfo(debugInfo)

        println("aaaa")

    }

}