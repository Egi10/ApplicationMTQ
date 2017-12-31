package com.example.egi_fcb.applicationmtq.Package_Berwudhu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.egi_fcb.applicationmtq.R;

public class Fragment_Menyapu_Kedua_Belah_Teliga extends Fragment {

    ImageView imageView;
    TextView judul, arti;

    public Fragment_Menyapu_Kedua_Belah_Teliga() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_berwudhu, container, false);

        imageView = (ImageView)rootView.findViewById(R.id.image_huruf);
        judul = (TextView)rootView.findViewById(R.id.textViewjudul);
        arti = (TextView)rootView.findViewById(R.id.textViewket);


        judul.setText("Menyapu Kedua Belah Telinga");

        arti.setText("Selesai Menyapu Sebagian Rambut Kepala, Terus Menyapu Kedua Belah Telinga Tiga Kali");

        imageView.setImageResource(R.drawable.wudhu_telinga);

        return rootView;
    }
}
