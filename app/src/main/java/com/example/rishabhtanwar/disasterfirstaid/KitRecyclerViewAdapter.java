package com.example.rishabhtanwar.disasterfirstaid;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class KitRecyclerViewAdapter extends RecyclerView.Adapter<KitRecyclerViewAdapter.ViewHolder>{

    private int [] mImages;
    private String [] mImageNames;

    public KitRecyclerViewAdapter(int [] images, String [] imageNames){
        mImages = images;
        mImageNames = imageNames;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.kit_activity_listitems, viewGroup, false);
        KitRecyclerViewAdapter.ViewHolder holder = new KitRecyclerViewAdapter.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.name.setText(mImageNames[i]);
        viewHolder.kitImage.setImageResource(mImages[i]);
    }

    @Override
    public int getItemCount() {
        return mImageNames.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView name;
        ImageView kitImage;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.kit_name);
            kitImage = itemView.findViewById(R.id.kit_image);
        }
    }

}
