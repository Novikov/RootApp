package com.w.rootapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.w.libraryapp.DataConsumer
import com.w.libraryapp.di.DemoSdkApplication

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        DemoSdkApplication.init(applicationContext)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val formatter = DataConsumer.greetingsFormatter
        Log.i("ASDASDSAD", formatter.sayHiWithName())
    }

    override fun onResume() {
        super.onResume()
        DemoSdkApplication.init(applicationContext)
    }

    override fun onStop() {
        super.onStop()
        DemoSdkApplication.close()
    }
}