package com.example.egi_fcb.applicationmtq.Package_Perintah_Sholat;

import android.content.Context;
import android.content.Intent;
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

import com.example.egi_fcb.applicationmtq.MainActivity;
import com.example.egi_fcb.applicationmtq.Package_Berwudhu.Activity_Berwudhu;
import com.example.egi_fcb.applicationmtq.Package_Hijaiyah.ClickListener;
import com.example.egi_fcb.applicationmtq.Package_Hijaiyah_Perkenalan.Activity_Hijaiyah;
import com.example.egi_fcb.applicationmtq.Package_Hijaiyah_Perkenalan.Activity_Hijaiyah_Jelas;
import com.example.egi_fcb.applicationmtq.Package_Kumpulan_Doa.Farsi;
import com.example.egi_fcb.applicationmtq.Package_Surat_Pendek.Activity_Surat_Al_Falak;
import com.example.egi_fcb.applicationmtq.R;

import java.io.IOException;
import java.util.List;

/**
 * Created by egi_fcb on 5/18/17.
 */

public class RecyclerViewAdapter_APS extends RecyclerView.Adapter<RecyclerViewAdapter_APS.RecyclerViewHolder> {
    private ClickListener clicklistener = null;
    List<Activity_Perintah_Sholat.User> values;
    Context context1;
    MediaPlayer mediaPlayer;

    public RecyclerViewAdapter_APS(Context context, List<Activity_Perintah_Sholat.User> userInformation) {
        context1 = context;
        this.values = userInformation;
    }

    @Override
    public RecyclerViewAdapter_APS.RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.costum_activity_perintah_sholat, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final RecyclerViewAdapter_APS.RecyclerViewHolder holder, final int position) {
        Typeface tf = Farsi.GetFarsiFont(context1);
        holder.textayat.setTypeface(tf);
        holder.textjudul.setText(values.get(position).getJudul());
        holder.textayat.setText(values.get(position).getAyat());
        holder.textarti.setText(values.get(position).getArti());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == 0) {
                    if (mediaPlayer != null) {
                        mediaPlayer.stop();
                    }
                    mediaPlayer = MediaPlayer.create(context1, R.raw.qs_al_baqarah_ayat_83);
                    mediaPlayer.start();
                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            holder.cardView.setEnabled(true);
                        }
                    });
                }else if (position == 1) {
                    if (mediaPlayer != null) {
                        mediaPlayer.stop();
                    }
                    mediaPlayer = MediaPlayer.create(context1, R.raw.qs_al_baqarah_ayat_110);
                    mediaPlayer.start();
                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            holder.cardView.setEnabled(true);
                        }
                    });
                }else if (position == 2) {
                    if (mediaPlayer != null) {
                        mediaPlayer.stop();
                    }
                    mediaPlayer = MediaPlayer.create(context1, R.raw.qs_an_nisa_ayat_103);
                    mediaPlayer.start();
                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            holder.cardView.setEnabled(true);
                        }
                    });
                }else if (position == 3) {
                    if (mediaPlayer != null) {
                        mediaPlayer.stop();
                    }
                    mediaPlayer= MediaPlayer.create(context1, R.raw.qs_hud_ayat_114);
                    mediaPlayer.start();
                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            holder.cardView.setEnabled(true);
                        }
                    });
                }else if (position == 4) {
                    if (mediaPlayer != null) {
                        mediaPlayer.stop();
                    }
                    mediaPlayer = MediaPlayer.create(context1, R.raw.qs_ibrahim_ayat_31);
                    mediaPlayer.start();
                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            holder.cardView.setEnabled(true);
                        }
                    });
                }else if (position == 5) {
                    if (mediaPlayer != null) {
                        mediaPlayer.stop();
                    }
                    mediaPlayer = MediaPlayer.create(context1, R.raw.qs_al_isra_ayat_78);
                    mediaPlayer.start();
                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            holder.cardView.setEnabled(true);
                        }
                    });
                }else if (position == 6) {
                    if (mediaPlayer != null) {
                        mediaPlayer.stop();
                    }
                    mediaPlayer = MediaPlayer.create(context1, R.raw.qs_taha_ayat_14);
                    mediaPlayer.start();
                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            holder.cardView.setEnabled(true);
                        }
                    });
                }else if (position == 7) {
                    if (mediaPlayer != null) {
                        mediaPlayer.stop();
                    }
                    mediaPlayer = MediaPlayer.create(context1, R.raw.qs_an_nur_ayat_56);
                    mediaPlayer.start();
                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            holder.cardView.setEnabled(true);
                        }
                    });
                }else if (position == 8) {
                    if (mediaPlayer != null) {
                        mediaPlayer.stop();
                    }
                    mediaPlayer = MediaPlayer.create(context1, R.raw.qs_luqman_ayat_17);
                    mediaPlayer.start();
                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            holder.cardView.setEnabled(true);
                        }
                    });
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.values.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView textayat, textarti, textjudul;
        CardView cardView;


        public RecyclerViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.cardView);
            textayat = (TextView) itemView.findViewById(R.id.textViewayat);
            textarti = (TextView) itemView.findViewById(R.id.textViewarti);
            textjudul = (TextView) itemView.findViewById(R.id.textViewjudul);
        }

        @Override
        public void onClick(View v) {
            if (clicklistener != null) {
                clicklistener.itemClicked(v, getAdapterPosition());
            }
        }
    }
}