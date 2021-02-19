package com.example.r6strategies.coastline;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.r6strategies.clb.easyclbstrat1;
import com.example.r6strategies.clb.hardclbstrat1;
import com.example.r6strategies.clb.mediumclbstrat1;

public class MyFragmentPagerAdapter1 extends FragmentPagerAdapter {

    public MyFragmentPagerAdapter1(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new easycostastrat1();
            case 1:
                return new mediumcostastrat1();
            case 2:
                return new hardcostastrat1();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
