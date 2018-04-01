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

public class Fragment_Surat_Pendek_Empat extends Fragment {

    ImageView imageView;
    TextView judul, arab, arti, ket;

    public Fragment_Surat_Pendek_Empat() {
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
        arab.setText("لِإِيلَافِ قُرَيْشٍ - 106:1"+"\n"+"إِيلَافِهِمْ رِحْلَةَ الشِّتَاءِ وَالصَّيْفِ - 106:2"+"\n"+"فَلْيَعْبُدُوا رَبَّ هَٰذَا الْبَيْتِ - 106:3"+"\n"+"الَّذِي أَطْعَمَهُم مِّن جُوعٍ وَآمَنَهُم مِّنْ خَوْفٍ - 106:4");

        arti.setText("106:1 - Karena kebiasaan orang-orang Quraisy"+"\n"+"106:2 - Yaitu kebiasaan mereka bepergian pada musim dingin dan musim panas."+"\n"+"106:3 - Maka hendaklah mereka menyembah Tuhan (pemilik) rumah ini (Ka‘bah),"+"\n"+"106:4 - Yang telah memberi makanan kepada mereka untuk menghilangkan lapar dan mengamankan mereka dari rasa ketakutan.");
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
