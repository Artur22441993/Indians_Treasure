package com.isnndai.terreuas;

import android.os.Build;

import androidx.annotation.RequiresApi;

import com.onesignal.OneSignal;

import java.util.Base64;

public class Asas {



    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String ddedea(String jad){


        Base64.Decoder dec = Base64.getDecoder();
        String decoded = new String(dec.decode(jad));

        return decoded;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String prrr(String campaignStr, String getPackageName, String AID, String appsFlyerUID){

        String key;
        String sub6;
        String sub7;
        String sub2;
        String sub3;
        String sub4;
        String sub5;

        String[] str = campaignStr.split("::");
        try {
            key = str[0];
        }catch (Exception e){
            key = "";
        }
        try {
            sub6 = str[1];
        }catch (Exception e){
            sub6 = "";
        }

        try {
            sub7 = str[2];
        }catch (Exception e){
            sub7 = "";

        }

        try {
            sub2 = str[3];
        }catch (Exception e){
            sub2 = "";
        }

        try {
            sub3 = str[4];
        }catch (Exception e){
            sub3 = "";
        }


        try {
            sub4 = str[5];
        }catch (Exception e){
            sub4 = "";
        }

        try {
            sub5 = str[6];
        }catch (Exception e){
            sub5 = "";
        }

        OneSignal.sendTag(ddedea("c3ViX2FwcA=="),sub6);

        String paramsBuild = ddedea("P2J1bmRsZT0=") + getPackageName + ddedea("JmFkX2lkPQ==") + AID + ddedea("JmFwcHNfaWQ9") + appsFlyerUID +
                ddedea("JnN1YjY9") + sub6 +
                ddedea("JnN1Yjc9") + sub7 +
                ddedea("JnN1YjI9") + sub2 +
                ddedea("JnN1YjM9") + sub3 +
                ddedea("JnN1YjQ9") + sub4 +
                ddedea("JnN1YjU9") + sub5 +
                ddedea("JmRldl9rZXk9") + ddedea(Aa.Khdjs) ;

        return  key + paramsBuild;

    }
}
