package com.example.r6strategies.clb;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.r6strategies.Modelli.OperatoreSpot;
import com.example.r6strategies.OperatorRecyclerViewDataAdapter;
import com.example.r6strategies.OperatorRecyclerViewItem;
import com.example.r6strategies.R;

import java.util.ArrayList;
import java.util.List;

public class mediumclbstrat1 extends Fragment {

    public mediumclbstrat1() {
        // Required empty public constructor
    }

    private List<OperatorRecyclerViewItem> carItemList = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mediumstrat, container, false);

        initializeCarItemList();
        RecyclerView carRecyclerView = (RecyclerView) view.findViewById(R.id.card_view_recycler_list);
        // Create the grid layout manager with 2 columns.
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        // Set layout manager.
        carRecyclerView.setLayoutManager(gridLayoutManager);

        // Create car recycler view data adapter with car item list.
        OperatorRecyclerViewDataAdapter carDataAdapter = new OperatorRecyclerViewDataAdapter(carItemList);
        // Set data adapter.
        carRecyclerView.setAdapter(carDataAdapter);
        return view;
    }

    private void initializeCarItemList() {
        if(carItemList == null)
        {
            OperatoreSpot os = new OperatoreSpot(1,"a",1,1);
            carItemList = new ArrayList<OperatorRecyclerViewItem>();
            carItemList.add(new OperatorRecyclerViewItem("MIRA", R.drawable.mira,os));
            carItemList.add(new OperatorRecyclerViewItem("JAGER", R.drawable.jager,os));
            carItemList.add(new OperatorRecyclerViewItem("KAID", R.drawable.kaid,os));
            carItemList.add(new OperatorRecyclerViewItem("MOZZIE", R.drawable.mozzie,os));
            carItemList.add(new OperatorRecyclerViewItem("MUTE", R.drawable.mute,os));
            carItemList.add(new OperatorRecyclerViewItem("WALLS", R.drawable.rfwalls,os));
            //carItemList.add(new CarRecyclerViewItem("Future", R.drawable.kaid));
        }
    }
}