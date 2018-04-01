package com.example.egi_fcb.applicationmtq.activity.doa;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.egi_fcb.applicationmtq.activity.campur.MainActivity;
import com.example.egi_fcb.applicationmtq.fragment.Farsi;
import com.example.egi_fcb.applicationmtq.R;

public class Activity_Doa_Akan_Keluar_Kamar_Mandi extends AppCompatActivity {
    ImageView imageView;
    TextView judul, arab, arti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Doa Ketika Akan Keluar Kamar Mandi");
        setContentView(R.layout.activity_doa);

        imageView = (ImageView)findViewById(R.id.image_huruf);
        judul = (TextView)findViewById(R.id.textViewjudul);
        arab = (TextView) findViewById(R.id.textViewayat);
        arti = (TextView)findViewById(R.id.textViewarti);


        judul.setText("Doa Ketika Akan Keluar Kamar Mandi");

        Typeface tf = Farsi.GetFarsiFont(this);
        arab.setTypeface(tf);
        arab.setText("اَلْحَمْدُ ِللهِ الَّذِى اَذْهَبَ عَنِّى اْلاَذى وَعَافَنِى");


        arti.setText("Segala puji bagi Allah yang telah menghilangkan penyakit dan telah membuatku sehat");

        imageView.setImageResource(R.drawable.doa_setelah_mandi);

        BottomNavigationView bottomNavigationView = (BottomNavigationView)findViewById(R.id.btm_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.action_back :
                        Intent myIntent = new Intent(getApplicationContext(), Activity_Doa_Akan_Masuk_Kamar_Mandi.class);
                        startActivity(myIntent);
                        finish();
                        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                        break;

                    case R.id.action_audio :
                        Toast.makeText(getApplicationContext(), "Comming Soon", Toast.LENGTH_LONG).show();
                        break;

                    case R.id.action_next :
                        Intent Intent = new Intent(getApplicationContext(), Activity_Doa_Akan_Belajar.class);
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
