package com.example.egi_fcb.applicationmtq.adapter.campur;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.egi_fcb.applicationmtq.activity.hijaiyah.Activity_Hijaiyah;
import com.example.egi_fcb.applicationmtq.activity.tadjwid.Activity_Utama_Tajwid;
import com.example.egi_fcb.applicationmtq.R;
import com.example.egi_fcb.applicationmtq.activity.hijaiyah.Activity_Menu_Utama_Harakat;
import com.example.egi_fcb.applicationmtq.activity.hijaiyah.Activity_Menu_Utama_Tanwin;

import java.util.ArrayList;

/**
 * Created by egi_fcb on 5/18/17.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<String> rvData;
    private Context context;

    public RecyclerViewAdapter(ArrayList<String> inputData) {
        rvData = inputData;
        context = null;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        // di tutorial ini kita hanya menggunakan data String untuk tiap item
        public TextView tv_kerja;
        public ImageView imageView;

        public ViewHolder(View v) {
            super(v);

            context = itemView.getContext();
            tv_kerja = (TextView)v.findViewById(R.id.textViewket);
            imageView = (ImageView)v.findViewById(R.id.image_icon);

            v.setTag(v);
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final Intent intent;
                    switch (getAdapterPosition()){
                        case 0:
                            intent =  new Intent(context, Activity_Hijaiyah.class);
                            context.startActivity(intent);
                            break;

                        case 1:
                            intent =  new Intent(context, Activity_Menu_Utama_Harakat.class);
                            context.startActivity(intent);
                            break;

                        case 2:
                            intent =  new Intent(context, Activity_Menu_Utama_Tanwin.class);
                            context.startActivity(intent);
                            break;

                        case 3:
                            intent =  new Intent(context, Activity_Utama_Tajwid.class);
                            context.startActivity(intent);
                            break;

                        case 4:
                            Toast.makeText(context, "Comming Soon", Toast.LENGTH_LONG).show();
                            //intent =  new Intent(context, Activity_Mengeja_1.class);
                            //context.startActivity(intent);
                            break;

                        case 5:
                            Toast.makeText(context, "Comming Soon", Toast.LENGTH_LONG).show();
                            //intent =  new Intent(context, Activity_Kuis.class);
                            //context.startActivity(intent);
                            break;
                    }

                }
            });
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // membuat view baru
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.costum_fragment_hijaiyah, parent, false);
        // mengeset ukuran view, margin, padding, dan parameter layout lainnya
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - mengambil elemen dari dataset (ArrayList) pada posisi tertentu
        // - mengeset isi view dengan elemen dari dataset tersebut
        holder.tv_kerja.setText(rvData.get(position));
        if (position == 0){
            holder.imageView.setImageResource(R.drawable.belajar_normal);
        }else if (position == 1){
            holder.imageView.setImageResource(R.drawable.belajar_fattah);
        }else if (position == 2){
            holder.imageView.setImageResource(R.drawable.belajar_kuis);
        }else if (position == 3){
            holder.imageView.setImageResource(R.drawable.belajar_tajwid);
        }else if (position == 4){
            holder.imageView.setImageResource(R.drawable.belajar_kuis);
        }else if (position == 5){
            holder.imageView.setImageResource(R.drawable.belajar_kuis);
        }
    }

    @Override
    public int getItemCount() {
        // menghitung ukuran dataset / jumlah data yang ditampilkan di RecyclerView
        return rvData.size();
    }
}