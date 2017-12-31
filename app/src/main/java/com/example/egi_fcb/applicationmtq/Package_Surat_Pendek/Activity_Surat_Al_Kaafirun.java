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

public class Activity_Surat_Al_Kaafirun extends AppCompatActivity {
    RecyclerView recyclerView;
    Context context;
    MediaPlayer mp;

    RecyclerViewAdapter_Surat_Al_Kaafirun recyclerViewAdapter_ayat;
    RecyclerView.LayoutManager recyclerViewLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semua_surat_pendek);
        setTitle("Surat Al-Kaafirun");

        context = getApplicationContext();

        mp = MediaPlayer.create(Activity_Surat_Al_Kaafirun.this, R.raw.surat_al_kafirun);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view1);

        //Change 2 to your choice because here 2 is the number of Grid layout Columns in each row.
        recyclerViewLayoutManager = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(recyclerViewLayoutManager);
        recyclerViewAdapter_ayat = new RecyclerViewAdapter_Surat_Al_Kaafirun(context,getUserInformation());
        recyclerView.setAdapter(recyclerViewAdapter_ayat);
    }

    private List<User> getUserInformation() {

        List<User> userList = new ArrayList<User>();
        userList.add(new User("1","قُلْ يٰآ أَيُّهَا الْكٰفِرُوْنَ","Katakanlah (Muhammad), Wahai orang-orang kafir!"));

        userList.add(new User("2","لَآ أَعْبُدُ مَا تَعْبُدُوْنَ","Aku tidak akan menyembah apa yang kamu sembah"));

        userList.add(new User("3","وَلَآ أَنْتُمْ عٰبِدُوْنَ مَآ أَعْبُدُ","Dan kamu tidak akan menyembah apa yang aku sembah"));

        userList.add(new User("4","وَلَآ أَنَا عَابِدٌ مَا عَبَدْتُمْ","Dan aku tidak akan pernah menyembah apa yang kamu sembah"));

        userList.add(new User("5","وَلَآ أَنْتُمْ عٰبِدُوْنَ مَآ أَعْبُدُ","Dan kamu tidak pernah pula menyembah apa yang aku sembah"));

        userList.add(new User("5","لَكُمْ دِيْنُكُمْ وَلِيَ دِيْنِ","Bagimu agamamu, dan bagiku agamaku"));

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
                bundle.putInt("data1", 5);
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
            bundle.putInt("data1", 5);
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
