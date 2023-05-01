package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SingleView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_view);

        Intent i = getIntent();

        int position = i.getExtras().getInt("id");
        ImageAdapter imageAdapter = new ImageAdapter(this);

        ImageView imageView = (ImageView) findViewById(R.id.SingleView);

        imageView.setImageResource(imageAdapter.mThumbIdsandText.get(position).first);
        TextView txtView = (TextView) findViewById(R.id.txtView);
        txtView.setText(imageAdapter.mThumbIdsandText.get(position).second);
    }

}