package com.example.egi_fcb.applicationmtq.activity.campur;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.egi_fcb.applicationmtq.R;

public class Activity_Kuis extends AppCompatActivity {
    ImageButton suara;
    Button pilihan1, pilihan2, pilihan3, pilihan4;
    TextView keterangan,hitungsalah;
    MediaPlayer mp;
    int salah, salah1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Permainan Kuis");
        setContentView(R.layout.activity_kuis);


        suara = (ImageButton)findViewById(R.id.button_suara);

        pilihan1 = (Button)findViewById(R.id.btn_pilihan1);
        pilihan2 = (Button)findViewById(R.id.btn_pilihan2);
        pilihan3 = (Button)findViewById(R.id.btn_pilihan3);
        pilihan4 = (Button)findViewById(R.id.btn_pilihan4);

        keterangan = (TextView)findViewById(R.id.tv_keterangan);
        hitungsalah = (TextView)findViewById(R.id.hitung_salah);

        mp = MediaPlayer.create(Activity_Kuis.this, R.raw.hijaiyah_waw);

        pilihan1.setEnabled(false);
        pilihan2.setEnabled(false);
        pilihan3.setEnabled(false);
        pilihan4.setEnabled(false);

        hitungsalah.setText("0");

        suara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                suara.setEnabled(false);
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        suara.setEnabled(true);
                        pilihan1.setEnabled(true);
                        pilihan2.setEnabled(true);
                        pilihan3.setEnabled(true);
                        pilihan4.setEnabled(true);
                    }
                });
            }
        });

        pilihan1.setText("و");
        pilihan2.setText("م");
        pilihan3.setText("ظ");
        pilihan4.setText("ح");

        pilihan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                keterangan.setText("Jawaban Kamu Benar Sekali");
            }
        });

        pilihan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                salah = Integer.valueOf(String.valueOf(hitungsalah.getText()));

                salah1 = salah + 1;

                hitungsalah.setText(String.valueOf(salah1));

                if (salah1 == 2){
                    AlertDialog.Builder alBuilder = new AlertDialog.Builder(Activity_Kuis.this);
                    alBuilder.setMessage("Kamu Sudah Melebihi Jawaban Salah");
                    alBuilder.setPositiveButton("Ulangi", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(myIntent);
                            finish();
                        }
                    });
                    final AlertDialog dialog;

                    dialog = alBuilder.create();

                    dialog.setOnShowListener(new DialogInterface.OnShowListener() {
                        @Override
                        public void onShow(DialogInterface dialogInterface) {
                            dialog.getButton(AlertDialog.BUTTON_NEGATIVE).setTextColor(getColor(R.color.AccentPink));
                            dialog.getButton(AlertDialog.BUTTON_POSITIVE).setTextColor(getColor(R.color.AccentPink));
                        }
                    });
                    dialog.show();
                }

                keterangan.setText("Jawaban Kamu Masih Salah");
            }
        });

        pilihan3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                salah = Integer.valueOf(String.valueOf(hitungsalah.getText()));

                salah1 = salah + 1;

                hitungsalah.setText(String.valueOf(salah1));

                if (salah1 == 2){
                    AlertDialog.Builder alBuilder = new AlertDialog.Builder(Activity_Kuis.this);
                    alBuilder.setMessage("Kamu Sudah Melebihi Jawaban Salah");
                    alBuilder.setPositiveButton("Ulangi", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(myIntent);
                            finish();
                        }
                    });
                    final AlertDialog dialog;

                    dialog = alBuilder.create();

                    dialog.setOnShowListener(new DialogInterface.OnShowListener() {
                        @Override
                        public void onShow(DialogInterface dialogInterface) {
                            dialog.getButton(AlertDialog.BUTTON_NEGATIVE).setTextColor(getColor(R.color.AccentPink));
                            dialog.getButton(AlertDialog.BUTTON_POSITIVE).setTextColor(getColor(R.color.AccentPink));
                        }
                    });
                    dialog.show();
                }

                keterangan.setText("Jawaban Kamu Masih Salah");
            }
        });

        pilihan3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                salah = Integer.valueOf(String.valueOf(hitungsalah.getText()));

                salah1 = salah + 1;

                hitungsalah.setText(String.valueOf(salah1));

                if (salah1 == 2){
                    AlertDialog.Builder alBuilder = new AlertDialog.Builder(Activity_Kuis.this);
                    alBuilder.setMessage("Kamu Sudah Melebihi Jawaban Salah");
                    alBuilder.setPositiveButton("Ulangi", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(myIntent);
                            finish();
                        }
                    });
                    final AlertDialog dialog;

                    dialog = alBuilder.create();

                    dialog.setOnShowListener(new DialogInterface.OnShowListener() {
                        @Override
                        public void onShow(DialogInterface dialogInterface) {
                            dialog.getButton(AlertDialog.BUTTON_NEGATIVE).setTextColor(getColor(R.color.AccentPink));
                            dialog.getButton(AlertDialog.BUTTON_POSITIVE).setTextColor(getColor(R.color.AccentPink));
                        }
                    });
                    dialog.show();
                }

                keterangan.setText("Jawaban Kamu Masih Salah");
            }
        });

        pilihan4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                salah = Integer.valueOf(String.valueOf(hitungsalah.getText()));

                salah1 = salah + 1;

                hitungsalah.setText(String.valueOf(salah1));

                if (salah1 == 2){
                    AlertDialog.Builder alBuilder = new AlertDialog.Builder(Activity_Kuis.this);
                    alBuilder.setMessage("Kamu Sudah Melebihi Jawaban Salah");
                    alBuilder.setPositiveButton("Ulangi", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(myIntent);
                            finish();
                        }
                    });
                    final AlertDialog dialog;

                    dialog = alBuilder.create();

                    dialog.setOnShowListener(new DialogInterface.OnShowListener() {
                        @Override
                        public void onShow(DialogInterface dialogInterface) {
                            dialog.getButton(AlertDialog.BUTTON_NEGATIVE).setTextColor(getColor(R.color.AccentPink));
                            dialog.getButton(AlertDialog.BUTTON_POSITIVE).setTextColor(getColor(R.color.AccentPink));
                        }
                    });
                    dialog.show();
                }

                keterangan.setText("Jawaban Kamu Masih Salah");
            }
        });
    }

    //Tombol Kembali
    public boolean onOptionsItemSelected(MenuItem item){
        mp.stop();
        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivityForResult(myIntent, 0);
        finish();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {
            mp.stop();
            Activity_Kuis.this.finish();
            Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(myIntent);
            finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}