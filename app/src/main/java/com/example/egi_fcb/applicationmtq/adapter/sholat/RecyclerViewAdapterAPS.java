package com.example.egi_fcb.applicationmtq.adapter.sholat;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.egi_fcb.applicationmtq.activity.sholat.Activity_Sholat_Ashar;
import com.example.egi_fcb.applicationmtq.activity.sholat.Activity_Sholat_Dzuhur;
import com.example.egi_fcb.applicationmtq.activity.sholat.Activity_Sholat_Isya;
import com.example.egi_fcb.applicationmtq.activity.sholat.Activity_Sholat_Maghrib;
import com.example.egi_fcb.applicationmtq.activity.sholat.Activity_Sholat_Shubuh;
import com.example.egi_fcb.applicationmtq.R;

import java.util.ArrayList;

/**
 * Created by egi_fcb on 5/18/17.
 */

public class RecyclerViewAdapterAPS extends RecyclerView.Adapter<RecyclerViewAdapterAPS.ViewHolder> {

    private ArrayList<String> rvData;
    private Context context;

    public RecyclerViewAdapterAPS(ArrayList<String> inputData) {
        rvData = inputData;
        context = null;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        // di tutorial ini kita hanya menggunakan data String untuk tiap item
        public TextView textView;
        public ImageView imageView;

        public ViewHolder(View v) {
            super(v);

            context = itemView.getContext();
            textView = (TextView)v.findViewById(R.id.textViewket);

            v.setTag(v);
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final Intent intent;
                    switch (getAdapterPosition()){
                        case 0:
                            intent =  new Intent(context,Activity_Sholat_Shubuh.class);
                            context.startActivity(intent);
                            break;

                        case 1:
                            intent =  new Intent(context,Activity_Sholat_Dzuhur.class);
                            context.startActivity(intent);
                            break;

                        case 2:
                            intent =  new Intent(context,Activity_Sholat_Ashar.class);
                            context.startActivity(intent);
                            break;

                        case 3:
                            intent =  new Intent(context,Activity_Sholat_Maghrib.class);
                            context.startActivity(intent);
                            break;

                        case 4:
                            intent =  new Intent(context,Activity_Sholat_Isya.class);
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
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.costum_activity_menu_utama_mengeja, parent, false);
        // mengeset ukuran view, margin, padding, dan parameter layout lainnya
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - mengambil elemen dari dataset (ArrayList) pada posisi tertentu
        // - mengeset isi view dengan elemen dari dataset tersebut
        holder.textView.setText(rvData.get(position));
    }

    @Override
    public int getItemCount() {
        // menghitung ukuran dataset / jumlah data yang ditampilkan di RecyclerView
        return rvData.size();
    }
}