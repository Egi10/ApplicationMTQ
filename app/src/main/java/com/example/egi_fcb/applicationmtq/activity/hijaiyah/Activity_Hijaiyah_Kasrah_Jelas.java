package com.example.egi_fcb.applicationmtq.activity.hijaiyah;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.egi_fcb.applicationmtq.R;

public class Activity_Hijaiyah_Kasrah_Jelas extends AppCompatActivity {
    TextView textView, textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_hijaiyah_jelas);
        setTitle("Lihat Hijaiyah Kasrah");

        textView = (TextView)findViewById(R.id.textViewayat);
        textView1 = (TextView)findViewById(R.id.textViewbacaan);

        if(getIntent().getExtras() != null){
            Bundle bundle = getIntent().getExtras();
            textView.setText(bundle.getString("data1"));
            textView1.setText(bundle.getString("data2"));
        }else{
            textView.setText(getIntent().getStringExtra("data1"));
            textView1.setText(getIntent().getStringExtra("data2"));
        }

        super.onCreate(savedInstanceState);


    }

    //Tombol Kembali
    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(Activity_Hijaiyah_Kasrah_Jelas.this , Activity_Hijaiyah_Kasrah.class);
        startActivityForResult(myIntent, 0);
        finish();
        return super.onOptionsItemSelected(item);
    }
}