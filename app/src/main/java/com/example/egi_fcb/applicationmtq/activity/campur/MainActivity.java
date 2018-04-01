package com.example.egi_fcb.applicationmtq.activity.campur;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.view.KeyEvent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.egi_fcb.applicationmtq.R;
import com.example.egi_fcb.applicationmtq.fragment.Fragment_Hijaiyah;
import com.example.egi_fcb.applicationmtq.activity.doa.Activity_Menu_Utama_Doa;
import com.example.egi_fcb.applicationmtq.activity.team.Activity_Team;
import com.example.egi_fcb.applicationmtq.activity.tuntunansholat.Activity_Tuntunan_Sholat;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setTitle("Belajar Al-Qur'an");

        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mAdView.setVisibility(View.GONE);
        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                mAdView.setVisibility(View.GONE);
            }

            @Override
            public void onAdFailedToLoad(int errorCode) {
                super.onAdFailedToLoad(errorCode);
                mAdView.setVisibility(View.GONE);
            }

            @Override
            public void onAdLeftApplication() {
                super.onAdLeftApplication();
            }

            @Override
            public void onAdOpened() {
                super.onAdOpened();
            }

            @Override
            public void onAdLoaded() {
                super.onAdLoaded();
                mAdView.setVisibility(View.VISIBLE);
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setItemIconTintList(null);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        Bundle bundle = getIntent().getExtras();
        int ab = 0;
        int ab1 = 0;
        if(bundle != null){            
            ab1 = bundle.getInt("data1",0);
            ab = bundle.getInt("data2",0);
        }

        if(ab1 == 2){
            viewPager.setCurrentItem(ab1);
        }
        if(ab == 1){
            viewPager.setCurrentItem(ab);
        }

        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
        //setupTabIcons();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.


        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_asmaul_husna) {
            Intent intent = new Intent(getApplicationContext(), Activity_Asmaul_Husna.class);
            startActivity(intent);
        } else if (id == R.id.nav_shalawat_nabi) {
            Intent intent = new Intent(getApplicationContext(), Activity_Shalawat_Nabi.class);
            startActivity(intent);
        } else if (id == R.id.nav_team) {
            Intent intent = new Intent(getApplicationContext(), Activity_Team.class);
            startActivity(intent);
        } else if (id == R.id.nav_about) {
            Intent intent = new Intent(getApplicationContext(), Activity_About.class);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void setupViewPager(final ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Fragment_Hijaiyah(), "BELAJAR\nAL-QUR'AN");
        adapter.addFragment(new Activity_Menu_Utama_Doa(), "DAFTAR\nDO'A");
        adapter.addFragment(new Activity_Tuntunan_Sholat(), "TUNTUNAN\nSHOLAT");
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if(position == 0){
                    setTitle("Belajar Al-Qur'an");
                }else if(position == 1){
                    setTitle("Daftar Do'a");
                }else if(position == 2){
                    setTitle("Tuntunan Sholat");
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
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

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // return to the App's Home Activity
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {
            AlertDialog.Builder alBuilder = new AlertDialog.Builder(MainActivity.this);
            alBuilder.setMessage("Apakah Saudara Akan Keluar ?");
            alBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent keluar = new Intent(Intent.ACTION_MAIN);
                    keluar.addCategory(Intent.CATEGORY_HOME);
                    keluar.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(keluar);
                }
            }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            final AlertDialog dialog;

            dialog = alBuilder.create();

            dialog.setOnShowListener(new DialogInterface.OnShowListener() {
                @SuppressLint("ResourceAsColor")
                @Override
                public void onShow(DialogInterface dialogInterface) {
                    Button positiveButton = ((AlertDialog) dialog)
                            .getButton(AlertDialog.BUTTON_POSITIVE);
                    positiveButton.setTextColor(R.color.AccentPink);
                    Button negatifeButton = ((AlertDialog) dialog)
                            .getButton(AlertDialog.BUTTON_NEGATIVE);
                    negatifeButton.setTextColor(R.color.AccentPink);
                }
            });
            dialog.show();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    protected void onPause() {
        mAdView.pause();
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mAdView.resume();
    }

    @Override
    protected void onDestroy() {
        mAdView.destroy();
        super.onDestroy();
    }
}