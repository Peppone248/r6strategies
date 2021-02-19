package com.example.r6strategies;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.r6strategies.oregon.SelectSpotOregon;
import com.example.r6strategies.oregon.easyoregonstrat;
import com.example.r6strategies.oregon.easyoregonstrat1;
import com.example.r6strategies.oregon.hardoregonstrat;
import com.example.r6strategies.oregon.hardoregonstrat1;
import com.example.r6strategies.oregon.mediumoregonstrat;
import com.example.r6strategies.oregon.mediumoregonstrat1;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    public MyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new easyoregonstrat();
                case 1:
                    return new mediumoregonstrat();
                case 2:
                    return new hardoregonstrat();

                default:
                    return null;
            }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
