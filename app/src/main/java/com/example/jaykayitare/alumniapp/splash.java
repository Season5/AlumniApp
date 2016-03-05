package com.example.jaykayitare.alumniapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by taifa on 3/5/16.
 */
public class splash extends AppCompatActivity {

    private final int SplashDisplayLength = 1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        /* Handler to start the main activity and
        * close splash screen after a few seconds*/
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Intent that will start the Main Activity
                Intent mainIntent = new Intent(splash.this, Main.class);
                splash.this.startActivity(mainIntent);
                splash.this.finish();
            }
        }, SplashDisplayLength);
    }
}
