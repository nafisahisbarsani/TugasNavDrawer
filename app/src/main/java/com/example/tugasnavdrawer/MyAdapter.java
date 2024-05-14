package com.example.tugasnavdrawer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<Makanan> makananList;
    private Context context;

    public MyAdapter(List<Makanan> makananList, Context context) {
        this.makananList = makananList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_data, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Makanan makanan = makananList.get(position);
        holder.foodNameTextView.setText(makanan.getFoodName());
        holder.foodImageView.setImageResource(makanan.getImageResourceId());
    }


    @Override
    public int getItemCount() {
        return makananList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView foodNameTextView;
        ImageView foodImageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            foodNameTextView = itemView.findViewById(R.id.foodName);
            foodImageView = itemView.findViewById(R.id.foodImage);
        }
    }
}
