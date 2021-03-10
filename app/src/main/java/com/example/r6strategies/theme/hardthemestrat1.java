package com.example.r6strategies.theme;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.r6strategies.OperatorRecyclerViewDataAdapter;
import com.example.r6strategies.OperatorRecyclerViewItem;
import com.example.r6strategies.R;

import java.util.ArrayList;
import java.util.List;

public class hardthemestrat1 extends Fragment {

    public hardthemestrat1() {
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
        View view = inflater.inflate(R.layout.fragment_hardstrat, container, false);

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

    /* Initialise car items in list. */
    private void initializeCarItemList()
    {
        if(carItemList == null)
        {

            carItemList = new ArrayList<OperatorRecyclerViewItem>();
            carItemList.add(new OperatorRecyclerViewItem("ECHO", R.drawable.echo,"7-1-3"));
            carItemList.add(new OperatorRecyclerViewItem("JAGER", R.drawable.jager,"7-1-3"));
            carItemList.add(new OperatorRecyclerViewItem("CASTLE", R.drawable.castle,"7-1-3"));
            carItemList.add(new OperatorRecyclerViewItem("BANDIT", R.drawable.bandit,"7-1-3"));
            carItemList.add(new OperatorRecyclerViewItem("MAESTRO", R.drawable.maestro,"7-1-3"));
            carItemList.add(new OperatorRecyclerViewItem("WALLS", R.drawable.rfwalls,"7-1-3"));
            //carItemList.add(new CarRecyclerViewItem("Future", R.drawable.kaid));
        }
    }
}