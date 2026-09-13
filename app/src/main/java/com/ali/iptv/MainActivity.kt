package com.ali.iptv

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val textView = TextView(this)
        textView.text = "مرحباً بك في Ali IPTV"
        textView.textSize = 26f
        textView.setPadding(100, 100, 100, 100)

        setContentView(textView)
    }
}
