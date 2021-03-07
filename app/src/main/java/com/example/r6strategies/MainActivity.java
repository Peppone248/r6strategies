package com.example.r6strategies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.r6strategies.bank.SelectSpotBank;
import com.example.r6strategies.border.SelectSpotBorder;
import com.example.r6strategies.clb.SelectSpotCLB;
import com.example.r6strategies.coastline.SelectSpotCosta;
import com.example.r6strategies.kafe.SelectSpotKafe;
import com.example.r6strategies.oregon.SelectSpotOregon;


public class MainActivity extends AppCompatActivity {
    ListView list;

    String[] maintitle ={
            "Kafe","Border",
            "Bank","Oregon",
            "Kanal", "Coastline",
            "Clubhouse", "Theme Park",
            "Villa", "Skyscraper"
    };


    Integer[] imgid={
            R.drawable.kafe,R.drawable.border,
            R.drawable.bank,R.drawable.oregon,
            R.drawable.kanal, R.drawable.costa,
            R.drawable.clb, R.drawable.theme,
            R.drawable.villa, R.drawable.skyscraper
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyListAdapter adapter=new MyListAdapter(this, maintitle, imgid);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
                if(position == 0) {
                    Intent kafe = new Intent(getApplicationContext(), SelectSpotKafe.class);
                    startActivity(kafe);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                }

                else if(position == 1) {
                    Intent kafe = new Intent(getApplicationContext(), SelectSpotBorder.class);
                    startActivity(kafe);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                }

                else if(position == 2) {
                    Intent bank = new Intent(MainActivity.this, SelectSpotBank.class);
                    MainActivity.this.startActivity(bank);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

                }
                else if(position == 3) {
                    Intent oregon = new Intent(MainActivity.this, SelectSpotOregon.class);
                    MainActivity.this.startActivity(oregon);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                }
                else if(position == 4) {

                    Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code",Toast.LENGTH_SHORT).show();
                }
                 else if(position == 5) {
                    Intent costa = new Intent(MainActivity.this, SelectSpotCosta.class);
                    MainActivity.this.startActivity(costa);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                }
                 else if(position == 6) {
                     Intent clb = new Intent(MainActivity.this, SelectSpotCLB.class);
                     MainActivity.this.startActivity(clb);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                }
                 else if(position == 7) {

                    Toast.makeText(getApplicationContext(),"Place Your Third Option Code",Toast.LENGTH_SHORT).show();
                }
                 else if(position == 8) {

                    Toast.makeText(getApplicationContext(),"Place Your Third Option Code",Toast.LENGTH_SHORT).show();
                }
                 else if(position == 9) {

                    Toast.makeText(getApplicationContext(),"Place Your Third Option Code",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


    @Override
    public void onBackPressed() {
        //Pulsante back disabilitato
    }

}