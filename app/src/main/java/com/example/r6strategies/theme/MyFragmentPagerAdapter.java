package com.example.r6strategies.theme;

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
                return new easythemestrat();
            case 1:
                return new mediumthemestrat();
            case 2:
                return new hardthemestrat();
            default:
                return null;
        }
    }


    @Override
    public int getCount() {
        return 3;
    }
}

