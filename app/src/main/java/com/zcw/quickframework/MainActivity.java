package com.zcw.quickframework;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Created by KC on 4/11/21
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.btnWebview);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), WebviewActivity.class);
                startActivity(intent);
            }
        });

//        ZcwWebview webview = findViewById(R.id.zcwWebview);
//        webview.loadUrl("https://www.163.com");
    }
}
