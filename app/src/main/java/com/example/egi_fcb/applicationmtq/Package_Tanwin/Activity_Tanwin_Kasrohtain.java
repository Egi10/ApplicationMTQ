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
import com.example.egi_fcb.applicationmtq.Package_Hijaiyah_Kasrah.RecyclerViewAdapter_AHK;
import com.example.egi_fcb.applicationmtq.R;

import java.util.ArrayList;
import java.util.List;

public class Activity_Tanwin_Kasrohtain extends AppCompatActivity {
    RecyclerView recyclerView;
    Context context;

    RecyclerViewAdapter_Tanwin_Kasrohtain recyclerViewAdapter_ahk;
    RecyclerView.LayoutManager recyclerViewLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Tanwin Kasrohtain");
        setContentView(R.layout.activity_hijaiyah_kasrah);

        context = getApplicationContext();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view1);

        //Change 2 to your choice because here 2 is the number of Grid layout Columns in each row.
        recyclerViewLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(recyclerViewLayoutManager);
        recyclerViewAdapter_ahk = new RecyclerViewAdapter_Tanwin_Kasrohtain(context,getUserInformation());
        recyclerView.setAdapter(recyclerViewAdapter_ahk);
    }

    private List<User> getUserInformation() {

        List<User> userList = new ArrayList<User>();
        userList.add(new User("بٍ","BIN"));
        userList.add(new User("اٍ","IN"));

        userList.add(new User("ثٍ","TSIN"));
        userList.add(new User("تٍ","TIN"));

        userList.add(new User("حٍ","HIN'"));
        userList.add(new User("جٍ","JIN"));

        userList.add(new User("دٍ","DZIN"));
        userList.add(new User("خٍ","KHIN'"));

        userList.add(new User("رٍ","RIN"));
        userList.add(new User("ذٍ","RIN"));

        userList.add(new User("سٍ","SIN"));
        userList.add(new User("زٍ","ZIN"));

        userList.add(new User("صٍ","SHIN"));
        userList.add(new User("شٍ","SYIN"));

        userList.add(new User("طٍ","THIN"));
        userList.add(new User("ضٍ","DHIN"));

        userList.add(new User("عٍ","'IN"));
        userList.add(new User("ظٍ","ZHIN"));

        userList.add(new User("فٍ","FIN"));
        userList.add(new User("غٍ","GHIN"));

        userList.add(new User("كٍ","KIN"));
        userList.add(new User("قٍ","QIN"));

        userList.add(new User("مٍ","MIN"));
        userList.add(new User("لٍ","LIN"));

        userList.add(new User("وٍ","WIN"));
        userList.add(new User("نٍ","NIN"));

        userList.add(new User("يٍ","YIN"));
        userList.add(new User("هٍ","HIN"));

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
