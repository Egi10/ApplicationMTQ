package com.example.egi_fcb.applicationmtq.Package_Hijaiyah_Kasrah;

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

public class RecyclerViewAdapter_AHK extends RecyclerView.Adapter<RecyclerViewAdapter_AHK.RecyclerViewHolder>{
    private ClickListener clicklistener = null;
    List<Activity_Hijaiyah_Kasrah.User> values;
    Context context1;

    public RecyclerViewAdapter_AHK(Context context, List<Activity_Hijaiyah_Kasrah.User> userInformation) {
        context1 = context;
        this.values = userInformation;
    }

    @Override
    public RecyclerViewAdapter_AHK.RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.costum_activity_huruf_hijaiyah_dammah, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final RecyclerViewAdapter_AHK.RecyclerViewHolder holder, final int position) {
        Typeface tf = Farsi.GetFarsiFont(context1);
        holder.textayat.setTypeface(tf);
        holder.textayat.setText(values.get(position).getAyat());
        holder.textbacaan.setText(values.get(position).getBacaan());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("data1", values.get(position).getAyat());
                bundle.putString("data2", values.get(position).getBacaan());
                bundle.putInt("data3", position);

                //Intent intent = new Intent(v.getContext(), Activity_Hijaiyah_Kasrah_Jelas.class);
                //intent.putExtras(bundle);
                //v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.values.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView image;
        TextView  textayat,textbacaan;
        CardView cardView;

        public RecyclerViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView)itemView.findViewById(R.id.card_view);
            textayat = (TextView)itemView.findViewById(R.id.textViewayat);
            textbacaan = (TextView)itemView.findViewById(R.id.textViewbacaan);
            image = (ImageView)itemView.findViewById(R.id.image);
        }

        @Override
        public void onClick(View v) {
            if (clicklistener != null) {
                clicklistener.itemClicked(v, getAdapterPosition());
            }
        }
    }
}