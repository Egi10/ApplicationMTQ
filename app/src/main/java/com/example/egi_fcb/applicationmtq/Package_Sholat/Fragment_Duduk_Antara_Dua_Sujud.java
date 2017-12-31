package com.example.egi_fcb.applicationmtq.Package_Sholat;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.egi_fcb.applicationmtq.Package_Kumpulan_Doa.Farsi;
import com.example.egi_fcb.applicationmtq.R;

public class Fragment_Duduk_Antara_Dua_Sujud extends Fragment {

    ImageView imageView;
    TextView judul, arab, arti, ket;

    public Fragment_Duduk_Antara_Dua_Sujud() {
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


        judul.setText("Duduk Antara Dua Sujud");
        Typeface tf = Farsi.GetFarsiFont(rootView.getContext());
        arab.setTypeface(tf);
        arab.setText("رَبِّ اغْفِرْلِيْ وَارْحَمْنِيْ وَاجْبُرْنِيْ وَارْفَعْنِيْ وَارْزُقْنِيْ وَاهْدِنِيْ وَعَافِنِيْ وَاعْفُ عَنِّيْ");

        arti.setText("Ya Allah,ampunilah dosaku,belas kasihinilah aku dan cukuplah segala kekuranganku da angkatlah derajatku dan berilah rezeki kepadaku,dan berilah aku petunjuk dan berilah kesehatan padaku dan berilah ampunan kepadaku");
        ket.setText("Setelah Sujud Kemudian Duduk Serta Membaca Allahu Akbar");

        imageView.setImageResource(R.drawable.sholat_duduk_antara_dua_sujud);
        return rootView;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        return super.onOptionsItemSelected(item);
    }
}
