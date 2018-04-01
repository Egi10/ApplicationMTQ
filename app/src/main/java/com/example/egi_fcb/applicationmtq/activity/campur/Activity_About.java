package com.example.egi_fcb.applicationmtq.activity.campur;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.egi_fcb.applicationmtq.R;

public class Activity_About extends AppCompatActivity {
    TextView judul, namateam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);

        judul = (TextView)findViewById(R.id.textViewjudul);
        namateam = (TextView)findViewById(R.id.textViewteam);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collab);
        collapsingToolbar.setExpandedTitleGravity(Gravity.CENTER_HORIZONTAL);
        collapsingToolbar.setTitle("Tentang");

        judul.setText("EDU Muslim");
        namateam.setText("Aplikasi ini dibuat untuk membantu anak-anak dalam belajar Al-Qur'an, Do'a sehari-hari dan " +
                "juga belajar gerakan wudhu dan gerakan sholat.\n\nAplikasi ini juga bisa digunakan oleh semua kalangan " +
                "untuk belajar Al-Qur'an, Do'a sehari-hari dan " +
                "juga belajar gerakan wudhu dan gerakan sholat.");
    }


    //Tombol Kembali
    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivityForResult(myIntent, 0);
        finish();
        return super.onOptionsItemSelected(item);
    }
}
