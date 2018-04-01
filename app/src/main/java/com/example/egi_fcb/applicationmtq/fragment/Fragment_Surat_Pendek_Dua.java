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

public class Fragment_Surat_Pendek_Dua extends Fragment {

    ImageView imageView;
    TextView judul, arab, arti, ket;

    public Fragment_Surat_Pendek_Dua() {
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
        arab.setText("إِذَا جَاءَ نَصْرُ اللَّهِ وَالْفَتْحُ - 110:1"+"\n"+"وَرَأَيْتَ النَّاسَ يَدْخُلُونَ فِي دِينِ اللَّهِ أَفْوَاجًا - 110:2"+"\n"+"فَسَبِّحْ بِحَمْدِ رَبِّكَ وَاسْتَغْفِرْهُ ۚ إِنَّهُ كَانَ تَوَّابًا - 110:3");

        arti.setText("110:1 - Apabila telah datang pertolongan Allah dan kemenangan"+"\n"+"110:2 - Dan engkau melihat manusia berbondong-bondong masuk agama Allah"+"\n"+"110:3 - Maka bertasbihlah dengan memuji Tuhanmu dan mohonlah ampunan kepada-Nya. Sungguh, Dia Maha Penerima tobat");
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
