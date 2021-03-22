package com.example.r6strategies.chalet;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.r6strategies.clb.easyclbstrat2;
import com.example.r6strategies.clb.hardclbstrat2;
import com.example.r6strategies.clb.mediumclbstrat2;

public class MyFragmentPagerAdapter2 extends FragmentPagerAdapter {

    public MyFragmentPagerAdapter2(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new easychaletstrat2();
            case 1:
                return new mediumchaletstrat2();
            case 2:
                return new hardchaletstrat2();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
