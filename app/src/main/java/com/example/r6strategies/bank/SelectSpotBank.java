package com.example.r6strategies.bank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.r6strategies.MyListRadioAdapter;
import com.example.r6strategies.R;
import com.example.r6strategies.coastline.CostaStrat;
import com.example.r6strategies.coastline.CostaStrat1;
import com.example.r6strategies.coastline.CostaStrat2;
import com.example.r6strategies.coastline.CostaStrat3;
import com.example.r6strategies.coastline.SelectSpotCosta;

public class SelectSpotBank extends AppCompatActivity {

    ListView list;

    public String[] maintitle ={
            "2F Executive Lounge\n2F CEO Office","1F Staff Room\n1F Open Arena",
            "1F Teller's Office\n1F Archives","B Lockers\nB CCTV Room"
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
                    Intent bank = new Intent(SelectSpotBank.this, BankStrat.class);
                    SelectSpotBank.this.startActivity(bank);

                }
                else if(position == 1) {
                    Intent bank = new Intent(SelectSpotBank.this, BankStrat1.class);
                    SelectSpotBank.this.startActivity(bank);
                }

                else if(position == 2) {
                    Intent bank = new Intent(SelectSpotBank.this, BankStrat2.class);
                    SelectSpotBank.this.startActivity(bank);
                }
                else if(position == 3) {
                    Intent bank = new Intent(SelectSpotBank.this, BankStrat3.class);
                    SelectSpotBank.this.startActivity(bank);
                }
            }
        });
    }
}