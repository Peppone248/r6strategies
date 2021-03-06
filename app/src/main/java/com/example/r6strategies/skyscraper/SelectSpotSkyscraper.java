package com.example.r6strategies.skyscraper;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.r6strategies.MyListRadioAdapter;
import com.example.r6strategies.R;

public class SelectSpotSkyscraper extends AppCompatActivity {

    ListView list;

    public String[] maintitle ={
            "2F Karaoke\n2F Tea Room","2F Exhibition\n2F Work Office",
            "1F BBQ\n1F Kitchen","1F Bedroom\n1F Bathroom"
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
                    Intent skyscraper = new Intent(SelectSpotSkyscraper.this, skyscraperStrat.class);
                    SelectSpotSkyscraper.this.startActivity(skyscraper);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

                }
                else if(position == 1) {
                    Intent skyscraper = new Intent(SelectSpotSkyscraper.this, skyscraperStrat1.class);
                    SelectSpotSkyscraper.this.startActivity(skyscraper);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                }

                else if(position == 2) {
                    Intent skyscraper = new Intent(SelectSpotSkyscraper.this, skyscraperStrat2.class);
                    SelectSpotSkyscraper.this.startActivity(skyscraper);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                }
                else if(position == 3) {
                    Intent skyscraper = new Intent(SelectSpotSkyscraper.this, skyscraperStrat3.class);
                    SelectSpotSkyscraper.this.startActivity(skyscraper);
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