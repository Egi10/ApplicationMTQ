package com.example.egi_fcb.applicationmtq.Package_Surat_Pendek;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.MenuItem;

import com.example.egi_fcb.applicationmtq.MainActivity;
import com.example.egi_fcb.applicationmtq.Package_Tuntunan_Sholat.Activity_Tuntunan_Sholat;
import com.example.egi_fcb.applicationmtq.Package_Tuntunan_Sholat.RecyclerViewAdapterATS;
import com.example.egi_fcb.applicationmtq.R;

import java.util.ArrayList;
import java.util.List;

public class Activity_Surat_Pendek extends AppCompatActivity {
    private RecyclerView rvView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> dataSet;

    public Activity_Surat_Pendek() {
        // Required empty public constructor
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surat_pendek);
        setTitle("Daftar Surat Pendek");

        // Inflate the layout for this fragment
        dataSet = new ArrayList<>();
        initDataset();

        rvView = (RecyclerView) findViewById(R.id.recycler_view);
        rvView.setHasFixedSize(true);

        // 2. set layoutManger
        rvView.setLayoutManager(new GridLayoutManager(this,1));

        /**
         * Kita menggunakan LinearLayoutManager untuk list standar
         * yang hanya berisi daftar item
         * disusun dari atas ke bawah
         */
        layoutManager = new GridLayoutManager(this,1);
        rvView.setLayoutManager(layoutManager);

        adapter = new RecyclerViewAdapter_ATS(dataSet);
        rvView.setAdapter(adapter);

        Bundle bundle = getIntent().getExtras();
        int ab = 0;
        if(bundle != null){
            ab = bundle.getInt("data1",0);
        }
        rvView.scrollToPosition(ab);
    }

    private void initDataset(){
        /**
         * Tambahkan item ke dataset
         * */
        dataSet.add("Surat An-Naas");
        dataSet.add("Surat Al-Falak");
        dataSet.add("Surat Al-Ikhlas");
        dataSet.add("Surat Al-Lahab");
        dataSet.add("Surat An-Nasr");
        dataSet.add("Surat Al-Kaafirun");
        dataSet.add("Surat Al-Kautsar");
        dataSet.add("Surat Al-Mauun");
        dataSet.add("Surat Al-Quraisy");
        dataSet.add("Surat Al-Humazah");
    }

    //Tombol Kembali
    public boolean onOptionsItemSelected(MenuItem item){
        Bundle bundle = new Bundle();
        bundle.putInt("data1", 2);
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {
            Bundle bundle = new Bundle();
            bundle.putInt("data1", 2);
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            intent.putExtras(bundle);
            startActivity(intent);
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
