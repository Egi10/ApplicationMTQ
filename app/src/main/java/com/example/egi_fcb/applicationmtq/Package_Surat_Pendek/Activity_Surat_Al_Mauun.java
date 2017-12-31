package com.example.egi_fcb.applicationmtq.Package_Surat_Pendek;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;

import com.example.egi_fcb.applicationmtq.R;

import java.util.ArrayList;
import java.util.List;

public class Activity_Surat_Al_Mauun extends AppCompatActivity {
    RecyclerView recyclerView;
    Context context;
    MediaPlayer mp;

    RecyclerViewAdapter_Surat_Al_Mauun recyclerViewAdapter_ayat;
    RecyclerView.LayoutManager recyclerViewLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semua_surat_pendek);
        setTitle("Surat Al-Mauun");

        context = getApplicationContext();

        mp = MediaPlayer.create(Activity_Surat_Al_Mauun.this, R.raw.surat_al_mauun);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view1);

        //Change 2 to your choice because here 2 is the number of Grid layout Columns in each row.
        recyclerViewLayoutManager = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(recyclerViewLayoutManager);
        recyclerViewAdapter_ayat = new RecyclerViewAdapter_Surat_Al_Mauun(context,getUserInformation());
        recyclerView.setAdapter(recyclerViewAdapter_ayat);
    }

    private List<User> getUserInformation() {

        List<User> userList = new ArrayList<User>();
        userList.add(new User("1","أَرَأَيْتَ الَّذِيْ يُكَذِّبُ بِالدِّيْنِ","Tahukah kamu (orang) yang mendustakan agama ?"));

        userList.add(new User("2","فَذٰلِكَ الَّذِيْ يَدُعُّ الْيَتِيْمَ","Maka itulah orang yang menghardik anak yatim"));

        userList.add(new User("3","وَلاَ يَحُضُّ عَلٰى طَعَامِ الْمِسْكِيْنِ","Dan tidak mendorong memberi makan orang miskin"));

        userList.add(new User("4","فَوَيْلٌ لِّلْمُصَلِّيْنَ","Maka celakalah orang yang shalat"));

        userList.add(new User("5","الَّذِيْنَ هُمْ عَنْ صَلاَتِهِمْ سَاهُوْنَ","Yaitu orang-orang yang lalai terhadap shalatnya"));

        userList.add(new User("6","الَّذِيْنَ هُمْ يُرَآءُوْنَ","Yang berbuat ria"));

        userList.add(new User("7","وَيَمْنَعُوْنَ الْمَاعُوْنَ","Dan enggan (memberikan) bantuan"));

        return userList;
    }

    public class User {
        private String no, ayat, arti;

        public String getNo() {
            return no;
        }

        public String getAyat() {
            return ayat;
        }

        public String getArti() {
            return arti;
        }

        public User(String no, String ayat, String arti) {
            this.no = no;
            this.ayat = ayat;
            this.arti = arti;
        }
    }

    //Tombol Kembali
    public boolean onOptionsItemSelected(final MenuItem item){
        switch (item.getItemId()) {
            case R.id.suara:
                mp.start();
                item.setEnabled(false);
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        item.setEnabled(true);
                    }
                });
                return true;

            default:
                mp.stop();
                Bundle bundle = new Bundle();
                bundle.putInt("data1", 7);
                Intent intent = new Intent(getApplicationContext(), Activity_Surat_Pendek.class);
                intent.putExtras(bundle);
                startActivity(intent);
                finish();
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {
            mp.stop();
            Bundle bundle = new Bundle();
            bundle.putInt("data1", 7);
            Intent intent = new Intent(getApplicationContext(), Activity_Surat_Pendek.class);
            intent.putExtras(bundle);
            startActivity(intent);
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
