package com.example.sandy.kotlin_intent_service

import android.app.IntentService
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import java.net.URL

var bmp: Bitmap? = null

class MyIntentService:IntentService("") {
    override fun onHandleIntent(intent: Intent?) {


        var url = URL("https://i.pinimg.com/originals/f9/c7/07/f9c707de781a8fbb45bc7f2ac56106ff.jpg")
        var isr =  url.openStream()
        bmp = BitmapFactory.decodeStream(isr)

        var i = Intent( )
        i.setAction("iservice_task_done")
        sendBroadcast(i)

    }
}