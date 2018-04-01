package com.example.egi_fcb.applicationmtq.activity.hijaiyah;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import com.example.egi_fcb.applicationmtq.adapter.campur.RecyclerViewAdapter_AHF;
import com.example.egi_fcb.applicationmtq.R;

import java.util.ArrayList;
import java.util.List;

public class Activity_Hijaiyah_Fathah extends AppCompatActivity {
    RecyclerView recyclerView;
    Context context;

    RecyclerViewAdapter_AHF recyclerViewAdapter_ahf;
    RecyclerView.LayoutManager recyclerViewLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Hijaiyah Fathah");
        setContentView(R.layout.activity_hijaiyah_fathah);

        context = getApplicationContext();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view1);

        //Change 2 to your choice because here 2 is the number of Grid layout Columns in each row.
        recyclerViewLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(recyclerViewLayoutManager);
        recyclerViewAdapter_ahf = new RecyclerViewAdapter_AHF(context,getUserInformation());
        recyclerView.setAdapter(recyclerViewAdapter_ahf);
    }

    private List<User> getUserInformation() {

        List<User> userList = new ArrayList<User>();
        userList.add(new User("بَ","BA"));
        userList.add(new User("اَ","A"));

        userList.add(new User("ثَ","TSA"));
        userList.add(new User("تَ","TA"));

        userList.add(new User("حَ","HA'"));
        userList.add(new User("جَ","JA"));

        userList.add(new User("دَ","DA"));
        userList.add(new User("خَ","KHA'"));

        userList.add(new User("رَ","RA"));
        userList.add(new User("ذَ","DZA"));

        userList.add(new User("سَ","SA"));
        userList.add(new User("زَ","ZA"));

        userList.add(new User("صَ","SHA"));
        userList.add(new User("شَ","SYA"));

        userList.add(new User("طَ","THA"));
        userList.add(new User("ضَ","DHA"));

        userList.add(new User("عَ","'A"));
        userList.add(new User("ظَ","ZHA"));

        userList.add(new User("فَ","FA"));
        userList.add(new User("غَ","GHA"));

        userList.add(new User("كَ","KA"));
        userList.add(new User("قَ","QA"));

        userList.add(new User("مَ","MA"));
        userList.add(new User("لَ","LA"));

        userList.add(new User("وَ","WA"));
        userList.add(new User("نَ","NA"));

        userList.add(new User("يَ","YA"));
        userList.add(new User("هَ","HA"));

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
