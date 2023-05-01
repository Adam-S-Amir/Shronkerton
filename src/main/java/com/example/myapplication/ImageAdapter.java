package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ImageAdapter extends BaseAdapter {

    private Context mContext;

    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;

        if (convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(350,350));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(100,30,100,30);
        }
        else {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    public ArrayList<Pair<Integer, String>> mThumbIdsandText = new ArrayList<>((Arrays.asList(

            new Pair<>(R.drawable.shrek1, "GET OUT OF MY SWAMP!"),
            new Pair<>(R.drawable.shrek2, "WHAT ARE YOU DOING IN MY HOUSE?"),
            new Pair<>(R.drawable.shrek3, "There Were Strong Gases Seepin' Outta My Butt That Day!"),
            new Pair<>(R.drawable.shrek4, "There's a stack of freshly made waffles in the middle of the forest!"),
            new Pair<>(R.drawable.shrek5, "Well, it's no wonder you don't have any friends."),
            new Pair<>(R.drawable.shrek6, "Ogres are like onions")

    )));

    public Integer[] mThumbIds = {
            R.drawable.shrek1, R.drawable.shrek2,
            R.drawable.shrek3, R.drawable.shrek4,
            R.drawable.shrek5, R.drawable.shrek6
    };


}