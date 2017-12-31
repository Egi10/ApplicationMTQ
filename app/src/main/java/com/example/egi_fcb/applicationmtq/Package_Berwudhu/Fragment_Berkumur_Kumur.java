package com.example.egi_fcb.applicationmtq.Package_Berwudhu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.egi_fcb.applicationmtq.R;

public class Fragment_Berkumur_Kumur extends Fragment {

    ImageView imageView;
    TextView judul, arti;

    public Fragment_Berkumur_Kumur() {
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


        judul.setText("Berkumur-Kumur");

        arti.setText("Selesai Membersihkan Tangan Terus Berkumur-Kumur Tiga Kali, Sambil Membersihkan Gigi");

        imageView.setImageResource(R.drawable.wudhu_kumur_kumur);

        return rootView;
    }
}
