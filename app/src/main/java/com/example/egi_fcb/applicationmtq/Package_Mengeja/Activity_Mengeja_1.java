package com.example.egi_fcb.applicationmtq.Package_Mengeja;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.MenuItem;

import com.example.egi_fcb.applicationmtq.MainActivity;
import com.example.egi_fcb.applicationmtq.R;

import java.util.ArrayList;

public class Activity_Mengeja_1 extends AppCompatActivity {
    private RecyclerView rvView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> dataSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Belajar Mengeja");
        setContentView(R.layout.activity_mengeja);

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
        layoutManager = new GridLayoutManager(this,2);
        rvView.setLayoutManager(layoutManager);

        adapter = new RecyclerViewAdapterM1(dataSet);
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
        dataSet.add("بَ اَ بَ");
        dataSet.add("اَ بَ اَ");
        dataSet.add("بَ اَ اَ");
        dataSet.add("اَ اَ بَ");
        dataSet.add("بَ بَ اَ");
        dataSet.add("اَ تَ بَ");
        dataSet.add("تَ اَ بَ");
        dataSet.add("ثَ اَ بَ");
        dataSet.add("ثَ بَ تَ");
        dataSet.add("ثَ اَ لَ");
        dataSet.add("جَ اَ حَ");
        dataSet.add("حَ حَ ثَ");
        dataSet.add("خَ دَ دَ");
        dataSet.add("خَ دَ ذَ");
        dataSet.add("دَ ذَ رَ");
        dataSet.add("رَ اَ زَ");
        dataSet.add("زَ اَ سَ");
        dataSet.add("سَ اَ شَ");
    }

    //Tombol Kembali
    public boolean onOptionsItemSelected(MenuItem item){
        Bundle bundle = new Bundle();
        bundle.putInt("data1", 0);
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {
            Bundle bundle = new Bundle();
            bundle.putInt("data1", 0);
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            intent.putExtras(bundle);
            startActivity(intent);
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}