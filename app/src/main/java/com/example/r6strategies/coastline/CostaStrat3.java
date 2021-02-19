package com.example.r6strategies.coastline;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.r6strategies.R;
import com.google.android.material.tabs.TabLayout;

public class CostaStrat3 extends AppCompatActivity {

    MyFragmentPagerAdapter3 myFragmentPagerAdapter3;
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
        myFragmentPagerAdapter3 = new com.example.r6strategies.coastline.MyFragmentPagerAdapter3(getSupportFragmentManager());
        viewPager.setAdapter(myFragmentPagerAdapter3);
    }

    private void setTabLayout() {
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setText("Easy");
        tabLayout.getTabAt(1).setText("Medium");
        tabLayout.getTabAt(2).setText("Hard");
    }
}