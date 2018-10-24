package com.example.rishabhtanwar.disasterfirstaid;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondGalleryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity_gallery);

        getIncomingIntent();
    }

    private void getIncomingIntent(){
        if(getIntent().hasExtra("image") && getIntent().hasExtra("image_name") && getIntent().hasExtra("info")){

            Integer image = getIntent().getIntExtra("image",0);
            String imageName = getIntent().getStringExtra("image_name");
            String info = getIntent().getStringExtra("info");

            getSupportActionBar().setTitle(imageName);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            setImage(image, imageName, info);
        }
    }

    private void setImage(Integer imageGiven, String imageName, String information){

        TextView name = findViewById(R.id.second_gallery_image_description);
        name.setText(imageName);

        TextView info = findViewById(R.id.second_gallery_info);
        info.setText(Html.fromHtml(information));

        ImageView image = findViewById(R.id.second_gallery_image);
        image.setImageResource(imageGiven);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id == android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
