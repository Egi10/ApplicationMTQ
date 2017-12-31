package com.example.egi_fcb.applicationmtq.Package_Sholat;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.egi_fcb.applicationmtq.Package_Kumpulan_Doa.Farsi;
import com.example.egi_fcb.applicationmtq.R;

public class Fragment_Surat_Pendek_Tiga extends Fragment {

    ImageView imageView;
    TextView judul, arab, arti, ket;

    public Fragment_Surat_Pendek_Tiga() {
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
        arab.setText("إِنَّا أَعْطَيْنَاكَ الْكَوْثَرَ - 108:1"+"\n"+"فَصَلِّ لِرَبِّكَ وَانْحَرْ - 108:2"+"\n"+"إِنَّ شَانِئَكَ هُوَ الْأَبْتَرُ - 108:3");

        arti.setText("108:1 - Sungguh, Kami telah memberimu (Muhammad) nikmat yang banyak."+"\n"+"108:2 - Maka laksanakanlah shalat karena Tuhanmu, dan berkurbanlah (sebagai ibadah dan mendekatkan diri kepada Allah)."+"\n"+"108:3 - Sungguh, orang-orang yang membencimu dialah yang terputus (dari rahmat Allah)");
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
