package com.example.jaykayitare.alumniapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;
import android.widget.TextView;

/**
 * Created by jaykayitare on 3/5/16.
 */
public class Splash extends AppCompatActivity {

    ProgressBar progressBar;
    int progressStatus = 0;
    TextView textView;
    Handler handler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        textView = (TextView) findViewById(R.id.progressstatus);
        new Thread(new Runnable() {
            public void run() {
                while (progressStatus < 100)
                {
                    progressStatus += 1;
                    handler.post(new Runnable()
                    {
                        public void run()
                        {
                            progressBar = (ProgressBar) findViewById(R.id.progressBar);
                            progressBar.setProgress(progressStatus);
                            textView.setText(progressStatus + "%");
                        }
                    });
                    try
                    {
                        Thread.sleep(200);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
                if (progressStatus==100)
                {
                    Intent i = new Intent(Splash.this, MainActivity.class);
                    startActivity(i);
                }
            }
        }).start();
    }
}
