package com.example.rishabhtanwar.disasterfirstaid;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.widget.Toast;

public class CallingActivity extends AppCompatActivity {
    private static final int REQUEST_CALL = 1;
    private String number;

    private String [] mStateNames = new String[]{"ANDHRA PRADESH","ARUNACHAL PRADESH","ASSAM","BIHAR","CHHATTISGARH","GOA","GUJARAT","HARYANA","HIMACHAL PRADESH","JAMMU & KASHMIR","JHARKHAND","KARNATAKA",
   "KERALA","MADHYA PRADESH","MAHARASHTRA","MANIPUR","MEGHALAYA","MIZORAM","NAGALAND","ODISHA","PUNJAB","RAJASTHAN","SIKKIM","TAMIL NADU","TELANGANA","TRIPURA","UTTAR PRADESH","UTTARAKHAND","WEST BENGAL","ANDAMAN & NICOBAR ISLANDS",
    "CHANDIGARH","DADAR & NAGAR HAVELLI","DAMAN & DIU","DELHI","LAKSHADWEEP","PUDUCHERRY"};
    private String [] mMobileNumbers = new String[]{"7729030405","9436042922","7086019494","9431800732","9425254003","7447429222","9978405367","9988177777","9418184700","9419000744","8789602225","9483869160",
    "9400202927"," 7049100555","9819935421","9917472900","9436333728","9612901360","9436005679","9437022776","98972987254","9414000240","7602665844","9840352966","9246542888","9436461940","9456274089","7895312007",
    "9410394444","9474269300","9416006665","7874148005","9436289791","9501939559","9540009320","9442234784"};
    private String [] mPhoneNumbers = new String[]{"08645-247222","0863-2377099","0361-2237221","0612-2215600","0771-2510209","0832-2419414","079-23259276","0172-2711925","0177-2626212","0194-2506463","0651-2400218",
    "080-22032995","0471-2364424","0755-2441523","022-22026868","0385-2450038","0364-2503022","0389-2315205","0370-2270938","0674-2534180","0172-2743854","0141-2227885","0359-2201145","044-28550601","040-23450779","0381-2413318",
    "0522-2238200","0135-2711439","033-22143674","03192-244266","0172-2700109","0260-2630304","0260-2230698","27203048","04896-263440","0413-2299503"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("State Emergency Numbers");
        setContentView(R.layout.activity_calling);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        initRecyclerView();
    }

    public void initRecyclerView(){
        RecyclerView recyclerView = findViewById(R.id.calling_recycler_view);
        CallingRecyclerViewAdapter adapter = new CallingRecyclerViewAdapter(this, mStateNames, mMobileNumbers, mPhoneNumbers, new CallingRecyclerViewAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(String item) {
                number = item;
                makeCall();
            }
        });
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void makeCall(){
        if(ContextCompat.checkSelfPermission(CallingActivity.this,Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(CallingActivity.this, new String[] {Manifest.permission.CALL_PHONE}, REQUEST_CALL);
        }else{
            String dial = "tel:" + number;
            startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id == android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if(requestCode == REQUEST_CALL){
            if(grantResults.length >0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){

            }else {
                Toast.makeText(this,"Permission DENIED",Toast.LENGTH_SHORT).show();
            }
        }
    }
}
