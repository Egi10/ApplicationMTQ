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

public class Fragment_Surat_Pendek_Satu extends Fragment {

    ImageView imageView;
    TextView judul, arab, arti, ket;

    public Fragment_Surat_Pendek_Satu() {
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


        judul.setText("Surat-Surat Pendek");
        Typeface tf = Farsi.GetFarsiFont(rootView.getContext());
        arab.setTypeface(tf);
        arab.setText("قُلْ هُوَ اللَّهُ أَحَدٌ - 112:1"+"\n"+"اللَّهُ الصَّمَدُ - 112:2"+"\n"+"لَمْ يَلِدْ وَلَمْ يُولَدْ - 112:3"+"\n"+"وَلَمْ يَكُن لَّهُ كُفُوًا أَحَدٌ - 112:4");

        arti.setText("112:1 - Katakanlah (Muhammad), Dialah Allah, Yang Maha Esa"+"\n"+"112:2 - Allah tempat meminta segala sesuatu"+"\n"+"112:3 - (Allah) tidak beranak dan tidak pula diperanakkan"+"\n"+"112:4 - Dan tidak ada sesuatu yang setara dengan Dia");
        ket.setText("Selesai Membaca Fatihah Dalam Raka'at Yang Pertama dan Kedua Bagi Orang Yang Shalat Sendirian Atau Imam, disunahkan membaca surat atau Ayat-Al-Qur'an");

        imageView.setImageResource(R.drawable.sholat_berdiri);
        return rootView;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        return super.onOptionsItemSelected(item);
    }
}
