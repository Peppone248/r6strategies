package com.example.r6strategies.oregon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.r6strategies.MyFragmentPagerAdapter2;
import com.example.r6strategies.R;
import com.google.android.material.tabs.TabLayout;

public class OregonStrat2 extends AppCompatActivity {

    MyFragmentPagerAdapter2 myFragmentPagerAdapter2;
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
        myFragmentPagerAdapter2 = new MyFragmentPagerAdapter2(getSupportFragmentManager());
        viewPager.setAdapter(myFragmentPagerAdapter2);
    }

    private void setTabLayout() {
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setText("Easy");
        tabLayout.getTabAt(1).setText("Medium");
        tabLayout.getTabAt(2).setText("Hard");
    }
}