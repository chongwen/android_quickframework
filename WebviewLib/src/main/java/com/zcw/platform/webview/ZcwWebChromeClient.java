package com.zcw.platform.webview;

import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;

/**
 * 自定义WebChromeClient
 */
public class ZcwWebChromeClient extends WebChromeClient {
    private ProgressBar mProgressbar;

    public ZcwWebChromeClient(ProgressBar progressBar) {
        mProgressbar = progressBar;
    }

    /**
     * 进度条
     *
     * @param view
     * @param newProgress
     */
    @Override
    public void onProgressChanged(WebView view, int newProgress) {
        if (newProgress == 100) {
            mProgressbar.setVisibility(View.INVISIBLE);
        } else {
            mProgressbar.setVisibility(View.VISIBLE);
            mProgressbar.setProgress(newProgress);
        }
    }
}
