package com.example.egi_fcb.applicationmtq.activity.campur;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.egi_fcb.applicationmtq.fragment.Farsi;
import com.example.egi_fcb.applicationmtq.R;

public class Activity_Shalawat_Nabi extends AppCompatActivity {

    TextView judul, arab, arti;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shalawat_nabi);
        setTitle("Asma'ul Husna");

        judul = (TextView)findViewById(R.id.textViewjudul);
        arab = (TextView) findViewById(R.id.textViewayat);
        arti = (TextView)findViewById(R.id.textViewarti);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //mp = MediaPlayer.create(Activity_Shalawat_Nabi.this, R.raw.ilma_plojovic_asmaul_husna);

        CollapsingToolbarLayout collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collab);
        collapsingToolbar.setExpandedTitleGravity(Gravity.CENTER_HORIZONTAL);
        collapsingToolbar.setTitle("Shalawat Nabi");

        judul.setText("Shalawat Nabi");

        Typeface tf = Farsi.GetFarsiFont(this);
        arab.setTypeface(tf);
        arab.setText("اَللَّهُمَّ صَلِّ عَلَى مُحَمَّدٍ وَعَلَى آلِ مُحَمَّدٍ وَبَارِكْ عَلَى مُحَمَّدٍ وَعَلَى آلِ مُحَمَّدٍ، كَمَا صَلَّيْتَ وَبَارَكْتَ عَلَى إِبْرَاهِيْمَ وَآلِ إِبْرَاهِيْمَ إِنَّكَ حَمِيْدُ مَجِيْدٌ");

        arti.setText("Ya Allah berikanlah rahmat kepada Muhammad dan keluarga Muhammad dan berilah karunia kepada Muhammad dan keluarga Muhammad sebagaimana Engkau telah memberikan rahmat dan karunia kepada Ibrahim dan keluarga Ibrahim, sesungguhnya Engkau Mahaterpuji lagi Mahaagung");

    }




    //Tombol Kembali
    public boolean onOptionsItemSelected(final MenuItem item){

        switch (item.getItemId()) {
            case R.id.suara:

                return true;

            default:
                //mp.stop();
                Activity_Shalawat_Nabi.this.finish();
                Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivityForResult(myIntent, 0);
                finish();
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {
            //mp.stop();
            Activity_Shalawat_Nabi.this.finish();
            Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(myIntent);
            finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
