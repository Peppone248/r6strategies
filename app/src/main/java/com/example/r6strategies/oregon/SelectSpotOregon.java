package com.example.r6strategies.oregon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.r6strategies.MyListRadioAdapter;
import com.example.r6strategies.R;

public class SelectSpotOregon extends AppCompatActivity {

    ListView list;

   public String[] maintitle ={
            "2F Main Dorms Hall\n2F Kids Dormitory","1F Dining Hall\n1F Kitchen",
            "1F Meeting Hall\n1F Kitchen","B Laundry Room\nB Supply Room"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_spot);

        MyListRadioAdapter adapter = new MyListRadioAdapter(this, maintitle);
        list = (ListView)findViewById(R.id.listSpot);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent oregon = new Intent(SelectSpotOregon.this, OregonStrat.class);
                    SelectSpotOregon.this.startActivity(oregon);

                }
                else if(position == 1) {
                    Intent oregon = new Intent(SelectSpotOregon.this, OregonStrat1.class);
                    SelectSpotOregon.this.startActivity(oregon);
                }

                else if(position == 2) {
                    Intent oregon = new Intent(SelectSpotOregon.this, OregonStrat2.class);
                    SelectSpotOregon.this.startActivity(oregon);
                }
                else if(position == 3) {
                    Intent oregon = new Intent(SelectSpotOregon.this, OregonStrat3.class);
                    SelectSpotOregon.this.startActivity(oregon);
                }
            }
        });

    }
}