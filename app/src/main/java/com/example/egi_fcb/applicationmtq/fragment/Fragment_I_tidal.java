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

public class Fragment_I_tidal extends Fragment {

    ImageView imageView;
    TextView judul, arab, arti, ket;

    public Fragment_I_tidal() {
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


        judul.setText("I'tidal");
        Typeface tf = Farsi.GetFarsiFont(rootView.getContext());
        arab.setTypeface(tf);
        arab.setText("سَمِعَ اللهُ لِمَنْ حَمِدَهُ"+"\n \n"+"رَبَّنَا لَكَ الْحَمْدُ مِلْءُ السَّموَاتِ وَمِلْءُ اْلاَرْضِ وَمِلْءُمَاشِئْتَ مِنْ شَيْئٍ بَعْدُ");

        arti.setText("Allah mendengar orang yang memuji-Nya"+"\n \n"+"Wahai Tuhan Kami ! Hanya Untuk-Mu lah Segala Puji, Sepenuh Langit Dan Bumi Dan Sepenuh Barang Yang Kau Kehendaki Sesudahnya.");
        ket.setText("Selesai rukuk, terus bangkitlah tegak dengan mengangkat kedua belah tangan setentang telinga");

        imageView.setImageResource(R.drawable.sholat_iktidal);

        return rootView;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        return super.onOptionsItemSelected(item);
    }
}
