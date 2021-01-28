package com.example.daydayup.activity

import android.content.ComponentName
import android.content.Intent
import android.content.ServiceConnection
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.IBinder
import android.view.View
import com.example.daydayup.service.MyService
import com.example.daydayup.R
import com.example.daydayup.util.simpleLogMethod

class LifeCyclerLogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cycler_log)
        window.decorView.findViewById<View>(R.id.container).setOnClickListener {
//            startActivity(Intent(this,LifeCyclerLogActivity::class.java))
            bindService(Intent(this, MyService::class.java),object : ServiceConnection{
                override fun onServiceDisconnected(name: ComponentName?) {

                }

                override fun onServiceConnected(name: ComponentName?, service: IBinder?) {
                }

            },100)
        }

        simpleLogMethod("onCreate")
    }

    override fun onStart() {
        super.onStart()
        simpleLogMethod("onStart")
    }

    override fun onResume() {
        super.onResume()
        simpleLogMethod("onResume")
    }

    override fun onRestart() {
        super.onRestart()

        simpleLogMethod("onRestart")
    }

    override fun onPause() {
        super.onPause()
        simpleLogMethod("onPause")
    }

    override fun onStop() {
        super.onStop()
        simpleLogMethod("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        simpleLogMethod("onDestroy")
    }


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        simpleLogMethod("onSaveInstanceState")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        simpleLogMethod("onRestoreInstanceState")
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        simpleLogMethod("onNewIntent")
    }
}