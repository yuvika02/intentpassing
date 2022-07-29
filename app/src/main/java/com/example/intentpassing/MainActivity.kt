package com.example.intentpassing

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        var dialintent = Intent(Intent.ACTION_MAIN)
        intent.data = Uri.parse("tel:0123456789")
        startActivity(intent)


        var emailintent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse("email: trikhayuvika20@gmail.com")
        startActivity(intent)

        var smsintent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse("sms: hello")
        startActivity(intent)

        var shareintent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse("share: www.google.com")
        startActivity(intent)

        var rateintent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse("Rate: 5")
        startActivity(intent)
    }
}
