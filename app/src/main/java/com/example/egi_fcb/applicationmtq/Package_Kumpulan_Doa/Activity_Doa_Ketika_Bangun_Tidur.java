package com.example.egi_fcb.applicationmtq.Package_Kumpulan_Doa;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.graphics.Typeface;
import android.widget.Toast;

import com.example.egi_fcb.applicationmtq.MainActivity;
import com.example.egi_fcb.applicationmtq.R;

public class Activity_Doa_Ketika_Bangun_Tidur extends AppCompatActivity {
    ImageView imageView;
    TextView a, b, c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Doa Ketika Bangun Tidur");
        setContentView(R.layout.activity_doa);

        String path = "DroidNaskh_Reguler.ttf";

        imageView = (ImageView)findViewById(R.id.image_huruf);
        a = (TextView)findViewById(R.id.textViewjudul);
        b = (TextView) findViewById(R.id.textViewayat);
        c = (TextView)findViewById(R.id.textViewarti);


        a.setText("Doa Ketika Bangun Tidur");

        Typeface tf = Farsi.GetFarsiFont(this);
        b.setTypeface(tf);
        b.setText("اَلْحَمْدُ ِللهِ الَّذِىْ اَحْيَانَا بَعْدَمَآ اَمَاتَنَا وَاِلَيْهِ النُّشُوْرُ");


        c.setText("Segala puji bagi Allah yang telah menghidupkan kami sesudah kami mati (membangunkan dari tidur) dan hanya kepada-Nya kami dikembalikan");

        imageView.setImageResource(R.drawable.doa_bangun_tidur);

        BottomNavigationView bottomNavigationView = (BottomNavigationView)findViewById(R.id.btm_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.action_back :
                        Intent myIntent = new Intent(getApplicationContext(), Activity_Doa_Kedua_Orang_Tua.class);
                        startActivity(myIntent);
                        finish();
                        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                        break;

                    case R.id.action_audio :
                        Toast.makeText(getApplicationContext(), "Comming Soon", Toast.LENGTH_LONG).show();
                        break;

                    case R.id.action_next :
                        Intent Intent = new Intent(getApplicationContext(), Activity_Doa_Akan_Tidur.class);
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
