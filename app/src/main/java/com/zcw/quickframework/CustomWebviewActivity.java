package com.zcw.quickframework;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.zcw.platform.webview.ZcwWebView;

/**
 * Created by KC on 4/11/21
 */
public class CustomWebviewActivity extends AppCompatActivity {
    private static final String ASSET_SCHEME = "file:///android_asset/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.custom_webview);

        ZcwWebView webview = findViewById(R.id.zcwWebview);
        webview.loadUrl("https://www.163.com");

        Button btn = findViewById(R.id.reloadBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                webview.loadUrl(ASSET_SCHEME+"zcw.html");
//                webview.reload();
            }
        });
    }
}
