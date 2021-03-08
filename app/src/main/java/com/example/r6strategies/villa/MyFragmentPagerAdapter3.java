package com.example.r6strategies.villa;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.r6strategies.coastline.easycostastrat3;
import com.example.r6strategies.coastline.hardcostastrat3;
import com.example.r6strategies.coastline.mediumcostastrat3;

public class MyFragmentPagerAdapter3 extends FragmentPagerAdapter {

    public MyFragmentPagerAdapter3(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new easyvillastrat3();
            case 1:
                return new mediumvillastrat3();
            case 2:
                return new hardvillastrat3();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
