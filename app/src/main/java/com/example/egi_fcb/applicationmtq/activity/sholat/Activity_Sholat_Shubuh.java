package com.example.egi_fcb.applicationmtq.activity.sholat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.MenuItem;

import com.example.egi_fcb.applicationmtq.fragment.Fragment_Doa_Iftitah;
import com.example.egi_fcb.applicationmtq.fragment.Fragment_Duduk_Antara_Dua_Sujud;
import com.example.egi_fcb.applicationmtq.fragment.Fragment_I_tidal;
import com.example.egi_fcb.applicationmtq.fragment.Fragment_Niat_Sholat_Shubuh;
import com.example.egi_fcb.applicationmtq.fragment.Fragment_Rukuk;
import com.example.egi_fcb.applicationmtq.fragment.Fragment_Salam;
import com.example.egi_fcb.applicationmtq.fragment.Fragment_Sujud;
import com.example.egi_fcb.applicationmtq.fragment.Fragment_Surat_Fatihah;
import com.example.egi_fcb.applicationmtq.fragment.Fragment_Surat_Pendek_Dua;
import com.example.egi_fcb.applicationmtq.fragment.Fragment_Surat_Pendek_Satu;
import com.example.egi_fcb.applicationmtq.fragment.Fragment_Takbiratul_Ikhram;
import com.example.egi_fcb.applicationmtq.fragment.Fragment_Tasyahud_Akhir;
import com.example.egi_fcb.applicationmtq.R;

import java.util.ArrayList;
import java.util.List;

public class Activity_Sholat_Shubuh extends AppCompatActivity {
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sholat);Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Niat Sholat Shubuh");

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if(position == 0){
                    setTitle("Niat Sholat Shubuh");
                }else if(position == 1){
                    setTitle("Takbiratul Ikhram");
                }else if(position == 2){
                    setTitle("Bacaan Do'a Iftitah");
                }else if(position == 3){
                    setTitle("Surat Fatihah");
                }else if(position == 4){
                    setTitle("Surat-Surat Pendek");
                }else if(position == 5){
                    setTitle("Rukuk");
                }else if(position == 6){
                    setTitle("I'tidal");
                }else if(position == 7){
                    setTitle("Sujud");
                }else if(position == 8){
                    setTitle("Duduk Antara Dua Sujud");
                }else if(position == 9){
                    setTitle("Sujud");
                }else if(position == 10){
                    setTitle("Surat Fatihah");
                }else if(position == 11){
                    setTitle("Surat-Surat Pendek");
                }else if(position == 12){
                    setTitle("Rukuk");
                }else if(position == 13){
                    setTitle("I'tidal");
                }else if(position == 14){
                    setTitle("Sujud");
                }else if(position == 15){
                    setTitle("Duduk Antara Dua Sujud");
                }else if(position == 16){
                    setTitle("Sujud");
                }else if(position == 17){
                    setTitle("Tasyahud Akhir");
                }else if(position == 18){
                    setTitle("Salam");
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new Fragment_Niat_Sholat_Shubuh(), "1");
        adapter.addFrag(new Fragment_Takbiratul_Ikhram(), "2");
        adapter.addFrag(new Fragment_Doa_Iftitah(), "3");
        adapter.addFrag(new Fragment_Surat_Fatihah(), "4");
        adapter.addFrag(new Fragment_Surat_Pendek_Satu(), "5");
        adapter.addFrag(new Fragment_Rukuk(), "6");
        adapter.addFrag(new Fragment_I_tidal(), "7");
        adapter.addFrag(new Fragment_Sujud(), "8");
        adapter.addFrag(new Fragment_Duduk_Antara_Dua_Sujud(), "9");
        adapter.addFrag(new Fragment_Sujud(), "10");
        adapter.addFrag(new Fragment_Surat_Fatihah(), "11");
        adapter.addFrag(new Fragment_Surat_Pendek_Dua(), "12");
        adapter.addFrag(new Fragment_Rukuk(), "13");
        adapter.addFrag(new Fragment_I_tidal(), "14");
        adapter.addFrag(new Fragment_Sujud(), "15");
        adapter.addFrag(new Fragment_Duduk_Antara_Dua_Sujud(), "16");
        adapter.addFrag(new Fragment_Sujud(), "17");
        adapter.addFrag(new Fragment_Tasyahud_Akhir(), "18");
        adapter.addFrag(new Fragment_Salam(), "18");


        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFrag(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            // return null to display only the icon
            return null;
        }
    }

    //Tombol Kembali
    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), Activity_Utama_Sholat.class);
        startActivityForResult(myIntent, 0);
        finish();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {
            Intent myIntent = new Intent(getApplicationContext(), Activity_Utama_Sholat.class);
            startActivity(myIntent);
            finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
