package com.example.egi_fcb.applicationmtq.adapter.campur;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.egi_fcb.applicationmtq.R;
import com.example.egi_fcb.applicationmtq.activity.doa.Activity_Doa_Akan_Belajar;
import com.example.egi_fcb.applicationmtq.activity.doa.Activity_Doa_Akan_Keluar_Kamar_Mandi;
import com.example.egi_fcb.applicationmtq.activity.doa.Activity_Doa_Akan_Keluar_Masjid;
import com.example.egi_fcb.applicationmtq.activity.doa.Activity_Doa_Akan_Makan;
import com.example.egi_fcb.applicationmtq.activity.doa.Activity_Doa_Akan_Masuk_Kamar_Mandi;
import com.example.egi_fcb.applicationmtq.activity.doa.Activity_Doa_Akan_Masuk_Masjid;
import com.example.egi_fcb.applicationmtq.activity.doa.Activity_Doa_Akan_Setelah_Makan;
import com.example.egi_fcb.applicationmtq.activity.doa.Activity_Doa_Akan_Tidur;
import com.example.egi_fcb.applicationmtq.activity.doa.Activity_Doa_Kedua_Orang_Tua;
import com.example.egi_fcb.applicationmtq.activity.doa.Activity_Doa_Ketika_Bangun_Tidur;
import com.example.egi_fcb.applicationmtq.activity.doa.Activity_Doa_Setelah_Belajar;

import java.util.ArrayList;

/**
 * Created by egi_fcb on 5/18/17.
 */

public class RecyclerViewAdapterAMUD extends RecyclerView.Adapter<RecyclerViewAdapterAMUD.ViewHolder> {

    private ArrayList<String> rvData;
    private Context context;

    public RecyclerViewAdapterAMUD(ArrayList<String> inputData) {
        rvData = inputData;
        context = null;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        // di tutorial ini kita hanya menggunakan data String untuk tiap item
        public TextView textView;
        public ImageView imageView;
        public CardView cardView;

        public ViewHolder(View v) {
            super(v);

            context = itemView.getContext();
            textView = (TextView)v.findViewById(R.id.textViewket);
            imageView = (ImageView)v.findViewById(R.id.image_icon);
            cardView = (CardView)v.findViewById(R.id.cardView);

            v.setTag(v);
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final Intent intent;
                    switch (getAdapterPosition()){
                        case 0:
                            intent =  new Intent(context,Activity_Doa_Kedua_Orang_Tua.class);
                            context.startActivity(intent);
                            break;

                        case 1:
                            intent =  new Intent(context, Activity_Doa_Ketika_Bangun_Tidur.class);
                            context.startActivity(intent);
                            break;

                        case 2:
                            intent =  new Intent(context, Activity_Doa_Akan_Tidur.class);
                            context.startActivity(intent);
                            break;

                        case 3:
                            intent =  new Intent(context, Activity_Doa_Akan_Masuk_Kamar_Mandi.class);
                            context.startActivity(intent);
                            break;

                        case 4:
                            intent =  new Intent(context, Activity_Doa_Akan_Keluar_Kamar_Mandi.class);
                            context.startActivity(intent);
                            break;

                        case 5:
                            intent =  new Intent(context, Activity_Doa_Akan_Belajar.class);
                            context.startActivity(intent);
                            break;

                        case 6:
                            intent =  new Intent(context, Activity_Doa_Setelah_Belajar.class);
                            context.startActivity(intent);
                            break;

                        case 7:
                            intent =  new Intent(context, Activity_Doa_Akan_Makan.class);
                            context.startActivity(intent);
                            break;

                        case 8:

                            intent =  new Intent(context, Activity_Doa_Akan_Setelah_Makan.class);
                            context.startActivity(intent);
                            break;

                        case 9:
                            intent =  new Intent(context, Activity_Doa_Akan_Masuk_Masjid.class);
                            context.startActivity(intent);
                            break;

                        case 10:
                            intent =  new Intent(context, Activity_Doa_Akan_Keluar_Masjid.class);
                            context.startActivity(intent);
                            break;
                    }

                }
            });
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // membuat view baru
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.costum_activity_menu_utama_doa, parent, false);
        // mengeset ukuran view, margin, padding, dan parameter layout lainnya
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        // - mengambil elemen dari dataset (ArrayList) pada posisi tertentu
        // - mengeset isi view dengan elemen dari dataset tersebut
        holder.textView.setText(rvData.get(position));
        if (position == 0){
            holder.imageView.setImageResource(R.drawable.doa_ortu);
        }else if (position == 1){
            holder.imageView.setImageResource(R.drawable.doa_bangun_tidur);
        }else if (position == 2){
            holder.imageView.setImageResource(R.drawable.doa_sebelum_tidur);
        }else if (position == 3){
            holder.imageView.setImageResource(R.drawable.doa_sebelum_mandi);
        }else if (position == 4){
            holder.imageView.setImageResource(R.drawable.doa_setelah_mandi);
        }else if (position == 5){
            holder.imageView.setImageResource(R.drawable.doa_sebelum_belajar);
        }else if (position == 6){
            holder.imageView.setImageResource(R.drawable.doa_setelah_belajar);
        }else if (position == 7){
            holder.imageView.setImageResource(R.drawable.doa_sebelum_makan);
        }else if (position == 8){
            holder.imageView.setImageResource(R.drawable.doa_sesudah_makan);
        }else if (position == 9){
            holder.imageView.setImageResource(R.drawable.doa_pergi_mejid);
        }else if (position == 10){
            holder.imageView.setImageResource(R.drawable.doa_plg_mesjid);
        }
    }

    @Override
    public int getItemCount() {
        // menghitung ukuran dataset / jumlah data yang ditampilkan di RecyclerView
        return rvData.size();
    }
}