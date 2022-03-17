package com.example.h5p;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView MyWebView = (WebView)findViewById(R.id.webview);

        MyWebView.getSettings().setJavaScriptEnabled(true);

        MyWebView.getSettings().setAllowFileAccess(true);
        MyWebView.getSettings().setAllowContentAccess(true);
        MyWebView.getSettings().setAllowFileAccessFromFileURLs(true);
        MyWebView.getSettings().setAllowUniversalAccessFromFileURLs(true);

        MyWebView.getSettings().setDomStorageEnabled(true);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            WebView.setWebContentsDebuggingEnabled(true);
        }

        MyWebView.loadUrl("file:///android_asset/www/index.html");
    }
}