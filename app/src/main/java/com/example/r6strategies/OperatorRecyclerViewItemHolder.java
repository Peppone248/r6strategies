package com.example.r6strategies;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class OperatorRecyclerViewItemHolder extends RecyclerView.ViewHolder {
    private TextView carTitleText = null;

    private ImageView carImageView = null;

    private TextView info=null;

    public OperatorRecyclerViewItemHolder(View itemView) {
        super(itemView);

        if (itemView != null) {
            carTitleText = (TextView) itemView.findViewById(R.id.card_view_image_title);

            carImageView = (ImageView) itemView.findViewById(R.id.card_view_image);

            info = (TextView) itemView.findViewById(R.id.card_view_info);
        }
    }

    public TextView getCarTitleText() {
        return carTitleText;
    }

    public TextView getCarInfo() {
        return info;
    }


    public ImageView getCarImageView() {
        return carImageView;
    }
}