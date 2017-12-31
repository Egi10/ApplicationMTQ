package com.example.egi_fcb.applicationmtq.Package_Utama_Sholat;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.MenuItem;

import com.example.egi_fcb.applicationmtq.MainActivity;
import com.example.egi_fcb.applicationmtq.Package_Surat_Pendek.Activity_Surat_Pendek;
import com.example.egi_fcb.applicationmtq.Package_Wudhu.RecyclerViewAdapter_Rukun_Wudhu;
import com.example.egi_fcb.applicationmtq.R;

import java.util.ArrayList;
import java.util.List;

public class Activity_Jumlah_Sholat extends AppCompatActivity {
    RecyclerView recyclerView;
    Context context;

    RecyclerViewAdapter_Jumlah_Sholat recyclerViewAdapter_sholat;
    RecyclerView.LayoutManager recyclerViewLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syarat_wudhu);
        setTitle("Jumlah dan Waktu Shalat");

        context = getApplicationContext();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        //Change 2 to your choice because here 2 is the number of Grid layout Columns in each row.
        recyclerViewLayoutManager = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(recyclerViewLayoutManager);
        recyclerViewAdapter_sholat = new RecyclerViewAdapter_Jumlah_Sholat(context,getUserInformation());
        recyclerView.setAdapter(recyclerViewAdapter_sholat);
    }

    private List<User> getUserInformation() {

        List<User> userList = new ArrayList<User>();
        userList.add(new User("1","Shalat Shubuh 2 rakaat, waktunya dimulai dari terbir fajar sadik (fajar putih yang terbenam di ufuk timur) sampai terbitnya matahari"));
        userList.add(new User("2","Shalat Dhuhur 4 rakaat, waktunya setelah tergelincir matahari sampai bayang-bayang suatu benda telah sama dengan panjang benda tersebut"));
        userList.add(new User("3","Shalat Ashar 4 rakaat, waktunya setelah habis waktu shalat dhuhur sampai matahari terbenam di ufuk barat"));
        userList.add(new User("4","Shalat Maghrib 3 rakaat, waktunya mulai terbenamnya matahari sampai hilangnya mega merah"));
        userList.add(new User("5","Sholat Isya 4 rakaat, waktunya mulai hilangnya mega merah hingga terbitnya fajar sadik"));

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
        bundle.putInt("data1", 0);
        Intent intent = new Intent(getApplicationContext(), Activity_Utama_Sholat.class);
        intent.putExtras(bundle);
        startActivity(intent);
        finish();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {
            Bundle bundle = new Bundle();
            bundle.putInt("data1", 0);
            Intent intent = new Intent(getApplicationContext(), Activity_Utama_Sholat.class);
            intent.putExtras(bundle);
            startActivity(intent);
            finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}