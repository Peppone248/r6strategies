package com.example.r6strategies.border;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.r6strategies.MyListRadioAdapter;
import com.example.r6strategies.R;


public class SelectSpotBorder extends AppCompatActivity {

    ListView list;

    public String[] maintitle ={
            "2F Armory Lockers\n2F Archives","1F Workshop\n1F Ventilation Room",
            "1F Customs Inspection\n1F Supply Room","1F Tellers\n1F Bathrooms"
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
                    Intent border = new Intent(SelectSpotBorder.this, BorderStrat.class);
                    SelectSpotBorder.this.startActivity(border);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

                }
                else if(position == 1) {
                    Intent border = new Intent(SelectSpotBorder.this, BorderStrat1.class);
                    SelectSpotBorder.this.startActivity(border);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                }

                else if(position == 2) {
                    Intent border = new Intent(SelectSpotBorder.this, BorderStrat2.class);
                    SelectSpotBorder.this.startActivity(border);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                }
                else if(position == 3) {
                    Intent border = new Intent(SelectSpotBorder.this, BorderStrat3.class);
                    SelectSpotBorder.this.startActivity(border);
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