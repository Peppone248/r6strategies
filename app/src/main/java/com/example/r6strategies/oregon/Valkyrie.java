package com.example.r6strategies.oregon;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.r6strategies.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Valkyrie extends AppCompatActivity {

    BottomNavigationView navView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valkyrie);
        navView = findViewById(R.id.navigationView);

        navView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.navigation_role:
                        Toast.makeText(Valkyrie.this, "ROLE", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.navigation_gadget:
                        Toast.makeText(Valkyrie.this, "GADGET", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.navigation_loadout:
                        Toast.makeText(Valkyrie.this, "LOADOUT", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });
    }
}