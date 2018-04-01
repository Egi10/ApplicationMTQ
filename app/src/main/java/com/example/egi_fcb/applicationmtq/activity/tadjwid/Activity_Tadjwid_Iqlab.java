package com.example.egi_fcb.applicationmtq.activity.tadjwid;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.egi_fcb.applicationmtq.activity.campur.MainActivity;
import com.example.egi_fcb.applicationmtq.R;

public class Activity_Tadjwid_Iqlab extends AppCompatActivity {
    VideoView videoView;
    TextView textView;
    MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tadjwid);
        setTitle("Tajwid Iqlab");

        videoView = (VideoView)findViewById(R.id.videotajwid);
        textView = (TextView)findViewById(R.id.textViewket);

        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.tajwid_iqlab));
        //digunakan untuk mengidentifikasi resource seperti lokasi video
        videoView.setMediaController(new MediaController(this));

        //menampilkan media controller video
        videoView.start();
        //memulai video
        textView.setText("Iqlab bahasa Arab: إقلاب adalah salah satu bagian dari hukum nun mati dan tanwin. Menurut bahasa, Iqlab artinya mengganti, sedangkan menurut istilah ilmu tajwid, iqlab artinya mengganti bunyi bacaan nun mati atau tanwin menjadi mim apabila huruf sesudahnya adalah huruf ba (ب). Biasanya ditandai dengan huruf mim kecil \"م\" (biasanya bentuk huruf mim yang berdiri) yang menandakan bahwa kalimat tersebut terdapat hukum bacaan iqlab."+"\n"+"" +
                "Contoh Bacaan\n" +"مِن بَعدِ \n" +"Kalimat diatas aslinya berbunyi Min ba`di, Namun dikarenakan hukum Iqlab, maka cara membacanya menjadi Mim ba`di (dengan membaca mim sedikit lebih panjang dan dengung)."+"\n"+"Sumber : Wikipedia");
    }

    //Tombol Kembali
    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivityForResult(myIntent, 0);
        finish();
        return super.onOptionsItemSelected(item);
    }
}
