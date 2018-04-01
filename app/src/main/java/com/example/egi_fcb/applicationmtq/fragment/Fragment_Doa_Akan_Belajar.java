package com.example.egi_fcb.applicationmtq.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.egi_fcb.applicationmtq.R;

public class Fragment_Doa_Akan_Belajar extends Fragment {

    ImageView imageView;
    TextView judul, arab, arti;

    public Fragment_Doa_Akan_Belajar() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_fargment_doa, container, false);

        imageView = (ImageView)rootView.findViewById(R.id.image_huruf);
        judul = (TextView)rootView.findViewById(R.id.textViewjudul);
        arab = (TextView)rootView.findViewById(R.id.textViewayat);
        arti = (TextView)rootView.findViewById(R.id.textViewarti);


        judul.setText("Doa Ketika Akan Belajar");
        arab.setText("يَارَبِّ زِدْنِىْ عِلْمًا وَارْزُقْنِىْ فَهْمًا");
        arti.setText("Ya Allah, tambahkanlah aku ilmu dan berikanlah aku rizqi akan kepahaman");

        imageView.setImageResource(R.mipmap.ic_launcher);

        return rootView;
    }
}
