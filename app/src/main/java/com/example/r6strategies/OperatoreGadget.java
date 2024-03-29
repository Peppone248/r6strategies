package com.example.r6strategies;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ListView;


import com.example.r6strategies.modelli.OperatoreSpot;

public class OperatoreGadget extends Fragment {

    String[] maintitle;
    Integer[] imgid ;

    public OperatoreGadget() {
        // Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_operator_gadget, container, false);

        Bundle bundle = getArguments();
        OperatoreSpot os= (OperatoreSpot) bundle.getSerializable("os");

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


        String temp = mappa+spot+diff+os.operatore.toLowerCase()+"gadget";
        Context context = view.getContext();
        String temp2;
        String temp3;
        int flag;
        int i =1;
        int j=0;

        do{
            j++;
            temp3= temp+j;
        }while (context.getResources().getIdentifier(temp3, "drawable", context.getPackageName())!=0);

        if(j>1){
            maintitle=new String[j-1];
            imgid=new Integer[j-1];

            do{
                temp2 = temp + i;
                flag=context.getResources().getIdentifier(temp2, "drawable", context.getPackageName());
                imgid[i-1]=flag;
                maintitle[i-1]= "Suggested Spot ";
                i++;
                temp3= temp+i;
            }while (context.getResources().getIdentifier(temp3, "drawable", context.getPackageName())!=0);

            ListView list=view.findViewById(R.id.list_images_ability);

            ImageGadgetListAdpter lAdapter = new ImageGadgetListAdpter(getActivity(),maintitle, imgid);

            list.setAdapter(lAdapter);

        }else{
            view =inflater.inflate(R.layout.fragment_operator_nogadget, container, false);
        }


      return view;
    }
}