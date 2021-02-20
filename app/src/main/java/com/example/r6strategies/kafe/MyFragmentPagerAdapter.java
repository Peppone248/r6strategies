package com.example.r6strategies.kafe;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.r6strategies.coastline.easycostastrat;
import com.example.r6strategies.coastline.hardcostastrat;
import com.example.r6strategies.coastline.mediumcostastrat;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    public MyFragmentPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new easykafestrat();
            case 1:
                return new mediumkafestrat();
            case 2:
                return new hardkafestrat();
            default:
                return null;
        }
    }


    @Override
    public int getCount() {
        return 3;
    }
}

