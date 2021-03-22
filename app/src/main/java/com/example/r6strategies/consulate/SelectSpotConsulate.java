package com.example.r6strategies.consulate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.r6strategies.MyListRadioAdapter;
import com.example.r6strategies.R;

public class SelectSpotConsulate extends AppCompatActivity {

    ListView list;

    public String[] maintitle ={
            "2F Consul Office \n 2F Meeting Room","1F Lobby \n 1F Press Room",
            "B Garage \n B Cafeteria","1F Tellers \n B Archives"
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
                    Intent consulate = new Intent(SelectSpotConsulate.this, ConsStrat.class);
                    SelectSpotConsulate.this.startActivity(consulate);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

                }
                else if(position == 1) {
                    Intent consulate = new Intent(SelectSpotConsulate.this, ConsStrat1.class);
                    SelectSpotConsulate.this.startActivity(consulate);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                }

                else if(position == 2) {
                    Intent consulate = new Intent(SelectSpotConsulate.this, ConsStrat2.class);
                    SelectSpotConsulate.this.startActivity(consulate);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                }
                else if(position == 3) {
                    Intent consulate = new Intent(SelectSpotConsulate.this, ConsStrat3.class);
                    SelectSpotConsulate.this.startActivity(consulate);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                }
            }
        });
    }
    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}