package com.example.r6strategies.oregon;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.r6strategies.R;
import com.example.r6strategies.ValkyrieGadget;
import com.example.r6strategies.ValkyrieInfo;
import com.example.r6strategies.ValkyrieLoadout;
import com.example.r6strategies.ValkyrieRole;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Valkyrie extends AppCompatActivity {

    BottomNavigationView navView;
    final Fragment fragment1 = new ValkyrieInfo();
    final Fragment fragment2 = new ValkyrieRole();
    final Fragment fragment3 = new ValkyrieGadget();
    final Fragment fragment4 = new ValkyrieLoadout();
    final FragmentManager fm = getSupportFragmentManager();
    Fragment active = fragment1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valkyrie);
        navView = findViewById(R.id.navigationView);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        fm.beginTransaction().add(R.id.main_container, fragment4, "3").hide(fragment4).commit();
        fm.beginTransaction().add(R.id.main_container, fragment3, "3").hide(fragment3).commit();
        fm.beginTransaction().add(R.id.main_container, fragment2, "2").hide(fragment2).commit();
        fm.beginTransaction().add(R.id.main_container,fragment1, "1").commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()){
                case R.id.navigation_info:
                    Toast.makeText(Valkyrie.this, "INFO", Toast.LENGTH_SHORT).show();
                    fm.beginTransaction().hide(active).show(fragment1).commit();
                    active = fragment1;

                case R.id.navigation_role:
                    Toast.makeText(Valkyrie.this, "ROLE", Toast.LENGTH_SHORT).show();
                    fm.beginTransaction().hide(active).show(fragment2).commit();
                    active = fragment2;
                    return true;
                case R.id.navigation_gadget:
                    Toast.makeText(Valkyrie.this, "GADGET", Toast.LENGTH_SHORT).show();
                    fm.beginTransaction().hide(active).show(fragment3).commit();
                    active = fragment3;
                    return true;
                case R.id.navigation_loadout:
                    Toast.makeText(Valkyrie.this, "LOADOUT", Toast.LENGTH_SHORT).show();
                    fm.beginTransaction().hide(active).show(fragment4).commit();
                    active = fragment4;
                    return true;
            }
            return false;
        }
    };
}