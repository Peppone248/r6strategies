package com.example.r6strategies.border;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    public MyFragmentPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new easyborderstrat();
            case 1:
                return new mediumborderstrat();
            case 2:
                return new hardborderstrat();
            default:
                return null;
        }
    }


    @Override
    public int getCount() {
        return 3;
    }
}

