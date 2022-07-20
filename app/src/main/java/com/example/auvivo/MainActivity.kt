package com.example.auvivo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var Buttoncar:Button ?=null
    var Buttonpent:Button ?=null
    var ButtonTech:Button ?=null
    var ButtonAccounts:Button ?=null
    var Buttonintent:Button ?=null
    var ButtonWeb:Button ?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Buttoncar = findViewById(R.id.btn_car)
        Buttonpent = findViewById(R.id.btn_pent)
        ButtonAccounts = findViewById(R.id.btn_accounts)
        ButtonTech = findViewById(R.id.btn_auvivo)
        Buttonintent = findViewById(R.id.btn_intent)
        ButtonWeb = findViewById(R.id.btn_web)

        Buttoncar!!.setOnClickListener {
            val car = Intent(this, CarCollection::class.java)
            startActivity(car)
        }
        Buttonpent!!.setOnClickListener {
            val penthouse = Intent(this, Penthouse::class.java)
            startActivity(penthouse)
        }
        ButtonAccounts!!.setOnClickListener {
            val accounts = Intent(this, Accounts::class.java)
            startActivity(accounts)
        }
        ButtonTech!!.setOnClickListener {
            val tech = Intent(this, TechHub::class.java)
            startActivity(tech)
        }
        Buttonintent!!.setOnClickListener {
            val intent = Intent(this, com.example.auvivo.intent::class.java)
            startActivity(intent)
        }
        ButtonWeb!!.setOnClickListener {
            val webview = Intent(this, web::class.java)
            startActivity(webview)
        }
    }  }