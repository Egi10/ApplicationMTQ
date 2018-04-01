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

public class Fragment_Niat_Sholat_Maghrib extends Fragment {

    ImageView imageView;
    TextView judul, arab, arti, ket;

    public Fragment_Niat_Sholat_Maghrib() {
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


        judul.setText("Niat Sholat Maghrib");
        Typeface tf = Farsi.GetFarsiFont(rootView.getContext());
        arab.setTypeface(tf);
        arab.setText("اُصَلِّيْ فَرْضَ اْلْمَغْرِبِ ثَلاَثَ رَكَعَاتٍ مُسْتَقْبِلَ اْلقِبْلَةِ اَدَاءً لِلَّهِ تَعَالَى" );

        arti.setText("Aku niat melakukan shalat fardu maghrib 3 rakaat menghadap kiblat karena Allah ta'ala");
        ket.setText("Berdiri Tegak Menghadap Kiblat dan Niat Mengerjakan Shalat. Niat Shalat Menurut Shalat Yang Sedang Dikerjakan");

        imageView.setImageResource(R.drawable.sholat_niat);

        return rootView;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        return super.onOptionsItemSelected(item);
    }
}
