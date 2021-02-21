package com.example.r6strategies.clb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.r6strategies.MyListRadioAdapter;
import com.example.r6strategies.R;
import com.example.r6strategies.oregon.OregonStrat;
import com.example.r6strategies.oregon.OregonStrat1;
import com.example.r6strategies.oregon.OregonStrat2;
import com.example.r6strategies.oregon.SelectSpotOregon;

public class SelectSpotCLB extends AppCompatActivity {

    ListView list;

    public String[] maintitle ={
            "2F Gym \n 2F Bedroom","2F CCTV Room \n 2F Cash Room",
            "1F Bar \n 1F Stock Room","B Church \n B Arsenal Room"
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
                    Intent clb = new Intent(SelectSpotCLB.this, CLBStrat.class);
                    SelectSpotCLB.this.startActivity(clb);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

                }
                else if(position == 1) {
                    Intent clb = new Intent(SelectSpotCLB.this, CLBStrat1.class);
                    SelectSpotCLB.this.startActivity(clb);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                }

                else if(position == 2) {
                    Intent clb = new Intent(SelectSpotCLB.this, CLBStrat2.class);
                    SelectSpotCLB.this.startActivity(clb);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                }
                else if(position == 3) {
                    Intent clb = new Intent(SelectSpotCLB.this, CLBStrat3.class);
                    SelectSpotCLB.this.startActivity(clb);
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