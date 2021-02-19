package com.example.r6strategies.coastline;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.r6strategies.R;
import com.google.android.material.tabs.TabLayout;

public class CostaStrat1 extends AppCompatActivity {

    MyFragmentPagerAdapter1 myFragmentPagerAdapter;
    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_costa_strat);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);

        setPagerAdapter();
        setTabLayout();
    }

    private void setPagerAdapter(){
        myFragmentPagerAdapter = new com.example.r6strategies.coastline.MyFragmentPagerAdapter1(getSupportFragmentManager());
        viewPager.setAdapter(myFragmentPagerAdapter);
    }

    private void setTabLayout() {
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setText("Easy");
        tabLayout.getTabAt(1).setText("Medium");
        tabLayout.getTabAt(2).setText("Hard");
    }
}