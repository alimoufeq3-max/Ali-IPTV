package com.ali.iptv

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val textView = TextView(this).apply {
            text = "مرحباً بك في Ali IPTV"
            textSize = 24f
            setPadding(60, 60, 60, 60)
        }

        setContentView(textView)
    }
}
