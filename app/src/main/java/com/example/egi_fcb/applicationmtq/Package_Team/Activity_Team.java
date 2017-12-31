package com.example.egi_fcb.applicationmtq.Package_Team;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.egi_fcb.applicationmtq.MainActivity;
import com.example.egi_fcb.applicationmtq.Package_Kumpulan_Doa.Farsi;
import com.example.egi_fcb.applicationmtq.R;

public class Activity_Team extends AppCompatActivity {
    TextView judul, namateam, judul1, namateam1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);

        judul = (TextView)findViewById(R.id.textViewjudul);
        namateam = (TextView)findViewById(R.id.textViewteam);

        judul1 = (TextView)findViewById(R.id.textViewjudul1);
        namateam1 = (TextView)findViewById(R.id.textViewteam1);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collab);
        collapsingToolbar.setExpandedTitleGravity(Gravity.CENTER_HORIZONTAL);
        collapsingToolbar.setTitle("Team");

        judul.setText("Member");
        namateam.setText("Julsapargi Nursam\n\nRidwan Budiman Etlanda\n\nAdiddo Restiady");

        judul1.setText("Support");
        namateam1.setText("Universitas Putra Indonesia \"YPTK\" Padang\n\nYayasan Perguruan Tinggi Komputer (YPTK) Padang");
    }


    //Tombol Kembali
    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivityForResult(myIntent, 0);
        finish();
        return super.onOptionsItemSelected(item);
    }
}
