package com.example.egi_fcb.applicationmtq.adapter.suratpendek;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.egi_fcb.applicationmtq.activity.suratpendek.Activity_Surat_Al_Quraisy;
import com.example.egi_fcb.applicationmtq.adapter.campur.ClickListener;
import com.example.egi_fcb.applicationmtq.fragment.Farsi;
import com.example.egi_fcb.applicationmtq.R;

import java.util.List;

/**
 * Created by egi_fcb on 5/18/17.
 */

public class RecyclerViewAdapter_Surat_Al_Quraisy extends RecyclerView.Adapter<RecyclerViewAdapter_Surat_Al_Quraisy.RecyclerViewHolder>{
    private ClickListener clicklistener = null;
    List<Activity_Surat_Al_Quraisy.User> values;
    Context context1;

    public RecyclerViewAdapter_Surat_Al_Quraisy(Context context, List<Activity_Surat_Al_Quraisy.User> userInformation) {
        context1 = context;
        this.values = userInformation;
    }

    @Override
    public RecyclerViewAdapter_Surat_Al_Quraisy.RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.costum_activity_ayat, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final RecyclerViewAdapter_Surat_Al_Quraisy.RecyclerViewHolder holder, final int position) {
        Typeface tf = Farsi.GetFarsiFont(context1);
        holder.textayat.setTypeface(tf);
        holder.textayat.setText(values.get(position).getAyat());
        holder.textno.setText(values.get(position).getNo());
        holder.textarti.setText(values.get(position).getArti());


    }

    @Override
    public int getItemCount() {
        return this.values.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView  textayat,textarti,textno;
        CardView cardView;

        public RecyclerViewHolder(View itemView) {
            super(itemView);

            context1 = itemView.getContext();
            cardView = (CardView)itemView.findViewById(R.id.card_view);
            textayat = (TextView)itemView.findViewById(R.id.tv_ayat);
            textno = (TextView)itemView.findViewById(R.id.tv_no);
            textarti = (TextView)itemView.findViewById(R.id.tv_arti);
        }

        @Override
        public void onClick(View v) {
            if (clicklistener != null) {
                clicklistener.itemClicked(v, getAdapterPosition());
            }
        }
    }
}