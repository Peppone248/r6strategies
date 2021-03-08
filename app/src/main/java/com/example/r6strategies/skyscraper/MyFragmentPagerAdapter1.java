package com.example.r6strategies.skyscraper;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.r6strategies.coastline.easycostastrat1;
import com.example.r6strategies.coastline.hardcostastrat1;
import com.example.r6strategies.coastline.mediumcostastrat1;

public class MyFragmentPagerAdapter1 extends FragmentPagerAdapter {

    public MyFragmentPagerAdapter1(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new easyskyscraperstrat1();
            case 1:
                return new mediumskyscraperstrat1();
            case 2:
                return new hardskyscraperstrat1();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
