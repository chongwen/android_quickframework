package com.zcw.quickframework;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.zcw.platform.webview.ZcwWebView;

/**
 * Created by KC on 4/11/21
 */
public class WebviewActivity extends AppCompatActivity {
    private static final String TAG = WebviewActivity.class.getSimpleName();
    WebView webview;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.webview);

        WebView webview = findViewById(R.id.syswebview);
//        webview.setWebViewClient(new WebViewClient() {
//            @Override
//            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
//                Log.d(TAG, "url = " + request.getUrl());
//                return false;
//            }
//        });

        webview.loadUrl("https://www.qq.com");

        btn = findViewById(R.id.reloadBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                webview.loadUrl("https://www.163.com");
//                webview.reload();
            }
        });
    }
}
