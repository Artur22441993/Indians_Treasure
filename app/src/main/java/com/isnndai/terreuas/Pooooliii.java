package com.isnndai.terreuas;

import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.webkit.WebView;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Base64;



public class Pooooliii extends AppCompatActivity {

    WebView wePollll;
    String lfl = "aHR0cHM6Ly93d3cucHJpdmFjeXBvbGljeW9ubGluZS5jb20vbGl2ZS5waHA/dG9rZW49TEd1aTF6T040ZTloNUc4d2cxMEdVY0VIekc2dG5NUEc=";
    public static int dddd = 0;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(1024);
        setContentView(R.layout.pooooliii);
        wePollll = findViewById(R.id.wePollll);
        Base64.Decoder ksas = Base64.getDecoder();
        String kjsai = new String(ksas.decode(lfl));
        wePollll.loadUrl(kjsai);
    }

    public static int dddedededaq(IT it){
        int jddus = Settings.Secure.getInt(it.getContentResolver(),
                Settings.Global.DEVELOPMENT_SETTINGS_ENABLED , 0);
        return jddus;

    }
}
