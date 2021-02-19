package com.example.r6strategies.coastline;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.r6strategies.clb.easyclbstrat3;
import com.example.r6strategies.clb.hardclbstrat3;
import com.example.r6strategies.clb.mediumclbstrat3;

public class MyFragmentPagerAdapter3 extends FragmentPagerAdapter {

    public MyFragmentPagerAdapter3(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new easycostastrat3();
            case 1:
                return new mediumcostastrat3();
            case 2:
                return new hardcostastrat3();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
