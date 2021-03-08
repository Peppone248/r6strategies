package com.example.r6strategies.kanal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.r6strategies.MyListRadioAdapter;
import com.example.r6strategies.R;

public class SelectSpotKanal extends AppCompatActivity {

    ListView list;

    public String[] maintitle ={
            "2F Radar Room\n2F Server Room","1F Map Room\n1F Security Room",
            "1F Coast Guard Meeting Room\n1F Lounge","B1 Supply Room\nB1 Kayaks"
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
                    Intent kanal = new Intent(SelectSpotKanal.this, kanalStrat.class);
                    SelectSpotKanal.this.startActivity(kanal);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

                }
                else if(position == 1) {
                    Intent kanal = new Intent(SelectSpotKanal.this, kanalStrat1.class);
                    SelectSpotKanal.this.startActivity(kanal);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                }

                else if(position == 2) {
                    Intent kanal = new Intent(SelectSpotKanal.this, kanalStrat2.class);
                    SelectSpotKanal.this.startActivity(kanal);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                }
                else if(position == 3) {
                    Intent kanal = new Intent(SelectSpotKanal.this, kanalStrat3.class);
                    SelectSpotKanal.this.startActivity(kanal);
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