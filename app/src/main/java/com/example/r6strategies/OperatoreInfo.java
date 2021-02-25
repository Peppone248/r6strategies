package com.example.r6strategies;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;

public class OperatoreInfo extends Fragment {

    private RadioButton radioButton1, radioButton2, radioButton3, radioButton4, radioButton5, radioButton6, radioButton7, radioButton8, radioButton9;
    public OperatoreInfo() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_operator_info, container, false);
        radioButton1 = (RadioButton) view.findViewById(R.id.radio_cor1);
        radioButton2 = (RadioButton) view.findViewById(R.id.radio_cor2);
        radioButton3 = (RadioButton) view.findViewById(R.id.radio_cor3);
        radioButton4 = (RadioButton) view.findViewById(R.id.radio_speed1);
        radioButton5 = (RadioButton) view.findViewById(R.id.radio_speed2);
        radioButton6 = (RadioButton) view.findViewById(R.id.radio_speed3);
        radioButton7 = (RadioButton) view.findViewById(R.id.radio_diff1);
        radioButton8 = (RadioButton) view.findViewById(R.id.radio_diff2);
        radioButton9 = (RadioButton) view.findViewById(R.id.radio_diff3);

        //if(titleOp="VALKYRIE")
            radioButton1.setChecked(true);
            radioButton2.setChecked(true);
            radioButton3.setChecked(false);
            radioButton4.setChecked(true);
        radioButton5.setChecked(true);
        radioButton6.setChecked(false);
        radioButton7.setChecked(true);
        radioButton8.setChecked(true);
        radioButton9.setChecked(false);
        return view;
    }
}