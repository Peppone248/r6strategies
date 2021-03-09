package com.example.r6strategies;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.r6strategies.modelli.OperatoreSpot;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link OperatoreRole#newInstance} factory method to
 * create an instance of this fragment.
 */
public class OperatoreRole extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public OperatoreRole() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ValkyrieRole.
     */
    // TODO: Rename and change types and number of parameters
    public static OperatoreRole newInstance(String param1, String param2) {
        OperatoreRole fragment = new OperatoreRole();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_operator_role, container, false);

        Bundle bundle = getArguments();
        OperatoreSpot os= (OperatoreSpot) bundle.getSerializable("os");
        ImageView rolePrint = view.findViewById(R.id.rolePrint);
        ImageView exampleRole = view.findViewById(R.id.exampleRole);
        String diff = null;
        String spot = null;
        String mappa = null;
        if(os.mappa==3){
           mappa = "oregon";
            if(os.spot==2){
                spot = "meetinghallkitchen";
            }
        }
        if(os.diff==1){
          diff ="easy";
        }

        String temp = mappa+spot+diff+os.operatore.toLowerCase()+"print";
        String tempExample = mappa+spot+diff+os.operatore.toLowerCase()+"example";

        Context context = rolePrint.getContext();
        int id = context.getResources().getIdentifier(temp, "drawable", context.getPackageName());
        rolePrint.setBackgroundResource(id);
        id =context.getResources().getIdentifier(tempExample, "drawable", context.getPackageName());
        exampleRole.setBackgroundResource(id);

        return view;
    }
}