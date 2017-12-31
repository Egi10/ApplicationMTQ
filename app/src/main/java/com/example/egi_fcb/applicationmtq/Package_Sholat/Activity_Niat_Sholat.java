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

import com.example.egi_fcb.applicationmtq.Package_Utama_Sholat.Activity_Tata_Cara_Sholat;
import com.example.egi_fcb.applicationmtq.Package_Utama_Sholat.Activity_Utama_Sholat;
import com.example.egi_fcb.applicationmtq.R;

import java.util.ArrayList;
import java.util.List;

public class Activity_Niat_Sholat extends AppCompatActivity {
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
                    setTitle("Niat Sholat Shubuh");
                }else if(position == 2){
                    setTitle("Niat Sholat Dzuhur");
                }else if(position == 3){
                    setTitle("Niat Sholat Ashar");
                }else if(position == 4){
                    setTitle("Niat Sholat Maghrib");
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
        adapter.addFrag(new Fragment_Niat_Sholat_Shubuh(), "2");
        adapter.addFrag(new Fragment_Niat_Sholat_Dzuhur(), "3");
        adapter.addFrag(new Fragment_Niat_Sholat_Ashar(), "4");
        adapter.addFrag(new Fragment_Niat_Sholat_Maghrib(), "5");

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
        Intent myIntent = new Intent(getApplicationContext(), Activity_Tata_Cara_Sholat.class);
        startActivityForResult(myIntent, 0);
        finish();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {
            Intent myIntent = new Intent(getApplicationContext(), Activity_Tata_Cara_Sholat.class);
            startActivity(myIntent);
            finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
