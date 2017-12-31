package com.example.egi_fcb.applicationmtq.Package_Berwudhu;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.egi_fcb.applicationmtq.Package_Kumpulan_Doa.Farsi;
import com.example.egi_fcb.applicationmtq.Package_Surat_Pendek.Activity_Surat_Al_Falak;
import com.example.egi_fcb.applicationmtq.R;

public class Fragment_Telapak_Tangan extends Fragment {

    ImageView imageView;
    TextView judul, arab, arti;

    public Fragment_Telapak_Tangan() {
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

        View rootView = inflater.inflate(R.layout.activity_berwudhu_ayat, container, false);

        imageView = (ImageView)rootView.findViewById(R.id.image_huruf);
        judul = (TextView)rootView.findViewById(R.id.textViewjudul);
        arab = (TextView)rootView.findViewById(R.id.textViewayat);
        arti = (TextView)rootView.findViewById(R.id.textViewket);


        judul.setText("Mencuci Kedua Belah Tangan");
        Typeface tf = Farsi.GetFarsiFont(rootView.getContext());
        arab.setTypeface(tf);
        arab.setText("بِسْمِ اللهِ الرَّحْمنِ الرَّحِيمِ");

        arti.setText("Sambil Mencuci Kedua Belah Tangan Sampai Pergelangan Tangan Dengan Bersih");

        imageView.setImageResource(R.drawable.wudhu_tangan_jari);

        return rootView;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        return super.onOptionsItemSelected(item);
    }
}
