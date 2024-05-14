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

public class FragmentMakananKesukaan extends Fragment {
    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private List<Makanan> makananList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_makanan_kesukaan, container, false);
        recyclerView = view.findViewById(R.id.rvMakananKesukaan);
        makananList = new ArrayList<>();

        // Add your favorite food items here
        makananList.add(new Makanan("Nasi Goreng", R.drawable.nasi_goreng));
        makananList.add(new Makanan("Bakso", R.drawable.bakso));
        makananList.add(new Makanan("Ayam Geprek", R.drawable.ayam_geprek));
        makananList.add(new Makanan("Martabak", R.drawable.martabak));
        makananList.add(new Makanan("Cumi Asam-Manis", R.drawable.cumi));

        adapter = new MyAdapter(makananList, getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);

        return view;
    }
}
