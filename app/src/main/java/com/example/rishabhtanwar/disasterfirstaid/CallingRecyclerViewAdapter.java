package com.example.rishabhtanwar.disasterfirstaid;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class CallingRecyclerViewAdapter extends RecyclerView.Adapter<CallingRecyclerViewAdapter.ViewHolder>{

    //private static final int REQUEST_CALL = 1;

    public interface OnItemClickListener{
        void onItemClick(String item);
    }

    private String [] mStateNames;
    private String [] mMobileNumbers;
    private String [] mPhoneNumbers;
    private Context mContext;
    private final OnItemClickListener listener;

    public CallingRecyclerViewAdapter(Context context,String [] stateNames, String [] mobileNumbers, String [] phoneNumbers,OnItemClickListener lnr){
        mStateNames = stateNames;
        mMobileNumbers = mobileNumbers;
        mPhoneNumbers = phoneNumbers;
        mContext = context;
        listener = lnr;
    }

    @NonNull
    @Override
    public CallingRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.calling_activity_listitems, viewGroup, false);
        CallingRecyclerViewAdapter.ViewHolder holder = new CallingRecyclerViewAdapter.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CallingRecyclerViewAdapter.ViewHolder viewHolder, final int i) {
        viewHolder.state.setText(mStateNames[i]);
        viewHolder.mobileNumber.setText(mMobileNumbers[i]);
        viewHolder.phoneNumber.setText(mPhoneNumbers[i]);

        viewHolder.bind(mMobileNumbers[i],listener);
    }

//    private void makeCall(String number){
//        if(ContextCompat.checkSelfPermission(mContext,Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
//            ActivityCompat.requestPermissions(mActivity,new String[] {Manifest.permission.CALL_PHONE},REQUEST_CALL);
//        } else {
//            String dial = "tel:" + number;
//            mContext.startActivity(new Intent(Intent.ACTION_CALL,Uri.parse(dial)));
//        }
//    }

    @Override
    public int getItemCount() {
        return mMobileNumbers.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView state;
        TextView mobileNumber;
        TextView phoneNumber;
        RelativeLayout mobileCall;
        RelativeLayout phoneCall;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            state = itemView.findViewById(R.id.state_name);
            mobileNumber = itemView.findViewById(R.id.mobile_number);
            phoneNumber = itemView.findViewById(R.id.phone_number);
            mobileCall = itemView.findViewById(R.id.mobile_layout);
            phoneCall = itemView.findViewById(R.id.phone_layout);
        }

        public void bind(final String item, final OnItemClickListener listener){
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(item);
                }
            });
        }
    }
}
