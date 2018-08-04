package com.example.sandy.kotlin_intent_service

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.ImageView

class MyReceiver(var iview: ImageView):BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {

        iview.setImageBitmap(bmp)
    }
}