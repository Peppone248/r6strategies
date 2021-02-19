package com.example.r6strategies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.r6strategies.clb.SelectSpotCLB;
import com.example.r6strategies.coastline.SelectSpotCosta;
import com.example.r6strategies.oregon.SelectSpotOregon;


public class MainActivity extends AppCompatActivity {
    ListView list;

    String[] maintitle ={
            "Kafe","Border",
            "Bank","Oregon",
            "Chalet", "Coastline",
            "Clubhouse", "Theme Park",
            "Villa"
    };

    String[] subtitle ={
            "Sub Title 1","Sub Title 2",
            "Sub Title 3","Sub Title 4",
            "Sub Title 5", "Sub Title 6",
            "Sub Title 7", "Sub Title 8",
            "Sub Title 9"
    };

    Integer[] imgid={
            R.drawable.kafe,R.drawable.border,
            R.drawable.bank,R.drawable.oregon,
            R.drawable.chalet, R.drawable.costa,
            R.drawable.clb, R.drawable.theme,
            R.drawable.villa
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyListAdapter adapter=new MyListAdapter(this, maintitle, subtitle, imgid);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
                if(position == 0) {
                    //code specific to first list item

                    Toast.makeText(getApplicationContext(),"Place Your First Option Code",Toast.LENGTH_SHORT).show();
                }

                else if(position == 1) {
                    //code specific to 2nd list item
                    Toast.makeText(getApplicationContext(),"Place Your Second Option Code",Toast.LENGTH_SHORT).show();
                }

                else if(position == 2) {

                    Toast.makeText(getApplicationContext(),"Place Your Third Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 3) {
                    Intent oregon = new Intent(MainActivity.this, SelectSpotOregon.class);
                    MainActivity.this.startActivity(oregon);
                }
                else if(position == 4) {

                    Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code",Toast.LENGTH_SHORT).show();
                }
                 else if(position == 5) {
                    Intent costa = new Intent(MainActivity.this, SelectSpotCosta.class);
                    MainActivity.this.startActivity(costa);
                }
                 else if(position == 6) {
                     Intent clb = new Intent(MainActivity.this, SelectSpotCLB.class);
                     MainActivity.this.startActivity(clb);
                }
                 else if(position == 7) {

                    Toast.makeText(getApplicationContext(),"Place Your Third Option Code",Toast.LENGTH_SHORT).show();
                }
                 else if(position == 8) {

                    Toast.makeText(getApplicationContext(),"Place Your Third Option Code",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}