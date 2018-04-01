package com.example.egi_fcb.applicationmtq.adapter.sholat;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.egi_fcb.applicationmtq.activity.sholat.Activity_Gerakan_Sholat;
import com.example.egi_fcb.applicationmtq.activity.sholat.Activity_Niat_Sholat;
import com.example.egi_fcb.applicationmtq.R;

import java.util.ArrayList;

/**
 * Created by egi_fcb on 5/18/17.
 */

public class RecyclerViewAdapter_TCS extends RecyclerView.Adapter<RecyclerViewAdapter_TCS.ViewHolder> {

    private ArrayList<String> rvData;
    private Context context;

    public RecyclerViewAdapter_TCS(ArrayList<String> inputData) {
        rvData = inputData;
        context = null;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        // di tutorial ini kita hanya menggunakan data String untuk tiap item
        public TextView textView, textView1;
        public ImageView imageView;

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
                            intent =  new Intent(context,Activity_Niat_Sholat.class);
                            context.startActivity(intent);
                            break;

                        case 1:
                            intent =  new Intent(context,Activity_Gerakan_Sholat.class);
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
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.costum_activity_syarat_wudhu, parent, false);
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
        }
    }

    @Override
    public int getItemCount() {
        // menghitung ukuran dataset / jumlah data yang ditampilkan di RecyclerView
        return rvData.size();
    }
}