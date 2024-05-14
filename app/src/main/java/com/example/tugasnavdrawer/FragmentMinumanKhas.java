package com.example.tugasnavdrawer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class FragmentMinumanKhas extends Fragment {
    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private List<Makanan> makananList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_minuman_khas, container, false);
        recyclerView = view.findViewById(R.id.rvMinumanKhas);
        makananList = new ArrayList<>();

        // Add your favorite food items here
        makananList.add(new Makanan("Es Poteng", R.drawable.es_poteng));
        makananList.add(new Makanan("Es Sarang Burung", R.drawable.es_sarang_burung));
        makananList.add(new Makanan("Brem", R.drawable.brem));
        makananList.add(new Makanan("Tuak Manis", R.drawable.tuak_manis));
        makananList.add(new Makanan("Serbat Jahe", R.drawable.serbat_jahe));

        adapter = new MyAdapter(makananList, getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);

        return view;
    }
}
