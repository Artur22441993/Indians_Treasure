package com.isnndai.terreuas;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class IT extends AppCompatActivity {

    ProgressBar progressBardadaqeqeol;
    Button bSss,bPppp,bGpp,bCccc;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(1024);
        setContentView(R.layout.it);
        progressBardadaqeqeol = findViewById(R.id.progressBar);
        bSss = findViewById(R.id.bSss);
        bPppp = findViewById(R.id.bPppp);
        bGpp = findViewById(R.id.bGpp);
        bCccc = findViewById(R.id.bCccc);


        if (Pooooliii.dddedededaq(this) == Pooooliii.dddd){

            Conenene conenene = new Conenene(progressBardadaqeqeol,bSss,bPppp,bGpp,bCccc,this);
            conenene.conene();
        }else {
            Aa.hdsk(progressBardadaqeqeol,bSss,bPppp,bGpp,bCccc,this);
        }

    }
}
