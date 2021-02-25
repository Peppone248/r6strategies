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

        TextView nomeOp = view.findViewById(R.id.name_operator);
        nomeOp.setText(os.operatore);

        switch(os.operatore){
            case"VALKYRIE":
                imOp.setImageResource(R.drawable.valk);
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
            case"CAIVERA":
                imOp.setImageResource(R.drawable.opcaveira);
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
            case"PULSE":
                imOp.setImageResource(R.drawable.oppulse);
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