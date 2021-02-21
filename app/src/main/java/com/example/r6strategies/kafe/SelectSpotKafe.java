package com.example.r6strategies.kafe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.r6strategies.MyListRadioAdapter;
import com.example.r6strategies.R;

public class SelectSpotKafe extends AppCompatActivity {

    ListView list;

    public String[] maintitle ={
            "3F Bar\n3F Cocktail Lounge","2F Fireplace Hall\n2F Mining Room",
            "2F Reading Room\n2F Fireplace Hall","1F Kitchen Service\n1F Kitchen Cooking"
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
                    Intent kafe = new Intent(SelectSpotKafe.this, KafeStrat.class);
                    SelectSpotKafe.this.startActivity(kafe);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

                }
                else if(position == 1) {
                    Intent kafe = new Intent(SelectSpotKafe.this, KafeStrat1.class);
                    SelectSpotKafe.this.startActivity(kafe);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                }

                else if(position == 2) {
                    Intent kafe = new Intent(SelectSpotKafe.this, KafeStrat2.class);
                    SelectSpotKafe.this.startActivity(kafe);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                }
                else if(position == 3) {
                    Intent kafe = new Intent(SelectSpotKafe.this, KafeStrat3.class);
                    SelectSpotKafe.this.startActivity(kafe);
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