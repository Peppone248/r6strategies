package com.example.r6strategies;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.r6strategies.modelli.OperatoreSpot;

public class OperatoreLoadout extends Fragment {

    public OperatoreLoadout() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_operator_loadout, container, false);
        Bundle bundle = getArguments();
        OperatoreSpot os= (OperatoreSpot) bundle.getSerializable("os");
        switch(os.operatore){
            case"VALKYRIE":

                break;
            case"BANDIT":

                break;
            case"MUTE":

                break;
            case"SMOKE":

                break;
            case"MELUSI":

                break;
            case"MIRA":

                break;
            case"VIGIL":


                break;
            case"KAID":

                break;
            case"ARUNI":

                break;
            case"ALIBI":

                break;
            case"FROST":

                break;
            case"LESION":

                break;
            case"ELA":

                break;
            case"CAIVERA":

                break;
            case"GOYO":

                break;
            case"JAGER":

                break;
            case"MAESTRO":

                break;
            case"MOZZIE":

                break;
            case"ORYX":

                break;
            case"TACHANKA":

                break;
            case"WAMAI":

                break;
            case"PULSE":

                break;
            case"KAPKAN":

                break;
            case"DOC":

                break;
            case"ROOK":

                break;
            case"CASTLE":

                break;
            case"WARDEN":

                break;
        }
        return view;
    }

}