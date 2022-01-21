package com.isnndai.terreuas;

import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.annotation.RequiresApi;

import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.onesignal.OneSignal;

import java.util.Map;



public class Aa extends Application {

    public static String kdnsd;
    public static String kdns = "";
    public static String ljdjA;
    public static String LJds;
    public static final String Khdjs = "ZHNtZ3VydG5qTkgzYVpENlNTdHpxYyA=";
    private static final String Knds = "OGVlM2EwYTctOGVlZS00MTczLTgxNDItYmUyMDA4NGU1YzNk";

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onCreate() {
        super.onCreate();

        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
        OneSignal.initWithContext(getApplicationContext());
        OneSignal.setAppId(Asas.ddedea(Knds));
        AppsFlyerLib.getInstance().init("dsmgurtnjNH3aZD6SStzqc", new AppsFlyerConversionListener() {
            @Override
            public void onConversionDataSuccess(Map<String, Object> map) {
                kdns = map.get(Asas.ddedea("YWZfc3RhdHVz")).toString();
                if (kdns.equals(Asas.ddedea("Tm9uLW9yZ2FuaWM="))){
                    String str =map.get(Asas.ddedea("Y2FtcGFpZ24=")).toString();
                    LJds = Asas.prrr(str,getPackageName(), ljdjA, kdnsd);
                }


            }

            @Override
            public void onConversionDataFail(String s) {
            }

            @Override
            public void onAppOpenAttribution(Map<String, String> map) {
            }

            @Override
            public void onAttributionFailure(String s) {
            }
        }, this);
        AppsFlyerLib.getInstance().start(this);

        kdnsd = AppsFlyerLib.getInstance().getAppsFlyerUID(getApplicationContext());


        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    ljdjA = AdvertisingIdClient.getAdvertisingIdInfo(getApplicationContext()).getId();
                }catch (Exception e){
                }
            }
        }).start();


    }


    public static void hdsk(ProgressBar ksdl, Button ksd, Button lojd, Button kjsdk, Button ljnjd, IT it){

        ksdl.setVisibility(View.INVISIBLE);
        ksd.setVisibility(View.VISIBLE);
        lojd.setVisibility(View.VISIBLE);
        kjsdk.setVisibility(View.VISIBLE);
        ljnjd.setVisibility(View.VISIBLE);

        ksd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                it.startActivity(new Intent(it.getApplicationContext(), MainActivity.class));
            }
        });

        lojd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                it.startActivity(new Intent(it.getApplicationContext(), Pooooliii.class));
            }
        });

        kjsdk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                it.startActivity(new Intent(it.getApplicationContext(), PrivAc.class));
            }
        });

        ljnjd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                it.finishAffinity();
            }
        });
    }


}
