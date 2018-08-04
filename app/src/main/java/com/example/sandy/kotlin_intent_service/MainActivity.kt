package com.example.sandy.kotlin_intent_service

import android.content.Intent
import android.content.IntentFilter
import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.net.URL

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener({

            var i = Intent(this,MyIntentService::class.java)
            startService(i)

        })

        var filter = IntentFilter( )
        filter.addAction("iservice_task_done")
        registerReceiver(MyReceiver(imageView),filter)
    }
}
