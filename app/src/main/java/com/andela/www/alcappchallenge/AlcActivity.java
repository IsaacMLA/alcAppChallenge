package com.andela.www.alcappchallenge;

import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AlcActivity extends AppCompatActivity {

    protected WebView webV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alc);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        webV = (WebView) findViewById(R.id.webView);
        webV.getSettings().setJavaScriptEnabled(true);

        webV.setWebViewClient(new WebViewClient(){
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed();
            }
        });
        webV.loadUrl("https://andela.com/alc/");

    }

}
