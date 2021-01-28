package com.example.daydayup.activity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.daydayup.R
import com.example.daydayup.fragment.LifecycleFragment1
import com.example.daydayup.fragment.LifecycleFragment2
import com.example.daydayup.ms.Test
import com.example.daydayup.util.simpleLogMethod
import kotlinx.android.synthetic.main.activity_fragment_test.*

class FragmentTestActivity : BaseLifecycleActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_test)

        if (savedInstanceState == null) {
            var lifecycleFragment1 = LifecycleFragment1()
            var lifecycleFragment2 = LifecycleFragment2()

            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, lifecycleFragment1, "fragment1").add(
                    R.id.fragment_container,
                    lifecycleFragment2, "fragment2"
                ).commit()

            btn1.setOnClickListener {
                supportFragmentManager.beginTransaction()
                    .show(lifecycleFragment1).hide(lifecycleFragment2).commit()

            }

            btn2.setOnClickListener {
                supportFragmentManager.beginTransaction()
                    .show(lifecycleFragment2).hide(lifecycleFragment1).commit()
            }

            btn3.setOnClickListener {
                supportFragmentManager.beginTransaction().addToBackStack("myStack").replace(R.id.fragment_container,lifecycleFragment1).commit()
            }

            btn4.setOnClickListener {
                supportFragmentManager.beginTransaction().addToBackStack("myStack").replace(R.id.fragment_container,lifecycleFragment2).commit()

            }
        }

    }
}