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

public class FragmentMakananKhas extends Fragment {
    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private List<Makanan> makananList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_makanan_khas, container, false);
        recyclerView = view.findViewById(R.id.rvMakananKhas);
        makananList = new ArrayList<>();

        // Add your favorite food items here
        makananList.add(new Makanan("Sepat", R.drawable.sepat));
        makananList.add(new Makanan("Singang", R.drawable.singang));
        makananList.add(new Makanan("Rembarang", R.drawable.rembarang));
        makananList.add(new Makanan("Gecok", R.drawable.gecok));
        makananList.add(new Makanan("Pelu Lenga", R.drawable.pelu_lenga));

        adapter = new MyAdapter(makananList, getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);

        return view;
    }
}
