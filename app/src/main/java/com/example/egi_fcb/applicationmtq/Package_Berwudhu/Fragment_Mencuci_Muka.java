package com.example.egi_fcb.applicationmtq.Package_Berwudhu;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.egi_fcb.applicationmtq.Package_Kumpulan_Doa.Farsi;
import com.example.egi_fcb.applicationmtq.R;

public class Fragment_Mencuci_Muka extends Fragment {

    ImageView imageView;
    TextView judul, arab, arti;

    public Fragment_Mencuci_Muka() {
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


        judul.setText("Mencuci Muka");

        Typeface tf = Farsi.GetFarsiFont(rootView.getContext());
        arab.setTypeface(tf);
        arab.setText("نَوَيْتُ الْوُضُوْءَ لِرَفْعِ الْحَدَثِ اْلاَصْغَرِ فَرْضًا ِللهِ تَعَالَى");

        arti.setText("Selesai Mencuci Lubang Hidung Terus Mencuci Muka Tiga Kali, Mulai Dari Tempat Tumbuhnya Rambut Kepala Hingga Bawah Dagu, dan Dari Telinga Kanan ke Telinga Kiri, Sambil Niat Wudhu Seperti Diatas");

        imageView.setImageResource(R.drawable.wudhu_wajah);

        return rootView;
    }
}
