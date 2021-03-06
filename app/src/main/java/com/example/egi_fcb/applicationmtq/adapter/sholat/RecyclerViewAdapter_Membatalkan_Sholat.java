package com.example.egi_fcb.applicationmtq.adapter.sholat;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.egi_fcb.applicationmtq.activity.sholat.Activity_Membatalkan_Sholat;
import com.example.egi_fcb.applicationmtq.R;
import com.example.egi_fcb.applicationmtq.adapter.campur.ClickListener;

import java.util.List;

/**
 * Created by egi_fcb on 5/18/17.
 */

public class RecyclerViewAdapter_Membatalkan_Sholat extends RecyclerView.Adapter<RecyclerViewAdapter_Membatalkan_Sholat.RecyclerViewHolder>{
    private ClickListener clicklistener = null;
    List<Activity_Membatalkan_Sholat.User> values;
    Context context1;

    public RecyclerViewAdapter_Membatalkan_Sholat(Context context, List<Activity_Membatalkan_Sholat.User> userInformation) {
        context1 = context;
        this.values = userInformation;
    }

    @Override
    public RecyclerViewAdapter_Membatalkan_Sholat.RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.costum_activity_syarat_wudhu, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final RecyclerViewAdapter_Membatalkan_Sholat.RecyclerViewHolder holder, final int position) {
        holder.textket.setText(values.get(position).getKet());
        holder.textno.setText(values.get(position).getNo());


    }

    @Override
    public int getItemCount() {
        return this.values.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView  textket,textno;

        public RecyclerViewHolder(View itemView) {
            super(itemView);

            context1 = itemView.getContext();
            textket = (TextView)itemView.findViewById(R.id.textViewket);
            textno = (TextView)itemView.findViewById(R.id.textViewno);
        }

        @Override
        public void onClick(View v) {
            if (clicklistener != null) {
                clicklistener.itemClicked(v, getAdapterPosition());
            }
        }
    }
}