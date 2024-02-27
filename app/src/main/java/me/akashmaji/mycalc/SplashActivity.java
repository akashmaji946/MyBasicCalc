package me.akashmaji.mycalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // create a Thread object for splash thing
        Thread thread = new Thread() {
            public void run(){
                try {
                    sleep(4000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } finally {
                    Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        };
        // launch the thread
        thread.start();
    }
}