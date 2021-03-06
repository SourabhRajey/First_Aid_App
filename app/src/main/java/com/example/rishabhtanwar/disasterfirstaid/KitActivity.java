package com.example.rishabhtanwar.disasterfirstaid;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

public class KitActivity extends AppCompatActivity {

    private int [] mImages = new int[]{R.drawable.acetaminofin,R.drawable.adhesive_bandage,R.drawable.adhesive_tape,R.drawable.antibiotic_oinment,R.drawable.anticeptic_sol,R.drawable.blanket,R.drawable.calamine,R.drawable.cold_packs,R.drawable.elastic_bandage,
            R.drawable.flashlight_extra_bateries,R.drawable.gloves,R.drawable.hydro_corcitone,R.drawable.mouth_pece_cpr,R.drawable.safety_pins,R.drawable.scissors,R.drawable.splint,R.drawable.sterile_gauge,R.drawable.thermometer,R.drawable.tooth_preservn_kit,R.drawable.wipes};
    private String [] mImageNames = new String[]{"Acetaminofin","Adhesive Bandage","Adhesive Tape","Antibiotic Ointment","Anticeptic Sol","Blanket","Calamine","Cold Packs","Elastic Bandage","Flashlight extra batteries","Gloves","Hydro Corcitone",
            "Mouthpiece CPR","Safety pins","Scissors","Splint","Sterile Gauge","Thermometer","Tooth preservation kit","Wipes"};
    private int [] mImageDescription = new int[]{R.string.aceto,R.string.bandages,R.string.tape,R.string.antibiotic,R.string.antiseptic,R.string.blanket,R.string.calamine,R.string.cold,R.string.eleastic,
            R.string.flash_light,R.string.gloves,R.string.hydro,R.string.mouthpiece,R.string.pins,R.string.scissors,R.string.splint,R.string.gauge,R.string.thermometer,R.string.tooth,R.string.wipes};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kit);
        initRecyclerView();
    }

    public void initRecyclerView(){
        RecyclerView recyclerView = findViewById(R.id.kit_recycler_view);
        KitRecyclerViewAdapter adapter = new KitRecyclerViewAdapter(KitActivity.this,mImages,mImageNames,mImageDescription);
        recyclerView.setLayoutManager(new GridLayoutManager(KitActivity.this,2));
        recyclerView.setAdapter(adapter);
    }
}
