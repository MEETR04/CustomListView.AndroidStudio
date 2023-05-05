package com.example.customlistview;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailedActivity extends AppCompatActivity {

    ActionBar actionBar;

    ImageView dimage;
    TextView dname, dprice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);

        dimage = findViewById(R.id.dimage);
        dname = findViewById(R.id.dname);
        dprice = findViewById(R.id.dprice);

        actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String price = intent.getStringExtra("price");
        int image = intent.getIntExtra("image",R.drawable.noimage);

        dname.setText(name);
        dprice.setText(price);
        dimage.setImageResource(image);
        actionBar.setTitle(name);


    }
}