package com.zcw.quickframework;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.zcw.platform.webview.ZcwWebView;

/**
 * Created by KC on 4/11/21
 */
public class CustomWebviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.custom_webview);

        ZcwWebView webview = findViewById(R.id.zcwWebview);
        webview.loadUrl("https://www.163.com");
    }
}
