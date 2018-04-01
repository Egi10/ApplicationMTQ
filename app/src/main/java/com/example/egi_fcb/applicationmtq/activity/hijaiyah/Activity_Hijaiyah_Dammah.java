package com.example.egi_fcb.applicationmtq.activity.hijaiyah;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import com.example.egi_fcb.applicationmtq.adapter.campur.RecyclerViewAdapter_AHD;
import com.example.egi_fcb.applicationmtq.R;

import java.util.ArrayList;
import java.util.List;

public class Activity_Hijaiyah_Dammah extends AppCompatActivity {
    RecyclerView recyclerView;
    Context context;

    RecyclerViewAdapter_AHD recyclerViewAdapter_ahd;
    RecyclerView.LayoutManager recyclerViewLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Hijaiyah Dammah");
        setContentView(R.layout.activity_hijaiyah_dammah);

        context = getApplicationContext();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view1);

        //Change 2 to your choice because here 2 is the number of Grid layout Columns in each row.
        recyclerViewLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(recyclerViewLayoutManager);
        recyclerViewAdapter_ahd = new RecyclerViewAdapter_AHD(context,getUserInformation());
        recyclerView.setAdapter(recyclerViewAdapter_ahd);
    }

    private List<User> getUserInformation() {

        List<User> userList = new ArrayList<User>();
        userList.add(new User("بُ","BU"));
        userList.add(new User("اُ","U"));

        userList.add(new User("ثُ","TSU"));
        userList.add(new User("تُ","TU"));

        userList.add(new User("حُ","HU'"));
        userList.add(new User("جُ","JU"));

        userList.add(new User("دُ","DU"));
        userList.add(new User("خُ","KHU'"));

        userList.add(new User("رُ","RU"));
        userList.add(new User("ذُ","DZU"));

        userList.add(new User("سُ","SU"));
        userList.add(new User("زُ","ZU"));

        userList.add(new User("صُ","SHU"));
        userList.add(new User("شُ","SYU"));

        userList.add(new User("طُ","THU"));
        userList.add(new User("ضُ","DHU"));

        userList.add(new User("عُ","'U"));
        userList.add(new User("ظُ","ZHU"));

        userList.add(new User("فُ","FU"));
        userList.add(new User("غُ","GHU"));

        userList.add(new User("كُ","KU"));
        userList.add(new User("قُ","QU"));

        userList.add(new User("مُ","MU"));
        userList.add(new User("لُ","LU"));

        userList.add(new User("وُ","WU"));
        userList.add(new User("نُ","NU"));

        userList.add(new User("يُ","YU"));
        userList.add(new User("هُ","HU"));

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
        Intent myIntent = new Intent(getApplicationContext(), Activity_Menu_Utama_Harakat.class);
        startActivityForResult(myIntent, 0);
        finish();
        return super.onOptionsItemSelected(item);
    }
}

