package com.example.egi_fcb.applicationmtq.Package_Tanwin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import com.example.egi_fcb.applicationmtq.Package_Hijaiyah.Activity_Menu_Utama_Harakat;
import com.example.egi_fcb.applicationmtq.Package_Hijaiyah.Activity_Menu_Utama_Tanwin;
import com.example.egi_fcb.applicationmtq.Package_Hijaiyah_Dammah.RecyclerViewAdapter_AHD;
import com.example.egi_fcb.applicationmtq.R;

import java.util.ArrayList;
import java.util.List;

public class Activity_Tanwin_Fatkhatain extends AppCompatActivity {
    RecyclerView recyclerView;
    Context context;

    RecyclerViewAdapter_Tanwin_Fatkhatain recyclerViewAdapter;
    RecyclerView.LayoutManager recyclerViewLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Tanwin Fat'khatain");
        setContentView(R.layout.activity_hijaiyah_dammah);

        context = getApplicationContext();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view1);

        //Change 2 to your choice because here 2 is the number of Grid layout Columns in each row.
        recyclerViewLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(recyclerViewLayoutManager);
        recyclerViewAdapter = new RecyclerViewAdapter_Tanwin_Fatkhatain(context,getUserInformation());
        recyclerView.setAdapter(recyclerViewAdapter);
    }

    private List<User> getUserInformation() {

        List<User> userList = new ArrayList<User>();
        userList.add(new User("بً","BAN"));
        userList.add(new User("اً","AN"));

        userList.add(new User("ثً","TSAN"));
        userList.add(new User("تً","TAN"));

        userList.add(new User("حً","HAN'"));
        userList.add(new User("جً","JAN"));

        userList.add(new User("دً","DAN"));
        userList.add(new User("خً","KHAN"));

        userList.add(new User("رً","RAN"));
        userList.add(new User("ذً","DZAN"));

        userList.add(new User("سً","SAN"));
        userList.add(new User("زً","ZAN"));

        userList.add(new User("صً","SHAN"));
        userList.add(new User("شً","SYAN"));

        userList.add(new User("طً","THAN"));
        userList.add(new User("ضً","DHAN"));

        userList.add(new User("عً","'AN"));
        userList.add(new User("ظً","ZHAN"));

        userList.add(new User("فً","FAN"));
        userList.add(new User("غً","GHAN"));

        userList.add(new User("كً","KAN"));
        userList.add(new User("قً","QAN"));

        userList.add(new User("مً","MAN"));
        userList.add(new User("لً","LAN"));

        userList.add(new User("وً","WAN"));
        userList.add(new User("نً","NAN"));

        userList.add(new User("يً","YAN"));
        userList.add(new User("هً","HAN"));

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
        Intent myIntent = new Intent(getApplicationContext(), Activity_Menu_Utama_Tanwin.class);
        startActivityForResult(myIntent, 0);
        finish();
        return super.onOptionsItemSelected(item);
    }
}

