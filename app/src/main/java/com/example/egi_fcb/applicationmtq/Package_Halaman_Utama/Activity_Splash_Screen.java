package com.example.egi_fcb.applicationmtq.Package_Halaman_Utama;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

import com.example.egi_fcb.applicationmtq.MainActivity;
import com.example.egi_fcb.applicationmtq.R;

public class Activity_Splash_Screen extends AppCompatActivity {

    private static int splashInternal = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Activity_Splash_Screen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },splashInternal);
    }
}
