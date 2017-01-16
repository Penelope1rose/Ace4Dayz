package com.example.p1444968.ace4dayz;

/**
 * Created by P1444968 on 10/1/2017.
 */

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.Window;

public class SplashScreen extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.splash);

        Thread splashThread = new Thread() {
            @Override
            public void run() {
                try {
                    int waited = 0;
                    while (waited < 2000) {
                        sleep(100);
                        waited += 100;
                    }
                } catch (InterruptedException e) {

                } finally {
                    finish();
                    Intent i = new Intent();
                    i.setClassName("com.example.p1444968.ace4dayz", "com.example.p1444968.ace4dayz.MainActivity");
                    startActivity(i);
                }
            }
        };
        splashThread.start();
    }
}
