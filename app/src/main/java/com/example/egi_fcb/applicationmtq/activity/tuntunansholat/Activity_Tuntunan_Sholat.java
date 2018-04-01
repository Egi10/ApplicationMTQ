package com.example.egi_fcb.applicationmtq.activity.tuntunansholat;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.egi_fcb.applicationmtq.adapter.tuntunansholat.RecyclerViewAdapterATS;
import com.example.egi_fcb.applicationmtq.R;

import java.util.ArrayList;

public class Activity_Tuntunan_Sholat extends Fragment {
    private RecyclerView rvView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> dataSet;

    public Activity_Tuntunan_Sholat() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        dataSet = new ArrayList<>();
        initDataset();

        // 1. get a reference to recyclerView
        View rootView = inflater.inflate(R.layout.activity_tuntunan_sholat, container, false);

        rvView = (RecyclerView) rootView.findViewById(R.id.recycler_view);
        rvView.setHasFixedSize(true);

        // 2. set layoutManger
        rvView.setLayoutManager(new GridLayoutManager(getActivity(),1));

        /**
         * Kita menggunakan LinearLayoutManager untuk list standar
         * yang hanya berisi daftar item
         * disusun dari atas ke bawah
         */
        layoutManager = new GridLayoutManager(getActivity(),1);
        rvView.setLayoutManager(layoutManager);

        adapter = new RecyclerViewAdapterATS(dataSet);
        rvView.setAdapter(adapter);

        return rootView;
    }

    private void initDataset(){
        /**
         * Tambahkan item ke dataset
         * */
        dataSet.add("Perintah Sholat");
        dataSet.add("Wudhu");
        dataSet.add("Sholat");
        dataSet.add("Surat Pendek");
    }
}
