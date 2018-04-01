package com.example.egi_fcb.applicationmtq.adapter.suratpendek;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.egi_fcb.applicationmtq.R;
import com.example.egi_fcb.applicationmtq.activity.suratpendek.Activity_Surat_Al_Falak;
import com.example.egi_fcb.applicationmtq.activity.suratpendek.Activity_Surat_Al_Humazah;
import com.example.egi_fcb.applicationmtq.activity.suratpendek.Activity_Surat_Al_Ikhlas;
import com.example.egi_fcb.applicationmtq.activity.suratpendek.Activity_Surat_Al_Kaafirun;
import com.example.egi_fcb.applicationmtq.activity.suratpendek.Activity_Surat_Al_Kautsar;
import com.example.egi_fcb.applicationmtq.activity.suratpendek.Activity_Surat_Al_Lahab;
import com.example.egi_fcb.applicationmtq.activity.suratpendek.Activity_Surat_Al_Mauun;
import com.example.egi_fcb.applicationmtq.activity.suratpendek.Activity_Surat_Al_Quraisy;
import com.example.egi_fcb.applicationmtq.activity.suratpendek.Activity_Surat_An_Naas;
import com.example.egi_fcb.applicationmtq.activity.suratpendek.Activity_Surat_An_Nasr;

import java.util.ArrayList;

/**
 * Created by egi_fcb on 5/18/17.
 */

public class RecyclerViewAdapter_ATS extends RecyclerView.Adapter<RecyclerViewAdapter_ATS.ViewHolder> {

    private ArrayList<String> rvData;
    private Context context;

    public RecyclerViewAdapter_ATS(ArrayList<String> inputData) {
        rvData = inputData;
        context = null;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        // di tutorial ini kita hanya menggunakan data String untuk tiap item
        public TextView textView, textView1;

        public ViewHolder(View v) {
            super(v);

            context = itemView.getContext();
            textView1 = (TextView)v.findViewById(R.id.textViewno);
            textView = (TextView)v.findViewById(R.id.textViewket);

            v.setTag(v);
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final Intent intent;
                    switch (getAdapterPosition()){
                        case 0:
                            intent =  new Intent(context,Activity_Surat_An_Naas.class);
                            context.startActivity(intent);
                            break;

                        case 1:
                            intent =  new Intent(context,Activity_Surat_Al_Falak.class);
                            context.startActivity(intent);
                            break;

                        case 2:
                            intent =  new Intent(context,Activity_Surat_Al_Ikhlas.class);
                            context.startActivity(intent);
                            break;

                        case 3:
                            intent =  new Intent(context,Activity_Surat_Al_Lahab.class);
                            context.startActivity(intent);
                            break;

                        case 4:
                            intent =  new Intent(context,Activity_Surat_An_Nasr.class);
                            context.startActivity(intent);
                            break;

                        case 5:
                            intent =  new Intent(context,Activity_Surat_Al_Kaafirun.class);
                            context.startActivity(intent);
                            break;

                        case 6:
                            intent =  new Intent(context,Activity_Surat_Al_Kautsar.class);
                            context.startActivity(intent);
                            break;

                        case 7:
                            intent =  new Intent(context,Activity_Surat_Al_Mauun.class);
                            context.startActivity(intent);
                            break;

                        case 8:
                            intent =  new Intent(context,Activity_Surat_Al_Quraisy.class);
                            context.startActivity(intent);
                            break;

                        case 9:
                            intent =  new Intent(context,Activity_Surat_Al_Humazah.class);
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
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.costum_activity_utama, parent, false);
        // mengeset ukuran view, margin, padding, dan parameter layout lainnya
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - mengambil elemen dari dataset (ArrayList) pada posisi tertentu
        // - mengeset isi view dengan elemen dari dataset tersebut
        holder.textView.setText(rvData.get(position));
        if(position == 0){
            holder.textView1.setText("1");
        }else if(position == 1){
            holder.textView1.setText("2");
        }else if(position == 2){
            holder.textView1.setText("3");
        }else if(position == 3){
            holder.textView1.setText("4");
        }else if(position == 4){
            holder.textView1.setText("5");
        }else if(position == 5){
            holder.textView1.setText("6");
        }else if(position == 6){
            holder.textView1.setText("7");
        }else if(position == 7){
            holder.textView1.setText("8");
        }else if(position == 8){
            holder.textView1.setText("9");
        }else if(position == 9){
            holder.textView1.setText("10");
        }
    }

    @Override
    public int getItemCount() {
        // menghitung ukuran dataset / jumlah data yang ditampilkan di RecyclerView
        return rvData.size();
    }
}