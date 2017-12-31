package com.example.egi_fcb.applicationmtq.Package_Hijaiyah_Perkenalan;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import com.example.egi_fcb.applicationmtq.MainActivity;
import com.example.egi_fcb.applicationmtq.Package_Hijaiyah_Kasrah.RecyclerViewAdapter_AHK;
import com.example.egi_fcb.applicationmtq.R;

import java.util.ArrayList;
import java.util.List;

public class Activity_Hijaiyah extends AppCompatActivity {
    RecyclerView recyclerView;
    Context context;

    RecyclerViewAdapter_AH recyclerViewAdapter_ah;
    RecyclerView.LayoutManager recyclerViewLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Huruf Hijaiyah");
        setContentView(R.layout.activity_huruf_hijaiyah);

        context = getApplicationContext();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view1);

        //Change 2 to your choice because here 2 is the number of Grid layout Columns in each row.
        recyclerViewLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(recyclerViewLayoutManager);
        recyclerViewAdapter_ah = new RecyclerViewAdapter_AH(context,getUserInformation());
        recyclerView.setAdapter(recyclerViewAdapter_ah);

        Bundle bundle = getIntent().getExtras();
        int ab = 0;
        if(bundle != null){
            ab = bundle.getInt("data1",0);
        }
        recyclerView.scrollToPosition(ab);
    }

    private List<User> getUserInformation() {

        List<User> userList = new ArrayList<User>();
        userList.add(new User("ب","BA"));
        userList.add(new User("ا","ALIF"));

        userList.add(new User("ث","TSA"));
        userList.add(new User("ت","TA"));

        userList.add(new User("ح","HA"));
        userList.add(new User("ج","JIM"));

        userList.add(new User("د","DAL"));
        userList.add(new User("خ","KHA"));

        userList.add(new User("ر","RA"));
        userList.add(new User("ذ","DZAL"));

        userList.add(new User("س","SIN"));
        userList.add(new User("ز","ZAY"));

        userList.add(new User("ص","SAD"));
        userList.add(new User("ش","SYIN"));

        userList.add(new User("ط","TA"));
        userList.add(new User("ض","DAD"));

        userList.add(new User("ع","AIN"));
        userList.add(new User("ظ","DHA"));

        userList.add(new User("ف","FA"));
        userList.add(new User("غ","GHAYN"));

        userList.add(new User("ك","KAF"));
        userList.add(new User("ق","QAF"));

        userList.add(new User("م","MIM"));
        userList.add(new User("ل","LAM"));

        userList.add(new User("و","WAW"));
        userList.add(new User("ن","NUN"));

        userList.add(new User("ء","HAMZAH"));
        userList.add(new User("ه","HA"));

        userList.add(new User("ي","YA"));

        return userList;
    }

    public class User {
        private String ayat,bacaan;


        public String getAyat() {
            return ayat;
        }

        public String getBacaan() {
            return bacaan;
        }

        public User(String ayat, String bacaan) {
            this.ayat = ayat;
            this.bacaan = bacaan;
        }
    }

    //Tombol Kembali
    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivityForResult(myIntent, 0);
        finish();
        return super.onOptionsItemSelected(item);
    }
}
