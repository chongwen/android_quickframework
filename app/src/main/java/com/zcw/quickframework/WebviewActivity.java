package com.zcw.quickframework;

import android.os.Bundle;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

import com.zcw.platform.webview.ZcwWebView;

/**
 * Created by KC on 4/11/21
 */
public class WebviewActivity extends AppCompatActivity {
    private static final String TAG = WebviewActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.webview);

        ZcwWebView webview = findViewById(R.id.syswebview);
//        webview.setWebViewClient(new WebViewClient() {
//            @Override
//            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
//                Log.d(TAG, "url = " + request.getUrl());
//                return false;
//            }
//        });

        webview.loadUrl("file:///android_asset/zcw.html");
    }
}
