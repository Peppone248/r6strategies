package com.example.r6strategies.clb;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.r6strategies.oregon.easyoregonstrat;
import com.example.r6strategies.oregon.hardoregonstrat;
import com.example.r6strategies.oregon.mediumoregonstrat;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    public MyFragmentPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new easyclbstrat();
            case 1:
                return new mediumclbstrat();
            case 2:
                return new hardclbstrat();
            default:
                return null;
        }
    }


    @Override
    public int getCount() {
        return 3;
    }
}

