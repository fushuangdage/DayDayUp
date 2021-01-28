package com.example.daydayup.service

import android.app.Service
import android.content.Intent
import android.os.Binder
import android.os.IBinder
import android.util.Log
import com.example.daydayup.util.simpleLogMethod

class MyService : Service() {

    override fun onBind(intent: Intent): IBinder {
        simpleLogMethod("onBind")
        return Binder()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        simpleLogMethod("onStartCommand")
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onUnbind(intent: Intent?): Boolean {
        simpleLogMethod("onUnbind")
        return super.onUnbind(intent)
    }

    override fun onCreate() {
        super.onCreate()
        simpleLogMethod("onCreate")
    }

    override fun onDestroy() {
        super.onDestroy()
        simpleLogMethod("onDestroy")
    }


}
