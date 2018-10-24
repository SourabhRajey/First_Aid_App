package com.example.rishabhtanwar.disasterfirstaid;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

public class LinksActivity extends AppCompatActivity {

    RelativeLayout ndma_layout;
    RelativeLayout ndrf_layout;
    RelativeLayout nidm_layout;
    RelativeLayout npoi_layout;
    RelativeLayout adrc_layout;
    RelativeLayout mha_layout;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_links);
        setTitle("Import Links");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ndma_layout = (RelativeLayout)findViewById(R.id.ndma);
        ndrf_layout = (RelativeLayout)findViewById(R.id.ndrf);
        nidm_layout = (RelativeLayout)findViewById(R.id.nidm);
        npoi_layout = (RelativeLayout)findViewById(R.id.npoi);
        adrc_layout = (RelativeLayout)findViewById(R.id.adrc);
        mha_layout = (RelativeLayout)findViewById(R.id.mha);

        ndma_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://ndma.gov.in/en/"));
                startActivity(intent);
            }
        });
        ndrf_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.ndrf.gov.in/"));
                startActivity(intent);
            }
        });
        nidm_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.nidm.gov.in/"));
                startActivity(intent);
            }
        });
        npoi_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.india.gov.in/"));
                startActivity(intent);
            }
        });
        adrc_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.adrc.asia/"));
                startActivity(intent);
            }
        });
        mha_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.ndmindia.nic.in/"));
                startActivity(intent);
            }
        });
    }
}
