package com.example.r6strategies;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.r6strategies.oregon.easyoregonstrat3;
import com.example.r6strategies.oregon.hardoregonstrat3;
import com.example.r6strategies.oregon.mediumoregonstrat3;

public class MyFragmentPagerAdapter3 extends FragmentPagerAdapter {
    public MyFragmentPagerAdapter3(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
       switch (position){
           case 0:
               return new easyoregonstrat3();
           case 1:
               return new mediumoregonstrat3();
           case 2:
               return new hardoregonstrat3();
           default:
               return null;
       }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
