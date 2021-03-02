package com.example.r6strategies;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

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
        ImageView prim = view.findViewById(R.id.image_primary);
        TextView tPrim = view.findViewById(R.id.name_primary);
        ImageView sec = view.findViewById(R.id.image_secondary);
        TextView tSec = view.findViewById(R.id.name_secondary);
        ImageView gad = view.findViewById(R.id.image_gadget);
        TextView tgad = view.findViewById(R.id.name_gadget);

        switch(os.operatore){
            case"VALKYRIE":
                prim.setImageResource(R.drawable.mpx);
                tPrim.setText("MPX");
                sec.setImageResource(R.drawable.d50);
                tSec.setText("D-50");
                gad.setImageResource(R.drawable.nitrocell);
                tgad.setText("NITRO-CELL");
                break;
            case"BANDIT":
                prim.setImageResource(R.drawable.primarybandit);
                tPrim.setText("MPX");
                sec.setImageResource(R.drawable.secondarybandit);
                tSec.setText("D-50");
                gad.setImageResource(R.drawable.nitrocell);
                tgad.setText("NITRO-CELL");
                break;
            case"MUTE":
                prim.setImageResource(R.drawable.primarymute);
                tPrim.setText("MPX");
                sec.setImageResource(R.drawable.d50);//manca la secondaria di mute
                tSec.setText("D-50");
                gad.setImageResource(R.drawable.nitrocell);
                tgad.setText("NITRO-CELL");
                break;
            case"SMOKE":
                prim.setImageResource(R.drawable.primarysmoke);
                tPrim.setText("MPX");
                sec.setImageResource(R.drawable.secondarysmoke);
                tSec.setText("D-50");
                gad.setImageResource(R.drawable.shield);
                tgad.setText("SHIELD");
                break;
            case"MELUSI":
                prim.setImageResource(R.drawable.primaryrook);
                tPrim.setText("MPX");
                sec.setImageResource(R.drawable.secondarymelusi);
                tSec.setText("D-50");
                gad.setImageResource(R.drawable.nitrocell);//manca gadget melusi
                tgad.setText("NITRO-CELL");
                break;
            case"MIRA":
                prim.setImageResource(R.drawable.primarymira);
                tPrim.setText("MPX");
                sec.setImageResource(R.drawable.secondarymira);
                tSec.setText("D-50");
                gad.setImageResource(R.drawable.nitrocell);
                tgad.setText("NITRO-CELL");
                break;
            case"VIGIL":
                prim.setImageResource(R.drawable.primaryvigil);
                tPrim.setText("MPX");
                sec.setImageResource(R.drawable.secondaryvigil);
                tSec.setText("D-50");
                gad.setImageResource(R.drawable.nitrocell);//manca gadget vigil
                tgad.setText("NITRO-CELL");

                break;
            case"KAID":
                prim.setImageResource(R.drawable.primarykaid);
                tPrim.setText("MPX");
                sec.setImageResource(R.drawable.secondarykaid);
                tSec.setText("D-50");
                gad.setImageResource(R.drawable.nitrocell);
                tgad.setText("NITRO-CELL");
                break;
            case"ARUNI":
                prim.setImageResource(R.drawable.primaryaruni);
                tPrim.setText("MPX");
                sec.setImageResource(R.drawable.secondaryaruni);
                tSec.setText("D-50");
                gad.setImageResource(R.drawable.nitrocell);//manca gagdet aruni
                tgad.setText("NITRO-CELL");
                break;
            case"ALIBI":
                prim.setImageResource(R.drawable.primaryalibi);
                tPrim.setText("MPX");
                sec.setImageResource(R.drawable.secondaryalibi);
                tSec.setText("D-50");
                gad.setImageResource(R.drawable.nitrocell);//manca gadget aruni
                tgad.setText("NITRO-CELL");
                break;
            case"FROST":
                prim.setImageResource(R.drawable.primaryfrost);
                tPrim.setText("MPX");
                sec.setImageResource(R.drawable.secondaryfrost);
                tSec.setText("D-50");
                gad.setImageResource(R.drawable.shield);
                tgad.setText("SHIELD");
                break;
            case"LESION":
                prim.setImageResource(R.drawable.primarylesion);
                tPrim.setText("MPX");
                sec.setImageResource(R.drawable.secondarylesion);
                tSec.setText("D-50");
                gad.setImageResource(R.drawable.shield);//mancano le granate
                tgad.setText("SHIELD");
                break;
            case"ELA":
                prim.setImageResource(R.drawable.primaryela);
                tPrim.setText("MPX");
                sec.setImageResource(R.drawable.secondaryela);
                tSec.setText("D-50");
                gad.setImageResource(R.drawable.shield);
                tgad.setText("SHIELD");
                break;
            case"CAIVERA":
                prim.setImageResource(R.drawable.primarycaveira);
                tPrim.setText("MPX");
                sec.setImageResource(R.drawable.secondarycaveira);
                tSec.setText("D-50");
                gad.setImageResource(R.drawable.shield);
                tgad.setText("SHIELD");
                break;
            case"GOYO":
                prim.setImageResource(R.drawable.primarymira);
                tPrim.setText("MPX");
                sec.setImageResource(R.drawable.secondarygoyo);
                tSec.setText("D-50");
                gad.setImageResource(R.drawable.shield);//gadget goyo
                tgad.setText("SHIELD");
                break;
            case"JAGER":
                prim.setImageResource(R.drawable.primaryjager);
                tPrim.setText("MPX");
                sec.setImageResource(R.drawable.secondaryfrost);//secondaria jager?
                tSec.setText("D-50");
                gad.setImageResource(R.drawable.barbedwire);
                tgad.setText("BARBED WIRE");
                break;
            case"MAESTRO":
                prim.setImageResource(R.drawable.primarymaestro);
                tPrim.setText("MPX");
                sec.setImageResource(R.drawable.secondaryfrost);//secondaria maestro
                tSec.setText("D-50");
                gad.setImageResource(R.drawable.shield);//granate
                tgad.setText("SHIELD");
                break;
            case"MOZZIE":
                prim.setImageResource(R.drawable.primarymozzie);
                tPrim.setText("MPX");
                sec.setImageResource(R.drawable.secondarymozzie);
                tSec.setText("D-50");
                gad.setImageResource(R.drawable.barbedwire);//gagdet mozzie
                tgad.setText("SHIELD");
                break;
            case"ORYX":
                prim.setImageResource(R.drawable.primarylesion);
                tPrim.setText("MPX");
                sec.setImageResource(R.drawable.secondaryfrost);//secondaria oryx
                tSec.setText("D-50");
                gad.setImageResource(R.drawable.shield);//gadget oryx
                tgad.setText("SHIELD");
                break;
            case"TACHANKA":
                prim.setImageResource(R.drawable.primarytachanka);
                tPrim.setText("MPX");
                sec.setImageResource(R.drawable.secondaryfrost);//secondaria aborto
                tSec.setText("D-50");
                gad.setImageResource(R.drawable.barbedwire);//non prende il riferimento al drawable alarm
                tgad.setText("SHIELD");
                break;
            case"WAMAI":
                prim.setImageResource(R.drawable.primarywamai);
                tPrim.setText("MPX");
                sec.setImageResource(R.drawable.secondarywamai);
                tSec.setText("D-50");
                gad.setImageResource(R.drawable.shield);//gadget wamai
                tgad.setText("SHIELD");
                break;
            case"PULSE":
                prim.setImageResource(R.drawable.primarypulse);
                tPrim.setText("MPX");
                sec.setImageResource(R.drawable.secondarypulse);
                tSec.setText("D-50");
                gad.setImageResource(R.drawable.shield);//gadget pulse
                tgad.setText("SHIELD");
                break;
            case"KAPKAN":
                prim.setImageResource(R.drawable.primarykapkan);
                tPrim.setText("MPX");
                sec.setImageResource(R.drawable.secondarykapkan);
                tSec.setText("D-50");
                gad.setImageResource(R.drawable.shield);//gadgetkapkan
                tgad.setText("SHIELD");
                break;
            case"DOC":
                prim.setImageResource(R.drawable.primaryrook);
                tPrim.setText("MPX");
                sec.setImageResource(R.drawable.secondaryfrost);//secondaria doc
                tSec.setText("D-50");
                gad.setImageResource(R.drawable.barbedwire);
                tgad.setText("SHIELD");
                break;
            case"ROOK":
                prim.setImageResource(R.drawable.primaryrook);
                tPrim.setText("MPX");
                sec.setImageResource(R.drawable.secondaryrook);
                tSec.setText("D-50");
                gad.setImageResource(R.drawable.shield);//gadget rook
                tgad.setText("SHIELD");
                break;
            case"CASTLE":
                prim.setImageResource(R.drawable.primarycastle);
                tPrim.setText("MPX");
                sec.setImageResource(R.drawable.secondarycastle);
                tSec.setText("D-50");
                gad.setImageResource(R.drawable.shield);//gadget castle
                tgad.setText("SHIELD");
                break;
            case"WARDEN":
                prim.setImageResource(R.drawable.mpx);
                tPrim.setText("MPX");
                sec.setImageResource(R.drawable.d50);
                tSec.setText("D-50");
                gad.setImageResource(R.drawable.nitrocell);
                tgad.setText("NITRO-CELL");
                break;
        }
        return view;
    }

}