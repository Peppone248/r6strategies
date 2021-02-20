package com.example.r6strategies;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class OperatorRecyclerViewItemHolder extends RecyclerView.ViewHolder{
private TextView carTitleText = null;

private ImageView carImageView = null;

public OperatorRecyclerViewItemHolder(View itemView) {
        super(itemView);

        if(itemView != null)
        {
        carTitleText = (TextView)itemView.findViewById(R.id.card_view_image_title);

        carImageView = (ImageView)itemView.findViewById(R.id.card_view_image);
        }
        }

public TextView getCarTitleText() {
        return carTitleText;
        }

public ImageView getCarImageView() {
        return carImageView;
        }
}