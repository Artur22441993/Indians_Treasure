package com.isnndai.terreuas;

import android.os.Build;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.annotation.RequiresApi;

public class Conenene {
    ProgressBar progressBardadaqeqeol;
    Button bSss,bPppp,bGpp,bCccc;
    IT it;

    public Conenene(ProgressBar progressBardadaqeqeol, Button bSss, Button bPppp, Button bGpp, Button bCccc, IT it) {
        this.progressBardadaqeqeol = progressBardadaqeqeol;
        this.bSss = bSss;
        this.bPppp = bPppp;
        this.bGpp = bGpp;
        this.bCccc = bCccc;
        this.it = it;
    }

    public void conene(){
        new Thread(new Runnable() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void run() {
                try {
                    String sas = Jksdk.dodk(it);
                    String[] ds = sas.split("\\\u007C");
                    String url = ds[0];
                    String keyDefault = ds[1];
                    String fbId = ds[2];
                    it.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Fase fase = new Fase(url,keyDefault,fbId,it);
                            fase.setbSss(bSss);
                            fase.setbPppp(bPppp);
                            fase.setbGpp(bGpp);
                            fase.setbCccc(bCccc);
                            fase.setProgressBardadaqeqeol(progressBardadaqeqeol);
                            fase.fasss();
                        }
                    });


                }catch (Exception e){
                    Aa.hdsk(progressBardadaqeqeol,bSss,bPppp,bGpp,bCccc,it);
                }

            }
        }).start();


    }
}
