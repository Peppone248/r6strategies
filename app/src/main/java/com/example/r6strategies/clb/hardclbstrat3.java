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


public class hardclbstrat3 extends Fragment {

    public hardclbstrat3() {
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
        View view = inflater.inflate(R.layout.fragment_hardclbstrat, container, false);

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
            carItemList.add(new CarRecyclerViewItem("MAESTRO", R.drawable.maestro));
            carItemList.add(new CarRecyclerViewItem("JAGER", R.drawable.jager));
            carItemList.add(new CarRecyclerViewItem("MELUSI", R.drawable.melusi));
            carItemList.add(new CarRecyclerViewItem("PULSE", R.drawable.pulse));
            carItemList.add(new CarRecyclerViewItem("GOYO", R.drawable.goyo));
            //carItemList.add(new CarRecyclerViewItem("Future", R.drawable.kaid));
        }
    }
}