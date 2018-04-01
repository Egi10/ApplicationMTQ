package com.example.egi_fcb.applicationmtq.fragment;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.egi_fcb.applicationmtq.R;

public class Fragment_Doa_Sesudah_Wudhu extends Fragment {

    ImageView imageView;
    TextView judul, arab, arti;

    public Fragment_Doa_Sesudah_Wudhu() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_berwudhu_ayat, container, false);

        imageView = (ImageView)rootView.findViewById(R.id.image_huruf);
        judul = (TextView)rootView.findViewById(R.id.textViewjudul);
        arab = (TextView)rootView.findViewById(R.id.textViewayat);
        arti = (TextView)rootView.findViewById(R.id.textViewket);


        judul.setText("Doa Sesudah Berwudhu");

        Typeface tf = Farsi.GetFarsiFont(rootView.getContext());
        arab.setTypeface(tf);
        arab.setText("اَشْهَدُ اَنْ لآّاِلَهَ اِلاَّاللهُ وَحْدَهُ لاَشَرِيْكَ لَهُ وَاَشْهَدُ اَنَّ مُحَمَّدًاعَبْدُهُ وَرَسُوْلُهُ. اَللهُمَّ اجْعَلْنِىْ مِنَ التَّوَّابِيْنَ وَاجْعَلْنِىْ مِنَ الْمُتَطَهِّرِيْنَ");

        arti.setText("Selesai Berwudhu Disunnahkan Membaca Doa Sambil Menghadap Ke Kiblat, dan Mengangkat Kedua Belah Tangannya");

        imageView.setImageResource(R.drawable.wudhu_doa);

        return rootView;
    }
}
