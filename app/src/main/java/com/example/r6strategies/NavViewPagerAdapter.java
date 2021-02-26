package com.example.r6strategies;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class NavViewPagerAdapter extends FragmentPagerAdapter {
    public NavViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new OperatoreInfo();
            case 1:
                return new OperatoreRole();
            case 2:
                return new OperatoreGadget();
            case 3:
                return new OperatoreLoadout();
                default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
