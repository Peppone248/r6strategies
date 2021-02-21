package com.example.r6strategies.bank;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.r6strategies.MyFragmentPagerAdapter1;
import com.example.r6strategies.R;
import com.google.android.material.tabs.TabLayout;

public class BankStrat1 extends AppCompatActivity {

    MyFragmentPagerAdapter1 myFragmentPagerAdapter;
    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oregon_strat);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);

        setPagerAdapter();
        setTabLayout();
    }

    private void setPagerAdapter(){
        myFragmentPagerAdapter = new MyFragmentPagerAdapter1(getSupportFragmentManager());
        viewPager.setAdapter(myFragmentPagerAdapter);
    }

    private void setTabLayout() {
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setText("Easy");
        tabLayout.getTabAt(1).setText("Medium");
        tabLayout.getTabAt(2).setText("Hard");
    }
}