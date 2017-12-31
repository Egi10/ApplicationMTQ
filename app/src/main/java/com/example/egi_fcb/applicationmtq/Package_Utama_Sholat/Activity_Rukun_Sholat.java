package com.example.egi_fcb.applicationmtq.Package_Utama_Sholat;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.MenuItem;

import com.example.egi_fcb.applicationmtq.Package_Surat_Pendek.Activity_Surat_Pendek;
import com.example.egi_fcb.applicationmtq.R;

import java.util.ArrayList;
import java.util.List;

public class Activity_Rukun_Sholat extends AppCompatActivity {
    RecyclerView recyclerView;
    Context context;

    RecyclerViewAdapter_Rukun_Sholat recyclerViewAdapter_sholat;
    RecyclerView.LayoutManager recyclerViewLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syarat_wudhu);
        setTitle("Rukun-Rukun Shalat");

        context = getApplicationContext();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        //Change 2 to your choice because here 2 is the number of Grid layout Columns in each row.
        recyclerViewLayoutManager = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(recyclerViewLayoutManager);
        recyclerViewAdapter_sholat = new RecyclerViewAdapter_Rukun_Sholat(context,getUserInformation());
        recyclerView.setAdapter(recyclerViewAdapter_sholat);
    }

    private List<User> getUserInformation() {

        List<User> userList = new ArrayList<User>();
        userList.add(new User("1","Niat dalam hati sesuai shalat yang dikerjakan"));
        userList.add(new User("2","Takbiratul ihram (membaca Alloohu Akbar)"));
        userList.add(new User("3","Berdiri bagi yang berkuasa"));
        userList.add(new User("4","Membaca surat Al-Fatihah pada tiap rakaat"));
        userList.add(new User("5","Ruku' berserta thuma'ninah"));
        userList.add(new User("6","I'tidal beserta thuma'ninah"));
        userList.add(new User("7","Sujud 2 kali beserta thuma'ninah"));
        userList.add(new User("8","Duduk antara dua sujud beserta thuma'ninah"));
        userList.add(new User("9","Duduk tahiyat/tasyahud akhir beserta thuma'ninah"));
        userList.add(new User("10","Membaca tahiyat / tasyahud akhir"));
        userList.add(new User("11","Membaca shalawat nabi pada tahiyat / tasyahud akhir"));
        userList.add(new User("12","Membaca salam yang pertama"));
        userList.add(new User("13","Tertib/urut"));

        return userList;
    }

    public class User {
        private String no, ket;

        public String getNo() {
            return no;
        }

        public String getKet() {
            return ket;
        }


        public User(String no, String ket) {
            this.no = no;
            this.ket = ket;
        }
    }

    //Tombol Kembali
    public boolean onOptionsItemSelected(final MenuItem item){
        Bundle bundle = new Bundle();
        bundle.putInt("data1", 2);
        Intent intent = new Intent(getApplicationContext(), Activity_Utama_Sholat.class);
        intent.putExtras(bundle);
        startActivity(intent);
        finish();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {
            Bundle bundle = new Bundle();
            bundle.putInt("data1", 2);
            Intent intent = new Intent(getApplicationContext(), Activity_Utama_Sholat.class);
            intent.putExtras(bundle);
            startActivity(intent);
            finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}