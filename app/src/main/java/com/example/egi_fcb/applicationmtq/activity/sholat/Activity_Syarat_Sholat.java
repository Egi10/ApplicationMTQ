package com.example.egi_fcb.applicationmtq.activity.sholat;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.MenuItem;

import com.example.egi_fcb.applicationmtq.adapter.sholat.RecyclerViewAdapter_Syarat_Sholat;
import com.example.egi_fcb.applicationmtq.R;

import java.util.ArrayList;
import java.util.List;

public class Activity_Syarat_Sholat extends AppCompatActivity {
    RecyclerView recyclerView;
    Context context;

    RecyclerViewAdapter_Syarat_Sholat recyclerViewAdapter_sholat;
    RecyclerView.LayoutManager recyclerViewLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syarat_wudhu);
        setTitle("Syarat-Syarat Sholat");

        context = getApplicationContext();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        //Change 2 to your choice because here 2 is the number of Grid layout Columns in each row.
        recyclerViewLayoutManager = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(recyclerViewLayoutManager);
        recyclerViewAdapter_sholat = new RecyclerViewAdapter_Syarat_Sholat(context,getUserInformation());
        recyclerView.setAdapter(recyclerViewAdapter_sholat);
    }

    private List<User> getUserInformation() {

        List<User> userList = new ArrayList<User>();
        userList.add(new User("1","Beragama islam"));
        userList.add(new User("2","Suci dari hadats besar dan kecil"));
        userList.add(new User("3","Sudah baligh dan berakal sehat"));
        userList.add(new User("4","Suci badan, pakaian dan tempat dari najis"));
        userList.add(new User("5","Mengetahui masuknya waktu shalat"));
        userList.add(new User("6","Menghadap kiblat"));
        userList.add(new User("7","Mengetahui yang rukun dan yang sunnah"));
        userList.add(new User("8","Menutup aurat"));

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
        bundle.putInt("data1", 1);
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
            bundle.putInt("data1", 1);
            Intent intent = new Intent(getApplicationContext(), Activity_Utama_Sholat.class);
            intent.putExtras(bundle);
            startActivity(intent);
            finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}