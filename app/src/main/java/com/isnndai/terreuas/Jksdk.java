package com.isnndai.terreuas;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;

import com.isnndai.terreuas.IT;

public class Jksdk {
   static String jds;
   static String jdl = "aHR0cHM6Ly9naXN0LmdpdGh1YnVzZXJjb250ZW50LmNvbS9BcnR1cjIyNDQxOTkzLzQ4NmQxZjcxMjViOGVlZTVmZGY5YTRkZWU5YzE2YTQ4L3Jhdy9JbmRpYW5zX1RyZWFzdXJl";
    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String dodk(IT it) throws Exception{

            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(jfj(jdl)).openConnection();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            jds = bufferedReader.readLine();

        return jds;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private static String jfj(String kdis){
        Base64.Decoder irsa = Base64.getDecoder();
        String jhds = new String(irsa.decode(kdis));
        return jhds;
    }
}
