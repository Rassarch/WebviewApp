package com.example.webviewapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Cari view berdasarkan id dan dimasukkan ke variabel
        val main_webview: WebView = findViewById(R.id.main_webview)

        // Membuat webview client, fungsinya biar dibuka di app
        // bukan di browser
        main_webview.webViewClient = WebViewClient()

        //mengatur setting webview, menghidupkan javascript
        main_webview.settings.javaScriptEnabled = true


        // Mendefiniskasn url
        main_webview.loadUrl("https://www.itemku.com")

        // Membaca tombol kembali

    }
}