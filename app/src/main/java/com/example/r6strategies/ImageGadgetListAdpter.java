package com.example.r6strategies;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ImageGadgetListAdpter  extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] maintitle;

    private final Integer[] imgid;

    public ImageGadgetListAdpter(Activity context, String[] maintitle, Integer[] imgid) {
        super(context, R.layout.mylist, maintitle);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.maintitle=maintitle;
        this.imgid=imgid;
    }


    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.list_gadget, null,true);

        TextView titleText = (TextView) rowView.findViewById(R.id.titleGadget);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imgSpotGadget);

        titleText.setText(maintitle[position]);
        imageView.setImageResource(imgid[position]);

        return rowView;
    };
}