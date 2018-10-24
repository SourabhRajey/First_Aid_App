package com.example.rishabhtanwar.disasterfirstaid;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class HelpActivity extends AppCompatActivity {

    EditText text_send;
    Button btn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        setTitle("Help");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        text_send = (EditText)findViewById(R.id.edit);
        btn = (Button)findViewById(R.id.send_email);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mail = text_send.getText().toString();
                if(mail.trim().length() > 0){
                    Intent intent = new Intent(Intent.ACTION_SEND);
                    intent.setData(Uri.parse("mailto:"));
                    String [] to = {"rishabhtanwar29@gmail.com","tathagat289@gmail.com","sourabhrajey@gmail.com"};
                    intent.putExtra(Intent.EXTRA_EMAIL,to);
                    intent.putExtra(Intent.EXTRA_SUBJECT,"Important! From Disaster Management app");
                    intent.putExtra(Intent.EXTRA_TEXT,mail);
                    intent.setType("message/rfc822");
                    Intent chooser = Intent.createChooser(intent,"Send Email");
                    startActivity(chooser);
                }else{
                    Toast.makeText(HelpActivity.this,"Type a massage",Toast.LENGTH_SHORT).show();
                }
            }
        });
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
