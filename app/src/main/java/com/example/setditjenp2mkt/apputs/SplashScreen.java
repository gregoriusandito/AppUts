package com.example.setditjenp2mkt.apputs;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        //jajal
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //setelah 5 detik, maka akan kita arahkan ke halaman utama
                Intent a = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(a);
                finish();
            }
        }, 3000L);

    }
}
