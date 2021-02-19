package com.example.r6strategies;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


import com.example.r6strategies.oregon.easyoregonstrat2;

import com.example.r6strategies.oregon.hardoregonstrat2;

import com.example.r6strategies.oregon.mediumoregonstrat2;

public class MyFragmentPagerAdapter2 extends FragmentPagerAdapter {

    public MyFragmentPagerAdapter2(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new easyoregonstrat2();
            case 1:
                return new mediumoregonstrat2();
            case 2:
                return new hardoregonstrat2();

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
