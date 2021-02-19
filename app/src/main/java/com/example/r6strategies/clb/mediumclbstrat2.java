package com.example.r6strategies.clb;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.r6strategies.CarRecyclerViewDataAdapter;
import com.example.r6strategies.CarRecyclerViewItem;
import com.example.r6strategies.R;

import java.util.ArrayList;
import java.util.List;

public class mediumclbstrat2 extends Fragment {

    public mediumclbstrat2() {
        // Required empty public constructor
    }

    private List<CarRecyclerViewItem> carItemList = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mediumclbstrat, container, false);

        initializeCarItemList();
        RecyclerView carRecyclerView = (RecyclerView) view.findViewById(R.id.card_view_recycler_list);
        // Create the grid layout manager with 2 columns.
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        // Set layout manager.
        carRecyclerView.setLayoutManager(gridLayoutManager);

        // Create car recycler view data adapter with car item list.
        CarRecyclerViewDataAdapter carDataAdapter = new CarRecyclerViewDataAdapter(carItemList);
        // Set data adapter.
        carRecyclerView.setAdapter(carDataAdapter);
        return view;
    }

    private void initializeCarItemList() {
        if(carItemList == null)
        {
            carItemList = new ArrayList<CarRecyclerViewItem>();
            carItemList.add(new CarRecyclerViewItem("VIGIL", R.drawable.vigil));
            carItemList.add(new CarRecyclerViewItem("ALIBI", R.drawable.alibi));
            carItemList.add(new CarRecyclerViewItem("KAID", R.drawable.kaid));
            carItemList.add(new CarRecyclerViewItem("VALKYRIE", R.drawable.valkyrie));
            carItemList.add(new CarRecyclerViewItem("ECHO", R.drawable.echo));
            //carItemList.add(new CarRecyclerViewItem("Future", R.drawable.kaid));
        }
    }
}