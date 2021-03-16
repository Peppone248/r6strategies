package com.example.r6strategies;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.r6strategies.modelli.OperatoreSpot;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class WallsActivity extends AppCompatActivity {

    private BottomNavigationView navView;
    private ViewPager viewPager;
    final Fragment fragment1 = new WallsReinforced();
    final Fragment fragment2 = new WallsRotation();
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
        setContentView(R.layout.activity_walls);

        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        navView = findViewById(R.id.navigationView);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        viewPager = (ViewPager) findViewById(R.id.view_pager_navView);
        fragment1.setArguments(bundle);
        fragment2.setArguments(bundle);

        fm.beginTransaction().add(R.id.main_container, fragment2, "2").hide(fragment2).commit();
        fm.beginTransaction().add(R.id.main_container,fragment1, "1").commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()){
                case R.id.navigation_reinforced:
                    fm.beginTransaction().hide(active).show(fragment1).commit();
                    active = fragment1;
                    return true;

                case R.id.navigation_rotation:
                    fm.beginTransaction().hide(active).show(fragment2).commit();
                    active = fragment2;
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