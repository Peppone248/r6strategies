package com.example.r6strategies;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;


import com.example.r6strategies.oregon.Valkyrie;
import com.google.android.material.snackbar.Snackbar;

import java.util.List;

public class OperatorRecyclerViewDataAdapter extends RecyclerView.Adapter<OperatorRecyclerViewItemHolder> {

        private List<OperatorRecyclerViewItem> carItemList;

        public OperatorRecyclerViewDataAdapter(List<OperatorRecyclerViewItem> carItemList) {
            this.carItemList = carItemList;
        }

        @Override
        public OperatorRecyclerViewItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            // Get LayoutInflater object.
            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
            // Inflate the RecyclerView item layout xml.
            View carItemView = layoutInflater.inflate(R.layout.card_view_item, parent, false);

            // Get car title text view object.
            final TextView carTitleView = (TextView)carItemView.findViewById(R.id.card_view_image_title);
            final TextView carInfo = (TextView)carItemView.findViewById(R.id.card_view_info);
            // Get car image view object.
            final ImageView carImageView = (ImageView)carItemView.findViewById(R.id.card_view_image);
            // When click the image.
            carItemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Get car title text.
                    String carTitle = carTitleView.getText().toString();
                    // Create a snackbar and show it.
                    Snackbar snackbar = Snackbar.make(carImageView, "You click " + carTitle +" image" + carInfo.getText().toString(), Snackbar.LENGTH_LONG);
                    snackbar.show();


                    switch (carTitle){
                        case "VALKYRIE":
                            v.getContext().startActivity(new Intent(v.getContext(), Valkyrie.class));
                    }



                }
            });

            // Create and return our custom Car Recycler View Item Holder object.
            OperatorRecyclerViewItemHolder ret = new OperatorRecyclerViewItemHolder(carItemView);
            return ret;
        }


        @Override
        public void onBindViewHolder(OperatorRecyclerViewItemHolder holder, int position) {
            if(carItemList!=null) {
                // Get car item dto in list.
                OperatorRecyclerViewItem carItem = carItemList.get(position);

                if(carItem != null) {
                    // Set car item title.
                    holder.getCarTitleText().setText(carItem.getCarName());
                    // Set car image resource id.
                    holder.getCarImageView().setImageResource(carItem.getCarImageId());

                    holder.getCarInfo().setText(carItem.getInfo());
                }
            }
        }

        @Override
        public int getItemCount() {
            int ret = 0;
            if(carItemList!=null)
            {
                ret = carItemList.size();
            }
            return ret;
        }

    }
