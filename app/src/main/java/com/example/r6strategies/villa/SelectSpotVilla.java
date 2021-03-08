package com.example.r6strategies.villa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.r6strategies.MyListRadioAdapter;
import com.example.r6strategies.R;

public class SelectSpotVilla extends AppCompatActivity {

    ListView list;

    public String[] maintitle ={
            "2F Aviator Room\n2F Games Room","2F Trophy Roomk\n2F Statuary Room",
            "1F Living Room\n1F Library","1F Dining Room\n1F Kitchen"
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
                    Intent villa = new Intent(SelectSpotVilla.this, villaStrat.class);
                    SelectSpotVilla.this.startActivity(villa);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

                }
                else if(position == 1) {
                    Intent villa = new Intent(SelectSpotVilla.this, villaStrat1.class);
                    SelectSpotVilla.this.startActivity(villa);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                }

                else if(position == 2) {
                    Intent villa = new Intent(SelectSpotVilla.this, villaStrat2.class);
                    SelectSpotVilla.this.startActivity(villa);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                }
                else if(position == 3) {
                    Intent villa = new Intent(SelectSpotVilla.this, villaStrat3.class);
                    SelectSpotVilla.this.startActivity(villa);
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