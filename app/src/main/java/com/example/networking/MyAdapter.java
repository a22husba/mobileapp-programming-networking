package com.example.networking;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    Context context;
    List<Mountain> mountains;

    public MyAdapter(Context context, List<Mountain> mountains) {
        this.context = context;
        this.mountains = mountains;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.mountain_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.nameView.setText(mountains.get(position).getName());
        holder.locationView.setText(mountains.get(position).getLocation());
        holder.imageView.setImageResource(mountains.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return mountains.size();
    }
}
