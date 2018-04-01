package com.example.egi_fcb.applicationmtq.fragment;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.egi_fcb.applicationmtq.fragment.Farsi;
import com.example.egi_fcb.applicationmtq.R;

public class Fragment_Doa_Iftitah extends Fragment {

    ImageView imageView;
    TextView judul, arab, arti, ket;

    public Fragment_Doa_Iftitah() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_cara_sholat, container, false);

        imageView = (ImageView)rootView.findViewById(R.id.image_huruf);
        judul = (TextView)rootView.findViewById(R.id.textViewjudul);
        arab = (TextView)rootView.findViewById(R.id.tv_ayat);
        arti = (TextView)rootView.findViewById(R.id.tv_arti);
        ket = (TextView)rootView.findViewById(R.id.textViewket);


        judul.setText("Doa Iftitah");
        Typeface tf = Farsi.GetFarsiFont(rootView.getContext());
        arab.setTypeface(tf);
        arab.setText("اَللهُ أَكْبَرُ كَبِيْرًا وَالْحَمْدُ ِللهِ كَثِيْرًا وَسُبْحَانَ اللهِ بُكْرَةً وَأَصِيْلاً. إِنِّىْ وَجَّهْتُ وَجْهِيَ لِلَّذِيْ فَطَرَالسَّمَاوَاتِ وَاْلأَرْضَ حَنِيْفًا مُسْلِمًا وَمَا أَنَا مِنَ الْمُشْرِكِيْنَ. إِنَّ صَلاَتِيْ وَنُسُكِيْ وَمَحْيَايَ وَمَمَاتِيْ ِللهِ رَبِّ الْعَالَمِيْنَ. لاَشَرِيْكَ لَهُ وَبِذلِكَ أُمِرْتُ وَأَنَا مِنَ الْمُسْلِمِيْنَ");

        arti.setText("Allah Maha Besar dengan sebesar-besarnya. Segala puji yang sebanyak-banyaknya bagi Allah. Maha Suci Allah pada pagi dan petang hari. Aku menghadapkan wajahku kepada Tuhan yang telah menciptakan langit dan bumi dengan segenap kepatuhan dan kepasrahan diri, dan aku bukanlah termasuk orang-orang yang menyekutukan-Nya. Sesungguhnya sholatku, ibadahku, hidup dan matiku hanyalah kepunyaan Allah, Tuhan semesta alam, yang tiada satu pun sekutu bagi-Nya. Dengan semua itulah aku diperintahkan dan aku adalah termasuk orang-orang yang berserah diri (muslim)");
        ket.setText("Setelah Takbiratul Ihkram Kedua Belah Tangannya Disedekapkan Pada Dada. Kemuadian Membaca Doa Iftitah");

        imageView.setImageResource(R.drawable.sholat_berdiri);


        return rootView;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        return super.onOptionsItemSelected(item);
    }
}
