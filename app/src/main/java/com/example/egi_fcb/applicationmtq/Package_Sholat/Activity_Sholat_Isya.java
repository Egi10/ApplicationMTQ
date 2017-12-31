package com.example.egi_fcb.applicationmtq.Package_Sholat;

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

import com.example.egi_fcb.applicationmtq.MainActivity;
import com.example.egi_fcb.applicationmtq.Package_Utama_Sholat.Activity_Utama_Sholat;
import com.example.egi_fcb.applicationmtq.R;

import java.util.ArrayList;
import java.util.List;

public class Activity_Sholat_Isya extends AppCompatActivity {
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sholat);Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Niat Sholat Isya");

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if(position == 0){
                    setTitle("Niat Sholat Isya");
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
                    setTitle("Duduk Tasyahud Awal");
                }else if(position == 18){
                    setTitle("Surat Fatihah");
                }else if(position == 19){
                    setTitle("Surat-Surat Pendek");
                }else if(position == 20){
                    setTitle("Rukuk");
                }else if(position == 21){
                    setTitle("I'tidal");
                }else if(position == 22){
                    setTitle("Sujud");
                }else if(position == 23){
                    setTitle("Duduk Antara Dua Sujud");
                }else if(position == 24){
                    setTitle("Sujud");
                }else if(position == 25){
                    setTitle("Surat Fatihah");
                }else if(position == 26){
                    setTitle("Surat-Surat Pendek");
                }else if(position == 27){
                    setTitle("Rukuk");
                }else if(position == 28){
                    setTitle("I'tidal");
                }else if(position == 29){
                    setTitle("Sujud");
                }else if(position == 30){
                    setTitle("Duduk Antara Dua Sujud");
                }else if(position == 31){
                    setTitle("Sujud");
                }else if(position == 32){
                    setTitle("Tasyahud Akhir");
                }else if(position == 33){
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
        adapter.addFrag(new Fragment_Niat_Sholat_Isya(), "1");
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
        adapter.addFrag(new Fragment_Tahiyat_Awal(), "18");
        adapter.addFrag(new Fragment_Surat_Fatihah(), "19");
        adapter.addFrag(new Fragment_Surat_Pendek_Tiga(), "20");
        adapter.addFrag(new Fragment_Rukuk(), "21");
        adapter.addFrag(new Fragment_I_tidal(), "22");
        adapter.addFrag(new Fragment_Sujud(), "15");
        adapter.addFrag(new Fragment_Duduk_Antara_Dua_Sujud(), "23");
        adapter.addFrag(new Fragment_Sujud(), "24");
        adapter.addFrag(new Fragment_Surat_Fatihah(), "25");
        adapter.addFrag(new Fragment_Surat_Pendek_Empat(), "26");
        adapter.addFrag(new Fragment_Rukuk(), "27");
        adapter.addFrag(new Fragment_I_tidal(), "28");
        adapter.addFrag(new Fragment_Sujud(), "29");
        adapter.addFrag(new Fragment_Duduk_Antara_Dua_Sujud(), "30");
        adapter.addFrag(new Fragment_Sujud(), "31");
        adapter.addFrag(new Fragment_Tasyahud_Akhir(), "32");
        adapter.addFrag(new Fragment_Salam(), "33");

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
