package com.example.intentpassing

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var btndial: Button
    lateinit var btnemail:Button
    lateinit var btnshare: Button
    lateinit var btnrate: Button
    lateinit var btnsms: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         btndial = findViewById(R.id.dial)
        btnemail = findViewById(R.id.email)
        btnshare = findViewById(R.id.share)
        btnrate = findViewById(R.id.rate)
        btnsms = findViewById(R.id.sms)



btndial.setOnClickListener {
            var dialintent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:9988422624")
            startActivity(dialintent) }
btnemail.setOnClickListener {
        var emailintent = Intent(Intent.ACTION_SENDTO)
        intent.data = Uri.parse("email: trikhayuvika20@gmail.com")
        startActivity(emailintent) }

btnsms.setOnClickListener {
        var smsintent = Intent(Intent.ACTION_SEND)
        intent.data = Uri.parse("sms: hello")
        startActivity(smsintent) }
btnshare.setOnClickListener {
        var shareintent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse("share: www.google.com")
        startActivity(shareintent) }

btnrate.setOnClickListener {
        var rateintent = Intent(Intent.ACTION_ALL_APPS)
        intent.data = Uri.parse("Rate: 5")
        startActivity(rateintent)
    } }
}
