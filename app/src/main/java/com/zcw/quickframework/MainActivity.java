package com.zcw.quickframework;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.zcw.platform.webview.ZcwWebview;

/**
 * Created by KC on 4/11/21
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ZcwWebview webview = findViewById(R.id.edxWebview);
        webview.loadUrl("https://www.baidu.com");
    }
}
