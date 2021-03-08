package com.example.r6strategies.theme;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.r6strategies.MyListRadioAdapter;
import com.example.r6strategies.R;

public class SelectSpotTheme extends AppCompatActivity {

    ListView list;

    public String[] maintitle ={
            "2F Initiation Room\n2F Offic","2F Bunk\n2F Day Care",
            "1F Armory\n1F Throne Room","1F Lab\n1F Storage"
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
                    Intent theme = new Intent(SelectSpotTheme.this, themeStrat.class);
                    SelectSpotTheme.this.startActivity(theme);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

                }
                else if(position == 1) {
                    Intent theme = new Intent(SelectSpotTheme.this, themeStrat1.class);
                    SelectSpotTheme.this.startActivity(theme);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                }

                else if(position == 2) {
                    Intent theme = new Intent(SelectSpotTheme.this, themeStrat2.class);
                    SelectSpotTheme.this.startActivity(theme);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                }
                else if(position == 3) {
                    Intent theme = new Intent(SelectSpotTheme.this, themeStrat3.class);
                    SelectSpotTheme.this.startActivity(theme);
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