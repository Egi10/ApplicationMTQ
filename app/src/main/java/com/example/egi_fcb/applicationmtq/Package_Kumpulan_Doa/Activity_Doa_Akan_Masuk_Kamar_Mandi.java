package com.example.egi_fcb.applicationmtq.Package_Kumpulan_Doa;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.egi_fcb.applicationmtq.MainActivity;
import com.example.egi_fcb.applicationmtq.Package_Surat_Pendek.Activity_Surat_Al_Falak;
import com.example.egi_fcb.applicationmtq.Package_Surat_Pendek.Activity_Surat_Pendek;
import com.example.egi_fcb.applicationmtq.R;

import java.io.IOException;

public class Activity_Doa_Akan_Masuk_Kamar_Mandi extends AppCompatActivity {
    ImageView imageView;
    TextView judul, arab, arti;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Doa Ketika Akan Masuk Kamar Mandi");
        setContentView(R.layout.activity_doa);

        imageView = (ImageView)findViewById(R.id.image_huruf);
        judul = (TextView)findViewById(R.id.textViewjudul);
        arab = (TextView) findViewById(R.id.textViewayat);
        arti = (TextView)findViewById(R.id.textViewarti);


        judul.setText("Doa Ketika Akan Masuk Kamar Mandi");

        Typeface tf = Farsi.GetFarsiFont(this);
        arab.setTypeface(tf);
        arab.setText("اَللّهُمَّ اِنىِّ اَعُوْذُ بِكَ مِنَ الْخُبُثِ وَ الْخَبَائِثِ");


        arti.setText("Ya Allah sesungguhnya aku berlindung kepadaMu dari setan laki-laki dan setan perempuan");

        imageView.setImageResource(R.drawable.doa_sebelum_mandi);

        mp = MediaPlayer.create(Activity_Doa_Akan_Masuk_Kamar_Mandi.this, R.raw.doa_masuk_kamar_mandi);

        BottomNavigationView bottomNavigationView = (BottomNavigationView)findViewById(R.id.btm_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.action_back :
                        mp.stop();
                        Intent myIntent = new Intent(getApplicationContext(), Activity_Doa_Akan_Tidur.class);
                        startActivity(myIntent);
                        finish();
                        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                        break;

                    case R.id.action_audio :
                        //try {mp.prepare();} catch (IllegalStateException e) { e.printStackTrace();} catch (IOException e) { }                     e.printStackTrace();}
                        /** Menjalankan Audio */
                        Toast.makeText(getApplicationContext(), "Comming Soon", Toast.LENGTH_LONG).show();
                        mp.start();

                        break;

                    case R.id.action_next :
                        mp.stop();
                        Intent Intent = new Intent(getApplicationContext(), Activity_Doa_Akan_Keluar_Kamar_Mandi.class);
                        startActivity(Intent);
                        finish();
                        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                        break;
                }
                return true;
            }
        });
    }

    //Tombol Kembali
    public boolean onOptionsItemSelected(MenuItem item){
        Bundle bundle = new Bundle();
        bundle.putInt("data2", 1);
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {
            Bundle bundle = new Bundle();
            bundle.putInt("data2", 1);
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            intent.putExtras(bundle);
            startActivity(intent);
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
