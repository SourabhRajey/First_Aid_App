package com.example.rishabhtanwar.disasterfirstaid;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class KitRecyclerViewAdapter extends RecyclerView.Adapter<KitRecyclerViewAdapter.ViewHolder>{

    private int [] mImages;
    private String [] mImageNames;
    private int [] mImageDescription;
    private Context mContext;
    private Dialog mDialog;

    public KitRecyclerViewAdapter(Context context, int [] images, String [] imageNames, int [] imageDescription){
        mImages = images;
        mImageNames = imageNames;
        mImageDescription = imageDescription;
        mContext = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.kit_activity_listitems, viewGroup, false);
        KitRecyclerViewAdapter.ViewHolder holder = new KitRecyclerViewAdapter.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder,final int i) {
        viewHolder.name.setText(mImageNames[i]);
        viewHolder.kitImage.setImageResource(mImages[i]);

        mDialog = new Dialog(mContext);
        mDialog.setContentView(R.layout.activity_kit_info);
        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        viewHolder.cardItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView dialog_kit_name = (TextView)mDialog.findViewById(R.id.kit_id);
                TextView dialog_kit_description = (TextView)mDialog.findViewById(R.id.kit_description);
                ImageView dialog_kit_image = (ImageView)mDialog.findViewById(R.id.kit_item);
                dialog_kit_name.setText(mImageNames[i]);
                dialog_kit_image.setImageResource(mImages[i]);
                dialog_kit_description.setText(mImageDescription[i]);
                mDialog.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mImageNames.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView name;
        ImageView kitImage;
        CardView cardItem;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.kit_name);
            kitImage = itemView.findViewById(R.id.kit_image);
            cardItem = itemView.findViewById(R.id.card);
        }
    }

}
