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

public class Activity_Membatalkan_Sholat extends AppCompatActivity {
    RecyclerView recyclerView;
    Context context;

    RecyclerViewAdapter_Membatalkan_Sholat recyclerViewAdapter_sholat;
    RecyclerView.LayoutManager recyclerViewLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syarat_wudhu);
        setTitle("Hal Membatalkan Sholat");

        context = getApplicationContext();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        //Change 2 to your choice because here 2 is the number of Grid layout Columns in each row.
        recyclerViewLayoutManager = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(recyclerViewLayoutManager);
        recyclerViewAdapter_sholat = new RecyclerViewAdapter_Membatalkan_Sholat(context,getUserInformation());
        recyclerView.setAdapter(recyclerViewAdapter_sholat);
    }

    private List<User> getUserInformation() {

        List<User> userList = new ArrayList<User>();
        userList.add(new User("1","Berhadats baik besar maupun kecil"));
        userList.add(new User("2","Terkena najis yang tidak dimaafkan"));
        userList.add(new User("3","Berkata dengan sengaja"));
        userList.add(new User("4","Terbuka auratnya"));
        userList.add(new User("5","Mengubah niat, misalnya ingin menggugurkan shalat"));
        userList.add(new User("6","Makan atau minum walau sedikit"));
        userList.add(new User("7","Bergerak tiga kali selain gerakan shalat"));
        userList.add(new User("8","Membelakangi kiblat"));
        userList.add(new User("9","Menambah rukun yang berupa perbuatan sepertirukuk dan sujud"));
        userList.add(new User("10","Tertawa terbahak-bahak"));
        userList.add(new User("11","Mendahului imam pada dua rukun shalat"));
        userList.add(new User("12","Murtad, yakni keluar dari agama islam"));

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
        bundle.putInt("data1", 3);
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
            bundle.putInt("data1", 3);
            Intent intent = new Intent(getApplicationContext(), Activity_Utama_Sholat.class);
            intent.putExtras(bundle);
            startActivity(intent);
            finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}