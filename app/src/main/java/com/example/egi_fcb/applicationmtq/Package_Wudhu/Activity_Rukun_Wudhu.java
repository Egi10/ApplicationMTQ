package com.example.egi_fcb.applicationmtq.Package_Wudhu;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.MenuItem;

import com.example.egi_fcb.applicationmtq.MainActivity;
import com.example.egi_fcb.applicationmtq.Package_Utama_Sholat.Activity_Utama_Sholat;
import com.example.egi_fcb.applicationmtq.Package_Utama_Wudhu.Activity_Utama_Wudhu;
import com.example.egi_fcb.applicationmtq.R;

import java.util.ArrayList;
import java.util.List;

public class Activity_Rukun_Wudhu extends AppCompatActivity {
    RecyclerView recyclerView;
    Context context;

    RecyclerViewAdapter_Rukun_Wudhu recyclerViewAdapter_wudhu;
    RecyclerView.LayoutManager recyclerViewLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syarat_wudhu);
        setTitle("Rukun-Rukun Wudhu");

        context = getApplicationContext();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        //Change 2 to your choice because here 2 is the number of Grid layout Columns in each row.
        recyclerViewLayoutManager = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(recyclerViewLayoutManager);
        recyclerViewAdapter_wudhu = new RecyclerViewAdapter_Rukun_Wudhu(context,getUserInformation());
        recyclerView.setAdapter(recyclerViewAdapter_wudhu);
    }

    private List<User> getUserInformation() {

        List<User> userList = new ArrayList<User>();
        userList.add(new User("1","Niat berwudhu ketika membasuh muka"));
        userList.add(new User("2","Membasuh muka"));
        userList.add(new User("3","Membasuh kedua tangan sampai siku"));
        userList.add(new User("4","Mengusap sebagian rambut kepala"));
        userList.add(new User("5","Membasuh ke dua kaki sampai mata kaki"));
        userList.add(new User("6","Tertib/urut"));
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
        Intent intent = new Intent(getApplicationContext(), Activity_Utama_Wudhu.class);
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
            Intent intent = new Intent(getApplicationContext(), Activity_Utama_Wudhu.class);
            intent.putExtras(bundle);
            startActivity(intent);
            finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}