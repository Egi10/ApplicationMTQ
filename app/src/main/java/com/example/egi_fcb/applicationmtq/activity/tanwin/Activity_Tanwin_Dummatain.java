package com.example.egi_fcb.applicationmtq.activity.tanwin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import com.example.egi_fcb.applicationmtq.adapter.tanwin.RecyclerViewAdapter_Tanwin_Dummatain;
import com.example.egi_fcb.applicationmtq.activity.hijaiyah.Activity_Menu_Utama_Harakat;
import com.example.egi_fcb.applicationmtq.R;

import java.util.ArrayList;
import java.util.List;

public class Activity_Tanwin_Dummatain extends AppCompatActivity {
    RecyclerView recyclerView;
    Context context;

    RecyclerViewAdapter_Tanwin_Dummatain recyclerViewAdapter;
    RecyclerView.LayoutManager recyclerViewLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Tanwin Dummatain");
        setContentView(R.layout.activity_hijaiyah_dammah);

        context = getApplicationContext();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view1);

        //Change 2 to your choice because here 2 is the number of Grid layout Columns in each row.
        recyclerViewLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(recyclerViewLayoutManager);
        recyclerViewAdapter = new RecyclerViewAdapter_Tanwin_Dummatain(context,getUserInformation());
        recyclerView.setAdapter(recyclerViewAdapter);
    }

    private List<User> getUserInformation() {

        List<User> userList = new ArrayList<User>();
        userList.add(new User("بٌ","BUN"));
        userList.add(new User("اٌ","UN"));

        userList.add(new User("ثٌ","TSUN"));
        userList.add(new User("تٌ","TUN"));

        userList.add(new User("حٌ","HUN'"));
        userList.add(new User("جٌ","JUN"));

        userList.add(new User("دٌ","DUN"));
        userList.add(new User("خٌ","KHUN'"));

        userList.add(new User("رٌ","RUN"));
        userList.add(new User("ذٌ","DZUN"));

        userList.add(new User("سٌ","SUN"));
        userList.add(new User("زٌ","ZUN"));

        userList.add(new User("صٌ","SHUN"));
        userList.add(new User("شٌ","SYUN"));

        userList.add(new User("طٌ","THUN"));
        userList.add(new User("ضٌ","DHUN"));

        userList.add(new User("عٌ","'UN"));
        userList.add(new User("ظٌ","ZHUN"));

        userList.add(new User("فٌ","FUN"));
        userList.add(new User("غٌ","GHUN"));

        userList.add(new User("قٌ","KUN"));
        userList.add(new User("قٌ","QUN"));

        userList.add(new User("مٌ","MUN"));
        userList.add(new User("لٌ","LUN"));

        userList.add(new User("وٌ","WUN"));
        userList.add(new User("نٌ","NUN"));

        userList.add(new User("يٌ","YUN"));
        userList.add(new User("هٌ","HUN"));

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

