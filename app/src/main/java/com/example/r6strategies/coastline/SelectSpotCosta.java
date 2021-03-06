package com.example.r6strategies.coastline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.r6strategies.MyListRadioAdapter;
import com.example.r6strategies.R;

public class SelectSpotCosta extends AppCompatActivity {

    ListView list;

    public String[] maintitle ={
            "2F Theater \n 2F Penthouse","2F Hookah Lounge \n 2F Billiards Room",
            "1F Blue Bar \n 1F Sunrise Bar","1F Service Entrance \n 1F Kitchen"
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
                    Intent costa = new Intent(SelectSpotCosta.this, CostaStrat.class);
                    SelectSpotCosta.this.startActivity(costa);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

                }
                else if(position == 1) {
                    Intent costa = new Intent(SelectSpotCosta.this, CostaStrat1.class);
                    SelectSpotCosta.this.startActivity(costa);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                }

                else if(position == 2) {
                    Intent costa = new Intent(SelectSpotCosta.this, CostaStrat2.class);
                    SelectSpotCosta.this.startActivity(costa);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                }
                else if(position == 3) {
                    Intent costa = new Intent(SelectSpotCosta.this, CostaStrat3.class);
                    SelectSpotCosta.this.startActivity(costa);
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