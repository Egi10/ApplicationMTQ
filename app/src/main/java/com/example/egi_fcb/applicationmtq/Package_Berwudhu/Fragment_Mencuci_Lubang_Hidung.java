package com.example.egi_fcb.applicationmtq.Package_Berwudhu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.egi_fcb.applicationmtq.R;

public class Fragment_Mencuci_Lubang_Hidung extends Fragment {

    ImageView imageView;
    TextView judul, arti;

    public Fragment_Mencuci_Lubang_Hidung() {
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


        judul.setText("Mencuci Lubang Hidung");

        arti.setText("Selesai Berkumur Terus Mencuci Lubang Hidung Tiga Kali");

        imageView.setImageResource(R.drawable.wudhu_hidung);

        return rootView;
    }
}
