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

        switch (os.diff){
            case 1:
                diff="easy";
                break;
            case 2:
                diff="medium";
                break;
            case 3:
                diff="hard";
                break;
        }

        switch (os.mappa){
            case 0:
                mappa="kafe";
                switch (os.spot){
                    case 0:
                        spot = "barcocktaillounge";
                        break;
                    case 1:
                        spot = "fireplacehallminingroom";
                        break;
                    case 2:
                        spot = "readingroomfireplacehall";
                        break;
                    case 3:
                        spot = "kitchenservicekitchencooking";
                        break;
                }
                break;
            case 1:
                mappa="border";
                switch (os.spot){
                    case 0:
                        spot = "armorylockersarchives";
                        break;
                    case 1:
                        spot = "workshopventilationroom";
                        break;
                    case 2:
                        spot = "customsinspectionsupplyroom";
                        break;
                    case 3:
                        spot = "tellersbathrooms";
                        break;
                }
                break;
            case 2:
                mappa="bank";
                switch (os.spot){
                    case 0:
                        spot = "executiveloungeceooffice";
                        break;
                    case 1:
                        spot = "staffroomopenarena";
                        break;
                    case 2:
                        spot = "tellersofficearchives";
                        break;
                    case 3:
                        spot = "lockerscctvroom";
                        break;
                }
                break;
            case 3:
                mappa="oregon";
                switch (os.spot){
                    case 0:
                        spot = "maindormshallkidsdormitory";
                        break;
                    case 1:
                        spot = "dininghallkitchen";
                        break;
                    case 2:
                        spot = "meetinghallkitchen";
                        break;
                    case 3:
                        spot = "laundryroomsupplyroom";
                        break;
                }
                break;
            case 4:
                mappa="kanal";
                switch (os.spot){
                    case 0:
                        spot = "radarroomserverroom";
                        break;
                    case 1:
                        spot = "maproomsecurityroom";
                        break;
                    case 2:
                        spot = "coastguardmeetingroomlounge";
                        break;
                    case 3:
                        spot = "supplyroomkayaks";
                        break;
                }
                break;
            case 5:
                mappa="coastline";
                switch (os.spot){
                    case 0:
                        spot = "theaterpenthouse";
                        break;
                    case 1:
                        spot = "hookahloungebilliardsroom";
                        break;
                    case 2:
                        spot = "bluebarsunrisebar";
                        break;
                    case 3:
                        spot = "serviceentrancekitchen";
                        break;
                }
                break;
            case 6:
                mappa="clb";
                switch (os.spot){
                    case 0:
                        spot = "gymbedroom";
                        break;
                    case 1:
                        spot = "cctvroomcashroom";
                        break;
                    case 2:
                        spot = "barstockroom";
                        break;
                    case 3:
                        spot = "churcharsenalroom";
                        break;
                }
                break;
            case 7:
                mappa="themepark";
                switch (os.spot){
                    case 0:
                        spot = "initiationroomoffice";
                        break;
                    case 1:
                        spot = "bunkdaycare";
                        break;
                    case 2:
                        spot = "armorythroneroom";
                        break;
                    case 3:
                        spot = "labstorage";
                        break;
                }
                break;
            case 8:
                mappa="villa";
                switch (os.spot){
                    case 0:
                        spot = "aviatorroomgamesroom";
                        break;
                    case 1:
                        spot = "trophyroomstatuaryroom";
                        break;
                    case 2:
                        spot = "livingroomlibrary";
                        break;
                    case 3:
                        spot = "diningroomkitchen";
                        break;
                }
                break;
            case 9:
                mappa="skyscraper";

                switch (os.spot){
                    case 0:
                        spot = "karaoketearoom";
                        break;
                    case 1:
                        spot = "exhibitionworkoffice";
                        break;
                    case 2:
                        spot = "bbqkitchen";
                        break;
                    case 3:
                        spot = "bedroombathroom";
                        break;
                }

                break;
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