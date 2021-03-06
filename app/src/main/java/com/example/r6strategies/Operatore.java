package com.example.r6strategies;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.r6strategies.modelli.OperatoreSpot;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Operatore extends AppCompatActivity {

    private BottomNavigationView navView;
    private ViewPager viewPager;
    final Fragment fragment1 = new OperatoreInfo();
    final Fragment fragment2 = new OperatoreRole();
    final Fragment fragment3 = new OperatoreGadget();
    final Fragment fragment4 = new OperatoreLoadout();
    final FragmentManager fm = getSupportFragmentManager();
    Fragment active = fragment1;

    OperatoreSpot os;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //prendo i dati
        Intent i = getIntent();
        os = (OperatoreSpot) i.getSerializableExtra("os");

        Bundle bundle = new Bundle();
        bundle.putSerializable("os", os);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operatore);

        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        navView = findViewById(R.id.navigationView);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        viewPager = (ViewPager) findViewById(R.id.view_pager_navView);
        fragment1.setArguments(bundle);
        fragment2.setArguments(bundle);
        fragment3.setArguments(bundle);
        fragment4.setArguments(bundle);
        fm.beginTransaction().add(R.id.main_container, fragment4, "4").hide(fragment4).commit();
        fm.beginTransaction().add(R.id.main_container, fragment3, "3").hide(fragment3).commit();
        fm.beginTransaction().add(R.id.main_container, fragment2, "2").hide(fragment2).commit();
        fm.beginTransaction().add(R.id.main_container,fragment1, "1").commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()){
                case R.id.navigation_info:
                    fm.beginTransaction().hide(active).show(fragment1).commit();
                    active = fragment1;
                    return true;

                case R.id.navigation_role:
                    fm.beginTransaction().hide(active).show(fragment2).commit();
                    active = fragment2;
                    return true;
                case R.id.navigation_gadget:
                    fm.beginTransaction().hide(active).show(fragment3).commit();
                    active = fragment3;
                    return true;
                case R.id.navigation_loadout:
                    fm.beginTransaction().hide(active).show(fragment4).commit();
                    active = fragment4;
                    return true;
            }
            return false;
        }
    };

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}