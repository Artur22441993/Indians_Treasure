package com.isnndai.terreuas;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Base64;


public class Offerrrreews extends AppCompatActivity {

    WebView webfjdsl;
    public ValueCallback<Uri> eee;
    public Uri kdsj = null;
    public ValueCallback<Uri[]> kds;
    public String kksd;
    public static final int lkdsk = 1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(1024);
        setContentView(R.layout.offferrrweq);
        webfjdsl = findViewById(R.id.webfjdsl);
        sydk();

        String hfdk =getIntent().getStringExtra("sdwq");
        Log.d("wwwww",hfdk);
        webfjdsl.loadUrl(hfdk);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode != lkdsk || kds == null) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        Uri[] results = null;
        if (resultCode == Activity.RESULT_OK) {
            if (data == null) {
                if (kksd != null) {
                    results = new Uri[]{Uri.parse(kksd)};
                }
            } else {
                String dataString = data.getDataString();
                if (dataString != null) {
                    results = new Uri[]{Uri.parse(dataString)};
                }
            }
        }
        kds.onReceiveValue(results);
        kds = null;

        if (eee == null) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        Uri result = null;
        try {
            if (resultCode != RESULT_OK) {
                result = null;
            } else {
                result = data == null ? kdsj : data.getData();
            }
        } catch (Exception e) { }
        eee.onReceiveValue(result);
        eee = null;
    }

    @Override
    public void onBackPressed() {
        if (webfjdsl.isFocused() && webfjdsl.canGoBack()) {
            webfjdsl.goBack();
        }
    }

    private void sydk(){

        CookieManager.getInstance().setAcceptThirdPartyCookies(webfjdsl, true);
        CookieManager.getInstance().setAcceptCookie(true);
        webfjdsl.getSettings().setAllowFileAccessFromFileURLs(true);
        webfjdsl.getSettings().setSavePassword(true);
        webfjdsl.getSettings().setDatabaseEnabled(true);
        webfjdsl.getSettings().setRenderPriority(android.webkit.WebSettings.RenderPriority.HIGH);
        webfjdsl.getSettings().setCacheMode(android.webkit.WebSettings.LOAD_DEFAULT);
        webfjdsl.getSettings().setAppCacheEnabled(true);
        webfjdsl.getSettings().setLoadsImagesAutomatically(true);
        webfjdsl.setSaveEnabled(true);
        webfjdsl.getSettings().setMixedContentMode(0);
        webfjdsl.setFocusable(true);
        webfjdsl.getSettings().setAllowUniversalAccessFromFileURLs(true);
        webfjdsl.getSettings().setJavaScriptEnabled(true);
        webfjdsl.getSettings().setAllowContentAccess(true);
        webfjdsl.getSettings().setLoadWithOverviewMode(true);
        webfjdsl.getSettings().setEnableSmoothTransition(true);
        webfjdsl.getSettings().setUseWideViewPort(true);
        webfjdsl.getSettings().setSaveFormData(true);
        webfjdsl.getSettings().setAllowFileAccess(true);
        webfjdsl.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webfjdsl.getSettings().setDomStorageEnabled(true);
        webfjdsl.setFocusableInTouchMode(true);
        webfjdsl.setWebViewClient(new WebClient());
        webfjdsl.setWebChromeClient(new WebChrome());
    }


    private class WebClient extends WebViewClient{

        @RequiresApi(api = Build.VERSION_CODES.O)
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            if(url.contains(kfl("NDA0"))){
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                finishAffinity();
            }
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);

            new Thread(new Runnable() {
                @Override
                public void run() {
                    E e = new E(url);
                    Fase.databaseddddd.daoDdd().insert(e);
                }
            }).start();
        }
    }


    private class WebChrome extends WebChromeClient{

        @RequiresApi(api = Build.VERSION_CODES.O)
        @Override
        public boolean onShowFileChooser(WebView view,
                                         ValueCallback<Uri[]> filePath,
                                         FileChooserParams fileChooserParams) {
            if (kds != null) {
                kds.onReceiveValue(null);
            }
            kds = filePath;
            Intent contentSelectionIntent = new Intent(Intent.ACTION_GET_CONTENT);
            contentSelectionIntent.addCategory(Intent.CATEGORY_OPENABLE);
            contentSelectionIntent.setType("*/*");
            Intent[] intentArray = new Intent[0];
            Intent chooserIntent = new Intent(Intent.ACTION_CHOOSER);
            chooserIntent.putExtra(Intent.EXTRA_INTENT, contentSelectionIntent);
            chooserIntent.putExtra(Intent.EXTRA_TITLE, kfl("U2VsZWN0IE9wdGlvbjo="));
            chooserIntent.putExtra(Intent.EXTRA_INITIAL_INTENTS, intentArray);
            startActivityForResult(chooserIntent, 1);
            return true;
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private String kfl(String kdm){
        Base64.Decoder kdsj = Base64.getDecoder();
        String kdns = new String(kdsj.decode(kdm));
        return kdns;
    }



}
