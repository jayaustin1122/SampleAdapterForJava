package com.lunacian.materialmedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView sportsTitle = findViewById(R.id.titleDetail);
        TextView mDetails = findViewById(R.id.subTitleDetail);
        ImageView sportsImage = findViewById(R.id.sportsImageDetail);

        sportsTitle.setText(getIntent().getStringExtra("title"));
        mDetails.setText(getIntent().getStringExtra("info"));
        Glide.with(this).load(getIntent().getIntExtra("img_src",0)).into(sportsImage);
    }
}