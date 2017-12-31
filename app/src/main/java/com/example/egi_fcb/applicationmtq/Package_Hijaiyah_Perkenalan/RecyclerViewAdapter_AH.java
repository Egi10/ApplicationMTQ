package com.example.egi_fcb.applicationmtq.Package_Hijaiyah_Perkenalan;

import android.content.Context;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.egi_fcb.applicationmtq.Package_Hijaiyah.ClickListener;
import com.example.egi_fcb.applicationmtq.Package_Kumpulan_Doa.Farsi;
import com.example.egi_fcb.applicationmtq.R;

import java.util.List;

/**
 * Created by egi_fcb on 5/18/17.
 */

public class RecyclerViewAdapter_AH extends RecyclerView.Adapter<RecyclerViewAdapter_AH.RecyclerViewHolder>{
    private ClickListener clicklistener = null;
    List<Activity_Hijaiyah.User> values;
    Context context1;

    public RecyclerViewAdapter_AH(Context context, List<Activity_Hijaiyah.User> userInformation) {
        context1 = context;
        this.values = userInformation;
    }

    @Override
    public RecyclerViewAdapter_AH.RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.costum_activity_huruf_hijaiyah_dammah, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final RecyclerViewAdapter_AH.RecyclerViewHolder holder, final int position) {
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
                if(position == 1){
                    holder.mediaPlayer = MediaPlayer.create(context1, R.raw.hijaiyah_alif);
                    holder.mediaPlayer.start();
                }else if(position == 0){
                    holder.mediaPlayer = MediaPlayer.create(context1, R.raw.hijaiyah_ba);
                    holder.mediaPlayer.start();
                }else if(position == 3){
                    holder.mediaPlayer = MediaPlayer.create(context1, R.raw.hijaiyah_ta);
                    holder.mediaPlayer.start();
                }else if(position == 2){
                    holder.mediaPlayer = MediaPlayer.create(context1, R.raw.hijaiyah_tsa);
                    holder.mediaPlayer.start();
                }else if(position == 5){
                    holder.mediaPlayer = MediaPlayer.create(context1, R.raw.hijaiyah_jim);
                    holder.mediaPlayer.start();
                }else if(position == 4){
                    holder.mediaPlayer = MediaPlayer.create(context1, R.raw.hijaiyah_ha);
                    holder.mediaPlayer.start();
                }else if(position == 7){
                    //holder.mediaPlayer = MediaPlayer.create(context1, R.raw.hijaiyah_ha_ha);
                    //holder.mediaPlayer.start();
                }else if(position == 6){
                    holder.mediaPlayer = MediaPlayer.create(context1, R.raw.hijaiyah_dal);
                    holder.mediaPlayer.start();
                }else if(position == 9){
                    //holder.mediaPlayer = MediaPlayer.create(context1, R.raw.hijaiya_z);
                    //holder.mediaPlayer.start();
                }else if(position == 8){
                    //holder.mediaPlayer = MediaPlayer.create(context1, R.raw.hijaiyah_ra);
                    //holder.mediaPlayer.start();
                }else if(position == 11){
                    holder.mediaPlayer = MediaPlayer.create(context1, R.raw.hijaiyah_zay);
                    holder.mediaPlayer.start();
                }else if(position == 10){
                    holder.mediaPlayer = MediaPlayer.create(context1, R.raw.hijaiyah_sin);
                    holder.mediaPlayer.start();
                }else if(position == 13){
                    holder.mediaPlayer = MediaPlayer.create(context1, R.raw.hijaiyah_syin);
                    holder.mediaPlayer.start();
                }else if(position == 12){
                    holder.mediaPlayer = MediaPlayer.create(context1, R.raw.hijaiyah_sad);
                    holder.mediaPlayer.start();
                }else if(position == 15){
                    holder.mediaPlayer = MediaPlayer.create(context1, R.raw.hijaiyah_dad);
                    holder.mediaPlayer.start();
                }else if(position == 14){
                    holder.mediaPlayer = MediaPlayer.create(context1, R.raw.hijaiyah_ta);
                    holder.mediaPlayer.start();
                }else if(position == 17){
                    holder.mediaPlayer = MediaPlayer.create(context1, R.raw.hijaiyah_dha);
                    holder.mediaPlayer.start();
                }else if(position == 16){
                    holder.mediaPlayer = MediaPlayer.create(context1, R.raw.hijaiyah_ain);
                    holder.mediaPlayer.start();
                }else if(position == 19){
                    holder.mediaPlayer = MediaPlayer.create(context1, R.raw.hijaiyah_ghayn);
                    holder.mediaPlayer.start();
                }else if(position == 18){
                    holder.mediaPlayer = MediaPlayer.create(context1, R.raw.hijaiyah_fa);
                    holder.mediaPlayer.start();
                }else if(position == 21){
                    holder.mediaPlayer = MediaPlayer.create(context1, R.raw.hijaiyah_qof);
                    holder.mediaPlayer.start();
                }else if(position == 20){
                    holder.mediaPlayer = MediaPlayer.create(context1, R.raw.hijaiyah_kaf);
                    holder.mediaPlayer.start();
                }else if(position == 23){
                    holder.mediaPlayer = MediaPlayer.create(context1, R.raw.hijaiyah_lam);
                    holder.mediaPlayer.start();
                }else if(position == 22){
                    holder.mediaPlayer = MediaPlayer.create(context1, R.raw.hijaiyah_mim);
                    holder.mediaPlayer.start();
                }else if(position == 25){
                    holder.mediaPlayer = MediaPlayer.create(context1, R.raw.hijaiyah_nun);
                    holder.mediaPlayer.start();
                }else if(position == 27){
                    holder.mediaPlayer = MediaPlayer.create(context1, R.raw.hijaiyah_ha_ha);
                    holder.mediaPlayer.start();
                }else if(position == 24){
                    holder.mediaPlayer = MediaPlayer.create(context1, R.raw.hijaiyah_waw);
                    holder.mediaPlayer.start();
                }else if(position == 28){
                    holder.mediaPlayer = MediaPlayer.create(context1, R.raw.hijaiyah_ya);
                    holder.mediaPlayer.start();
                }

                //Intent intent = new Intent(v.getContext(), Activity_Hijaiyah_Jelas.class);
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
        MediaPlayer mediaPlayer;

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