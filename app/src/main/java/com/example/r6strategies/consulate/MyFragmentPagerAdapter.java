package com.example.r6strategies.consulate;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.r6strategies.clb.easyclbstrat;
import com.example.r6strategies.clb.hardclbstrat;
import com.example.r6strategies.clb.mediumclbstrat;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    public MyFragmentPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new easyconsstrat();
            case 1:
                return new mediumconsstrat();
            case 2:
                return new hardconsstrat();
            default:
                return null;
        }
    }


    @Override
    public int getCount() {
        return 3;
    }
}

