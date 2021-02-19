package com.example.r6strategies;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.TextView;

public class MyListRadioAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] maintitle;

    public MyListRadioAdapter(Activity context, String[] maintitle){
        super(context, R.layout.mylistspot, maintitle);
        this.context=context;
        this.maintitle=maintitle;

    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.mylistspot, null, true);
        TextView titleText = (TextView) rowView.findViewById(R.id.titleSpot);

        titleText.setText(maintitle[position]);

        return rowView;
    };
}
