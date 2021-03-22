package com.example.r6strategies.chalet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.r6strategies.MyListRadioAdapter;
import com.example.r6strategies.R;


public class SelectSpotChalet extends AppCompatActivity {

    ListView list;

    public String[] maintitle ={
            "2F Master Bedroom \n 2F Office","1F Bar \n 1F Gaming Room",
            "1F Dining Room \n 1F Kitchen","B Wine Cellar \n B Snowmobile Garage"
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
                    Intent chalet = new Intent(SelectSpotChalet.this, ChaletStrat.class);
                    SelectSpotChalet.this.startActivity(chalet);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

                }
                else if(position == 1) {
                    Intent chalet = new Intent(SelectSpotChalet.this, ChaletStrat1.class);
                    SelectSpotChalet.this.startActivity(chalet);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                }

                else if(position == 2) {
                    Intent chalet = new Intent(SelectSpotChalet.this, ChaletStrat2.class);
                    SelectSpotChalet.this.startActivity(chalet);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                }
                else if(position == 3) {
                    Intent chalet = new Intent(SelectSpotChalet.this, ChaletStrat3.class);
                    SelectSpotChalet.this.startActivity(chalet);
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