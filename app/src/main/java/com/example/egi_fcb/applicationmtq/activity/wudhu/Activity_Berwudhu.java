package com.example.egi_fcb.applicationmtq.activity.wudhu;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.MenuItem;

import com.example.egi_fcb.applicationmtq.fragment.Fragment_Berkumur_Kumur;
import com.example.egi_fcb.applicationmtq.fragment.Fragment_Doa_Sesudah_Wudhu;
import com.example.egi_fcb.applicationmtq.fragment.Fragment_Mencuci_Kaki;
import com.example.egi_fcb.applicationmtq.fragment.Fragment_Mencuci_Lubang_Hidung;
import com.example.egi_fcb.applicationmtq.fragment.Fragment_Mencuci_Muka;
import com.example.egi_fcb.applicationmtq.fragment.Fragment_Mencuci_Tangan;
import com.example.egi_fcb.applicationmtq.fragment.Fragment_Menyapu_Kedua_Belah_Teliga;
import com.example.egi_fcb.applicationmtq.fragment.Fragment_Menyapu_Sebagian_Rambut;
import com.example.egi_fcb.applicationmtq.fragment.Fragment_Telapak_Tangan;
import com.example.egi_fcb.applicationmtq.R;

import java.util.ArrayList;
import java.util.List;

public class Activity_Berwudhu extends AppCompatActivity {
    private ViewPager viewPager;
    MediaPlayer mediaPlayer, mediaPlayer1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__berwudhu);Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Mencuci Kedua Belah Tangan");

        mediaPlayer = MediaPlayer.create(Activity_Berwudhu.this, mAudio[0]);
        mediaPlayer.start();

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setCurrentItem(0);
        setupViewPager(viewPager);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if(position == 0){
                    mediaPlayer = MediaPlayer.create(Activity_Berwudhu.this, mAudio[0]);
                    mediaPlayer.start();
                    setTitle("Mencuci Kedua Belah Tangan");
                }else if(position == 1){
                    mediaPlayer.stop();
                    //mediaPlayer1 = MediaPlayer.create(Activity_Berwudhu.this, mAudio[1]);
                    //mediaPlayer1.start();
                    setTitle("Mencuci Kedua Belah Tangan");
                    setTitle("Berkumur-Kumur");
                }else if(position == 2){
                    mediaPlayer.stop();
                    setTitle("Mencuci Lubang Hidung");
                }else if(position == 3){
                    mediaPlayer = MediaPlayer.create(Activity_Berwudhu.this, mAudio[3]);
                    mediaPlayer.start();
                    setTitle("Mencuci Muka");
                }else if(position == 4){
                    mediaPlayer.stop();
                    setTitle("Mencuci Tangan");
                }else if(position == 5){
                    mediaPlayer.stop();
                    setTitle("Menyapu Sebagian Rambu");
                }else if(position == 6){
                    mediaPlayer.stop();
                    setTitle("Menyapu Kedua Belah Telinga");
                }else if(position == 7){
                    mediaPlayer.stop();
                    setTitle("Mencuci Kedua Kaki");
                }else if(position == 8){
                    mediaPlayer = MediaPlayer.create(Activity_Berwudhu.this, mAudio[8]);
                    mediaPlayer.start();
                    setTitle("Doa Sesudah Berwudhu");
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private int[] mAudio = new int[]{R.raw.wudhu_bismillah,R.raw.doa_masuk_kamar_mandi,R.raw.wudhu_bismillah,R.raw.wudhu_niat_berwudhu,R.raw.wudhu_bismillah,R.raw.wudhu_bismillah,R.raw.wudhu_bismillah,R.raw.wudhu_bismillah,R.raw.wudhu_doa_setelah_wudhu,};

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new Fragment_Telapak_Tangan(), "1");
        adapter.addFrag(new Fragment_Berkumur_Kumur(), "2");
        adapter.addFrag(new Fragment_Mencuci_Lubang_Hidung(), "3");
        adapter.addFrag(new Fragment_Mencuci_Muka(), "4");
        adapter.addFrag(new Fragment_Mencuci_Tangan(), "5");
        adapter.addFrag(new Fragment_Menyapu_Sebagian_Rambut(), "6");
        adapter.addFrag(new Fragment_Menyapu_Kedua_Belah_Teliga(), "7");
        adapter.addFrag(new Fragment_Mencuci_Kaki(), "8");
        adapter.addFrag(new Fragment_Doa_Sesudah_Wudhu(), "9");
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
        mediaPlayer.stop();
        Bundle bundle = new Bundle();
        bundle.putInt("data1", 4);
        Intent intent = new Intent(getApplicationContext(), Activity_Utama_Wudhu.class);
        intent.putExtras(bundle);
        startActivity(intent);
        finish();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {
            mediaPlayer.stop();
            Bundle bundle = new Bundle();
            bundle.putInt("data1", 4);
            Intent intent = new Intent(getApplicationContext(), Activity_Utama_Wudhu.class);
            intent.putExtras(bundle);
            startActivity(intent);
            finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }


}
