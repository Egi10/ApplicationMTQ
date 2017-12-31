package com.example.egi_fcb.applicationmtq.Package_Hijaiyah_Kasrah;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import com.example.egi_fcb.applicationmtq.MainActivity;
import com.example.egi_fcb.applicationmtq.Package_Hijaiyah.Activity_Menu_Utama_Harakat;
import com.example.egi_fcb.applicationmtq.Package_Hijaiyah_Dammah.Activity_Hijaiyah_Dammah;
import com.example.egi_fcb.applicationmtq.Package_Hijaiyah_Fathah.Activity_Hijaiyah_Fathah;
import com.example.egi_fcb.applicationmtq.Package_Hijaiyah_Fathah.RecyclerViewAdapter_AHF;
import com.example.egi_fcb.applicationmtq.R;

import java.util.ArrayList;
import java.util.List;

public class Activity_Hijaiyah_Kasrah extends AppCompatActivity {
    RecyclerView recyclerView;
    Context context;

    RecyclerViewAdapter_AHK recyclerViewAdapter_ahk;
    RecyclerView.LayoutManager recyclerViewLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Hijaiyah Kasrah");
        setContentView(R.layout.activity_hijaiyah_kasrah);

        context = getApplicationContext();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view1);

        //Change 2 to your choice because here 2 is the number of Grid layout Columns in each row.
        recyclerViewLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(recyclerViewLayoutManager);
        recyclerViewAdapter_ahk = new RecyclerViewAdapter_AHK(context,getUserInformation());
        recyclerView.setAdapter(recyclerViewAdapter_ahk);
    }

    private List<User> getUserInformation() {

        List<User> userList = new ArrayList<User>();
        userList.add(new User("بِ","BI"));
        userList.add(new User("اِ","I"));

        userList.add(new User("ثِ","TSI"));
        userList.add(new User("تِ","TI"));

        userList.add(new User("حِ","HI'"));
        userList.add(new User("جِ","JI"));

        userList.add(new User("دِ","DZI"));
        userList.add(new User("خِ","KHI'"));

        userList.add(new User("رِ","RI"));
        userList.add(new User("ذِ","RI"));

        userList.add(new User("سِ","SI"));
        userList.add(new User("زِ","ZI"));

        userList.add(new User("صِ","SHI"));
        userList.add(new User("شِ","SYI"));

        userList.add(new User("طِ","THI"));
        userList.add(new User("ضِ","DHI"));

        userList.add(new User("عِ","'I"));
        userList.add(new User("ظِ","ZHI"));

        userList.add(new User("فِ","FI"));
        userList.add(new User("غِ","GHI"));

        userList.add(new User("كِ","KI"));
        userList.add(new User("قِ","QI"));

        userList.add(new User("مِ","MI"));
        userList.add(new User("لِ","LI"));

        userList.add(new User("وِ","WI"));
        userList.add(new User("نِ","NI"));

        userList.add(new User("يِ","YI"));
        userList.add(new User("هِ","HI"));

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
