package com.example.egi_fcb.applicationmtq.adapter.campur;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.egi_fcb.applicationmtq.activity.tanwin.Activity_Tanwin_Dummatain;
import com.example.egi_fcb.applicationmtq.activity.tanwin.Activity_Tanwin_Fatkhatain;
import com.example.egi_fcb.applicationmtq.activity.tanwin.Activity_Tanwin_Kasrohtain;
import com.example.egi_fcb.applicationmtq.R;
import com.example.egi_fcb.applicationmtq.activity.hijaiyah.Activity_Menu_Utama_Tanwin;

import java.util.List;

/**
 * Created by egi_fcb on 5/18/17.
 */

public class RecyclerViewAdapter_AMUT extends RecyclerView.Adapter<RecyclerViewAdapter_AMUT.RecyclerViewHolder>{
    private ClickListener clicklistener = null;
    List<Activity_Menu_Utama_Tanwin.User> values;
    Context context1;

    public RecyclerViewAdapter_AMUT(Context context, List<Activity_Menu_Utama_Tanwin.User> userInformation) {
        context1 = context;
        this.values = userInformation;
    }

    @Override
    public RecyclerViewAdapter_AMUT.RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.costum_activity_menu_utama_harakat, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final RecyclerViewAdapter_AMUT.RecyclerViewHolder holder, final int position) {
        holder.textimage.setText(values.get(position).getJudul());
        holder.image.setText(values.get(position).getSubjudul());
        holder.gambar1.setText(values.get(position).getAyat1());
        holder.gambar2.setText(values.get(position).getAyat2());
        holder.gambar3.setText(values.get(position).getAyat3());
    }

    @Override
    public int getItemCount() {
        return this.values.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView image;
        TextView  textimage;
        TextView  gambar1;
        TextView  gambar2;
        TextView  gambar3;
        CardView cardView;

        public RecyclerViewHolder(View v) {
            super(v);

            context1 = itemView.getContext();

            cardView = (CardView)v.findViewById(R.id.card_view);
            textimage = (TextView)v.findViewById(R.id.image_icon);
            image = (TextView) v.findViewById(R.id.image_icon2);
            gambar1 = (TextView) v.findViewById(R.id.gambar1);
            gambar2 = (TextView) v.findViewById(R.id.gambar2);
            gambar3 = (TextView) v.findViewById(R.id.gambar3);

            v.setTag(v);
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final Intent intent;
                    switch (getAdapterPosition()){
                        case 0:
                            intent =  new Intent(context1, Activity_Tanwin_Fatkhatain.class);
                            context1.startActivity(intent);
                            break;

                        case 1:
                            intent =  new Intent(context1, Activity_Tanwin_Kasrohtain.class);
                            context1.startActivity(intent);
                            break;

                        case 2:
                            intent =  new Intent(context1, Activity_Tanwin_Dummatain.class);
                            context1.startActivity(intent);

                            break;
                    }

                }
            });
        }

        @Override
        public void onClick(View v) {
            if (clicklistener != null) {
                clicklistener.itemClicked(v, getAdapterPosition());
            }
        }
    }
}