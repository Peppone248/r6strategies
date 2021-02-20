package com.example.r6strategies.Intro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.r6strategies.MainActivity;
import com.example.r6strategies.R;

public class Splash extends AppCompatActivity {
    private static int SPALSH_TIME_OUT = 5000;

    private String id;
    TextView gadg;
    ImageView logo;

    //Animazioni
    Animation bottomAnimation, middleAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        bottomAnimation = AnimationUtils.loadAnimation(this, R.anim.top_animation_splash);
        middleAnimation = AnimationUtils.loadAnimation(this, R.anim.middle_animation_splash);


        logo = findViewById(R.id.logo);
        gadg = findViewById(R.id.dev);

        logo.setAnimation(middleAnimation);
        gadg.setAnimation(bottomAnimation);

        //Estraggo l'utente

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
                overridePendingTransition(R.anim.anim, R.anim.no_animation);
            }
        }, 2000);


    }
}