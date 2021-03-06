package com.zcw.platform.webview;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;

import com.zcw.platform.R;


/**
 * 自定义Webview
 */
public class ZcwWebView extends WebView {
    private Context mContex;
    private ProgressBar webviewProgressbar;

    public ZcwWebView(Context context) {
        super(context);
        this.mContex = context;
        init();
    }

    public ZcwWebView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mContex = context;
        init();
    }

    public ZcwWebView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContex = context;
        init();
    }


    private void init() {
        // ProgressBar
        webviewProgressbar = new ProgressBar(mContex, null, android.R.attr.progressBarStyleHorizontal);
        webviewProgressbar.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, 10, 0, 0));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            webviewProgressbar.setProgressDrawable(getResources().getDrawable(R.drawable.progress_horizontal_holo_light, mContex.getTheme()));
        } else {
            webviewProgressbar.setProgressDrawable(getResources().getDrawable(R.drawable.progress_horizontal_holo_light));
        }
        addView(webviewProgressbar);

        // WebSettings
        WebSettings webSettings = getSettings();
        webSettings.setJavaScriptEnabled(true); //启用JavaScript

        // 自定义Client
        setWebViewClient(new ZcwWebViewClient());
        setWebChromeClient(new ZcwWebChromeClient(webviewProgressbar));
    }
}
