package com.example.r6strategies.clb;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.r6strategies.OperatorRecyclerViewDataAdapter;
import com.example.r6strategies.OperatorRecyclerViewItem;
import com.example.r6strategies.R;

import java.util.ArrayList;
import java.util.List;


public class hardclbstrat extends Fragment {

    public hardclbstrat() {
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
        View view = inflater.inflate(R.layout.activity_available_soon_screen, container, false);

      /*  initializeCarItemList();
        RecyclerView carRecyclerView = (RecyclerView) view.findViewById(R.id.card_view_recycler_list);
        // Create the grid layout manager with 2 columns.
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        // Set layout manager.
        carRecyclerView.setLayoutManager(gridLayoutManager);

        // Create car recycler view data adapter with car item list.
        OperatorRecyclerViewDataAdapter carDataAdapter = new OperatorRecyclerViewDataAdapter(carItemList);
        // Set data adapter.
        carRecyclerView.setAdapter(carDataAdapter); */
        return view;
    }

    private void initializeCarItemList() {
        if(carItemList == null)
        {

            carItemList = new ArrayList<OperatorRecyclerViewItem>();
            carItemList.add(new OperatorRecyclerViewItem("MAESTRO", R.drawable.maestro,"6-0-3"));
            carItemList.add(new OperatorRecyclerViewItem("JAGER", R.drawable.jager,"6-0-3"));
            carItemList.add(new OperatorRecyclerViewItem("CASTLE", R.drawable.castle,"6-0-3"));
            carItemList.add(new OperatorRecyclerViewItem("VALKYRIE", R.drawable.valkyrie,"6-0-3"));
            carItemList.add(new OperatorRecyclerViewItem("BANDIT", R.drawable.bandit,"6-0-3"));
            carItemList.add(new OperatorRecyclerViewItem("WALLS", R.drawable.rfwalls,"6-0-3"));

        }
    }
}