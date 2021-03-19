package com.example.r6strategies;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

import com.example.r6strategies.modelli.OperatoreSpot;

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

        Bundle bundle = getArguments();
        OperatoreSpot os= (OperatoreSpot) bundle.getSerializable("os");
        ImageView imOp = view.findViewById(R.id.image_operator);
        ImageView flag= view.findViewById(R.id.flag_operator);
        ImageView ability = view.findViewById(R.id.image_ability);
        TextView aff= view.findViewById(R.id.name_affiliazione);
        TextView nameAbility = view.findViewById(R.id.name_ability);

        TextView nomeOp = view.findViewById(R.id.name_operator);
        nomeOp.setText(os.operatore);

        switch(os.operatore){
            case"VALKYRIE":
                imOp.setImageResource(R.drawable.valk);
                flag.setImageResource(R.drawable.flagusa);
                ability.setImageResource(R.drawable.blackeye);
                aff.setText("Navy Seal");
                nameAbility.setText("BLACK EYE");
                //COR
                radioButton1.setChecked(true);
                radioButton2.setChecked(true);
                radioButton3.setChecked(false);
                //VEL
                radioButton4.setChecked(true);
                radioButton5.setChecked(true);
                radioButton6.setChecked(false);
                //DIFF
                radioButton7.setChecked(true);
                radioButton8.setChecked(true);
                radioButton9.setChecked(false);
                break;
            case"BANDIT":
                imOp.setImageResource(R.drawable.opbandit);
                flag.setImageResource(R.drawable.germanyflag);
                aff.setText("GSG9");
                nameAbility.setText("CAVO ELETTRIZZATO");
                //COR
                radioButton1.setChecked(true);
                radioButton2.setChecked(false);
                radioButton3.setChecked(false);
                //VEL
                radioButton4.setChecked(true);
                radioButton5.setChecked(true);
                radioButton6.setChecked(true);
                //DIFF
                radioButton7.setChecked(true);
                radioButton8.setChecked(false);
                radioButton9.setChecked(false);
                break;
            case"MUTE":
                imOp.setImageResource(R.drawable.opmute);
                flag.setImageResource(R.drawable.britainflag);
                ability.setImageResource(R.drawable.jammer);
                aff.setText("SAS");
                nameAbility.setText("JAMMER");
                //COR
                radioButton1.setChecked(true);
                radioButton2.setChecked(true);
                radioButton3.setChecked(false);
                //VEL
                radioButton4.setChecked(true);
                radioButton5.setChecked(true);
                radioButton6.setChecked(false);
                //DIFF
                radioButton7.setChecked(true);
                radioButton8.setChecked(false);
                radioButton9.setChecked(false);
                break;
            case"SMOKE":
                imOp.setImageResource(R.drawable.opsmoke);
                flag.setImageResource(R.drawable.britainflag);
                aff.setText("SAS");
                ability.setImageResource(R.drawable.gasgrenade);
                nameAbility.setText("GRANATA GAS A DISTANZA");
                //COR
                radioButton1.setChecked(true);
                radioButton2.setChecked(true);
                radioButton3.setChecked(false);
                //VEL
                radioButton4.setChecked(true);
                radioButton5.setChecked(true);
                radioButton6.setChecked(false);
                //DIFF
                radioButton7.setChecked(true);
                radioButton8.setChecked(true);
                radioButton9.setChecked(false);
                break;
            case"MELUSI":
                imOp.setImageResource(R.drawable.opmelusi);
                flag.setImageResource(R.drawable.southafricaflag);
                aff.setText("ITF");
                ability.setImageResource(R.drawable.banshee);
                nameAbility.setText("BANSHEE");
                //COR
                radioButton1.setChecked(true);
                radioButton2.setChecked(false);
                radioButton3.setChecked(false);
                //VEL
                radioButton4.setChecked(true);
                radioButton5.setChecked(true);
                radioButton6.setChecked(true);
                //DIFF
                radioButton7.setChecked(true);
                radioButton8.setChecked(false);
                radioButton9.setChecked(false);
                break;
            case"MIRA":
                imOp.setImageResource(R.drawable.opmira);
                flag.setImageResource(R.drawable.spainflag);
                aff.setText("G.E.O.");
                ability.setImageResource(R.drawable.blackmirror);
                nameAbility.setText("SPECCHIO NERO");
                //COR
                radioButton1.setChecked(true);
                radioButton2.setChecked(true);
                radioButton3.setChecked(true);
                //VEL
                radioButton4.setChecked(true);
                radioButton5.setChecked(false);
                radioButton6.setChecked(false);
                //DIFF
                radioButton7.setChecked(true);
                radioButton8.setChecked(true);
                radioButton9.setChecked(true);
                break;
            case"VIGIL":
                imOp.setImageResource(R.drawable.opvigil);//<3
                flag.setImageResource(R.drawable.southkoreaflag);
                aff.setText("707TH SMB");
                nameAbility.setText("ERC-7");
                //COR
                radioButton1.setChecked(true);
                radioButton2.setChecked(false);
                radioButton3.setChecked(false);
                //VEL
                radioButton4.setChecked(true);
                radioButton5.setChecked(true);
                radioButton6.setChecked(true);
                //DIFF
                radioButton7.setChecked(true);
                radioButton8.setChecked(true);
                radioButton9.setChecked(true);

                break;
            case"KAID":
                imOp.setImageResource(R.drawable.opkaid);
                flag.setImageResource(R.drawable.moroccoflag);
                aff.setText("GIGR");
                ability.setImageResource(R.drawable.electroclaw);
                nameAbility.setText("ELETTROARTIGLIO");
                //COR
                radioButton1.setChecked(true);
                radioButton2.setChecked(true);
                radioButton3.setChecked(true);
                //VEL
                radioButton4.setChecked(true);
                radioButton5.setChecked(false);
                radioButton6.setChecked(false);
                //DIFF
                radioButton7.setChecked(true);
                radioButton8.setChecked(true);
                radioButton9.setChecked(false);
                break;
            case"ARUNI":
                imOp.setImageResource(R.drawable.oparuni);
                flag.setImageResource(R.drawable.thailandflag);
                aff.setText("NIGHTHAVEN");
                nameAbility.setText("CANCELLO SURYA");
                //COR
                radioButton1.setChecked(true);
                radioButton2.setChecked(true);
                radioButton3.setChecked(false);
                //VEL
                radioButton4.setChecked(true);
                radioButton5.setChecked(true);
                radioButton6.setChecked(false);
                //DIFF
                radioButton7.setChecked(true);
                radioButton8.setChecked(true);
                radioButton9.setChecked(false);
                break;
            case"ALIBI":
                imOp.setImageResource(R.drawable.opalibi);
                flag.setImageResource(R.drawable.italyflag);
                aff.setText("G.I.S.");
                ability.setImageResource(R.drawable.prisma);
                nameAbility.setText("PRISMA");
                //COR
                radioButton1.setChecked(true);
                radioButton2.setChecked(false);
                radioButton3.setChecked(false);
                //VEL
                radioButton4.setChecked(true);
                radioButton5.setChecked(true);
                radioButton6.setChecked(true);
                //DIFF
                radioButton7.setChecked(true);
                radioButton8.setChecked(true);
                radioButton9.setChecked(true);
                break;
            case"FROST":
                imOp.setImageResource(R.drawable.opfrost);
                flag.setImageResource(R.drawable.canadaflag);
                aff.setText("JTF2");
                ability.setImageResource(R.drawable.frosttrap);
                nameAbility.setText("TAPPETO TRAPPOLA");
                //COR
                radioButton1.setChecked(true);
                radioButton2.setChecked(true);
                radioButton3.setChecked(false);
                //VEL
                radioButton4.setChecked(true);
                radioButton5.setChecked(true);
                radioButton6.setChecked(false);
                //DIFF
                radioButton7.setChecked(true);
                radioButton8.setChecked(true);
                radioButton9.setChecked(false);
                break;
            case"LESION":
                imOp.setImageResource(R.drawable.oplesion);
                flag.setImageResource(R.drawable.hongkongicon);
                aff.setText("S.D.U.");
                ability.setImageResource(R.drawable.spinelesion);
                nameAbility.setText("MINA GU");
                //COR
                radioButton1.setChecked(true);
                radioButton2.setChecked(true);
                radioButton3.setChecked(false);
                //VEL
                radioButton4.setChecked(true);
                radioButton5.setChecked(true);
                radioButton6.setChecked(false);
                //DIFF
                radioButton7.setChecked(true);
                radioButton8.setChecked(false);
                radioButton9.setChecked(false);
                break;
            case"ELA":
                imOp.setImageResource(R.drawable.opela);
                flag.setImageResource(R.drawable.polandflag);
                aff.setText("GROM");
                ability.setImageResource(R.drawable.mineela);
                nameAbility.setText("MINA CONCUSSIONE");
                //COR
                radioButton1.setChecked(true);
                radioButton2.setChecked(false);
                radioButton3.setChecked(false);
                //VEL
                radioButton4.setChecked(true);
                radioButton5.setChecked(true);
                radioButton6.setChecked(true);
                //DIFF
                radioButton7.setChecked(true);
                radioButton8.setChecked(false);
                radioButton9.setChecked(false);
                break;
            case"CAVEIRA":
                imOp.setImageResource(R.drawable.opcaveira);
                flag.setImageResource(R.drawable.brazilflag);
                aff.setText("BOPE");
                nameAbility.setText("PASSO FELPATO");
                //COR
                radioButton1.setChecked(true);
                radioButton2.setChecked(false);
                radioButton3.setChecked(false);
                //VEL
                radioButton4.setChecked(true);
                radioButton5.setChecked(true);
                radioButton6.setChecked(true);
                //DIFF
                radioButton7.setChecked(true);
                radioButton8.setChecked(true);
                radioButton9.setChecked(true);
                break;
            case"GOYO":
                imOp.setImageResource(R.drawable.opgoyo);
                flag.setImageResource(R.drawable.mexicanflag);
                aff.setText("FES");
                ability.setImageResource(R.drawable.volcanshield);
                nameAbility.setText("SCUDO VOLCAN");
                //COR
                radioButton1.setChecked(true);
                radioButton2.setChecked(true);
                radioButton3.setChecked(false);
                //VEL
                radioButton4.setChecked(true);
                radioButton5.setChecked(true);
                radioButton6.setChecked(false);
                //DIFF
                radioButton7.setChecked(true);
                radioButton8.setChecked(true);
                radioButton9.setChecked(false);
                break;
            case"JAGER":
                imOp.setImageResource(R.drawable.opjager);//quando carichi questa foto le granate non sono più un problema
                flag.setImageResource(R.drawable.germanyflag);
                aff.setText("GSG9");
                ability.setImageResource(R.drawable.ads);
                nameAbility.setText("ADS");
                //COR
                radioButton1.setChecked(true);
                radioButton2.setChecked(true);
                radioButton3.setChecked(false);
                //VEL
                radioButton4.setChecked(true);
                radioButton5.setChecked(true);
                radioButton6.setChecked(false);
                //DIFF
                radioButton7.setChecked(true);
                radioButton8.setChecked(true);
                radioButton9.setChecked(false);
                break;
            case"MAESTRO":
                imOp.setImageResource(R.drawable.opmaestro);
                flag.setImageResource(R.drawable.italyflag);
                aff.setText("GIS");
                ability.setImageResource(R.drawable.evileye);
                nameAbility.setText("OCCHIO DEL MALE");
                //COR
                radioButton1.setChecked(true);
                radioButton2.setChecked(true);
                radioButton3.setChecked(true);
                //VEL
                radioButton4.setChecked(true);
                radioButton5.setChecked(false);
                radioButton6.setChecked(false);
                //DIFF
                radioButton7.setChecked(true);
                radioButton8.setChecked(true);
                radioButton9.setChecked(false);
                break;
            case"MOZZIE":
                imOp.setImageResource(R.drawable.opmozzie);
                flag.setImageResource(R.drawable.australiaflag);
                aff.setText("SASR");
                ability.setImageResource(R.drawable.pestlauncher);
                nameAbility.setText("LANCIAPARASSITI");
                //COR
                radioButton1.setChecked(true);
                radioButton2.setChecked(true);
                radioButton3.setChecked(false);
                //VEL
                radioButton4.setChecked(true);
                radioButton5.setChecked(true);
                radioButton6.setChecked(false);
                //DIFF
                radioButton7.setChecked(true);
                radioButton8.setChecked(true);
                radioButton9.setChecked(false);
                break;
            case"ORYX":
                imOp.setImageResource(R.drawable.oporyx);
                flag.setImageResource(R.drawable.jordanflag);
                aff.setText("NA");
                ability.setImageResource(R.drawable.remahdash);
                nameAbility.setText("SCATTO REMAH");
                //COR
                radioButton1.setChecked(true);
                radioButton2.setChecked(true);
                radioButton3.setChecked(false);
                //VEL
                radioButton4.setChecked(true);
                radioButton5.setChecked(true);
                radioButton6.setChecked(false);
                //DIFF
                radioButton7.setChecked(true);
                radioButton8.setChecked(true);
                radioButton9.setChecked(false);
                break;
            case"TACHANKA":
                imOp.setImageResource(R.drawable.optachanka);
                flag.setImageResource(R.drawable.russiaflag);
                aff.setText("SPETSNAZ");
                nameAbility.setText("SHUMIKHA");
                //COR
                radioButton1.setChecked(true);
                radioButton2.setChecked(true);
                radioButton3.setChecked(true);
                //VEL
                radioButton4.setChecked(true);
                radioButton5.setChecked(false);
                radioButton6.setChecked(false);
                //DIFF
                radioButton7.setChecked(true);
                radioButton8.setChecked(false);
                radioButton9.setChecked(false);
                break;
            case"WAMAI":
                imOp.setImageResource(R.drawable.opwamai);
                flag.setImageResource(R.drawable.kenyaflag);
                aff.setText("NIGHTHAVEN");
                nameAbility.setText("SISTEMA MAG-NET");
                //COR
                radioButton1.setChecked(true);
                radioButton2.setChecked(true);
                radioButton3.setChecked(false);
                //VEL
                radioButton4.setChecked(true);
                radioButton5.setChecked(true);
                radioButton6.setChecked(false);
                //DIFF
                radioButton7.setChecked(true);
                radioButton8.setChecked(true);
                radioButton9.setChecked(false);
                break;
            case"ECHO":
                imOp.setImageResource(R.drawable.opecho);
                flag.setImageResource(R.drawable.japanflag);
                aff.setText("S.A.T.");
                ability.setImageResource(R.drawable.yokai);
                nameAbility.setText("YOKAI");
                //COR
                radioButton1.setChecked(true);
                radioButton2.setChecked(true);
                radioButton3.setChecked(true);
                //VEL
                radioButton4.setChecked(true);
                radioButton5.setChecked(false);
                radioButton6.setChecked(false);
                //DIFF
                radioButton7.setChecked(true);
                radioButton8.setChecked(true);
                radioButton9.setChecked(true);
                break;
            case"PULSE":
                imOp.setImageResource(R.drawable.oppulse);
                flag.setImageResource(R.drawable.flagusa);
                aff.setText("SWAT");
                nameAbility.setText("SENSORE CARDIACO");
                //COR
                radioButton1.setChecked(true);
                radioButton2.setChecked(false);
                radioButton3.setChecked(false);
                //VEL
                radioButton4.setChecked(true);
                radioButton5.setChecked(true);
                radioButton6.setChecked(true);
                //DIFF
                radioButton7.setChecked(true);
                radioButton8.setChecked(true);
                radioButton9.setChecked(true);
                break;
            case"KAPKAN":
                imOp.setImageResource(R.drawable.opkapkan);
                flag.setImageResource(R.drawable.russiaflag);
                aff.setText("SPETSNAZ");
                ability.setImageResource(R.drawable.kapkantrap);
                nameAbility.setText("ANTI-INTRUSIONE");
                //COR
                radioButton1.setChecked(true);
                radioButton2.setChecked(true);
                radioButton3.setChecked(false);
                //VEL
                radioButton4.setChecked(true);
                radioButton5.setChecked(true);
                radioButton6.setChecked(false);
                //DIFF
                radioButton7.setChecked(true);
                radioButton8.setChecked(false);
                radioButton9.setChecked(false);
                break;
            case"DOC":
                imOp.setImageResource(R.drawable.opdoc);
                flag.setImageResource(R.drawable.franceflag);
                aff.setText("GIGN");
                nameAbility.setText("BLACK EYE");
                nameAbility.setText("SIRINGA AUTOMATICA");
                //COR
                radioButton1.setChecked(true);
                radioButton2.setChecked(true);
                radioButton3.setChecked(true);
                //VEL
                radioButton4.setChecked(true);
                radioButton5.setChecked(false);
                radioButton6.setChecked(false);
                //DIFF
                radioButton7.setChecked(true);
                radioButton8.setChecked(false);
                radioButton9.setChecked(false);
                break;
            case"ROOK":
                imOp.setImageResource(R.drawable.oprook);
                flag.setImageResource(R.drawable.franceflag);
                aff.setText("GIGN");
                nameAbility.setText("PIASTRE CORAZZATE");
                //COR
                radioButton1.setChecked(true);
                radioButton2.setChecked(true);
                radioButton3.setChecked(true);
                //VEL
                radioButton4.setChecked(true);
                radioButton5.setChecked(false);
                radioButton6.setChecked(false);
                //DIFF
                radioButton7.setChecked(true);
                radioButton8.setChecked(false);
                radioButton9.setChecked(false);
                break;
            case"CASTLE":
                imOp.setImageResource(R.drawable.opcastle);
                flag.setImageResource(R.drawable.flagusa);
                aff.setText("SWAT");
                ability.setImageResource(R.drawable.armorpanel);
                nameAbility.setText("PANNELLO CORAZZATO");
                //COR
                radioButton1.setChecked(true);
                radioButton2.setChecked(true);
                radioButton3.setChecked(false);
                //VEL
                radioButton4.setChecked(true);
                radioButton5.setChecked(true);
                radioButton6.setChecked(false);
                //DIFF
                radioButton7.setChecked(true);
                radioButton8.setChecked(true);
                radioButton9.setChecked(false);
                break;
            case"WARDEN":
                imOp.setImageResource(R.drawable.opwarden);
                flag.setImageResource(R.drawable.flagusa);
                aff.setText("SECRET SERVICE");
                nameAbility.setText("OCCHIALI SMART");
                //COR
                radioButton1.setChecked(true);
                radioButton2.setChecked(true);
                radioButton3.setChecked(false);
                //VEL
                radioButton4.setChecked(true);
                radioButton5.setChecked(true);
                radioButton6.setChecked(false);
                //DIFF
                radioButton7.setChecked(true);
                radioButton8.setChecked(true);
                radioButton9.setChecked(false);
                break;
        }


        return view;
    }
}