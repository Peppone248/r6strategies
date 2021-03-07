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
                prim.setImageResource(R.drawable.mp7);
                tPrim.setText("MP7");
                sec.setImageResource(R.drawable.p12);
                tSec.setText("P12");
                gad.setImageResource(R.drawable.nitrocell);
                tgad.setText("NITRO-CELL");
                break;
            case"MUTE":
                prim.setImageResource(R.drawable.mp5k);
                tPrim.setText("MP5K");
                sec.setImageResource(R.drawable.smg11);//manca la secondaria di mute
                tSec.setText("SMG-11");
                gad.setImageResource(R.drawable.nitrocell);
                tgad.setText("NITRO-CELL");
                break;
            case"SMOKE":
                prim.setImageResource(R.drawable.m590a1);
                tPrim.setText("M590A1");
                sec.setImageResource(R.drawable.smg11);
                tSec.setText("SMG-11");
                gad.setImageResource(R.drawable.shield);
                tgad.setText("SHIELD");
                break;
            case"MELUSI":
                prim.setImageResource(R.drawable.mp5);
                tPrim.setText("MP5");
                sec.setImageResource(R.drawable.rg15);
                tSec.setText("RG15");
                gad.setImageResource(R.drawable.nitrocell);//manca gadget melusi
                tgad.setText("IMPACT GRENADE");
                break;
            case"MIRA":
                prim.setImageResource(R.drawable.vector45acp);
                tPrim.setText("VECTOR .45 ACP");
                sec.setImageResource(R.drawable.ita12s);
                tSec.setText("ITA12S");
                gad.setImageResource(R.drawable.nitrocell);
                tgad.setText("NITRO-CELL");
                break;
            case"VIGIL":
                prim.setImageResource(R.drawable.k1a);
                tPrim.setText("K1A");
                sec.setImageResource(R.drawable.smg12);
                tSec.setText("SMG-12");
                gad.setImageResource(R.drawable.impactgrenade);//manca gadget vigil
                tgad.setText("IMPACT GRENADE");
                break;
            case"KAID":
                prim.setImageResource(R.drawable.auga3);
                tPrim.setText("AUG A3");
                sec.setImageResource(R.drawable.kaid44magsemiauto);
                tSec.setText(".44 MAG SEMI-AUTO");
                gad.setImageResource(R.drawable.nitrocell);
                tgad.setText("NITRO-CELL");
                break;
            case"ARUNI":
                prim.setImageResource(R.drawable.p10roni);
                tPrim.setText("P10 RONI");
                sec.setImageResource(R.drawable.prb92);
                tSec.setText("PRB92");
                gad.setImageResource(R.drawable.barbedwire);//manca gagdet aruni
                tgad.setText("BARBED WIRE");
                break;
            case"ECHO":
                prim.setImageResource(R.drawable.mp5sd);
                tPrim.setText("MP5SD");
                sec.setImageResource(R.drawable.bearing9);
                tSec.setText("BEARING 9");
                gad.setImageResource(R.drawable.shield);
                tgad.setText("SHIELD");
                break;
            case"ALIBI":
                prim.setImageResource(R.drawable.mx4storm);
                tPrim.setText("MX4 STORM");
                sec.setImageResource(R.drawable.bailiff410);
                tSec.setText("BAILIFF 410");
                gad.setImageResource(R.drawable.shield);//manca gadget aruni
                tgad.setText("SHIELD");
                break;
            case"FROST":
                prim.setImageResource(R.drawable.frost9mmc1);
                tPrim.setText("9MM C1");
                sec.setImageResource(R.drawable.ita12s);
                tSec.setText("ITA12S");
                gad.setImageResource(R.drawable.shield);
                tgad.setText("SHIELD");
                break;
            case"LESION":
                prim.setImageResource(R.drawable.t5smg);
                tPrim.setText("T-5 SMG");
                sec.setImageResource(R.drawable.q929);
                tSec.setText("Q929");
                gad.setImageResource(R.drawable.impactgrenade);//mancano le granate
                tgad.setText("IMPACT GRENADE");
                break;
            case"ELA":
                prim.setImageResource(R.drawable.scorpionevo3a1);
                tPrim.setText("SCORPION EVO 3 A1");
                sec.setImageResource(R.drawable.rg15);
                tSec.setText("RG15");
                gad.setImageResource(R.drawable.shield);
                tgad.setText("SHIELD");
                break;
            case"CAVEIRA":
                prim.setImageResource(R.drawable.m12);
                tPrim.setText("M12");
                sec.setImageResource(R.drawable.luison);
                tSec.setText("LUISON");
                gad.setImageResource(R.drawable.impactgrenade);
                tgad.setText("IMPACT GRENADE");
                break;
            case"GOYO":
                prim.setImageResource(R.drawable.vector45acp);
                tPrim.setText("VECTOR .45 ACP");
                sec.setImageResource(R.drawable.p229rc);
                tSec.setText("P229 RC");
                gad.setImageResource(R.drawable.nitrocell);//gadget goyo
                tgad.setText("NITRO-CELL");
                break;
            case"JAGER":
                prim.setImageResource(R.drawable.carabine416c);
                tPrim.setText("416-C CARABINE");
                sec.setImageResource(R.drawable.p12);
                tSec.setText("P12");
                gad.setImageResource(R.drawable.barbedwire);
                tgad.setText("BARBED WIRE");
                break;
            case"MAESTRO":
                prim.setImageResource(R.drawable.alda556);
                tPrim.setText("ALDA 5.56");
                sec.setImageResource(R.drawable.bailiff410);//secondaria maestro
                tSec.setText("BAILIFF 410");
                gad.setImageResource(R.drawable.impactgrenade);//granate
                tgad.setText("IMPACT GRENADE");
                break;
            case"MOZZIE":
                prim.setImageResource(R.drawable.commando9);
                tPrim.setText("COMMANDO 9");
                sec.setImageResource(R.drawable.sdp9mm);
                tSec.setText("SDP 9MM");
                gad.setImageResource(R.drawable.nitrocell);//gagdet mozzie
                tgad.setText("NITRO-CELL");
                break;
            case"ORYX":
                prim.setImageResource(R.drawable.t5smg);
                tPrim.setText("T-5 SMG");
                sec.setImageResource(R.drawable.bailiff410);//secondaria oryx
                tSec.setText("BAILIFF 410");
                gad.setImageResource(R.drawable.alarm);//gadget oryx
                tgad.setText("ALARM");
                break;
            case"TACHANKA":
                prim.setImageResource(R.drawable.dp27);
                tPrim.setText("DP27");
                sec.setImageResource(R.drawable.gsh18);
                tSec.setText("GSH-18");
                gad.setImageResource(R.drawable.alarm);
                tgad.setText("ALARM");
                break;
            case"WAMAI":
                prim.setImageResource(R.drawable.auga2);
                tPrim.setText("AUG A2");
                sec.setImageResource(R.drawable.d40);
                tSec.setText("D-40");
                gad.setImageResource(R.drawable.impactgrenade);//gadget wamai
                tgad.setText("IMPACT GRENADE");
                break;
            case"PULSE":
                prim.setImageResource(R.drawable.m1014);
                tPrim.setText("M1014");
                sec.setImageResource(R.drawable.m45meusoc);
                tSec.setText("M45 MEUSOC");
                gad.setImageResource(R.drawable.nitrocell);//gadget pulse
                tgad.setText("NITRO-CELL");
                break;
            case"KAPKAN":
                prim.setImageResource(R.drawable.k9x19vsn);
                tPrim.setText("9X19VSN");
                sec.setImageResource(R.drawable.gsh18);
                tSec.setText("GSH-18");
                gad.setImageResource(R.drawable.nitrocell);//gadgetkapkan
                tgad.setText("NITRO-CELL");
                break;
            case"DOC":
                prim.setImageResource(R.drawable.mp5);
                tPrim.setText("MP5");
                sec.setImageResource(R.drawable.lfp586);//secondaria doc
                tSec.setText("LFP586");
                gad.setImageResource(R.drawable.camerabullet);
                tgad.setText("BULLETPROOF CAMERA");
                break;
            case"ROOK":
                prim.setImageResource(R.drawable.mp5);
                tPrim.setText("MP5");
                sec.setImageResource(R.drawable.lfp586);
                tSec.setText("LFP586");
                gad.setImageResource(R.drawable.impactgrenade);//gadget rook
                tgad.setText("IMPACT GRENADE");
                break;
            case"CASTLE":
                prim.setImageResource(R.drawable.ump45);
                tPrim.setText("UPM45");
                sec.setImageResource(R.drawable.supershorty);
                tSec.setText("SUPER SHORTY");
                gad.setImageResource(R.drawable.impactgrenade);//gadget castle
                tgad.setText("IMPACT GRENADE");
                break;
            case"WARDEN":
                prim.setImageResource(R.drawable.mpx);
                tPrim.setText("MPX");
                sec.setImageResource(R.drawable.smg12);
                tSec.setText("SMG-12");
                gad.setImageResource(R.drawable.nitrocell);
                tgad.setText("NITRO-CELL");
                break;
        }
        return view;
    }

}