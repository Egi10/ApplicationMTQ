package com.example.egi_fcb.applicationmtq.Package_Hijaiyah_Perkenalan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.egi_fcb.applicationmtq.R;

public class Activity_Hijaiyah_Jelas extends AppCompatActivity {
    TextView textView, textView1, a, b, c;
    ImageView d;
    int ab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_hijaiyah_jelas_tambah_arab);
        setTitle("Lihat Huruf Hijaiyah");

        textView = (TextView)findViewById(R.id.textViewayat);
        a = (TextView)findViewById(R.id.a);
        b = (TextView)findViewById(R.id.b);
        c = (TextView)findViewById(R.id.c);
        d = (ImageView) findViewById(R.id.d);
        textView1 = (TextView)findViewById(R.id.textViewbacaan);

        if(getIntent().getExtras() != null){
            Bundle bundle = getIntent().getExtras();
            textView.setText(bundle.getString("data1"));
            textView1.setText(bundle.getString("data2"));
            ab = bundle.getInt("data3");
            if(ab == 4){
                a.setText(" جَاءَ ");
                b.setText("jaa-a");
                c.setText("Datang");
                d.setImageResource(R.drawable.after_mandi);
            }
        }else{
            textView.setText(getIntent().getStringExtra("data1"));
            textView1.setText(getIntent().getStringExtra("data2"));
        }

        super.onCreate(savedInstanceState);
    }

    //Tombol Kembali
    public boolean onOptionsItemSelected(final MenuItem item){
        Bundle bundle = new Bundle();
        bundle.putInt("data1", ab);
        Intent intent = new Intent(getApplicationContext(), Activity_Hijaiyah.class);
        intent.putExtras(bundle);
        startActivity(intent);
        finish();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {
            Bundle bundle = new Bundle();
            bundle.putInt("data1", ab);
            Intent intent = new Intent(getApplicationContext(), Activity_Hijaiyah.class);
            intent.putExtras(bundle);
            startActivity(intent);
            finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}