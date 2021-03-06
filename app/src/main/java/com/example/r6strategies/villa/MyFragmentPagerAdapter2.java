package com.example.r6strategies.villa;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.r6strategies.coastline.easycostastrat2;
import com.example.r6strategies.coastline.hardcostastrat2;
import com.example.r6strategies.coastline.mediumcostastrat2;

public class MyFragmentPagerAdapter2 extends FragmentPagerAdapter {

    public MyFragmentPagerAdapter2(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new easyvillastrat2();
            case 1:
                return new mediumvillastrat2();
            case 2:
                return new hardvillastrat2();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
