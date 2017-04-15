package com.esaathi.ui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.esaathi.R;

import im.delight.android.webview.AdvancedWebView;

public class SellActivity extends AppCompatActivity implements AdvancedWebView.Listener {

    private AdvancedWebView mWebView;
    private ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell);
        mWebView = (AdvancedWebView) findViewById(R.id.form);
        mWebView.setListener(this, this);
        mWebView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSfPHYGiiRZHob_Oqj8UG36o8B1cnnei980yesFxERvFxTM-9A/viewform?c=0&w=1");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(getApplicationContext(), AgeGroupActivity.class));
        overridePendingTransition(R.anim.push_left_in, R.anim.push_right_out);
        finish();
    }

    @Override
    public void onPageStarted(String url, Bitmap favicon) {
        dialog = ProgressDialog.show(this, "", "कृपया प्रतीक्षा करें!...", true);
    }

    @Override
    public void onPageFinished(String url) {
        if (dialog != null)
            dialog.dismiss();
    }

    @Override
    public void onPageError(int errorCode, String description, String failingUrl) {

    }

    @Override
    public void onDownloadRequested(String url, String suggestedFilename, String mimeType, long contentLength, String contentDisposition, String userAgent) {

    }

    @Override
    public void onExternalPageRequest(String url) {

    }
}
