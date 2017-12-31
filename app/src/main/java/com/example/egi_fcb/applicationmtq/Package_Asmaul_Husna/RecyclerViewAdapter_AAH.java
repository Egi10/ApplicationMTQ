package com.example.egi_fcb.applicationmtq.Package_Asmaul_Husna;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.egi_fcb.applicationmtq.Package_Hijaiyah.ClickListener;
import com.example.egi_fcb.applicationmtq.Package_Hijaiyah_Fathah.Activity_Hijaiyah_Fathah;
import com.example.egi_fcb.applicationmtq.Package_Hijaiyah_Fathah.Activity_Hijaiyah_Fathah_Jelas;
import com.example.egi_fcb.applicationmtq.Package_Kumpulan_Doa.Farsi;
import com.example.egi_fcb.applicationmtq.R;

import java.util.List;

/**
 * Created by egi_fcb on 5/18/17.
 */

public class RecyclerViewAdapter_AAH extends RecyclerView.Adapter<RecyclerViewAdapter_AAH.RecyclerViewHolder>{
    private ClickListener clicklistener = null;
    List<Activity_Asmaul_Husna.User> values;
    Context context1;
    CardView cardView;

    public RecyclerViewAdapter_AAH(Context context, List<Activity_Asmaul_Husna.User> userInformation) {
        context1 = context;
        values = userInformation;
    }

    @Override
    public RecyclerViewAdapter_AAH.RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.costum_activity_asmaul_husna, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final RecyclerViewAdapter_AAH.RecyclerViewHolder holder, final int position) {
        Typeface tf = Farsi.GetFarsiFont(context1);
        holder.ayat.setTypeface(tf);
        holder.no.setText(values.get(position).getNo());
        holder.ayat.setText(values.get(position).getAyat());
        holder.bacaan.setText(values.get(position).getBacaan());
        holder.arti.setText(values.get(position).getArti());
    }

    @Override
    public int getItemCount() {
        return values.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView  ayat, bacaan, arti, no;
        public RecyclerViewHolder(View itemView) {
            super(itemView);
            ayat = (TextView)itemView.findViewById(R.id.tv_ayat);
            bacaan = (TextView)itemView.findViewById(R.id.tv_bacaan);
            arti = (TextView)itemView.findViewById(R.id.tv_arti);
            no = (TextView)itemView.findViewById(R.id.tv_no);
            cardView = (CardView)itemView.findViewById(R.id.card_view);
        }

        @Override
        public void onClick(View v) {
            if (clicklistener != null) {
                clicklistener.itemClicked(v, getAdapterPosition());
            }
        }
    }
}