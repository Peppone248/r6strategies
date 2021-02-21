package com.example.r6strategies.clb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.r6strategies.R;
import com.google.android.material.tabs.TabLayout;

public class CLBStrat1 extends AppCompatActivity {

    MyFragmentPagerAdapter1 myFragmentPagerAdapter1;
    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_l_b_strat);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);

        setPagerAdapter();
        setTabLayout();
    }
    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    private void setPagerAdapter(){
        myFragmentPagerAdapter1 = new com.example.r6strategies.clb.MyFragmentPagerAdapter1(getSupportFragmentManager());
        viewPager.setAdapter(myFragmentPagerAdapter1);
    }

    private void setTabLayout() {
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setText("Easy");
        tabLayout.getTabAt(1).setText("Medium");
        tabLayout.getTabAt(2).setText("Hard");
    }
}