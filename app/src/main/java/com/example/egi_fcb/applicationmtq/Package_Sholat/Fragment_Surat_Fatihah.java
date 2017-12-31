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

public class Fragment_Surat_Fatihah extends Fragment {

    ImageView imageView;
    TextView judul, arab, arti, ket;

    public Fragment_Surat_Fatihah() {
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


        judul.setText("Surat Fatihah");
        Typeface tf = Farsi.GetFarsiFont(rootView.getContext());
        arab.setTypeface(tf);
        arab.setText("بِسْمِ اللَّهِ الرَّحْمَٰنِ الرَّحِيمِ - 1:1"+"\n"+"الْحَمْدُ لِلَّهِ رَبِّ الْعَالَمِينَ - 1:2"+"\n"+"الرَّحْمَٰنِ الرَّحِيمِ - 1:3"+"\n"+"مَالِكِ يَوْمِ الدِّينِ - 1:4"+"\n"+"إِيَّاكَ نَعْبُدُ وَإِيَّاكَ نَسْتَعِينُ - 1:5"+"\n"+"اهْدِنَا الصِّرَاطَ الْمُسْتَقِيمَ - 1:6"+"\n"+"صِرَاطَ الَّذِينَ أَنْعَمْتَ عَلَيْهِمْ غَيْرِ الْمَغْضُوبِ عَلَيْهِمْ وَلَا الضَّالِّينَ - 1:7");

        arti.setText("1:1 - Dengan menyebut nama Allah yang Maha Pemurah lagi Maha Penyayang"+"\n"+"1:2 - Segala puji bagi Allah, Tuhan semesta alam"+"\n"+"1:3 - Maha Pemurah lagi Maha Penyayang"+"\n"+"1:4 - Yang menguasai di hari Pembalasan"+"\n"+"1:5 - Hanya Engkaulah yang Kami sembah, dan hanya kepada Engkaulah Kami meminta pertolongan"+"\n"+"1:6 - Tunjukilah Kami jalan yang lurus"+"\n"+"1:7 - Yaitu jalan orang-orang yang telah Engkau beri nikmat kepada mereka; bukan (jalan) mereka yang dimurkai dan bukan (pula jalan) mereka yang sesat");
        ket.setText("Selesai Membaca Doa Iftitah, Kemudian Membaca Surat Fatihah");

        imageView.setImageResource(R.drawable.sholat_berdiri);
        return rootView;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        return super.onOptionsItemSelected(item);
    }
}
