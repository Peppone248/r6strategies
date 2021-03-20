package com.example.r6strategies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.r6strategies.kafe.SelectSpotKafe;

public class FirstScreen extends AppCompatActivity {

    public ImageView attImg;
    public ImageView defImg;
    public TextView attacker;
    public TextView defender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_screen);

        attImg = (ImageView) findViewById(R.id.r6attImage);
        defImg = (ImageView) findViewById(R.id.r6defImage);
        attacker = (TextView) findViewById(R.id.att);
        defender = (TextView) findViewById(R.id.def);

        defImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent defStrat = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(defStrat);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });

        defender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent defStrat = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(defStrat);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });
        
        attImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent attStrat = new Intent(getApplicationContext(), AvailableSoonScreen.class);
                startActivity(attStrat);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });

        attacker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent attStrat = new Intent(getApplicationContext(), AvailableSoonScreen.class);
                startActivity(attStrat);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });
    }


    @Override
    public void onBackPressed() {
        //Pulsante back disabilitato
    }

}