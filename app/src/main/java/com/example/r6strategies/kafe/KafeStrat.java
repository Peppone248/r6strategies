package com.example.r6strategies.kafe;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.r6strategies.R;
import com.google.android.material.tabs.TabLayout;

public class KafeStrat extends AppCompatActivity {

    com.example.r6strategies.kafe.MyFragmentPagerAdapter myFragmentPagerAdapter;
    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kafe_strat);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);

        setPagerAdapter();
        setTabLayout();
    }

    private void setPagerAdapter(){
        myFragmentPagerAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(myFragmentPagerAdapter);
    }

    private void setTabLayout() {
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setText("Easy");
        tabLayout.getTabAt(1).setText("Medium");
        tabLayout.getTabAt(2).setText("Hard");
    }
}