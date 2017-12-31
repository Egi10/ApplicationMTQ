package com.example.egi_fcb.applicationmtq.Package_Perintah_Sholat;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.MenuItem;

import com.example.egi_fcb.applicationmtq.MainActivity;
import com.example.egi_fcb.applicationmtq.Package_Hijaiyah_Perkenalan.Activity_Hijaiyah;
import com.example.egi_fcb.applicationmtq.Package_Hijaiyah_Perkenalan.RecyclerViewAdapter_AH;
import com.example.egi_fcb.applicationmtq.Package_Surat_Pendek.Activity_Surat_Al_Falak;
import com.example.egi_fcb.applicationmtq.Package_Surat_Pendek.Activity_Surat_Pendek;
import com.example.egi_fcb.applicationmtq.R;

import java.util.ArrayList;
import java.util.List;

public class Activity_Perintah_Sholat extends AppCompatActivity {

    RecyclerView recyclerView;
    Context context;
    MediaPlayer mediaPlayer;

    RecyclerViewAdapter_APS recyclerViewAdapter_aps;
    RecyclerView.LayoutManager recyclerViewLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Perintah Sholat");
        setContentView(R.layout.activity_perintah_sholat);

        context = getApplicationContext();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view1);

        //Change 2 to your choice because here 2 is the number of Grid layout Columns in each row.
        recyclerViewLayoutManager = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(recyclerViewLayoutManager);
        recyclerViewAdapter_aps = new RecyclerViewAdapter_APS(context,getUserInformation());
        recyclerView.setAdapter(recyclerViewAdapter_aps);
    }

    private List<User> getUserInformation() {

        List<User> userList = new ArrayList<User>();
        userList.add(new User("وَإِذْ أَخَذْنَا مِيثَٰقَ بَنِىٓ إِسْرَٰٓءِيلَ لَا تَعْبُدُونَ إِلَّا ٱللَّهَ وَبِٱلْوَٰلِدَيْنِ إِحْسَانًا وَذِى ٱلْقُرْبَىٰ وَٱلْيَتَٰمَىٰ وَٱلْمَسَٰكِينِ وَقُولُوا۟ لِلنَّاسِ حُسْنًا وَأَقِيمُوا۟ ٱلصَّلَوٰةَ وَءَاتُوا۟ ٱلزَّكَوٰةَ ثُمَّ تَوَلَّيْتُمْ إِلَّا قَلِيلًا مِّنكُمْ وَأَنتُم مُّعْرِضُونَ","Dan (ingatlah), ketika Kami mengambil janji dari Bani Israil (yaitu): Janganlah kamu menyembah selain Allah, dan berbuat kebaikanlah kepada ibu bapa, kaum kerabat, anak-anak yatim, dan orang-orang miskin, serta ucapkanlah kata-kata yang baik kepada manusia, dirikanlah shalat dan tunaikanlah zakat. Kemudian kamu tidak memenuhi janji itu, kecuali sebahagian kecil daripada kamu, dan kamu selalu berpaling","QS. Al-Baqarah [2] : 83"));
        userList.add(new User("وَأَقِيمُوا۟ ٱلصَّلَوٰةَ وَءَاتُوا۟ ٱلزَّكَوٰةَ ۚ وَمَا تُقَدِّمُوا۟ لِأَنفُسِكُم مِّنْ خَيْرٍ تَجِدُوهُ عِندَ ٱللَّهِ ۗ إِنَّ ٱللَّهَ بِمَا تَعْمَلُونَ بَصِيرٌ","Dan dirikanlah shalat dan tunaikanlah zakat. Dan kebaikan apa saja yang kamu usahakan bagi dirimu, tentu kamu akan mendapat pahala nya pada sisi Allah. Sesungguhnya Alah Maha Melihat apa-apa yang kamu kerjakan.","QS. Al-Baqarah [2] : 110"));
        userList.add(new User("فَإِذَا قَضَيْتُمُ ٱلصَّلَوٰةَ فَٱذْكُرُوا۟ ٱللَّهَ قِيَٰمًا وَقُعُودًا وَعَلَىٰ جُنُوبِكُمْ ۚ فَإِذَا ٱطْمَأْنَنتُمْ فَأَقِيمُوا۟ ٱلصَّلَوٰةَ ۚ إِنَّ ٱلصَّلَوٰةَ كَانَتْ عَلَى ٱلْمُؤْمِنِينَ كِتَٰبًا مَّوْقُوتًا","Maka apabila kamu telah menyelesaikan shalat(mu), ingatlah Allah di waktu berdiri, di waktu duduk dan di waktu berbaring. Kemudian apabila kamu telah merasa aman, maka dirikanlah shalat itu (sebagaimana biasa). Sesungguhnya shalat itu adalah fardhu yang ditentukan waktunya atas orang-orang yang beriman","QS. An-Nisa' [4] : 103"));
        userList.add(new User("وَأَقِمِ ٱلصَّلَوٰةَ طَرَفَىِ ٱلنَّهَارِ وَزُلَفًا مِّنَ ٱلَّيْلِ ۚ إِنَّ ٱلْحَسَنَٰتِ يُذْهِبْنَ ٱلسَّيِّـَٔاتِ ۚ ذَٰلِكَ ذِكْرَىٰ لِلذَّٰكِرِينَ","Dan dirikanlah sembahyang itu pada kedua tepi siang (pagi dan petang) dan pada bahagian permulaan daripada malam. Sesungguhnya perbuatan-perbuatan yang baik itu menghapuskan (dosa) perbuatan-perbuatan yang buruk. Itulah peringatan bagi orang-orang yang ingat","QS. Hud [11] : 114"));
        userList.add(new User("قُل لِّعِبَادِىَ ٱلَّذِينَ ءَامَنُوا۟ يُقِيمُوا۟ ٱلصَّلَوٰةَ وَيُنفِقُوا۟ مِمَّا رَزَقْنَٰهُمْ سِرًّا وَعَلَانِيَةً مِّن قَبْلِ أَن يَأْتِىَ يَوْمٌ لَّا بَيْعٌ فِيهِ وَلَا خِلَٰلٌ","Katakanlah kepada hamba-hamba-Ku yang telah beriman: \"Hendaklah mereka mendirikan shalat, menafkahkan sebahagian rezeki yang Kami berikan kepada mereka secara sembunyi ataupun terang-terangan sebelum datang hari (kiamat) yang pada bari itu tidak ada jual beli dan persahabatan","QS. 'Ibrahim [14] : 31"));
        userList.add(new User("أَقِمِ ٱلصَّلَوٰةَ لِدُلُوكِ ٱلشَّمْسِ إِلَىٰ غَسَقِ ٱلَّيْلِ وَقُرْءَانَ ٱلْفَجْرِ ۖ إِنَّ قُرْءَانَ ٱلْفَجْرِ كَانَ مَشْهُودًا","Dirikanlah shalat dari sesudah matahari tergelincir sampai gelap malam dan (dirikanlah pula shalat) subuh. Sesungguhnya shalat subuh itu disaksikan (oleh malaikat)","QS. Al-'Isra' [17] : 78"));
        userList.add(new User("إِنَّنِىٓ أَنَا ٱللَّهُ لَآ إِلَٰهَ إِلَّآ أَنَا۠ فَٱعْبُدْنِى وَأَقِمِ ٱلصَّلَوٰةَ لِذِكْرِىٓ","Sesungguhnya Aku ini adalah Allah, tidak ada Tuhan (yang hak) selain Aku, maka sembahlah Aku dan dirikanlah shalat untuk mengingat Aku","QS. Taha [20] : 14"));
        userList.add(new User("وَأَقِيمُوا۟ ٱلصَّلَوٰةَ وَءَاتُوا۟ ٱلزَّكَوٰةَ وَأَطِيعُوا۟ ٱلرَّسُولَ لَعَلَّكُمْ تُرْحَمُونَ","Dan dirikanlah sembahyang, tunaikanlah zakat, dan taatlah kepada rasul, supaya kamu diberi rahmat","QS. An-Nur [24] : 56"));
        userList.add(new User("يَٰبُنَىَّ أَقِمِ ٱلصَّلَوٰةَ وَأْمُرْ بِٱلْمَعْرُوفِ وَٱنْهَ عَنِ ٱلْمُنكَرِ وَٱصْبِرْ عَلَىٰ مَآ أَصَابَكَ ۖ إِنَّ ذَٰلِكَ مِنْ عَزْمِ ٱلْأُمُورِ","Hai anakku, dirikanlah shalat dan suruhlah (manusia) mengerjakan yang baik dan cegahlah (mereka) dari perbuatan yang mungkar dan bersabarlah terhadap apa yang menimpa kamu. Sesungguhnya yang demikian itu termasuk hal-hal yang diwajibkan (oleh Allah)","QS. Luqman [31] : 17"));

        return userList;
    }

    public class User {
        private String ayat,arti, judul;

        public String getJudul() {
            return judul;
        }

        public String getArti() {
            return arti;
        }

        public String getAyat() {
            return ayat;
        }

        public User(String ayat, String arti, String judul) {
            this.ayat = ayat;
            this.judul = judul;
            this.arti = arti;
        }
    }

    //Tombol Kembali
    public boolean onOptionsItemSelected(MenuItem item){
        Bundle bundle = new Bundle();
        bundle.putInt("data1", 2);
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
        if (recyclerViewAdapter_aps.mediaPlayer != null) {
            recyclerViewAdapter_aps.mediaPlayer.stop();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {
            Bundle bundle = new Bundle();
            bundle.putInt("data1", 2);
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            intent.putExtras(bundle);
            startActivity(intent);
            if (recyclerViewAdapter_aps.mediaPlayer != null) {
                recyclerViewAdapter_aps.mediaPlayer.stop();
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
