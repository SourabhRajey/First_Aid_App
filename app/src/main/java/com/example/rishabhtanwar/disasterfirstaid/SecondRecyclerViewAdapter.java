package com.example.rishabhtanwar.disasterfirstaid;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SecondRecyclerViewAdapter extends RecyclerView.Adapter<SecondRecyclerViewAdapter.ViewHolder> {

    private ArrayList<String> mImageNames = new ArrayList<>();
    private ArrayList<Integer> mImages = new ArrayList<>();
    private ArrayList<String> mInfo = new ArrayList<>();
    private Context mContext;

    public SecondRecyclerViewAdapter(Context context, ArrayList<String> imageNames, ArrayList<Integer> images, ArrayList<String> info){
        mImageNames = imageNames;
        mImages = images;
        mInfo = info;
        mContext = context;
    }

    @NonNull
    @Override
    public SecondRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.second_activity_listitems, viewGroup, false);
        SecondRecyclerViewAdapter.ViewHolder holder = new SecondRecyclerViewAdapter.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull SecondRecyclerViewAdapter.ViewHolder viewHolder, final int i) {
        viewHolder.image.setImageResource(mImages.get(i));
        viewHolder.imageName.setText(mImageNames.get(i));

        viewHolder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Toast.makeText(mContext, mImageNames.get(i),Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(mContext, SecondGalleryActivity.class);
                intent.putExtra("image", mImages.get(i));
                intent.putExtra("image_name", mImageNames.get(i));
                intent.putExtra("info", mInfo.get(i));
                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mImageNames.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView imageName;
        LinearLayout parentLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.info_image);
            imageName = itemView.findViewById(R.id.info_name);
            parentLayout = itemView.findViewById(R.id.info_layout);
        }
    }
}
